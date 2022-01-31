package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUpdate {
	public static void main(String[] args) throws IOException {
		
	
	File f = new File("C:\\Users\\chsai\\eclipse-workspace\\Baseclass\\target\\Excels\\Data Driven Excel.xlsx");
	
	FileInputStream fin = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fin);
	
	Sheet s = w.getSheet("saikumar");
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		
		
		for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			
			int type = c.getCellType();
			if (type==1) {
				String value = c.getStringCellValue();
				if (value.equals("ORACLE")) {
					
					c.setCellValue("frameworks");
					
					FileOutputStream fout = new FileOutputStream(f);
					
					w.write(fout);
					
					System.out.println("updated");
					
					
					
					
				}
				
			}
		}
		
	}
	
	
	
	}	
}
