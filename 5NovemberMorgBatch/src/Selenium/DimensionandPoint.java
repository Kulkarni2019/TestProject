package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionandPoint {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drivers= new ChromeDriver();
		
		drivers.get("https://hotstar.com/");
		
		Thread.sleep(5000);
		
		Dimension d= new Dimension(200,300);
		drivers.manage().window().setSize(d);
		
		Thread.sleep(5000);
		
		Point p= new Point(300,400);
		drivers.manage().window().setPosition(p);
		
		System.out.println(drivers.manage().window().getSize());
		
		
		
	    Thread.sleep(5000);
	    
	    
		
	}

}
