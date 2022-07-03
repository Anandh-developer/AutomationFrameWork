package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import FrameWindowsSwitcher.FrameWindowSwitcher;
import Helper.FluentWaitHelper;
import Helper.JavascriptHelper;
import Helper.MouseEventsHelper;
import Helper.WaitHelper;
import Listeners.ListenersTestNG;
import Utilities.BaseClass;


@Listeners(ListenersTestNG.class)
public class TestClass extends BaseClass{

	WebDriver driver=BaseClass.initializeDriver("Chrome");
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver);
	MouseEventsHelper mouseEvenetHelper= new MouseEventsHelper(driver);
	WaitHelper waitHelper= new WaitHelper(driver);
	FrameWindowSwitcher frameWindowSwitcher= new FrameWindowSwitcher(driver);
	FluentWaitHelper fluentWaitHelpr= new FluentWaitHelper(driver);
	/*@Test()
	public void test1()
	{
	driver.get("http://www.seleniumframework.com/demo-sites/");
	javascriptHelper.jsScroll();
	javascriptHelper.scrollToWebElement(driver.findElement(By.xpath("(//a[text()='Find Element Strategies'])[2]")));
	javascriptHelper.scrollIntoViewAndClick(driver.findElement(By.xpath("(//a[text()='Find Element Strategies'])[2]")));
	
	}*/
/*	@Test()
	public void test2() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//waitHelper.waitForElementVisible(driver.findElement(By.xpath("//ul[@id='gallery']//li[1]")), 3000);
		mouseEvenetHelper.doubleClick(driver.findElement(By.xpath("//li[text()='Accepted Elements']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/iframe[1]")));
		frameWindowSwitcher.switchToFrameByWebElement(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/iframe[1]")));
		waitHelper.waitForElementVisible(driver.findElement(By.xpath("//div[@id='draggable']/p")), 3000);
		WebElement srcElement =driver.findElement(By.xpath("//div[@id='draggable']/p"));
		WebElement destElement=driver.findElement(By.xpath("//div[@id='droppable']/p"));
		mouseEvenetHelper.dragAndDrop(srcElement, destElement);
		
		//Thread.sleep(3000);
	}*/
	@Test()
	public void test3()
	{
		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		//driver.findElement(By.xpath("//ul//li[3]//span[text()='Select Elements']")).click();		
		frameWindowSwitcher.switchToFrameByWebElement(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		/*for(int i=1;i<=7;i++)
		{
			try
			{
			mouseEvenetHelper.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']//li["+i+"]")));
			}
			catch(Exception e)
			{
				break;
			}
		}*/
		WebElement element1 = driver.findElement(By.xpath("//ol[@id='selectable']//li[1]"));
		WebElement element2 = driver.findElement(By.xpath("//ol[@id='selectable']//li[3]"));
		mouseEvenetHelper.controlClick(element1);
		mouseEvenetHelper.controlClick(element2);
		}
	@AfterMethod
	public void tearDOwn()
	{
		driver.quit();
	}
	

}
