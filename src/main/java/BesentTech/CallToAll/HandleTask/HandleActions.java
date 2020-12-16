package BesentTech.CallToAll.HandleTask;

import org.openqa.selenium.support.ui.Select;

import BesentTech.CallToAll.ElemantHandle.HandleActionList;
import BesentTech.CallToAll.ElemantHandle.HandleElements;

public class HandleActions implements HandleActionList {
	static HandleElements elements=new HandleElements();
	
	public static void writeTextInto(String elementType, String elementName, String inputText)
	{
		elements.getElement(elementType, elementName).sendKeys(inputText);
	}
	public static void clickOn(String elementType, String elementName)
	{
		elements.getElement(elementType, elementName).click();
	}
	public static void clearOf(String elementType, String elementName)
	{
		elements.getElement(elementType, elementName).clear();
	}
	
	public static String getTextFrom(String elementType, String elementName)
	{
		return elements.getElement(elementType, elementName).getText();
	}
	
	public static String getAttributeOf(String elementType, String elementName, String attributeName)
	{
		return elements.getElement(elementType, elementName).getAttribute(attributeName);
	}
	public static boolean canWeSee(String elementType, String elementName)
	{
		return elements.getElement(elementType, elementName).isDisplayed();
	}
	public static boolean canWeClick(String elementType, String elementName)
	{
		return elements.getElement(elementType, elementName).isEnabled();
	}
	public static boolean canWeSelect(String elementType, String elementName)
	{
		return elements.getElement(elementType, elementName).isSelected();
	}
	public static void selectFromDropdownValueByIndex(String elementType, String elementName, String indexNumber)
	{
		Select sel=new Select(elements.getElement(elementType, elementName));
		sel.selectByIndex(new Integer(indexNumber));
	}
	public static void selectFromDropdownValueByValue(String elementType, String elementName, String value)
	{
		Select sel=new Select(elements.getElement(elementType, elementName));
		sel.selectByValue(value);
	}
	public static void selectFromDropdownValueByDisplayedText(String elementType, String elementName, String displayedText)
	{
		Select sel=new Select(elements.getElement(elementType, elementName));
		sel.deselectByVisibleText(displayedText);
	}
}
