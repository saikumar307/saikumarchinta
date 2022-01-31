package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseClass {
	public static WebDriver driver;
	public static void launchChome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		
	}
	public static  void loadurl(String url) {
		driver.get(url);
		
	}
	public static void winmax() {
		driver.manage().window().maximize();
	}
	public static void printcurrenturl() {
		System.out.println(driver.getCurrentUrl());
	}
	public static void printtitle() {
		System.out.println(driver.getTitle());
		
	}
	public static void fill(WebElement element, String value) {
		element.sendKeys(value);
		
		
	}
	public static void btnclick(WebElement element) {
		element.click();
		
	}
	public static void click(WebElement Weblement) {
		Weblement.click();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static JavascriptExecutor js;

	public static void scrollpage(WebElement targetWebelement) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView()", targetWebelement);

	}
	public static void screenshoot(String imageName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\\\Users\\\\chsai\\\\eclipse-workspace\\\\chromeBrowser\\\\Screenshots\\\\saikumar.png");
		FileUtils.copyFile(source, destination);
	}

	public static Actions a;

	public static void movetoelement(WebElement target) {

		a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void dragAndDrop(WebElement source, WebElement target) {

		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void contextClick() {
		a.contextClick().perform();
	}

	public static void doubleclick() {
		a.doubleClick().perform();
	}
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
				System.out.println("saikumar");
				System.out.println("pushtoo");
	}
}