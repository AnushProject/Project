package Fil2;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Fil1.Baseclass;
import Fil1.loginpage;



public class Runpage extends Baseclass{
	@Test
	public void loginapp() {
		loginpage loginpage = PageFactory.initElements(driver,loginpage.class);
		
		loginpage.ClickTheLink();
	}
	
	

}
