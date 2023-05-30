package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void verifytitle()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String titel = "soogle";
	String etitle =driver.getTitle();
	if(titel.equals(etitle)) {
	  System.out.println("title i match and pass");
	}
	else {
		System.out.println("title is not match and fail");
	}
	
}
}
