package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenralMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

		Thread.sleep(5000);
		
		driver.navigate().refresh();
		driver.get("https://www.amazon.com/ref=nav_logo");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		boolean search = driver.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(search);
		
		boolean textboxenable = driver.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(textboxenable);
		
		
		driver.quit();
	}
}

