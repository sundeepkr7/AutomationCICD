package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the last row number which contains data
		int rowcount = wb.getSheet("invalidlogin").getLastRowNum();
		
        for(int i=0; i<=rowcount; i++) {
        	String un = wb.getSheet("invalidlogin").getRow(i).getCell(0).getStringCellValue();
        	String pw = wb.getSheet("invalidlogin").getRow(i).getCell(1).getStringCellValue();
        	System.out.println(un+ " " +pw);
        	
        			
        }
		
	}

}
