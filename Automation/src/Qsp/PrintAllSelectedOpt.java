package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOpt {
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/USER/Desktop/Menu%20List.html");
    WebElement Slvlist = driver.findElement(By.id("SLV"));
    Select s=new Select(Slvlist);
    Thread.sleep(2000);
    s.selectByValue("p");
    s.selectByIndex(2);
    s.selectByValue("s");
    s.selectByVisibleText("kfc");
   List<WebElement> allopt = s.getAllSelectedOptions();
   int count=allopt.size();
   for (int i = 0; i <count; i++) {
	   String text = allopt.get(i).getText();
	   System.out.println(text);
	   
}
   
   driver.close();
    }

}