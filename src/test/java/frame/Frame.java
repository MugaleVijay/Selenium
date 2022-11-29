package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[normalize-space()='iFrame'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='New document'])[4]")).click();
		
		//switch to the frame
		driver.switchTo().frame(0);     
		driver.findElement(By.id("tinymce")).sendKeys("handling the frame ");
		
		//switch back from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
		driver.findElement(By.xpath("(//div[normalize-space()='Select all'])[1]")).click();
		driver.findElement(By.xpath("(//*[name()='path'])[8]")).click();
		driver.close();
		
	}

}
