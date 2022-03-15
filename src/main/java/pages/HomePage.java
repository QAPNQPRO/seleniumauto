package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

	WebDriver driver ;
	
	@FindBy(xpath="//img[@title='Flipkart']") WebElement logo;
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']") WebElement productSearch;
	
	@FindBy(xpath = "//a[text()='Login']") WebElement loginBtn;
	@FindBy(xpath="") WebElement Web ;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void closePopup() { 
		WebElement popupCloser = driver.findElement(By.xpath("//button[text()='✕']"));
		popupCloser.click();
	}
	
	
	public void login() {
		
		String col = loginBtn.getCssValue("padding");
		
		
		System.out.println(col);
	
		loginBtn.click();
		WebElement enterEmail = driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/ancestor::label/preceding-sibling::input"));
		enterEmail.sendKeys("jojopaul8@gmail.com");
		
		
		
	}
}

	
	
	

