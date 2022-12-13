package takeScreenShotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downcasting {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//downcasting
		RemoteWebDriver remote = (RemoteWebDriver) driver;
		File src = remote.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShot/fb.png");
		
		//Files.copy(src,new File("./ScreenShot/fbloinpage.png"));

		FileUtils.copyFile(src, dest);
		
		driver.close();
	}

}
