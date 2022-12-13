package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	// window

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
		Thread.sleep(3000);
		// minimize
		driver.manage().window().minimize();

		Thread.sleep(3000);
		// full screen
		driver.manage().window().fullscreen();


		

	}

}