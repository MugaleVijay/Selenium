package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void loginMethod() 
	{
		int result=5/0;
		System.out.println(result);
		Reporter.log("logging in....",true);
	}

	@Test(dependsOnMethods = "loginMethod")
	public void createUser() 
	{
		Reporter.log("creating user....",true);
	}


	@Test(dependsOnMethods = "loginMethod")
	public void logoutMethod() 
	{
		 Reporter.log("logging out....",true);
	}
}
