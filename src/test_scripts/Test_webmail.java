package test_scripts;

import org.testng.annotations.Test;

import Generics.Base_class_webmail;
import Object_repository.Webmail_page;


	@Test
	public class Test_webmail extends Base_class_webmail {
		public void Login_page() throws InterruptedException
		{
		  
		  
		  Webmail_page page= new Webmail_page(driver);
		  
	page.set_Email_address("namratha@agilehealthtech.com");	  
		  
		  page.set_Password("Aht2018@");
		  
		  page.set_Submit();
		  Thread.sleep(2000);
		  
          page.set_Signout();
}
	}

