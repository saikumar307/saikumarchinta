package org.sample;

import java.io.IOException;

import org.baseclass.BaseData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDrivenSample extends BaseData {
public static void main(String[] args) throws IOException {
		
		launchChrome();
		loadURL("http://www.facebook.com");
		maxwindow();
		
		printTittle();
		currenturl();
		WebElement user = driver.findElement(By.id("email"));
		fill(user, getdata(2, 0));
		
		WebElement pass = driver.findElement(By.id("pass"));
		fill(pass, getdata(4, 2));
		
		WebElement btn = driver.findElement(By.name("login"));
		clickbutton(btn);
	}
}
