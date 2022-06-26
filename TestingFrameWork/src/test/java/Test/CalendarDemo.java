package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TestData.ExcelReader;
import Utilities.BaseClass;


public class CalendarDemo {
	ExcelReader excelReader;
@Test()
public void calenderDemo() throws IOException{
	WebDriver driver=BaseClass.initializeDriver("Chrome");
	driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	Actions action= new Actions(driver);
	excelReader= new ExcelReader();
	for(int i=1;i<=2;i++)
	{
		
	driver.findElement(By.xpath("(//a[text()='"+excelReader.getIntegerTestData("Calender", 0, 0)+"'])["+i+"]"));
    String attributeValue = driver.findElement(By.xpath("(//a[text()='"+excelReader.getIntegerTestData("Calender", 0, 0)+"'])["+i+"]")).getAttribute("aria-current");
	if(attributeValue.equals("true"))
	{
		System.out.println("Inside If Condition");
		action.doubleClick(driver.findElement(By.xpath("(//a[text()='"+excelReader.getIntegerTestData("Calender", 0, 0)+"'])["+i+"]")));
		//.click();
		break;
	}
	else
	{
		System.out.println("Inisde Else block");
	}
		
	}
	
}
}
