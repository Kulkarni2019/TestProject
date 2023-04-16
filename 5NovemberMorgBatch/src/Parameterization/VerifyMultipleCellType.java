package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyMultipleCellType {
	
	public static void main(String...args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_VerifyData.xlsx");
		
		Cell cellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(1);
		CellType CT= cellInfo.getCellType();
		
		if(CT == CellType.STRING)
		{
			System.out.println(cellInfo.getStringCellValue());
		}
		else if(CT == CellType.NUMERIC)
		{
			System.out.println(cellInfo.getNumericCellValue());
		}
		else if(CT == CellType.BOOLEAN)
		{
			System.out.println(cellInfo.getBooleanCellValue());
		}
	}

}
