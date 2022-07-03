package Helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitHelper {

//	WebElement webElement;
	WebDriver driver;
	String xpath;

	public FluentWaitHelper(WebDriver driver) {
		this.driver = driver;
		// this.webElement = webElement;
	}

	public void elementToBeVisisble(WebElement webElement, int timeOut, int pollingSeconds) {
		@SuppressWarnings("unchecked")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingSeconds)).ignoring(Exception.class);

		wait.until(ExpectedConditions.visibilityOf(webElement));

	}

	public void elementToBeClickableWihFluentWait(WebElement element, int timeOut, int pollingSeconds) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingSeconds)).ignoring(Exception.class);

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	
}
