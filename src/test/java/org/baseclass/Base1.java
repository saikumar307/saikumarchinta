package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	
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
	
}
