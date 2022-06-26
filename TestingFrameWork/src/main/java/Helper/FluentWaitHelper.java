package Helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitHelper {

//	WebElement webElement;
	WebDriver driver;
    String xpath;

	public FluentWaitHelper(WebDriver driver) {
		this.driver = driver;
	//	this.webElement = webElement;
	}

	public void elementToBeVisisble(final WebElement webElement) {
		@SuppressWarnings("unchecked")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))
				.pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
			 //WebElement webElement=driver.findElement(By.xpath(xpath));
			 webElement.sendKeys("Ok");
				return webElement;
			}
		});
	}
	}
	
