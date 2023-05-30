package Annotation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseClass {
	static {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser(){
		Reporter.log("open Browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 @AfterTest
	 public void closebrowser() {
		 Reporter.log("close browser",true);
		 driver.close();
	 }
	 @BeforeMethod
	 public void login() throws IOException {
		 Reporter.log("login",true);
		 FileLib f =new FileLib();
		String url = f.getPropertyData("url");
		String un=f.getPropertyData("un");
		String pwd=f.getPropertyData("pwd");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.SetLogin(un, pwd);
		
	 }

}
