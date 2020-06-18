package test_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups="a")
	public void m1() {
		Reporter.log("m1 -group a", true);
	}
	
	@Test(groups="b")
	public void m2() {
		Reporter.log("m2 -group b", true);
	}

	@Test(groups="a")
	public void m3() {
		Reporter.log("m3 -group a", true);
	}
	
	@Test(groups="b")
	public void m4() {
		Reporter.log("m4 -group b", true);
	}
	
	@Test(groups= {"a","b"})
	public void m5() {
		Reporter.log("m5 -group a and b", true);
	}
}
