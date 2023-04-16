package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {
	
	public static void main(String[] args)

	{
		WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.facebook.com/reg/");
	    
	    WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	    
	    Select s= new Select(month);
	    
	    List<WebElement> allOptions = s.getAllSelectedOptions();
	    
	    for(int i=0; i<=allOptions.size()-1;i++) //to print all the options present in listbox
	    {
	    	System.out.println(allOptions.get(i).getText());
	    }

    }
}
