package BesentTech.CallToAll.BaseClasses;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import BesentTech.CallToAll.configuration.PublicContext;
import BesentTech.CallToAll.configuration.ReadProperties;

public class ConfiguarBrowser {
	ReadProperties readProperties=new ReadProperties();
	@BeforeMethod
	public void setDriver() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		Map<String, Object> map=new HashedMap<String, Object>();
		map.put("download.default_directory", PublicContext.downloadPath);
		map.put("disable-popup-blocking", true);
		map.put("plugins.always_open_pdf_externally", true);
		options.setExperimentalOption("prefs", map);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		System.setProperty("webdriver.chrome.driver", PublicContext.driverPath+"chromedriver.exe");
		PublicContext.driver = new ChromeDriver(options);
		PublicContext.driver.get(readProperties.getPropertiesfor("AppURL"));
	}
	@AfterMethod
	public void downDriver() {
		PublicContext.driver.quit();
	}

}
