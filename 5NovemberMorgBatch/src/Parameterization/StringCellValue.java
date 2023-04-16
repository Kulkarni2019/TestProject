package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringCellValue {


	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream input= new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_Fetchdata.xlsx");
		String str= WorkbookFactory.create(input).
		getSheet("Sheet1").getRow(2).getCell(3).getStringCellValue();
		System.out.println(str);
		
	}

}
