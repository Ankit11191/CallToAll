package BesentTech.CallToAll.configuration;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class PublicContext {
	public static WebDriver driver=null;
	public static String downloadPath=System.getProperty("user.dir")+File.separator+"downloads"+File.separator;
	public static String driverPath="./drivers/";
	public static String ScreenshotPAth="./ScreenShots/";
	public static String testdataFileLoc="./TestDataFiles/";
	public static String testdataFileExt=".xlsx";
	public static String logPath="./Logs";
	public static ExtentReports report=null;
	public static ExtentTest test;

}
