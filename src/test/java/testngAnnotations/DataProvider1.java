package testngAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1 {
	
	@DataProvider
	public Object[][] getData() 
	{
		Object[][] a = new Object[3][2];
		a[0][0]="manager123";
		a[0][1]="pass@123";
		
		a[1][0]="manage$#";
		a[1][1]="12*3P";
		
		a[2][0]="manager";
		a[2][1]="admin";
		
		
		
		return a;    
	}
	
	@Test(dataProvider = "getData")
	public void demo(String username, String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
