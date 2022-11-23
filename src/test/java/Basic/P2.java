package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P2 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 driver.findElement(By.name("login-button")).click();
	}

}
