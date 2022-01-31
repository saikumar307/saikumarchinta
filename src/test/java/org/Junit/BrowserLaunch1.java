package org.Junit;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseData;
import org.baseclass.BasePojo;
import org.baseclass.FBLoginPojo;
import org.baseclass.FBLoginPojo1;
import org.baseclass.SeleniumBaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BrowserLaunch1 extends BasePojo{
	@BeforeClass
	public static void launchingChrome() {
		launchChrome();
		loadURL("https://www.facebook.com");
		maxwindow();
		
		
	}
	@AfterClass
	public static  void quitBrowser() {
		//driver.close();
	}
	@Before
	public void startTime() {
		Date d= new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d= new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws IOException  {
		
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(4, 2));
		//fill(f.getTxtpass(), getdata(4, 2));
		//clickbutton(f.getBtnlogin());
		

	}
	@Test
	public void tc3() throws IOException {

	FBLoginPojo f =new FBLoginPojo();
	fill(f.getTxtpass(), getdata(1, 0));
	
	}	
	@Test
	public void tc2()  {

	FBLoginPojo f =new FBLoginPojo();
	clickbutton(f.getBtnlogin());
	}	
}
