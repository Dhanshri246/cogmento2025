package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilityClass extends BaseClass{
	
	public static void click(WebElement wb)
	{
		wb.click();
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void handleDropDown(List<WebElement> wb, String value)
	{
		for(WebElement abc:wb)
		{
			String txt = abc.getText();
			if(txt.contains(value))
			{
				abc.click();
				break;
			}
		}
	}
	
	public static void handleRadioBtns(List<WebElement> wb, int value)
	{
		for(int i=0; i<=value; i++)
		{
			wb.get(value).click();
		}
	}
}
