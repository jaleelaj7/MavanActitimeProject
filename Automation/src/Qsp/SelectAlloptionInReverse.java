package Qsp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlloptionInReverse {
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Menu%20List.html");
	     WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		for (int i = 0; i <count; i++) {
			s.selectByIndex(i);
			
		}
		for (int i =count-1; i>=0; i--) {
			s.deselectByIndex(i);
			
		}
		driver.close();
	
	}
}
