package Qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo02 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecho.driver","./driver/gechodriver.exe");
	}
	public static void main(String [] args) {
		WebDriver driver= new ChromeDriver();
	   DemoA.testA(driver);	
			
		
	}

}
