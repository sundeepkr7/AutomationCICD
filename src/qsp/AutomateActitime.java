package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//go to actitime
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		//enter the username as admin
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		//enter the password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.close();
	}
}
