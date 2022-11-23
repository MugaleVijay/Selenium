package pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=hp+laptop&sprefix=hp+%2Caps%2C300&ref=nb_sb_ss_ts-doa-p_2_3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.getTitle();
		String text=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole'])[1]")).getText();
	    System.out.println(text);
		driver.close();
	
	}

}


		
		