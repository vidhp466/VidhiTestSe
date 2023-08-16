package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTextbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

		WebElement element = driver.findElement(By.name("search"));
		element.click();
		element.sendKeys("iphone");
		element.clear();
		Thread.sleep(6000);
		element.sendKeys("macbook");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("button[class = 'btn btn-default btn-lg']")).click();
		driver.findElement(By.partialLinkText("About")).click();
		
		//Thread.sleep(6000);
		//driver.close();
		
//		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("macbook");
//		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
		
	}
}
