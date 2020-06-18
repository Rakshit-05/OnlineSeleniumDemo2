package Object_repository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webmail_page {
	@FindBy(xpath="//input[@class='input-text login-form-user']")
	private WebElement Email_address;
	
	
	@FindBy(xpath="//input[@class='input-text login-form-password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//i[@class='fa fa-sign-out launcher-icon']")
	private WebElement Signout;
	
	public Webmail_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void set_Email_address(String emailid)
	{
		Email_address.sendKeys(emailid);
		}
	public void set_Password(String pswrd)
	{
		Password.sendKeys(pswrd);
	}
		public void set_Submit()
		{
			Submit.sendKeys(Keys.ENTER);
		}
		public void set_Signout()
		{
			Signout.click();
		}
	
}
