package testngpac;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNg {
  @Test
  public void f() {
	  // Print on Console and Report
	  Reporter.log("Sun",true);
	  
	  // Print on only Report
	  Reporter.log("Mon",false);
	  Reporter.log("wed");
	  
	  // Print on only Console
	  System.out.println("Thu");
	  
  }
}
