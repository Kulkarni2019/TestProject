package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintRowData {
	
	public static void main(String...args) throws EncryptedDocumentException, IOException
	{
		FileInputStream files = new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_Fetchdata.xlsx");
		org.apache.poi.ss.usermodel.Sheet sheet1 = WorkbookFactory.create(files).getSheet("Sheet1");
		short cellsize= sheet1.getRow(1).getLastCellNum();
		System.out.println(cellsize);
		
		for(int i=0;i<cellsize;i++)
		{
			String data= sheet1.getRow(1).getCell(i).getStringCellValue();
			System.out.print(" "+data);
		}
		
	}

}
