package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
	public static void main(String...args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		 ArrayList<String> al = new ArrayList<String>(id);
		 
		 String s= al.get(1); // child browser address
		 
		 driver.switchTo().window(s);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
		 
		 driver.switchTo().window(al.get(2));

		 }

}
