package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.FluentWaitHelper;
import Utilities.BaseClass;

public class WaitDemo {

	WebDriver driver = BaseClass.initializeDriver("Chrome");
	FluentWaitHelper fluentWait;

	@SuppressWarnings("unchecked")
	@Test()
	public void test() {
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		// WebElement findElement =
		fluentWait = new FluentWaitHelper(driver);
	//	fluentWait.elementToBeVisisble(driver.findElement(By.xpath("//h3[normalize-space()='Show the textboxes here:']//input[@id='txt1']")));

	}
}
