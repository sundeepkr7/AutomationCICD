package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBoxDOB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement daylistbox =driver.findElement(By.id("day"));
		Select s1 = new Select(daylistbox);
		s1.selectByValue("7");
		
		WebElement monthlistbox =driver.findElement(By.id("month"));
		Select s2 = new Select(monthlistbox);
		s2.selectByValue("8");
		
		
		WebElement yearlistbox =driver.findElement(By.id("year"));
		Select s3 = new Select(yearlistbox);
		s3.selectByVisibleText("1991");
	 }
	
}
