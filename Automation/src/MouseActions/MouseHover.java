package MouseActions;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {


	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
      driver.get("https://www.vtiger.com/");
      WebElement target = driver.findElement(By.partialLinkText("Resources"));
      Actions a=new Actions(driver);
	a.moveToElement(target).perform();
      driver.findElement(By.partialLinkText("Contact Us")).click();
      WebElement phno = driver.findElement(By.xpath("//P[contains(text(),'Bengaluru')]/../p[2]"));
      System.out.println(phno);
      driver.close();
	}

}
