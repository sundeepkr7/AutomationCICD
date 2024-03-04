package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWindowHandles {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://secure.indeed.com/");
        driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
        driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
        Set<String> allwh = driver.getWindowHandles();
        for(String wh:allwh)
        {
        	System.out.println(wh);
        }
        driver.quit();
	}

}
