package CodeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Helper.JavascriptHelper;
import Helper.WindowHandlers;
import Utilities.BaseClass;

public class WindowHandleTest {
	WebDriver driver=BaseClass.initializeDriver("firefox");
	WindowHandlers windowHandles= new WindowHandlers(driver);
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver);
	@Test()
	public void windowHandlesTest() throws InterruptedException
	{
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		windowHandles.switchToNewWindow(1);
		javascriptHelper.jsScroll();
		windowHandles.swithcToParentWindowWithChildClose();
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
