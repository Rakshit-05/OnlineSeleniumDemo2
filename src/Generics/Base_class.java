package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base_class 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");		
	}
	
	@BeforeMethod
	public void launch_browser()
	{
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://freeonlinesurveys.com/s/TUMeiw6d");		
	}
	
}
