package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertOk {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver web= new ChromeDriver();
		
		web.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		web.manage().window().maximize();
		
		web.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		Thread.sleep(1000);
		
		web.switchTo().alert().accept();
	}

}
