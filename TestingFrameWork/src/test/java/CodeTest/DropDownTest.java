package CodeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import FrameWindowsSwitcher.FrameWindowSwitcher;
import Helper.DropDownPicker;
import Utilities.BaseClass;

public class DropDownTest {
WebDriver driver =BaseClass.initializeDriver("Chrome");
FrameWindowSwitcher frameAndWindowSwitcher= new FrameWindowSwitcher(driver);

DropDownPicker dropDownPicker= new DropDownPicker();
	
	@Test()
	public void dropDownTest() throws InterruptedException
	{
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		//frameAndWindowSwitcher.switchToFrameByWebElement(null);
		dropDownPicker.selectByVisibleText(driver.findElement(By.xpath("//select")), "Australia");
		dropDownPicker.selectByUsingIndexValue(driver.findElement(By.xpath("//select")), 10);
		dropDownPicker.selectByValue(driver.findElement(By.xpath("//select")), "ABW");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void  tearDown()
	{
		driver.quit();
	}
}
