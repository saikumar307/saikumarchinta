package org.TestNG;

import org.testng.annotations.Test;

public class ParallelBrowser {
	@Test
	private void tc11() {
		System.out.println("test 11:" +Thread.currentThread().getId());
	}
	
	@Test
	private void tc33(){
		System.out.println("test 33:"+Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
		System.out.println("test 22:" +Thread.currentThread().getId());
	}
	
	
}
