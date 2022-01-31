package org.TestNG;

import org.testng.annotations.Test;

public class Launchbrowser1 {
	@Test(groups="regretion")
	private void tc11() {
		System.out.println("test 11");
	}
	@Test(groups="sanity")
	private void tc33() {
		System.out.println("test 33");
	}
	@Test(groups="culture")
	private void tc22() {
		System.out.println("test 22");
	}
}
