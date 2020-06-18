package test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotationDemo1 {
	WebDriver driver;
	
	@BeforeSuite
	void set_property_chrome() {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
		
		@BeforeMethod
		void launch_browser() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize(); 
		}
		@Test
		public void m1() {
			driver.get("https://www.urbanladder.com");
			Reporter.log("urbanlader launched successfully",true);
		}
		
		@AfterMethod
		void close_browser() {
			driver.quit();
		}

}
