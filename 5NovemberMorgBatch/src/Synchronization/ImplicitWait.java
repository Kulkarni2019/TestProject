package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) deprecated method(currently not in use)
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9823628430");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shree@1234");

	    driver.findElement(By.xpath("//button[@value='1']")).click();

		
	}

}
