package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilityClass;

public class LogoutPage extends BaseClass {

	//logout
			@FindBy(xpath ="//div[@class='ui basic button floating item dropdown']")
			WebElement settings;
			
			@FindBy(xpath="//span[text()='Log Out']")
			WebElement logout;
			
			public LogoutPage()
			{
				PageFactory.initElements(driver, this);
			}
			
			public void logoutFunctionality()
			{
				UtilityClass.click(settings);
				UtilityClass.click(logout);
			}
}
