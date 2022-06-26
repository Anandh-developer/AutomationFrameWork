package Helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotTaker {
	WebDriver driver;
	FileUtils fileUtils= new FileUtils();
	public ScreenshotTaker(WebDriver driver)
	{
		this.driver= driver;
	}
	public void takeScreenshot() throws IOException
	{
		TakesScreenshot srcFile=(TakesScreenshot) driver;
		File screenshotFile = srcFile.getScreenshotAs(OutputType.FILE);
		File DestFilefile= new File("./ScreenshotFile/screenshot.jpg");
		fileUtils.copyFile(screenshotFile, DestFilefile);
		
	}

}
