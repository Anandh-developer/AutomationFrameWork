package Helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertsHandler {
	WebDriver driver;

	public AlertsHandler(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToAlert() {
		driver.switchTo().alert();
	}

	public void AcceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void promtAlert(String text) {
		Alert alert = driver.switchTo().alert();
	alert.sendKeys(text);
	alert.accept();
	}

	public boolean isAlertDisplayed() {
		boolean result;
		try {
			driver.switchTo().alert();
			result = true;

		} catch (NoAlertPresentException e) {
			result = false;
		}

		return result;
	}
	public String getAlertText()
	{
		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}

}
