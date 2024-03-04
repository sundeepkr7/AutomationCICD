package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("qsp");
		

	}

}
