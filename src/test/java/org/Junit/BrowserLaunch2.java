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

public class BrowserLaunch2 extends BasePojo{
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
		fill(f.getTxtuser(), getdata(1, 0));
		fill(f.getTxtpass(), getdata(4, 2));
		clickbutton(f.getBtnlogin());
	}

}
