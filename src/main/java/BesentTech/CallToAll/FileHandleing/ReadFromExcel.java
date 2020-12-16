package BesentTech.CallToAll.FileHandleing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import BesentTech.CallToAll.configuration.PublicContext;
import BesentTech.CallToAll.configuration.ReadProperties;

public class ReadFromExcel {
	public static List<ArrayList<String>> getData(String testfilename) {
		List<ArrayList<String>> lst = new ArrayList<ArrayList<String>>();
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			fis = new FileInputStream(PublicContext.testdataFileLoc+testfilename+PublicContext.testdataFileExt);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheetAt(0);
		Iterator<Row> rowItr = sh.rowIterator();

		FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
		DataFormatter formatter = new DataFormatter();
		if (new ReadProperties().getPropertiesfor("isExcelFileHeaderExclude").toUpperCase().equals("T")) {
			rowItr.next();
		}
		while (rowItr.hasNext()) {
			ArrayList<String> alst = new ArrayList<String>();
			Row row = rowItr.next();
			Cell cell;
			for (int i = 0; i < row.getLastCellNum(); i++) {
				cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			}
			Iterator<Cell> cellItr = row.cellIterator();
			while (cellItr.hasNext()) {
				cell = cellItr.next();
				alst.add(formatter.formatCellValue(evaluator.evaluateInCell(cell)));
			}
			lst.add(alst);
		}
		return lst;
	}

	public static void main(String[] args) {
		List<ArrayList<String>> data = getData("testdata1");
		for (ArrayList<String> str : data) {
			System.out.println(str);
		}
	}
}
