package BesentTech.CallToAll.DriverCommand;

import BesentTech.CallToAll.configuration.PublicContext;

public class HandleDriverCommands {
	public static String getPageTitle() {
		return PublicContext.driver.getTitle();
	}
	public static String getCurrentPageUrl() {
		return PublicContext.driver.getCurrentUrl();
	}
	public static void goForward() {
		PublicContext.driver.navigate().forward();
	}
	public static void goBackward() {
		PublicContext.driver.navigate().back();
	}
	public static void doRefresh() {
		PublicContext.driver.navigate().refresh();
	}

}
