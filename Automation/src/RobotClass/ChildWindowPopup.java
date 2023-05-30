package RobotClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
     driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
     String wh = driver.getWindowHandle();
     
     System.out.println(wh);

     driver.close();
		
	}

}
