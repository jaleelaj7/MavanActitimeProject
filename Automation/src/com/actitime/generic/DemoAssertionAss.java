package com.actitime.generic;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertionAss {
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
	
	Assert.assertEquals(etitle, atitle);
	driver.quit();

	}
}