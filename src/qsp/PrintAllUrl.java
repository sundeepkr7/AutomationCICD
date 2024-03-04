package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.*;
//import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrintAllUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("wipro jobs");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> alllinks =driver.findElements(By.xpath("//h3[contains(text(),'Wipro ')]"));
		int count =alllinks.size();
		System.out.println(count);
		Thread.sleep(3000);
       /* Actions a = new Actions(driver);
        a.doubleClick();
        Thread.sleep(3000);
        Robot r =new Robot();
        r.keyPress(KeyEvent.VK_W);*/
		 for (WebElement i : alllinks) 
	        {
	           System.out.println(i.getAttribute("href"));
	        }
        
      driver.close();  
	}

}
