package Parameterization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BooleanCellValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream files= new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_Fetchdata.xlsx");
		boolean data1= WorkbookFactory.create(files).getSheet("Sheet1").
				getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(data1);
	}
}
