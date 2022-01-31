package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPojo1 extends BasePojo{
public FBLoginPojo1() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='text']")
		
	})
	private WebElement txtuser;
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(id="//input[@type='password']")
	})
	private WebElement txtpass;
	
	
		
		@FindBy(xpath="//button[@name='login']")
		private WebElement btnlogin;



		public WebElement getTxtuser() {
			return txtuser;
		}



		public WebElement getTxtpass() {
			return txtpass;
		}



		public WebElement getBtnlogin() {
			return btnlogin;
		}

	
}
