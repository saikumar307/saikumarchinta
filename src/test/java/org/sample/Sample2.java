package org.sample;

import org.baseclass.Base1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample2 extends Base1{
		public static void main(String[] args) {

			launchChrome();
			loadURL("http://adactinhotelapp.com/");
			maxwindow();
			
			printTittle();
			currenturl();
			WebElement user = driver.findElement(By.id("username"));
			fill(user, "greens@321");
			
			WebElement pass = driver.findElement(By.id("password"));
			fill(pass, "521001");
			
			WebElement btn = driver.findElement(By.name("login"));
			clickbutton(btn);
		}

	}

