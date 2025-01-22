package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilityClass;

public class LoginPage extends BaseClass{

	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement Login;
	
	//create factory repository 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String Username, String Password) throws InterruptedException
	{
		UtilityClass.sendKeys(email, Username);
		UtilityClass.sendKeys(password, Password);
		UtilityClass.click(Login);
		Thread.sleep(2000);
		
	}
}
