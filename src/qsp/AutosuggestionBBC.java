package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionBBC {
	static {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			//open the browser
			WebDriver driver = new ChromeDriver();
			//go to bbc.com
			driver.get("https://www.bbc.com/");
			
	        
	        String xpath2 = "//div[contains(@class,'most-popular')]";
	        
	        //capture all the autosuggestions and print it on the console
	        List<WebElement> allsugg =driver.findElements(By.xpath(xpath2));
	        int count = allsugg.size();
	        
	        System.out.println(count);
	        for(int i=0;i<count;i++)
			{
				String text = allsugg.get(i).getText();
				System.out.println(text);
			} 
			
	      //span[@class='top-list-item__bullet']/../h3
  }
		
}