package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	 @Test()
	  public void createUser() 
	  {
		  Reporter.log("creating user....",true);
	  }
	  
	  
	  @Test(enabled = true)
	  public void login() 
	  {
		  Reporter.log("logging in.......",true);
	  }
	  

}
