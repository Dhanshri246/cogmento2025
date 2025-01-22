package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilityClass;

public class CompaniesPage extends BaseClass {

	@FindBy(xpath="//span[text()='Companies']")
	WebElement companies;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createCompanies;
	
	@FindBy(name="name")
	WebElement nameCompanies;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveCompanies;
	
	public CompaniesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void comapniesPageFunctionality(String Name) throws InterruptedException
	{
		UtilityClass.click(companies);
		UtilityClass.click(createCompanies);
		UtilityClass.sendKeys(nameCompanies, Name);
		
		Thread.sleep(2000);
		UtilityClass.click(saveCompanies);
	}
}
