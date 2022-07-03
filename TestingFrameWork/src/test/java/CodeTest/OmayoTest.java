package CodeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Helper.FluentWaitHelper;
import Helper.JavascriptHelper;
import Helper.WaitHelper;
import PageObjects.OmayoBlogSpotObj;
import Utilities.BaseClass;

public class OmayoTest {
	WebDriver driver=BaseClass.initializeDriver("Chrome");
	OmayoBlogSpotObj omayoObj= new OmayoBlogSpotObj(driver);
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver);
	//FluentWaitHelper fluentWaitHelper= new FluentWaitHelper(driver);
	WaitHelper waitHelper= new WaitHelper(driver);
	@Test(testName="OmayoTet")
	public void omayoTest()
	{
		driver.get("https://omayo.blogspot.com/");
		javascriptHelper.scrollIntoViewAndClick(omayoObj.omayoDropdown());
		//fluentWaitHelper.elementToBeClickableWihFluentWait(omayoObj.omayoDropDownFacebook(), 30, 2);
		waitHelper.waitForElementVisible(omayoObj.omayoDropDownFacebook(), 300);
		omayoObj.omayoDropDownFacebook().click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
