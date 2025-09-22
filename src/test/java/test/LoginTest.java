package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void LoginSuccess() {
		
		LoginPage login = new LoginPage(driver);
	
		String uname = "sampleTest";
		String pwd = "sampleTest";
		
		login.LoginFunction(uname, pwd);
		
		// Assert Account Overview
		login.ValidateMessage("Account Overview");
		
	}
	
		@Test
		public void LoginFailureTest() {
		
		LoginPage login = new LoginPage(driver);
		String uname = "hghv";
		String pwd = "hghv";
		
		login.LoginFunction(uname, pwd);
		login.ValidateErrorMessage("The username and password could not be verified.");
		
	}
	
	
	
	
	

}
