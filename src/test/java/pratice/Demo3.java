package pratice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[.=' SkillRary Demo APP']) [2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		
		driver.findElement(By.xpath("(//a[.='Selenium Training'])[2]")).click();

	
	}
}
