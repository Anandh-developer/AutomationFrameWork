package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	WebDriver driver;
	
	WebDriverWait wait;
	public WaitHelper(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForElementVisible(WebElement element,int duration)
	{
		wait = new WebDriverWait(driver,Duration.ofMillis(duration));
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	public void setImpleciWait(int timeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeout));
	}
	
	

}
