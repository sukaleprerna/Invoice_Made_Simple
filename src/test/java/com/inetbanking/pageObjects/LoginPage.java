package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);    // We Will Created The Counstructor
		
	}
		
		@FindBy(name="username")
		WebElement txtUserName;            //First Element to identify
		
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtpassword; 
		
		
		@FindBy(name="submit")
		@CacheLookup
		WebElement btnLogin;
		
		public void setUserName(String uname)
		{
		
		txtUserName.sendKeys(uname);
		
}
	
		public void setpassword(String pwd)
		{
		
			txtpassword.sendKeys(pwd);

}
		
		public void ClickSubmit()
		{
		
		btnLogin.click();
		
		}
}
		
		
