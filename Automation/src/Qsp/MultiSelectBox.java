package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectBox {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.get("file:///C:/Users/USER/Desktop/Menu%20List.html");
    WebElement multilist = driver.findElement(By.id("mtr"));
    Select s=new Select(multilist);
    Thread.sleep(2000);
    s.selectByIndex(2);
    s.selectByValue("k");
    s.selectByVisibleText("idly");
    System.out.println(s);
    s.deselectByVisibleText("idly");
    
    s.deselectByIndex(2);
    s.deselectByValue("k");
    boolean status = s.isMultiple();
    System.out.println(status);
	}

}
