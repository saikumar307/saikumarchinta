package org.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed2 {
	@Test
	private void tc3() {
		Assert.assertTrue(false, "please check the test");
		System.out.println("test 3");
	}
	@Test
	private void tc1() {
		System.out.println("test 1");
	}
	@Test
	private void tc2() {
		Assert.assertTrue(false, "please check the test");

		System.out.println("test 2");
	}
}
