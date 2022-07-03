package CodeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import FrameWindowsSwitcher.FrameWindowSwitcher;
import Helper.MouseEventsHelper;
import Utilities.BaseClass;

public class HoverTest {
	WebDriver driver =BaseClass.initializeDriver("Chrome");
	FrameWindowSwitcher frameSwitcher= new FrameWindowSwitcher(driver);
	MouseEventsHelper mouseEventHelper= new MouseEventsHelper(driver);
	@Test()
	public void hoverTest()
	{
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		frameSwitcher.switchToFrameByWebElement(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		mouseEventHelper.moveToWebElement(driver.findElement(By.xpath("//a[text()='Vienna, Austria']")));		
	}
	public void tearDown()
	{
		driver.quit();
	}

}
