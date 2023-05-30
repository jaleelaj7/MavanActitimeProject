package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 boolean logo =driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	 Thread.sleep(2000);
	 if (logo==true)
	 {
		 System.out.println("logo is ddisplayed and pass ");
	 }
	 else 
	 {
		 System.out.println("logo is not displayed and fail ");
	 }
	 driver.close();
	}

}
