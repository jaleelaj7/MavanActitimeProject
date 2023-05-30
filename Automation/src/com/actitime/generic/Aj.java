package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Aj {
	@Test
	public void ajboss() {
		Reporter.log("aj started",true);//3
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class",true);//1
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("after class",true);//5
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("after method",true);//4
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method",true);//2
		
	}
	
	

}
