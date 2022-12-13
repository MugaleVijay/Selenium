package testngpac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram_Prank {
	
	public WebDriver driver;
	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority = 1)
	public void Login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Vijay mugale");
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Log in']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Not Now']")).click();
		driver.findElement(By.xpath("(//div[.='Search'])[1]")).sendKeys("Rushikesh Lohare");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Rushikesh Lohare'])[1]")).click();
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 2,invocationCount = 4)
	public void sendtext() {
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("hii");
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		
	}
	@Test(priority = 3)
	public void tearDown() {
		driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Settings'])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Log out')]")).click();
		driver.quit();
	}
}