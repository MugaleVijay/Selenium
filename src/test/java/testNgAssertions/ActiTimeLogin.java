package testNgAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLogin {
	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String loginpagetitle = driver.getTitle();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(loginpagetitle,"VIjay - Login");   // softAssert
		
		WebElement usertb = driver.findElement(By.name("username"));
		boolean statusOfUserTb = usertb.isDisplayed();
		Assert.assertEquals(statusOfUserTb, true);                // hard assert
		usertb.sendKeys("manager");
		
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		boolean statusOfPasswordTb = passwordTB.isDisplayed();
		Assert.assertEquals(statusOfPasswordTb, true );          // hard Assert
		passwordTB.sendKeys("123");
		
		WebElement clickButton = driver.findElement(By.id("loginButton"));
		boolean statusOfClickButton = clickButton.isDisplayed();
		Assert.assertEquals(statusOfClickButton, true);          //hard assert
		clickButton.click();
		Thread.sleep(4000);
		
		String actualHomePageTitle = driver.getTitle();
		softassert.assertNotEquals(actualHomePageTitle,"actiTIME - Enter Time-Track");
		
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		
		softassert.assertAll();  // user mandatory line when soft assert is used 
	}
	

}
