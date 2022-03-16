package utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartWeb {
	
		WebDriver driver = null; 
		
		
		public WebDriver appStart() {
			System.setProperty("webdriver.gecko.driver", "/home/tuhin/.jenkins/workspace/testseleniumscript/src/main/resources/geckodriverlinux");
			this.driver = new FirefoxDriver();
			this.driver.navigate().to("https://www.flipkart.com/");
			this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			this.driver.manage().window().maximize();
			return driver;
		}
		
//		public static void appClose() {
//			driver.close();
//		}
//		
		
		
		
		
		
	}


