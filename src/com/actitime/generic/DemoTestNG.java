package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	
   @Test
   public void demoTest() {
	Reporter.log("welcome",true);
	Reporter.log("bye",false);
	Reporter.log("hello");

  }
}
