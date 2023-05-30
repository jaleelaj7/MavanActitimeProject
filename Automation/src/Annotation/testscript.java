package Annotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testscript extends DiffBtwnBcAndBm {

	@Test
	public void test1() {
		Reporter.log("Main Test Script 1",true);
	}
}
