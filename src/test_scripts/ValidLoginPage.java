package test_scripts;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import Object_repository.Login_page;

	public class ValidLoginPage {
		static {
			System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		}
		public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
		
		  driver.get("https://www.urbanladder.com/user/spree_user/sign_in");
		  Login_page lp=new Login_page(driver);
		
		lp.set_user_name("rakshithmk.at@gmail.com");
		
		lp.set_password("R9731626183");
	}
	}

