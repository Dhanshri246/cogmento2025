package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;

public class DealsPageTest extends BaseClass {

	@Test
	public void validateDealsPage() throws InterruptedException
	{
		DealsPage deals = new DealsPage();
		deals.dealsPageFunctionality("1st Deal");
		
	}
}
