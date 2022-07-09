package CodeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Helper.AlertsHandler;
import Helper.FluentWaitHelper;
import Helper.JavascriptHelper;
import PageObjects.OmayoBlogSpotObj;
import Utilities.BaseClass;

public class AlertHandlerTest {
	
	WebDriver driver=BaseClass.initializeDriver("chrome");
	OmayoBlogSpotObj omayoObj= new OmayoBlogSpotObj(driver);
	AlertsHandler alertHandler= new AlertsHandler(driver);
	FluentWaitHelper fluentWaitHelper= new FluentWaitHelper(driver);
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver);
	
	@Test(testName="alertDemo")
	public void alertHandlerTest() throws InterruptedException
	{
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	    alertHandler.promtAlert("Ok");
		Thread.sleep(5000); 
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000); 
		driver.quit();
	}

}
