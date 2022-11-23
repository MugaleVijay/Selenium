package newWindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createNewWindow {

	public static void main(String[] args) {
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.instagram.com/accounts/login/");
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		driver.close();
	
	}
}
