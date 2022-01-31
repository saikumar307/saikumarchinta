package org.TestNG;

import org.testng.annotations.Test;

public class ParallelLaunch {
	@Test
	private void tc1() {
		System.out.println("test 1:" +Thread.currentThread().getId());
	}
	
	@Test
	private void tc3(){
		System.out.println("test 3:"+Thread.currentThread().getId());
	}
	
	@Test
	private void tc2() {
		System.out.println("test 2:"+Thread.currentThread().getId());
	}
}
