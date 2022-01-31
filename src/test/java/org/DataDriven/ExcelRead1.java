package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	public static void main(String[] args) throws IOException {
File f = new File("C:\\Users\\chsai\\eclipse-workspace\\Baseclass\\target\\Excels\\Data Driven Excel.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("saikumar");
		
		int a = s.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows:"+a);
		
		Row r = s.getRow(3);
		int b = r.getPhysicalNumberOfCells();
		System.out.println("physicalNumberOfCells:"+b);
		
	}
}
