package org.Junit;

import org.junit.Assert;
import org.junit.Test;

public class Employee1 {
	@Test
	public void tc11() {
		System.out.println("test 11");	
	}
	@Test
	public void tc33() {
		Assert.assertTrue("Verify tc33", false);
		System.out.println("test 33");	
	}
	@Test
	public void tc22() {
		System.out.println("test 22");	
	}

}
