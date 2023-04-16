package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		WebElement Month= driver.findElement(By.xpath("//select[@title='Month']"));
	   
		Select s= new Select(Month);
		//s.selectByIndex(3);
		//s.selectByValue("7");
		//s.selectByVisibleText("Jun");
		
		System.out.println(s.getFirstSelectedOption().getText());
	}
}
