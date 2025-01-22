package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LogoutPage;

public class LogoutPageTest extends BaseClass{

	@Test
	public void validateLogoutPage()
	{
		LogoutPage logout = new LogoutPage();
		logout.logoutFunctionality();
	}
}
