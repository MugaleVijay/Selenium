package testngAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLogin {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		

	}


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test(priority = 1)
	public void loginToActiTime() throws InterruptedException 
	{
		driver.findElement(By.name("username")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority = 2)
	public void logOutFromActiTime() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}