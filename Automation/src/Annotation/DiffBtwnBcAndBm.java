package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class DiffBtwnBcAndBm {
	
	@BeforeTest
	public void virat() {
		Reporter.log("Before Test",true);
	}
	
	@BeforeClass
	public void cristano() {
		Reporter.log("Before class ",true);
	} 
	
	
	
	
	
	@AfterClass
	public void cristanoo() {
		Reporter.log("After class",true);
	} 
	@AfterTest
	public void viratt() {
		Reporter.log("After Test",true);
	}
	
}