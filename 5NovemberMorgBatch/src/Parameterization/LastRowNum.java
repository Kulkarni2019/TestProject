package Parameterization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowNum {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream files = new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_Fetchdata.xlsx");
		
		int lastRowNum= WorkbookFactory.create(files).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(lastRowNum + 1);
	}

}
