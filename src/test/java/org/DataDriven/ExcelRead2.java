package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	public static void main(String[] args) throws IOException {
File f = new File("C:\\Users\\chsai\\eclipse-workspace\\Baseclass\\target\\Excels\\Data Driven Excel.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("saikumar");

		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell cell = r.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat sim =new SimpleDateFormat("dd, mmm, yyy");
						String value = sim.format(d);
						System.out.println(value);
						
						
					}
					else {
						double d = cell.getNumericCellValue();
						
						long l = (long)d;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
					
				}
	}
}
}
}