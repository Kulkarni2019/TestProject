package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElement {
	
	public static void main(String...args) throws InterruptedException
	{
		WebDriver web= new ChromeDriver();
		
		web.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(1000);
		
		List<WebElement> noOfRows = web.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println(noOfRows.size());
		
		List<WebElement> noOfCells = web.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
		
		System.out.println(noOfCells.size());
	}

}
