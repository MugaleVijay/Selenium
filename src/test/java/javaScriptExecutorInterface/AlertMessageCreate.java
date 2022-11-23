package javaScriptExecutorInterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class AlertMessageCreate {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('Allu Arjun')");
		Thread.sleep(2000);
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		
	}

}
