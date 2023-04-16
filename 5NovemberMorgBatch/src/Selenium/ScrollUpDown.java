package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String...args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.album.alexflueras.ro/index.php/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	 JavascriptExecutor scroll = (JavascriptExecutor)driver;
	 
	 scroll.executeScript("window.scrollBy(0,400)");  // scroll down
	 
	 Thread.sleep(2000);
	 
	 scroll.executeScript("window.scrollBy(0,-400)"); // scroll up
	 
	 Thread.sleep(2000);
	 
     scroll.executeScript("window.scrollBy(500,0)");  // scroll right
	 
	 Thread.sleep(2000);
	 
	 scroll.executeScript("window.scrollBy(-500,-0)"); // scroll left
	 
	 Thread.sleep(2000);
	 

}
}