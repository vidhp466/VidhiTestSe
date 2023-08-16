package JioMart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoover {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Groceries"))).perform();
		
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Premium Fruits"))).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Home & Kitchen"))).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Fashion"))).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Electronics"))).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Beauty"))).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Home Improvement"))).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Sports, Toys & Luggage"))).perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
