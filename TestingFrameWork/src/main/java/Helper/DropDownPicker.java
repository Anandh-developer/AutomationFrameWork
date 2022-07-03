package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPicker {
	WebDriver driver;
	Select select;
	public DropDownPicker(WebDriver driver)
	{
	this.driver=driver;	
	}
	public void selectByUsingIndexValue(WebElement element,int index)
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value)
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	public void selectByString(WebElement element,String visibleText)
	{
		select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public void deSelectByIndex(WebElement element ,int index)
	{
		select = new Select(element);
		select.deselectByIndex(index);
	}
	public void deSelectByValue(WebElement element ,String value)
	{
		select = new Select(element);
		select.deselectByValue(value);
	}
	public void deSelectByVisibleText(WebElement element ,String visibleText)
	{
		select = new Select(element);
		select.deselectByVisibleText(visibleText);
	}

}
