package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currenturl {
	
	public static void main(String...args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String expurl = "https://cricbuzz.com/";
		
		if(url.equalsIgnoreCase(expurl))
		{
			System.out.println("Navigate to valid page");
		}
		else
		{
			System.out.println("Navigate to invalid page");
		}
	}

}
