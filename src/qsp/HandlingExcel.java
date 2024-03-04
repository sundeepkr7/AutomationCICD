package qsp;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//get the java representative object of the physical file
		FileInputStream fis =new FileInputStream("./data/testscript.xlsx");
		
		//create workbook or open the excel in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the control of the sheet, then row, then cell and then read the data
		String data = wb.getSheet("create customer").getRow(1).getCell(2).getStringCellValue();
		
		//print the data on the console
		System.out.println(data);
	}	
}
