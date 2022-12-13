package testngpac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToInstagram {

	WebDriver driver;
	
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void loginInstagram() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("vijay mugale");
		driver.findElement(By.name("password")).sendKeys("pass123");
		driver.findElement(By.xpath("//div[.='Log in']")).click();
		Thread.sleep(4000);
	}
}
