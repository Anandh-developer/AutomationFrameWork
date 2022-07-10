package Helper;

import java.util.Iterator;
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
		Set<String> windowHandle2 = driver.getWindowHandles();
		int winCount = windowHandle2.size();
		System.out.println(winCount);
		Iterator<String> iter=windowHandle2.iterator();
		while(iter.hasNext())
		{
			System.out.println(winCount);
			if(winCount==1)
			{
				System.out.println("Inside if condition");
				driver.switchTo().window(iter.next());
				break;
			}
			else
			{
				driver.close();
			}
			winCount--;
		}
		
		
	}
}