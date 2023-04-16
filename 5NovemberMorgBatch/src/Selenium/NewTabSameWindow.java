package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabSameWindow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver web= new FirefoxDriver();
		
		web.get("https://www.google.com/");
		
		web.switchTo().newWindow(WindowType.TAB);
		
		web.get("https://www.flipkart.com/");
		
	}
}
