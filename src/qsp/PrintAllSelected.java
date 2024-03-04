package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	}
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/hp/OneDrive/Desktop/food.html");
		
		WebElement cplistbox =driver.findElement(By.id("cp"));
		Select s = new Select(cplistbox);
		List<WebElement> allSOptions = s.getAllSelectedOptions();
		int count = allSOptions.size();
		System.out.println(count);
		
		for(WebElement option:allSOptions)    //for each loop
		{
			 String text = option.getText();
			 System.out.println(text);
		}
		/*for(int i=0; i<count; i++)          //for loop
		{
			String text = allSOptions.get(i).getText();
			System.out.println(text);
		}*/
		driver.close();
		
		}
}
