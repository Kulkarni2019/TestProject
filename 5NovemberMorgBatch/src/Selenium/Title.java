package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		//driver.close();  current tab closed
		//driver.quit();   current browser closed
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String exptitle= "E-commerce shopping site for Electronics,Health & Household";
		
		if(title.equalsIgnoreCase(exptitle))
		{
			System.out.println("Navigate to correct page");
		}
		else
		{
			System.out.println("Navigate to invalid page");
		}
	}
	

}
