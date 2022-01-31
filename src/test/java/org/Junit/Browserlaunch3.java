package org.Junit;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BasePojo;
import org.baseclass.FBLoginPojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Browserlaunch3 extends BasePojo {
	@BeforeClass
	public static void launchingChrome() {
		launchChrome();
		
		maxwindow();
		
		
	}
	@AfterClass
	public static  void quitBrowser() {
		driver.close();
	}
	@Before
	public void startTime() {
		loadURL("https://www.facebook.com");
		Date d= new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d= new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws IOException, InterruptedException  {
		
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(1, 0));
		fill(f.getTxtpass(), getdata(4, 2));
		clickbutton(f.getBtnlogin());
		Thread.sleep(2000);
	}
	@Test
	public  void tc2() throws IOException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(2, 0));
		fill(f.getTxtpass(), getdata(1, 1));
		clickbutton(f.getBtnlogin());
	}
}
