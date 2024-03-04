package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Page1.html");
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(1000);
		driver.switchTo().frame("f1");
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(1000);
	    WebElement f = driver.findElement(By.xpath("//iframe"));
		Thread.sleep(1000);
		driver.switchTo().frame(f);
		//driver.switchTo().frame("f1");
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("d");
	}
}
