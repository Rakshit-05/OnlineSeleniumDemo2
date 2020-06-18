package TestDataProvider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation2 
{
	@DataProvider
	public String[][] getData() {
		
		String[][] ur=new String[3][1];
		ur[0][0]="username1";
		ur[1][0]="username2";
		ur[2][0]="username3";
		return ur;
	}
	
	@Test(dataProvider="getData")
	public void print_username(String username) {
		Reporter.log("Test begin",true);
		Reporter.log(username,true);
	}
}
