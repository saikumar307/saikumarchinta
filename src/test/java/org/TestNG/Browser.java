package org.TestNG;

import org.testng.annotations.DataProvider;

public class Browser {
	@DataProvider(name="loginData")
	private Object[][] data() {
		
		return new Object[][] {
			
			
			{"greenstech","greens@123"},
			{"dhoni","dhoni@123"},
			{"virat","virat@123"},
			{"sachin","sachin@123"},
			
			
			
			
		};
}
}