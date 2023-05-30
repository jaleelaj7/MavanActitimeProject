package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
		int x1=login.getSize().getHeight();
		int x2=login.getSize().getWidth();
		
		driver.findElement(By.id("email")).sendKeys("admib");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		System.out.println("the login button hight is:"+x1);
		System.out.println("the login button width is:"+x2);
		driver.close();

	}

}
