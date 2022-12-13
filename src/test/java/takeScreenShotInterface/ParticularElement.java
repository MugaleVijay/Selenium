package takeScreenShotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticularElement {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Screen shot of section / Portion of the page
		WebElement ele = driver.findElement(By.xpath("(//div[@data-a-card-type=\"basic\"])[2]"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File tar = new File("./ScreenShot/amazon1Section.png");
		FileUtils.copyFile(src, tar);

		driver.close();
	}

}
