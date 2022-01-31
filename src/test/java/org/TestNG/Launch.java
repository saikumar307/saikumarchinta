package org.TestNG;

import java.io.IOException;

import org.baseclass.BasePojo;
import org.testng.annotations.DataProvider;

public class Launch extends BasePojo{
	@DataProvider(name="loginData")
	private Object[][] data() throws IOException {
		
		return new Object[][] {
			
			
			{getdata(1, 0), getdata(1, 1)},
			{getdata(2, 0), getdata(2, 1)},
			{getdata(3, 0), getdata(3, 1)},
			{getdata(4, 0), getdata(4, 1)},
			
			
		};
}
}