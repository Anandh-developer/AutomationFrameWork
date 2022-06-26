package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.ScreenshotTaker;
import Helper.WaitHelper;
import PageObjects.AngularDemo_Obj;
import TestData.ExcelReader;
import Utilities.BaseClass;

public class TestSample extends BaseClass{
	
	WebDriver driver=BaseClass.initializeDriver("chrome");
	AngularDemo_Obj angularDmoobj = new AngularDemo_Obj(driver);
	ExcelReader excelReader;
	WaitHelper waitHelper = new WaitHelper(driver);
	ScreenshotTaker screenshotTaker= new ScreenshotTaker(driver);
	@BeforeTest
	public void beforeMethod()
	{
		
		driver.get("https://material.angular.io/components/categories");
	}
	
	@Test()
	public void businessProcess() throws IOException
	{
		excelReader = new ExcelReader();
		angularDmoobj.inputMenu().click();
		waitHelper.waitForElementVisible(angularDmoobj.favoriteFoodTextBox(), 50000);
		angularDmoobj.favoriteFoodTextBox().clear();
		angularDmoobj.favoriteFoodTextBox().sendKeys(excelReader.getTestData("Food", 0, 0));
		screenshotTaker.takeScreenshot();
		
	}
	@AfterTest
	public void afterMethod()
	{
		driver.close();	
	}

}
