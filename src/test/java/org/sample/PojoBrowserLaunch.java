package org.sample;

import java.io.IOException;

import org.baseclass.BasePojo;
import org.baseclass.FBLoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoBrowserLaunch extends BasePojo{
public static void main(String[] args) throws IOException {
		
		launchChrome();
		loadURL("http://www.facebook.com");
		maxwindow();
		
		printTittle();
		currenturl();
		
		FBLoginPojo f = new FBLoginPojo();
		
		
		fill(f.getTxtuser(), getdata(1, 0));
		
		fill(f.getTxtpass(), getdata(4, 2));
		
		clickbutton(f.getBtnlogin());
	}
}
