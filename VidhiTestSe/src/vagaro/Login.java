package vagaro;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Login {

	@Test
	public void validLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vagaro.com/");


		driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/header/nav[1]/div[4]/a[6]")).click();

		Thread.sleep(5000);

		driver.findElement(By.id("txtUsernameP")).sendKeys("rs2");
		driver.findElement(By.id("txtPasswordP")).sendKeys("Vagaro@09");
		driver.findElement(By.id("btLogin")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

	@Test
	public void invalidLogin() throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vagaro.com/");
		System.out.println(driver.getTitle());


		driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/header/nav[1]/div[4]/a[6]")).click();

		Thread.sleep(5000);
		
		Date currentdate = new Date();
		String scrFilename = currentdate.toString().replace(" ","-").replace(":","-");
		
		driver.findElement(By.id("txtUsernameP")).sendKeys("");
		driver.findElement(By.id("txtPasswordP")).sendKeys("");
		driver.findElement(By.id("btLogin")).click();
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(".//screen shots/"+scrFilename+".png"));
		Thread.sleep(3000);


		driver.findElement(By.id("txtUsernameP")).sendKeys("rs");
		driver.findElement(By.id("txtPasswordP")).sendKeys("Vagaro");
		driver.findElement(By.id("btLogin")).click();
		Thread.sleep(3000);

		String expectedTitle = "Book Your Next Salon, Spa, Or Fitness Appointment | Vagaro";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {

			System.out.println("Log in unsuccessful");
		}
		else {
			System.out.println(driver.getTitle()+"Log in successful");
		}
		Thread.sleep(3000);

		driver.quit();
	}
}
