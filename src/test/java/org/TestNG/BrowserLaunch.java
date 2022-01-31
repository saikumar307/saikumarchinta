package org.TestNG;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BasePojo;
import org.baseclass.FBLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLaunch extends BasePojo{
	@BeforeClass
	private void LaunchBrowser() {
		launchChrome();
		maxwindow();
		
		
	}
	@AfterClass
	private void QuitBrowser() {
		driver.close();
	}
	@BeforeMethod
	private void StartTime() {
		loadURL("https://www.facebook.com");
		Date d = new Date();
		System.out.println(d);
		
	}
	@AfterMethod
	private void EndTime() {
		Date d = new Date();
		System.out.println(d);
		
	}
	@Test(priority=-8)
	private void tc1() throws IOException, InterruptedException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(2, 0));
		fill(f.getTxtpass(), getdata(2, 1));
		clickbutton(f.getBtnlogin());
		Thread.sleep(2000);
	}
	
	@Test(enabled=false)
	private void tc3() throws IOException, InterruptedException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(3, 0));
		fill(f.getTxtpass(), getdata(3, 1));
		clickbutton(f.getBtnlogin());
		Thread.sleep(2000);
	}
	
	@Test(invocationCount=3)
	private void tc2() throws IOException, InterruptedException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(1, 0));
		fill(f.getTxtpass(), getdata(1, 1));
		clickbutton(f.getBtnlogin());
		Thread.sleep(2000);	
	}
}
