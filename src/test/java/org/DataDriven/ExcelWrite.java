package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\chsai\\eclipse-workspace\\Baseclass"
				+ "\\target\\Excels\\saikumarch.xlsx");
		
		boolean a = f.createNewFile();
		System.out.println(a);
		
		FileInputStream file = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet c = w.createSheet("greens");
		Row row = c.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue("saikumar@gmail.com");
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		
		System.out.println("Success");
		
		
	}
}
