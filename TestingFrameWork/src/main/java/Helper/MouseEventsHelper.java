package Helper;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsHelper {
	WebDriver driver;
	Actions actions;
	public MouseEventsHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	public void rightClick(WebElement element)
	{
		actions= new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	public void mouseClick(WebElement element)
	{
		actions= new Actions(driver);
		actions.click(element).build().perform();
	}
	public void doubleClick(WebElement element)
	{
		actions= new Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	public void clickAndHold(WebElement element)
	{
		actions= new Actions(driver);
		actions.clickAndHold(element).build().perform();
	}
	public void clickAndHoldAndRelease(WebElement element)
	{
		actions= new Actions(driver);
		actions.clickAndHold(element).release(element).build().perform();
	}
	public void dragAndDrop(WebElement srcElement,WebElement destElement)
	{
		actions= new Actions(driver);
		actions.dragAndDrop(srcElement,destElement).build().perform();
	}
	public void mousePointRightClick()
	{
		actions= new Actions(driver);
		actions.contextClick().click().build().perform();
	}
	public void controlClick(WebElement element)
	{
		actions= new Actions(driver);
		actions.keyDown(Keys.LEFT_CONTROL).click(element).build().perform();
	}
	
	

}
