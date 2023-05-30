package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class FlipkartAutoSug {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
     List<WebElement> we = driver.findElements(By.xpath("//div[contains(text(),'iphone')]"));
     for(WebElement aj:we)
     {
    	 
    	String text = aj.getText();
    	System.out.println(text);
   
     }
     driver.close();
	}

}
