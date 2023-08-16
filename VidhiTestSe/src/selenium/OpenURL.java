package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("learn vidhi learn");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1122334455");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("778899445566");
		Thread.sleep(3000);
		
		
		
		
	}

}
