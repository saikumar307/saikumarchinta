package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BrowserLaunch {
	@BeforeClass
	public static void launchingChrome() {
		System.out.println("chrome");
		
	}
	@AfterClass
	public static  void quitBrowser() {
		System.out.println("quit");
		
	}
	@Before
	public void startTime() {
		System.out.println("start");
		
	}
	@After
	public void endTime() {
		System.out.println("end");
		
	}
	@Test
	public void tc2() {
		System.out.println("test2");
	}
	@Ignore
	@Test
	public void tc1() {
		System.out.println("test1");
}
	@Test
	public void tc3() {
		System.out.println("test3");
}
}
