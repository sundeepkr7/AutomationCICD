package qsp;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/food.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		HashSet<String> hs = new HashSet<String>();
		Select s = new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for(int i =0;i<count;i++) {
			String text = alloptions.get(i).getText();
		    hs.add(text);
		}
		for(String option:hs) {
			System.out.println(option);
		}
		
	}
}
