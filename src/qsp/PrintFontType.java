package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFontType {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement link= driver.findElement(By.linkText("Forgotten password?"));
	        String fontfamily = link.getCssValue("font-family");
	        System.out.println(fontfamily);
	        driver.close();
		
		}
}
