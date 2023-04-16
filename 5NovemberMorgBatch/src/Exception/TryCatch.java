package Exception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TryCatch {
	
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.netflix.com/in/login");
	
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kulkarnishraddha35@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubhu@897");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\'btn login-button btn-submit btn-small\']")).click();
		Thread.sleep(2000);
		
		try {
			driver.findElement(By.xpath("//input[@type='password12']")).sendKeys("shubhu@897");
			try
	        {
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	    }
	        catch(TimeoutException t)
	        {
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	        }
		}
		
		catch(NoSuchElementException e){
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubhu@897");
	 
	        /*try
	        {
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	    }
	        catch(TimeoutException t)
	        {
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	        }*/
		}
		System.out.println("Login successful.");
	}

}
