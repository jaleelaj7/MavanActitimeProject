package RobotClass;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
  static {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }

	public static void main(String[] args) {
		System.out.println("enter the title to close");
		Scanner s=new Scanner(System.in);
		String title=s.nextLine();
		WebDriver driver =new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	     driver.findElement(By.id("apple-signin-button")).click();
	     driver.findElement(By.id("login-facebook-button")).click();
	     Set<String> allwh = driver.getWindowHandles();
	     for(String wh:allwh)
	     {
	    	driver.switchTo().window(wh);
	    	String t1 = driver.getTitle();
	        if (t1.contains(title))
	        {
	        	driver.close();
	        }
	    
	}

}
}
	

