package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFileTestData {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis =new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url"); 
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		/*System.out.println(url);
		System.out.println(un);
		System.out.println(pw);*/
		
		      WebDriver driver = new ChromeDriver();
		
		        Thread.sleep(1000);
				driver.get(url);
			    Thread.sleep(1000);
				driver.findElement(By.id("username")).sendKeys(un);
				Thread.sleep(1000);
				driver.findElement(By.name("pwd")).sendKeys(pw);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				
				
		
	}

}
