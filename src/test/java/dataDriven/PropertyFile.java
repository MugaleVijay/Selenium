package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		Properties  p= new Properties();
		FileInputStream fis=new FileInputStream("./data.properties");
		p.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
				

	}

}
