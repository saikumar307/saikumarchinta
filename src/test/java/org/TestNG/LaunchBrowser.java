package org.TestNG;

import org.testng.annotations.Test;

public class LaunchBrowser {
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("test 1");
	}
	@Test(groups="sanity")
	private void tc3() {
		System.out.println("test3");
	}
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("test 2");
	}
}
