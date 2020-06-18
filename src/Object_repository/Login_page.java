package Object_repository;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login_page {

	@FindBy(xpath="//div[@id='content']//form[@name='login_form']//input[@id='spree_user_email']")		
	private WebElement user_name;
		
	@FindBy(xpath="//div[@id='content']//form[@name='login_form']//input[@id='spree_user_password']")			
	private WebElement password;

	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void set_user_name(String ur_name)
	{
		user_name.sendKeys(ur_name);
		}
	public void set_password(String pwd)
	{
		password.sendKeys(pwd,Keys.ENTER);
	}
}

