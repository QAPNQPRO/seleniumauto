package utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartWeb {
	
		WebDriver driver = null; 
		
		
		public WebDriver appStart() {
			System.setProperty("webdriver.chrome.driver", "/home/tuhin/.jenkins/workspace/testseleniumscript/src/main/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}
		
//		public static void appClose() {
//			driver.close();
//		}
//		
		
		
		
		
		
	}


