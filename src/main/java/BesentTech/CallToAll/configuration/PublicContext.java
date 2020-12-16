package BesentTech.CallToAll.configuration;

import java.io.File;

import org.openqa.selenium.WebDriver;

public class PublicContext {
	public static WebDriver driver=null;
	public static String downloadPath=System.getProperty("user.dir")+File.separator+"downloads"+File.separator;
	public static String driverPath="./drivers/";
	public static String ScreenshotPAth="./ScreenShots/";
	
}
