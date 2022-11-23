package popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_sendKeys {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// send keys use for if there are type="file" attribute present
		
		driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys("C:\\pratice\\file.txt");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}

