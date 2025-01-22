package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass{

	@Test
	public void validateHomePage() throws InterruptedException
	{
		HomePage home = new HomePage();
		home.homePageFunctionality();
	}
}
