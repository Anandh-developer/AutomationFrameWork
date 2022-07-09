package Helper;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandlers {
	WebDriver driver;

	public WindowHandlers(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToNewWindow(int i) {
		int winCount = 0;
		Set<String> windowHandles = driver.getWindowHandles();
		for (String winHandles : windowHandles) {
			if (winCount == i) {
				driver.switchTo().window(winHandles);
			}
			winCount++;
		}
	}

	public void swithcToParentWindowWithChildClose() {

		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println(windowHandle.size());
		driver.close();
		Set<String> windowHandle2 = driver.getWindowHandles();
		System.out.println(windowHandle2.size());
		driver.switchTo().window(windowHandle.toString());
	}
}