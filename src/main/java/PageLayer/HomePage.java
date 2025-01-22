package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilityClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//span[text()='Home']")			
	WebElement home;
	
	//@FindBy(xpath = "//i[@class='home icon']")
	//WebElement logo;
	
	//capture home logo, title, url
	//String title = driver.getTitle();
	
	//String url = driver.getCurrentUrl();
	
	//create factory repository 
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homePageFunctionality() throws InterruptedException
	{
		UtilityClass.click(home);
		//logo.isDisplayed();
		
		Thread.sleep(2000);
						
	}
	
	
}
