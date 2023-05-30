package RobotClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWithoughtQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	     WebDriver driver =new ChromeDriver();
	     driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	     driver.findElement(By.id("apple-signin-button")).click();
	     driver.findElement(By.id("login-facebook-button")).click();
	     Set<String> wh = driver.getWindowHandles();
	     for(String s:wh)
	     {
	    	driver.switchTo().window(s);
	         driver.close();	
	     }
	    
		}

	}
