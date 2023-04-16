package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertCancel {
	
	static public void main(String...args) throws InterruptedException
	{
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
		
	}

}
