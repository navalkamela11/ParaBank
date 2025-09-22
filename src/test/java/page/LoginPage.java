package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	
	WebDriver driver;
	
	@FindBy( xpath = "//input[@name='username']")
	WebElement UserName;
	
	@FindBy ( xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy ( xpath = "//input[@value='Log In']")
	WebElement LoginBtn;
	
	@FindBy( id = "p")
	WebElement error;
	
	
	
	
	public LoginPage(WebDriver p1) {
		driver = p1;
		PageFactory.initElements(driver, this);// @find by will only work with this
		
	}
	
	public void LoginFunction(String uname, String pwd) {
	
		
		//Enter Username
		UserName.sendKeys(uname);
				
		//Enter Password
		Password.sendKeys(pwd);
				
		//Click the login Button
		LoginBtn.click();
		
	}
	
	public void ValidateErrorMessage(String ErrorMessage) {
		WebElement error = driver.findElement(By.tagName("p"));
		Assert.assertTrue(error.isDisplayed());
		
	}
	
	public void ValidateMessage(String Message) {
		WebElement text = driver.findElement(By.cssSelector(".title"));
		Assert.assertTrue(text.isDisplayed());
		
	}
	
	

}
