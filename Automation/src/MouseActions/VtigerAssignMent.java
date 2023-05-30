package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerAssignMent {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.vtiger.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     WebElement text = driver.findElement(By.partialLinkText("Resources"));
     Actions a=new Actions(driver);
     a.moveToElement(text).perform();
     driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[1]")).click();
     WebElement login = driver.findElement(By.id("loginspan"));
     a.doubleClick(login).perform();
     boolean disp = driver.findElement(By.xpath("//img[@src='https://crmaccess.vtiger.com/vtigeraddons/pages/assets/201804/images/logo-500.png']")).isDisplayed();
     if(disp==true)
     {
    	 System.out.println("image is displayed");
     }
     else
     {
    	 System.out.println("image is not displayed");
     }
	}

}
