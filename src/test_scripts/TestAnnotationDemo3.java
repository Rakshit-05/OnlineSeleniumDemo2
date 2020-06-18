package test_scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationDemo3 {
	@BeforeSuite
	public void before_suite() {
		Reporter.log("Before Suite", true);
	}
	
	@BeforeTest
	public void before_test() {
		Reporter.log("Before Test", true);
	}
	
	@BeforeClass
	public void before_class() {
		Reporter.log("Before Class", true);
	}
	
	@BeforeMethod
	public void before_method() {
		Reporter.log("Before Method", true);
	}
	
	@Test
	public void m1() {
		Reporter.log("after Test", true);
	}
	
	
	@AfterMethod
	public void after_method() {
		Reporter.log("After Method", true);
	}
	
	@AfterClass
	public void after_class() {
		Reporter.log("After Class", true);
	}
	
	
	@AfterTest
	public void after_test() {
		Reporter.log("After Test", true);
	}
	
	@AfterSuite
	public void after_suite() {
		Reporter.log("After Suite", true);
	}
	
	
		
	}


