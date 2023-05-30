package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinistryOfCommerce {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
     driver.get("//pib.gov.in/indexd.as");
	}

}
