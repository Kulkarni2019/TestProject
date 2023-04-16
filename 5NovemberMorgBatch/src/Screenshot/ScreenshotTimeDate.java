package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotTimeDate {
	public static void main(String[] args) throws IOException
	{
		WebDriver drive= new FirefoxDriver();
		drive.get("https://www.hotstar.com/gb/subscribe/sign-in/");
		
		for(int i=1;i<=3;i++)
		{
		File source= ((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(3);
		File destination = new File("C:\\Users\\Shraddha\\ManualTesting\\screenshot"+random+""+timestamp()+".jpg");
		FileHandler.copy(source, destination);
	}
	}

	public static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());
	}

}
