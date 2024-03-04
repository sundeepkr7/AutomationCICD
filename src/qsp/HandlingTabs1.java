package qsp;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingTabs1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
	
	      // window handles iterate
	      Iterator it = allwh.iterator();
	      String ch =  (String) it.next();
	      String pw =  (String) it.next();
	      // switching child window
	      driver.switchTo().window(ch);
	      System.out.println("Child window title "+ driver.getTitle());
	      // close the child browser window
	      driver.close();
	      // switching parent window
	      driver.switchTo().window(pw);
	      System.out.println("Parent window title: "+ driver.getTitle());
	      driver.quit();
		
		/*for(String wh:allwh) {
			Thread.sleep(3000);
			if(pwh.equals(wh)) {
			driver.switchTo().window(wh);
			driver.close();*/
		  }
		}
	