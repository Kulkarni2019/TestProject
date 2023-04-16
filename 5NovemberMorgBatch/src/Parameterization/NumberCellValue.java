package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumberCellValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	    FileInputStream file= new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_Fetchdata.xlsx");
	    double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1)
	    		.getNumericCellValue();
	    System.out.println(data);
	}

}
