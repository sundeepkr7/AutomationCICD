package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodcls {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

   @Test
   public void validLogin(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage1 l = new LoginPage1(driver);
	l.setLogin("admin", "manager");
	
    }
   @Test
	public void Testing2()
	{
		System.out.println("hi hello");
	}
}
