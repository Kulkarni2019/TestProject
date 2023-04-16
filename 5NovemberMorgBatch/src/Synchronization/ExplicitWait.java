package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/login.php");
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9823628430");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shree@1234");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='1']"))).click();
	   }

}
