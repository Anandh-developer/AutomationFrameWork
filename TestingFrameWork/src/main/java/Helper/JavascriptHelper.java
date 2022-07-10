package Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptHelper {
	WebDriver driver;
	JavascriptExecutor javascriptExecutor;
	public JavascriptHelper(WebDriver driver)
	{
		this.driver= driver;
	javascriptExecutor=(JavascriptExecutor) driver;
	}
	public void scrollToWebElement(WebElement element)
	{
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);
	}
	public void javascriptClick(WebElement element)
	{
		javascriptExecutor.executeScript("arguments[0].click();",element);
	}
	public void scrollIntoViewAndClick(WebElement element)
	{
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);
		javascriptExecutor.executeScript("arguments[0].click();",element);
	}
	public void jsScroll()
	{
		javascriptExecutor.executeScript("window.scrollBy(0,600);");
	}
	public void executeScript(String script)
	{
		javascriptExecutor.executeScript("return "+script);
	}
}
