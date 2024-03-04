package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> allCheckBox;
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCheckBox() {
		for(int i =0; i<allCheckBox.size();i++)
		{
			allCheckBox.get(i).click();
		}
	}
}
