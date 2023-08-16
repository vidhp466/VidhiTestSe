package vagaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vagaro.com/");
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/header/nav[1]/div[4]/a[6]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Sign Up Now']")).click();
		Thread.sleep(10000);
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.click();
		firstname.sendKeys("vidhi");
		//driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("vidhi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/form/div[4]/div/div/article/div/div[1]/div[1]/div[2]/div/input")).sendKeys("patel");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"txtCell\"]")).sendKeys("1234567890");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys("patel@patel.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"txtRPassword\"]")).sendKeys("Vagaro@1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btnRegister\"]")).click();
		
		
		Thread.sleep(5000);
		
		
	}

}
