package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	 @Test(invocationCount = 5)
	  public void verifyloginButtonEnableDisableStatus() 
	  {
		  Reporter.log("disabled !!",true);
	  }

}
