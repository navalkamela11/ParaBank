package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

WebDriver driver;
	
	@BeforeMethod(alwaysRun =true)
	public void Launch(){
		
		String BrowserName = System.getProperty("Browser");
		
		if(BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		// Launch the Google.com
		driver = new FirefoxDriver();
				
		//Launch the browser
		driver.get(" https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@AfterMethod(alwaysRun =true)
	public void TearDown() {
		
		driver.quit();
	}
}
