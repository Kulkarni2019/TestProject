package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastCellNum {

	public static void main(String...args) throws EncryptedDocumentException, IOException
	{
		FileInputStream input = new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_Fetchdata.xlsx");
		int lastcell = WorkbookFactory.create(input).getSheet("Sheet1").getRow(1).getLastCellNum();
		System.out.println(lastcell);
	}
}
