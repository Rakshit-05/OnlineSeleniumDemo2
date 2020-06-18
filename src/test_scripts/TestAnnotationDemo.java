package test_scripts;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	@Test
	public class TestAnnotationDemo 
	{
			static {
				System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			}
				
				@Test(invocationCount=2,priority=3)
				public void m1() {
				WebDriver driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
			
			  driver.get("https://www.urbanladder.com");
		Reporter.log("urbanlader launched successfully",true);
		driver.close();
			}
				@Test(priority=0)
				public void m5() {
			
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize(); 
					
					  driver.get("https://www.urbanladder.com");
				Reporter.log("urbanlader launched successfully",true);
				driver.close();
			}

		@Test(priority=2)
		public void m3() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
			
			  driver.get("https://www.urbanladder.com");
		Reporter.log("urbanlader launched successfully",true);
		driver.close();
		}
		}

