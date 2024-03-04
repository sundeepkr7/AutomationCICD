package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class LoginPage1 {

  @FindBy(id = "username")
  private WebElement unTbx;

  @FindBy(name = "pwd")
  private WebElement pwTbx;                           //declaration

  @FindBy(xpath="//div[text()='Login ']")
  
  
  private WebElement lgBtn;

   public LoginPage1(WebDriver driver) {
	PageFactory.initElements(driver, this);        //initialization
   }
   public void setLogin(String un, String pw) {
	unTbx.sendKeys(un);
	pwTbx.sendKeys(pw);                            //utilization
	lgBtn.click();
   }


}
