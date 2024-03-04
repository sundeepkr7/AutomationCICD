package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAddressOfWindowHandles {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		Set<String> allwh = driver.getWindowHandles();
		String pwh = driver.getWindowHandle();
		System.out.println(pwh);//prints the address of parent window
		int count = allwh.size();
        System.out.println(count);
        for(String wh:allwh)
        {
        	System.out.println(wh);//prints all the address i.e. parent and child browser
        	                       // first address will be the parent browser address
        }
        //Thread.sleep(3000);
        driver.quit();   
	}

}
