package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListMultiProgram {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.facebook.com/reg/");
	    
	    WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	    
	    Select s= new Select(year);
	    
	    List<WebElement> option = s.getOptions();
	    
	    int size= option.size(); //to get size of listbox
	    
	    System.out.println(size);
	    
	    // to print all the options present in listbox
	    for(int i=0;i<=option.size()-1;i++) //to print all the options present in listbox
	    {
	    	System.out.println(option.get(i).getText());
	    }
	   
	    
	}

}
