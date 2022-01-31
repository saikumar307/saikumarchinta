package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\chsai\\eclipse-workspace\\Baseclass\\target\\Excels\\Data Driven Excel.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("saikumar");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		System.out.println(c);
		System.out.println("success");
		
	}
}
