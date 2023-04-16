package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataCT {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Shraddha\\OneDrive\\Documents\\Selenium_StringData.xlsx");
		
		Sheet sheet1= WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0;i<=sheet1.getLastRowNum();i++)
		{
			for(int j=0;j<=sheet1.getRow(i).getLastCellNum()-1;j++)
			{
				Cell cellInfo= sheet1.getRow(i).getCell(j);
			    CellType CT= cellInfo.getCellType();
			    
			    if(CT == CellType.STRING)
			    {
			    	System.out.print(cellInfo.getStringCellValue()+ " ");
			    }
			    
			    else if(CT == CellType.NUMERIC)
			    {
			    	System.out.print(cellInfo.getBooleanCellValue()+ " ");
			    }
			    
			    else if(CT == CellType.BOOLEAN)
			    {
			    	System.out.print(cellInfo.getBooleanCellValue()+ " ");
			    }
			}
			System.out.println();
		}
	}

}
