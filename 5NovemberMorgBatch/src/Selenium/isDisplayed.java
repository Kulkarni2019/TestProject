package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	
	public static void main(String...args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		//WebElement customGen= driver.findElement(By.xpath("//input[@class='_58mt']"));
		
		//boolean result= customGen.isDisplayed();
		
		//System.out.println(result);
		
		WebElement text=driver.findElement(By.xpath("//div[@class='mtm mbs_2_68']"));
		
		String result=text.getText();
		System.out.println(result);
	}

}
