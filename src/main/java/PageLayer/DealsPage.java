package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilityClass;

public class DealsPage extends BaseClass{

	@FindBy(xpath ="//span[text()='Deals']")
	WebElement deals;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createDeals;
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveDeals;
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void dealsPageFunctionality(String Title) throws InterruptedException
	{
		UtilityClass.click(deals);
		UtilityClass.click(createDeals);
		UtilityClass.sendKeys(title, Title);
		
		Thread.sleep(2000);
		UtilityClass.click(saveDeals);
	}
	
}
