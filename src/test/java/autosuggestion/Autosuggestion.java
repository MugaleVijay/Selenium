package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("seleni");
		List<WebElement> ele =driver.findElements(By.xpath("//div[@role='option']"));
		System.out.println(ele.size());
		
		for(int i=0; i<ele.size(); i++)
		{
			WebElement options=ele.get(i);
			System.out.println(options.getText());
		}
		driver.quit(); 
			
		

	}

}
