package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement ele = driver.findElement(By.id("column-a"));
		WebElement tar = driver.findElement(By.id("column-b"));
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.dragAndDrop(ele, tar).perform();
		Thread.sleep(4000);
		driver.close();

	}

}
