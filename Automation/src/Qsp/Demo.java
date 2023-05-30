package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.instagram.com");
		String title =c1.getTitle();
		System.out.println(title);
		c1.close();
		
				
	}

}
