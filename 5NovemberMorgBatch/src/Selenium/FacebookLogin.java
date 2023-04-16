package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String...args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9823628430");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shree@1234");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//button[@value='1']")).click();
	    Thread.sleep(2000);
	    }
}
