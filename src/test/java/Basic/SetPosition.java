package Basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetPosition {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Point P=new Point(400,400);
		driver.manage().window().setPosition(P);
		
	}

}
