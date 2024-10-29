package Fil1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	WebDriver driver;
	
	public void Loginpage(WebDriver ldriver) {
		this.driver = ldriver;
	}
		@FindBy(xpath="//*[@id=\"commonWebElements\"]/p[1]/a")
		WebElement Link;
		
		public void ClickTheLink() {
			
			try {
				Thread.sleep(2000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
			Link.click();
			
		}

}
