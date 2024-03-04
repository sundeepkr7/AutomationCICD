package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		System.out.println(url);
		
		String custName = f.getExcelData("create customer", 1, 2);
		System.out.println(custName);
		f.SetExcelData("create customer", 1, 4, "pass");
		

	}

}
