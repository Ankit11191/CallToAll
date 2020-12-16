package BesentTech.CallToAll;

import org.testng.annotations.Test;

import BesentTech.CallToAll.BaseClasses.ConfiguarBrowser;
import BesentTech.CallToAll.HandleTask.HandleActions;

public class Testcase1 extends ConfiguarBrowser{
	@Test
	public void testCAse1() throws InterruptedException {
		HandleActions.clickOn("linktext", "Download – Selenium Interview Question PDF");
		Thread.sleep(5000);
		}
}
