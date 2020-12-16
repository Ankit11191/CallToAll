package BesentTech.CallToAll.DriverCommand;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BesentTech.CallToAll.configuration.PublicContext;

public class TakeScreenshot {
	public static void getScreenShot() {
		String dateTime=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		String ssDestination=PublicContext.ScreenshotPAth+File.separator+"ScreenShot_"+dateTime+".png";
		File rawImage = ((TakesScreenshot)PublicContext.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(rawImage, new File(ssDestination));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
