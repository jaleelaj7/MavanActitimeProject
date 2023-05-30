package DataDrivenTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("https://shoppersstack.com/");
     driver.manage().window().maximize();
     System.out.println("main begin");
     driver.findElement(By.id("loginBtn")).click();
       System.out.println("main end ");

}
}