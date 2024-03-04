package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionAlphabetical {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/hp/OneDrive/Desktop/food.html");
         WebElement mtrlistbox = driver.findElement(By.id("mtr"));
         ArrayList<String> al = new ArrayList<String>();
         Select s = new Select(mtrlistbox);
         List<WebElement> allOptions = s.getOptions();
         int count =allOptions.size();
         System.out.println(count);
        /* for(int i=0;i<count;i++) 
         {
        	 String text = allOptions.get(i).getText();
        	 al.add( text); 
         }*/
         for(WebElement option:allOptions) {
        	 al.add(option.getText());
         }
         Collections.sort(al);  //sorts array list  
         System.out.println("MTRlistbox options in alphabetical order:");
         for(int i=0;i<al.size();i++ ) 
         {
        	 String option = al.get(i);
         System.out.println(option); 
         }
         driver.close();
	}

}
