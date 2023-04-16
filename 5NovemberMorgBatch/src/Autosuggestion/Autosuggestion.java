package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Flipkart");
		
		Thread.sleep(2000);
		
		List<WebElement> option = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		
//		for(int i=0;i<option.size();i++)
	//	{
//			System.out.println(option.get(i).getText());
		//}
		
		for(WebElement Eachoption : option)     // advanced for loop
		{
			System.out.println(Eachoption.getText());
		}
		
	}

}
