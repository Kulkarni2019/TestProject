package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) throws InterruptedException
	
	{
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		Thread.sleep(1000);
		
        //driver.switchTo().alert().accept();
        
        driver.switchTo().alert().dismiss();
		
	}

}
