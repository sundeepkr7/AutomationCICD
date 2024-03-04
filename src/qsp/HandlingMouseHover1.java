package qsp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.vtiger.com/");
        WebElement target = driver.findElement(By.partialLinkText("Resources"));
        Actions a = new Actions(driver);
        a.moveToElement(target).perform();
        driver.findElement(By.partialLinkText("Customers")).click();
        driver.findElement(By.partialLinkText("READ FULL STORY")).click();
        String actualTitle = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']")).getText();
          if(actualTitle.contains("HackerEarth"))
  	          {
            	 System.out.println(actualTitle + " is displayed");
  	          }
      	      else {
      	    	driver.close();
      	        }
        }
        
    
       
	}


