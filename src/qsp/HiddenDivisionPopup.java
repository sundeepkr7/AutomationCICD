package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//input[@id='policynumber'])")).sendKeys("123");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		//driver.findElement(By.xpath("(//input[@id='dob'])")).click();
		driver.findElement(By.id("dob")).click();
		
		WebElement monthlistbox = driver.findElement(By.xpath("(//select[@class='ui-datepicker-month'])"));
		Select s1 = new Select(monthlistbox);
		s1.selectByValue("7");
		WebElement yearlistbox = driver.findElement(By.xpath("(//select[@class='ui-datepicker-year'])"));
		Select s2 = new Select(yearlistbox);
		s2.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("(//td[@class=' ']/../../tr[2]/td[4]/a)")).click();
		//driver.findElement(By.xpath("//a[.='7']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("7908179147");
		driver.findElement(By.linkText("Lets Renew")).click();
		
		String errormsg = driver.findElement(By.id("policynumberError")).getText();	//automated message
		String error = ("Please enter valid Policy No.");	// manual
		System.out.println(errormsg);
		if(errormsg.equals(error))
		{
			System.out.println("" +errormsg+"msg is displayed and pass");
		}
		else
		{
			System.out.println("" +errormsg+"msg is not displayed and fail");
		}
		
		
		
	}

}
