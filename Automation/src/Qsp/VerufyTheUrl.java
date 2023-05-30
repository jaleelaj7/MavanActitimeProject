package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerufyTheUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
        String expectedurl="https://www.selenium.dev/";
        String actualurl =driver.getCurrentUrl();
       if (expectedurl.equals(actualurl))
        {
        	System.out.println("url is succsfully navigating and pass ");
        	
        }
        else
        {
        	System.out.println("url is not succusfully navigating and Fail");
        }
        driver.close();
        
	}

}
