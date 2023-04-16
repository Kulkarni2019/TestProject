package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintMultipleRowData {
	
	public static void main(String...args) throws EncryptedDocumentException, IOException
	{
		FileInputStream input = new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_StringData.xlsx");
		Sheet sheets = WorkbookFactory.create(input).getSheet("Sheet1");
		for(int i=0;i<sheets.getLastRowNum();i++)
		{
			for(int j=0;j<=sheets.getRow(i).getLastCellNum()-1;j++)
			{
				String data1= sheets.getRow(i).getCell(j).getStringCellValue();
				System.out.print("" +data1);
			}
			System.out.println();
		}
	}

}