package org.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	private void LaunchBrowser() {
		System.out.println("Browser Launch");
	}
	@AfterClass
	private void QuitBrowser() {
		System.out.println("Quit");
	}
	@BeforeMethod
	private void StartTime() {
		System.out.println("Start");
	}
	@AfterMethod
	private void EndTime() {
		System.out.println("End");
	}
	@Test
	private void tc1() {
		System.out.println("Test 1");
	}@Test
	private void tc3() {
		System.out.println("Test 3");
	}@Test
	private void tc2() {
		System.out.println("Test 2");
	}
}
