package BesentTech.CallToAll;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BesentTech.CallToAll.BaseClasses.ConfiguarBrowser;
import BesentTech.CallToAll.HandleTask.HandleActions;
import BesentTech.CallToAll.configuration.PublicContext;

public class Testcase1 extends ConfiguarBrowser{ 
	@Test
	public void testCAse1() throws InterruptedException {
		PublicContext.test=PublicContext.report.createTest("my First Test Case");
		HandleActions.clickOn("linktext", "Download – Selenium Interview Question PDF");
		PublicContext.test.log(Status.PASS, "File Download successfully");
		Thread.sleep(5000);
		}
}
