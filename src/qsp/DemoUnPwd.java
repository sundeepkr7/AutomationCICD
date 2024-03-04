package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUnPwd {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement emailTbx = driver.findElement(By.id("username"));
	int height = emailTbx.getSize().getHeight();
	int width = emailTbx.getSize().getWidth();
	System.out.println("Height=" +height);
	System.out.println("Width=" +width);
	driver.close();

	}

}
