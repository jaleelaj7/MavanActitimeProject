package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertion {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void verifytitle()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String etitle = "soogle";
	String atitle =driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(etitle, atitle);
	driver.close();
	s.assertAll();
	
}
}