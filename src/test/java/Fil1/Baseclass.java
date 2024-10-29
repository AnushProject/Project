package Fil1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Fil3.browserFactory;

public class Baseclass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = browserFactory.startApplication(driver,"Chrome", "https://artoftesting.com/samplesiteforselenium");
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		browserFactory.QuitBrowser(driver);
		
	}

}
