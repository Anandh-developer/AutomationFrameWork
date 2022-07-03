package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OmayoBlogSpotObj {
	WebDriver driver;
	public OmayoBlogSpotObj(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='Dropdown']")
	private WebElement omayo_Dropdown;
	public WebElement omayoDropdown()
	{
		return omayo_Dropdown;
	}
	@FindBy(xpath="//a[text()='Facebook']")
	private WebElement omayo_DropDownFaceBook;
	public WebElement omayoDropDownFacebook()
	{
		return omayo_DropDownFaceBook;
	}
	@FindBy(id="prompt")
	private WebElement omayo_getPromtAlert;
	public WebElement omayoGetPromtAlert()
	{
		return omayo_getPromtAlert;
	}

}
