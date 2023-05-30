package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlloptionWithOutLoop {
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/USER/Desktop/Menu%20List.html");
    WebElement Slvlist = driver.findElement(By.id("SLV"));
    Select s=new Select(Slvlist);
    String allopt = s.getWrappedElement().getText();
    System.out.println(allopt);
    driver.close();
    
	}

}

