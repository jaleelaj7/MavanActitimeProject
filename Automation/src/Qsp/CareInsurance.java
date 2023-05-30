package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthdropElement=driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(monthdropElement);
		s1.selectByVisibleText("Oct");
	WebElement yerarelement=driver.findElement(By.className("ui-datepicker-year"));
	Select s2=new Select(yerarelement);
	s2.selectByValue("2000");
	driver.findElement(By.xpath("(//a[@class='ui-state-default'])[23]")).click();	
	driver.findElement(By.id("alternative_number")).sendKeys("7259341638");
	driver.findElement(By.id("renew_policy_submit")).click();
		
    
	}

}
