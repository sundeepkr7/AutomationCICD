package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

   public class LoginPage {
   private WebElement untbx;
   private WebElement pwtbx;
   private WebElement lgBtn;

   public LoginPage(WebDriver driver)
   {
	untbx = driver.findElement(By.id("username"));
	pwtbx = driver.findElement(By.name("pwd"));
	lgBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
    }
    //Business logic method
   public void setLogin(String un,String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgBtn.click();
    }
}
