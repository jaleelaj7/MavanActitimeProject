package EmbeddedFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingEframe {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/USER/Desktop/page1.html");
     driver.findElement(By.id("t1")).sendKeys("admine");
     RemoteWebDriver r=(RemoteWebDriver)driver;
     r.executeScript("document.getElementById(\"t2\").value=(\"manager\")");
	}

}
