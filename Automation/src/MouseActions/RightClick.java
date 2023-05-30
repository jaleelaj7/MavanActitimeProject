package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
     WebElement link = driver.findElement(By.linkText("actiTime Inc"));
     Actions a=new Actions(driver);
     a.contextClick(link).perform();
     Thread.sleep(2000);
     Robot r =new Robot();
     r.keyPress(KeyEvent.VK_W);
     driver.close();
	}

}
