package org.TestNG;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void tc1(String name) {
		if (name.equals("chrome") ) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if (name.equals("ff")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver =new FirefoxDriver();
			
		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("greens");
		driver.findElement(By.id("pass")).sendKeys("greens@123");
		
	}
}
