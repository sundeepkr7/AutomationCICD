package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodcls1 {
static {
	System.setProperty("webdriver.driver.chrome","./driver/chromedriver.exe");
}
 @Test
 public void validLogin()
 {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/hp/OneDrive/Desktop/checkbox.html");
	LoginPage1 l = new LoginPage1(driver);
	l.setCheckBox();
}
}
