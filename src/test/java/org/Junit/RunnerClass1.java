package org.Junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass1 {
	
	@Test
	public void tc40() {
		Result rs = JUnitCore.runClasses(Client1.class,Employee1.class);
		System.out.println("Run count: "+ rs.getRunCount());
		System.out.println("Failure Count:"+rs.getFailureCount());
		System.out.println("Ignore Count:"+rs.getIgnoreCount());
		System.out.println("Run Time:"+ rs.getRunTime());
		List<Failure> list = rs.getFailures();
		
		for (Failure x : list) {
			
			System.out.println(x);
			
			
			
		}
	}
}
