package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocator {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver =new ChromeDriver();
     driver.get("file:///C:/Users/USER/Desktop/aj.html");
     driver.findElement(By.tagName("a")).click();
     
     }

}
