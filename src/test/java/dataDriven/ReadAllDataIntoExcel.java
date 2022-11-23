//WAS to read all the data excel sheet 
package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataIntoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		for (int i=0; i<=sh.getLastRowNum();i++) 
		{
			Row r = sh.getRow(i);
			
			for (int j=0;j<r.getLastCellNum();j++) 
			{
				Cell c = r.getCell(j);
				String values = c.toString();
				System.out.println(values);
				
			}
			System.out.println();
				
		}
	}

}
