package autoIt;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();",ele);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C://AutoItfiles/fileupload.exe"+" "+"C:\\pratice\file.txt");

	}

}

