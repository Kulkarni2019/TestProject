package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement source= driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		//WebElement sources= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//WebElement destinations = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions acts= new Actions(driver);
		
		Thread.sleep(1000);
		
		acts.moveToElement(source).clickAndHold().moveToElement(destination).
		release().build().perform();
		
		
}
}