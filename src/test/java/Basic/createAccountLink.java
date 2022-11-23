package Basic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class createAccountLink {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Join now")).click();
		// login to account
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1800889999");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("akshay@123");
		// create new account
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("akshay");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("kumar");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Verify']")).click();


		//use switch to control statement for verify button
		//	driver.findElement(By.xpath("//button[contains(text()='Verify')]")).click();
		//Thread.sleep(7000);

		//driver.close();

	}

}
