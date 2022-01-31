package org.TestNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Failed implements IRetryAnalyzer{
	
	
	int min=0; int max= 3;

	public boolean retry(ITestResult result) {
		
		if (min<max) {
			
			
			min++;
			return true;
		}

		
		
		
		return false;
	}
	
}
