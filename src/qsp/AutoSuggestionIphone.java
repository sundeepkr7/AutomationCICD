package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionIphone {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
				
		//go to flipkart.com
	    driver.get("https://www.flipkart.com/");
	    	 
	    //type i phone 13 pro max in the search text box
		 driver.findElement(By.name("q")).sendKeys("i phone 13 pro max" + Keys.ENTER);
		 Thread.sleep(3000);
		 
         driver.findElement(By.xpath("//button[text()='✕']")).click();
         
		 String xpath1 = "//div[contains(text(),'APPLE iPhone 13 Pro Max')]";
		 String xpath2 = "//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div";
		 
		 //find all the autosuggestions and print the count of autosuggestions
		 List<WebElement> allProductNames = driver.findElements(By.xpath(xpath1));
		 List<WebElement> allProductPrices = driver.findElements(By.xpath(xpath2));
		 int count = allProductPrices.size();
		 System.out.println(count);
		 
		 //print the text of all autosuggestions
		 for(int i=0;i<count;i++)
		 {
			 String ProductName = allProductNames.get(i).getText();
			 String ProductPrice = allProductPrices.get(i).getText();
			 System.out.println(ProductName+ "----->" +ProductPrice);	 
		 }
		 /*for(WebElement i:allProductPrices)
		 {
			 String ProductName = i.getText();
			 String ProductPrice = i.getText();
			 System.out.println(ProductName+ "----->" +ProductPrice);	 
		 }*/
		 
		
	}

}
