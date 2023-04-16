package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	
	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
     
     WebDriver a= new ChromeDriver();
     a.get("https://geeksforgeeks.com/");
     Thread.sleep(4000);
     
     a.navigate().to("https://w3schools.com/");
     Thread.sleep(4000);
     
     a.navigate().back();
     Thread.sleep(4000);
     
     a.navigate().forward();
     Thread.sleep(4000);
     
     a.navigate().refresh();
     Thread.sleep(4000);
     
     a.manage().window().maximize();
     Thread.sleep(4000);
     
     a.manage().window().minimize();
     Thread.sleep(4000);
     
     a.close();
     }
}
