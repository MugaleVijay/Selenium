package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitimelogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://hp/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(4000);
		 driver.findElement(By.name("username")).sendKeys("manager");
		 Thread.sleep(4000);
		 driver.findElement(By.name("pwd")).sendKeys("123");
		 Thread.sleep(4000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(3000);
		 driver.close();

	}
}
