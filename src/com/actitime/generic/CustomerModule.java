package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test(priority=1,invocationCount=3)
	public void createcustomer(){
		Reporter.log("createcustomer",true);
		
	}
	@Test(priority=2,dependsOnMethods="createcustomer")
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
	}
	
	@Test(dependsOnMethods= {"createcustomer","modifycustomer"})
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
	}
}
