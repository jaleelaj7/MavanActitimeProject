package EmbeddedFrame;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    
    driver.get("https://www.bbc.com/");
    JavascriptExecutor j=(JavascriptExecutor)driver;
    j.executeScript("Window.ScrollBy(0,3000)");
	}
  
}
