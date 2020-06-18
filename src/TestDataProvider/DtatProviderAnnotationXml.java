package TestDataProvider;

import org.junit.runners.Parameterized.Parameters;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DtatProviderAnnotationXml 
{
	@Test
	@Parameters({"username","password"})
	public static void test_parameters(String uname, String pass) 
	{
		Reporter.log("DataProviderDemo",true);
		Reporter.log(uname,true);
		Reporter.log(pass,true);
	}
	}

