package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabNewWindow {
	
	public static void main(String...args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver c= new ChromeDriver();
		c.get("https://www.instagram.com/");
		
		c.switchTo().newWindow(WindowType.WINDOW);
		
		c.get("https://www.facebook.com/");
		c.quit();
	}

}
