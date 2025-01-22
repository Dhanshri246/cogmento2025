package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateLoginFunctionality() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		login.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");
	}

}
