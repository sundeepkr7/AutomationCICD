package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule1 {

	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority=1,invocationCount=2)
	public void editCustomer() {
		Reporter.log("editCustomer",true);
	}
	@Test
	public void registerCustomer() {
		Reporter.log("register Customer",true);
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
	
}
