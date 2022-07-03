package FrameWindowsSwitcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameWindowSwitcher {
	WebDriver driver;

	public FrameWindowSwitcher(WebDriver driver) {
		this.driver = driver;
	}
public void switchToFrameByWebElement(WebElement element)
{
	driver.switchTo().frame(element);
}
public void switchToFrameByIndex(int index)
{
	driver.switchTo().frame(index);
}
public void switchToFrameByID(String id)
{
	driver.switchTo().frame(id);
}
}
