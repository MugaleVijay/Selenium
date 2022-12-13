package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Thread.sleep(2000);
        //back
		driver.navigate().back();

		Thread.sleep(2000);
        //forward
		driver.navigate().forward();

		Thread.sleep(2000);
        //refresh
		driver.navigate().refresh();

	}

}