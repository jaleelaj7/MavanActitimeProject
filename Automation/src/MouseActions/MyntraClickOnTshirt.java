package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraClickOnTshirt {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.myntra.com/");
    WebElement men = driver.findElement(By.xpath("(//a[contains(text(),'Men')])[1]"));
    Actions a=new Actions(driver);
    a.moveToElement(men).perform();
    driver.findElement(By.xpath("(//a[contains(text(),'T-Shirts')])[1]")).click();
    List<WebElement> price = driver.findElements(By.xpath("(//h3[.='Louis Philippe Sport']/../div/span/span[1])[5]"));
    System.out.println(price);
    driver.close();
	}

}
