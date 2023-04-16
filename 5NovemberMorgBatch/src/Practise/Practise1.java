package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.vbout.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//li[@id='menu-item-84169']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='Marketing Automation Platform']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
}
