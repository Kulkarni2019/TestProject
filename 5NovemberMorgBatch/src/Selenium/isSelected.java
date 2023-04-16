package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isSelected {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver web= new FirefoxDriver();
		web.get("https://www.facebook.com/reg/");
		
		WebElement female= web.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		female.click();
		
		boolean result= female.isSelected();
		System.out.println(result);
		
		if(result == true)
		{
			System.out.println("Given element is selected");
		}
		
		else
		{
			System.out.println("Given element is not selected");
		}
	}

}
