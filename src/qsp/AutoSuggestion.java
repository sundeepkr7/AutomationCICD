package qsp;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
static {
	System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//go to google.com
		driver.get("https://www.google.com/");
		//type java in search textbox
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		
		List<WebElement> allsugg =driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count =allsugg.size();
		System.out.println(count);
		
		/* for (WebElement i : allsugg) 
	        {
			 String text = i.getText();
	         System.out.println(text);
	         // System.out.println(i.getText());
	        }*/
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text);
			
		}
		allsugg.get(0).click();
		

	}

}
