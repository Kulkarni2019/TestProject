package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //upcasting
		driver.get("https://www.facebook.com/"); //used to launch application
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.quit();
		
	}
}
