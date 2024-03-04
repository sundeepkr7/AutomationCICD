package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		 
		//go to flipkart.com
		 driver.get("https://www.flipkart.com/");
		 
		 Thread.sleep(3000);
		 
		// driver.findElement(By.xpath("//button[text()='✕']")).click();
	      driver.findElement(By.xpath("(//button)[2]")).click();
		 
		 //type i phone in the search text box
		 driver.findElement(By.name("q")).sendKeys("i phone");
		 
		 Thread.sleep(3000);
		
		 //find all the autosuggestions and print the count of autosuggestions
		 List<WebElement> allsugg=driver.findElements(By.xpath("//span[text()='i phone']/.."));
		 int count = allsugg.size();
		 System.out.println(count);
		 
		 //print the text of all autosuggestions
		 for(int i=0;i<count;i++)
		 {
			 String text = allsugg.get(i).getText();
			 System.out.println(text);	 
		 }
		 
		 //select the last autosuggestion
		 allsugg.get(count-1).click();
		 
	}

}
