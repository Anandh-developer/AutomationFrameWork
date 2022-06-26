package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngularDemo_Obj {
	WebDriver driver;
	public AngularDemo_Obj(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//span[contains(text(),' Input ')]")
    private WebElement input_menu;
	public WebElement inputMenu()
	{
		return input_menu;
	}
	@FindBy(xpath="//input-overview-example//mat-form-field[1]//input[1]")
	private WebElement favoriteFood_TextBox;
	public WebElement favoriteFoodTextBox()
	{
		return favoriteFood_TextBox;
	}
}
