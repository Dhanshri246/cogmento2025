package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactsPage;

public class ContactsPageTest extends BaseClass {

	@Test
	public void validateContactsPage() throws InterruptedException
	{
		ContactsPage contacts = new ContactsPage();
		contacts.contactPageFunctionality("Lalit", "Kale");
	}
}
