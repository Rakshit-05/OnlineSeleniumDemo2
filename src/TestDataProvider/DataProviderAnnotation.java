package TestDataProvider;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation 
{
	static WebDriver driver;
	
	@DataProvider
	public static String[][] getData()
	{
		String[][] s=new String[2][2];
		s[0][0]="username1";
		s[0][1]="password1";
		s[1][0]="username2";
		s[1][1]="password2";
		return s;	
	}
	
@Test(dataProvider="getData")
public static  void testlogin(String un,String ps) 
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(ps);
	driver.findElement(By.xpath("//input[@Value='log In']")).submit();	
}

@BeforeClass
public static void setpath() 
{
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
}

@BeforeMethod
public static void launchApplication() 
{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize(); 
	driver.get("https://www.facebook.com/");
}
}