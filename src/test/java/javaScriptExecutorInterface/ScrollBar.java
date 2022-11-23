package javaScriptExecutorInterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		// alert message
		
		js.executeScript("alert('Allu Arjun')");
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		driver.close();
		
		
	}

}
