package BesentTech.CallToAll.ElemantHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BesentTech.CallToAll.configuration.PublicContext;

public class HandleElements {
	public WebElement getElement(String byType, String address) {
		WebElement element=null;
		switch (byType.toLowerCase()) {
		case "id":
			element = PublicContext.driver.findElement(By.id(address));
			break;
		case "name":
			element = PublicContext.driver.findElement(By.name(address));
			break;
		case "tagname":
			element = PublicContext.driver.findElement(By.tagName(address));
			break;
		case "xpath":
			element = PublicContext.driver.findElement(By.xpath(address));
			break;
		case "cssselector":
			element = PublicContext.driver.findElement(By.cssSelector(address));
			break;
		case "linktext":
			element = PublicContext.driver.findElement(By.linkText(address));
			break;
		case "partiallinktext":
			element = PublicContext.driver.findElement(By.partialLinkText(address));
			break;
		case "classname":
			element = PublicContext.driver.findElement(By.className(address));
			break;
		default:
			System.err.println("No Such element type");
			System.exit(0);
		}
		return element;
	}
}
