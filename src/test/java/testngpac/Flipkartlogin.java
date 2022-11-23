package testngpac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartlogin {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://affiliate.flipkart.com/login");
		WebElement ele1 = driver.findElement(By.id("inputEmail"));
		ele1.sendKeys("123@gmail.com");
		WebElement ele2 = driver.findElement(By.id("inputPassword"));
		ele2.sendKeys("1234");
		driver.findElement(By.id("submitLogin")).click();
		
		
		
		
		
	}
	

}
