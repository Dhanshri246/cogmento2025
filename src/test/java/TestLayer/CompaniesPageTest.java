package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.CompaniesPage;

public class CompaniesPageTest extends BaseClass{

	@Test
	public void validateCompaniesPage() throws InterruptedException
	{
		CompaniesPage companies = new CompaniesPage();
		companies.comapniesPageFunctionality("HCL");
	}
}
