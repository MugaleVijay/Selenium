package testngpac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("vijay mugale");
		driver.findElement(By.name("password")).sendKeys("pass123");
		driver.findElement(By.xpath("//div[.='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Not Now']")).click();
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		//driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Search'])[1]"));
		driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Messenger'])[1]")).sendKeys("Rushikesh Lohare");
		driver.findElement(By.xpath("(//div[text()='Rushikesh Lohare'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='Message'])[1]")).click();
		WebElement messageBox= driver.findElement(By.xpath("//textarea[@placeholder='Message...']"));
		messageBox.sendKeys("hii");
		WebElement sendButton = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		sendButton.click();
		driver.quit();
		
		
		
		
	}

	
}
