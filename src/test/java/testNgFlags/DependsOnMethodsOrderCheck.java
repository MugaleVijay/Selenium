package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsOrderCheck {
	@Test
	public void a()
	{
		Reporter.log("A Method",true);
	}
	
	@Test(dependsOnMethods = "d")
	public void b()
	{
		Reporter.log("B Method",true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("C Method",true);
	}

	@Test
	public void d()
	{
		Reporter.log("D Method",true);
	}


}
