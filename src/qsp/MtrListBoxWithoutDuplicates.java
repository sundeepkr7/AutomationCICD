package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListBoxWithoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
	        driver.get("file:///C:/Users/hp/OneDrive/Desktop/food.html");
	         WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	         Select s = new Select(mtrlistbox);
	         List<WebElement> allOption = s.getOptions();
	         TreeSet<String> ts = new TreeSet<String>();
	        
	         for(WebElement option:allOption) 
	        	 {
	        	 ts.add( option.getText()); 
	         }
	         System.out.println("MTRlistbox options without duplicates:");
	        
	         for(String mtroptions: ts ) 
	         {
	         System.out.println(mtroptions); 
	         }
	         driver.close();
		}
}
