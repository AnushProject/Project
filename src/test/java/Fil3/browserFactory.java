package Fil3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserFactory {
	
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appUrl) {
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
			}
				
			
		else {
			System.err.println("Wrong Driver");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	public static void QuitBrowser(WebDriver driver) {
		driver.close();
		
	}

}
