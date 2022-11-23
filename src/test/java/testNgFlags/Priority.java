package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void logoutMethod() 
	{
		 Reporter.log("logging out....",true);
	}
	
	@Test(priority  =-1)
	public void loginMethod() 
	{
		Reporter.log("logging in....",true);
	}

	@Test()
	public void createUser() 
	{
		Reporter.log("creating user....",true);
	}


	
	
	// Output
	
	/*loginMethod
	createUser
	logoutMethod*/

}
