package testngpac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCaseRerun {
	
	
	
	@Test
	public void tc1()
	{
		int a=10/1;
	Reporter.log("test case1",true);
	System.out.println(a);
		
	}
	@Test
	public void tc2() {
		Reporter.log("test case2",true);
	}
	
	@Test
	public void tc3() {
		Reporter.log("test case3",true);
	}
	
	@Test
	public void tc4() {
		int b=10/0;
		Reporter.log("test case4",true);
		System.out.println();
	}
	
}
