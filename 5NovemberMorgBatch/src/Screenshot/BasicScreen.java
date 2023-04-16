package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class BasicScreen {

	public static void main(String[] args) throws IOException
	{
		WebDriver drive= new ChromeDriver();
		drive.get("https://www.netflix.com/in/Login/");
		
		for(int i=1;i<=3;i++)
		{
		File source= ((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(2);
		File destination = new File("C:\\Users\\Shraddha\\ManualTesting\\screen"+random+".jpg");
		FileHandler.copy(source, destination);
	}
	}
}
