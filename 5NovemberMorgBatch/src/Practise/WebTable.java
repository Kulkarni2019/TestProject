package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html?utm_content=anc-true");
		
		Thread.sleep(3000);
		
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		//System.out.println(noOfRows.size());
		
		for(int i=1;i<=noOfRows.size();i++)
		{
			List<WebElement> noOfCells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i + 1)+"]//td"));
			//System.out.println(noOfCells.size());
			
			for(int cell=0; cell<noOfCells.size();i++)
			{
				System.out.print(noOfCells.get(cell).getText()+ "");
			}
			System.out.println();
		}
		
		
	}
}
