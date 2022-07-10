package CodeTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetTest {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
driver.get("https://www.w3schools.com/java/java_iterator.asp");
	}
}
