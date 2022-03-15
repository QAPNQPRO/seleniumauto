package testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import utilites.StartWeb;

public class TestLogin {
	
		StartWeb strweb = new StartWeb();
		WebDriver d = strweb.appStart();
	
	@Test
	public void logIn() {
		
		HomePage hp = new HomePage(d);
		hp.closePopup();
		hp.login();
	}
	
	
	
	
	
}
