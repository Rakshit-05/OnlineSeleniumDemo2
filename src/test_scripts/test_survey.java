package test_scripts;

import org.testng.annotations.Test;

import Generics.Base_class;
import Object_repository.Survey_page;

@Test
public class test_survey extends Base_class
{
	public void Login_page()
	{
	  
	  Survey_page page = new Survey_page(driver);
	  
page.set_user_name("Rakshit M K");	  
	  
	  page.set_Company("TestYantra");
	  
	  
	  page.set_Zip_Code("571401");
	  
	  page.set_county("India");
	  
	  page.set_Email_Address("rakshithmk.at@gmail.com");
	  
	  page.set_Phone_Number("9731626183");
	  
	  page.set_Submit();
	}

}
