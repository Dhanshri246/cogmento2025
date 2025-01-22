package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilityClass;

public class ContactsPage extends BaseClass {

	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement contacts;
	
	@FindBy(xpath = "//button[text() ='Create']")
	WebElement createContacts;
	
	@FindBy(name ="first_name")
	WebElement firstname;
	
	@FindBy(name ="last_name")
	WebElement lastname;
	
	//@FindBy(xpath ="//label[text()='Status']/parent::div/child::div[@class='ui selection dropdown']")
	//WebElement statusDropDown;
	
//	@FindBys(@FindBy (xpath ="//div[@class='visible menu transition']/child::div"))
//	List<WebElement> allStatus;
//	
//	@FindBy(name ="value")
//	WebElement phone;
	
//	@FindBys(@FindBy(xpath ="//div[@class='ui toggle checkbox']"))
//	List<WebElement> radioList;
	
	@FindBy(xpath ="//button[text()='Save']")
	WebElement saveContact;
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void contactPageFunctionality(String Firstname, String Lastname) throws InterruptedException
	{
		UtilityClass.click(contacts);
		UtilityClass.click(createContacts);
		UtilityClass.sendKeys(firstname, Firstname);
		UtilityClass.sendKeys(lastname, Lastname);
		//UtilityClass.handleDropDown(allStatus, Status);
		//UtilityClass.sendKeys(contacts, Phone);
		//UtilityClass.handleRadioBtns(radioList, Radio);
		
		Thread.sleep(2000);
		UtilityClass.click(saveContact);
		
	}
}
	