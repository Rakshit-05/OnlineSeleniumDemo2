package Object_repository;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Survey_page {

		@FindBy(xpath="//div[text()='Name *']/preceding::textarea")
		private WebElement user_name;
		
		@FindBy(xpath="//div[text()='Company']/preceding-sibling::textarea")
		private WebElement Company;
		
		@FindBy(xpath="//div[text()='Zip / Postal Code *']/preceding-sibling::textarea")
		private WebElement Zip_Code;
		
		@FindBy(xpath="//div[@class='form__combobox__button']")
		private WebElement Country;
				
				@FindBy(xpath="//div[text()='Email Address *']/preceding-sibling::textarea")
				private WebElement Email_Address;
				
				@FindBy(xpath="//div[text()='Phone Number *']/preceding-sibling::textarea")
				private WebElement Phone_Number;
				
				@FindBy(xpath="//button[text()=' Submit ']")
				private WebElement Submit;
				
				public Survey_page(WebDriver driver) 
				{
					PageFactory.initElements(driver,this);
				}
				public void set_user_name(String ur_name)
				{
					user_name.sendKeys(ur_name);
					}
				public void set_Company(String cmpny)
				{
					Company.sendKeys(cmpny);
					}
				public void set_Zip_Code(String zp)
				{
					Zip_Code.sendKeys(zp);
				}
				
				public void set_county(String country)
				{
					Country.click();
				}
				
				public void set_Email_Address(String email_add)
				{
					Email_Address.sendKeys(email_add);
				}
				
				public void set_Phone_Number(String phn_nmbr)
				{
					Phone_Number.sendKeys(phn_nmbr);
				}
				
				public void set_Submit()
				{
					Submit.sendKeys(Keys.ENTER);
				}
				
}
