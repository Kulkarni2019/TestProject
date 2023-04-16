package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NetflixLogin {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
	driver.get("https://www.netflix.com/in/login");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kulkarnishraddha35@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubhu@897");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class=\'btn login-button btn-submit btn-small\']")).click();
	Thread.sleep(2000);
	}
}
