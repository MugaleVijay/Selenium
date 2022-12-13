package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement button = driver.findElement(By.id("loginButton"));

		if (button.isEnabled()) {
			System.out.println("Pass:element is enabled");
			button.click();
		} else {
			System.out.println("ail:element is not enabled");
		}

		driver.close();

	}

}