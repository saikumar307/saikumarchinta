package org.baseclass;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePojo {
	public static WebDriver driver;
	public static  void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	public static void loadURL(String url) {
		driver.get(url);
	}
	
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	
	public static void printTittle() {
		System.out.println(driver.getTitle());
		
	}
	public static void currenturl() {
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public static void fill(WebElement element,String value) {
	element.sendKeys(value);
	
	}
	public static void clickbutton(WebElement element) {
		element.click();

	}
	public static String getdata(int rowNumber, int cellNumber) throws IOException {
File f = new File("C:\\Users\\chsai\\eclipse-workspace\\Baseclass\\target\\Excels\\Data Driven Excel.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("saikumar");
		
		
			Row r = s.getRow(rowNumber);
			
			
				Cell cell = r.getCell(cellNumber);
				int cellType = cell.getCellType();
				String value = "";
				if (cellType==1) {
				 value = cell.getStringCellValue();
					
					
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat sim =new SimpleDateFormat("dd, mmm, yyy");
						 value = sim.format(d);
					
						
						
					}
					else {
						double d = cell.getNumericCellValue();
						
						long l = (long)d;
						 value = String.valueOf(l);
					
					}
					
				}
				return value;
	}
	
	
}




