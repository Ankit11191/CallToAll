package BesentTech.CallToAll.Reporting;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportLog {
	 public static ExtentHtmlReporter htmlReporter;
	 public static ExtentReports extent;
	 
	 public static ExtentReports setExtent() {
		 String currentDate  = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());  
	  htmlReporter= new ExtentHtmlReporter("./Report/"+"MyReport_"+currentDate+".html");
	  htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extentReportConfig.xml");
	  
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	  extent.setSystemInfo("HostName", "MyHost");
	  extent.setSystemInfo("ProjectName", "OrangeHRM");
	  extent.setSystemInfo("Tester", "Hitendra");
	  extent.setSystemInfo("OS", "Win10");
	  extent.setSystemInfo("Browser", "Chrome");
	  return extent;
	 }
	 public static void endReport() {
	  extent.flush();
	 }
}
