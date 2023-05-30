package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}							

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://shoppersstack.com/");
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.findElement(By.id("loginBtn")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("Create Account")).click();
     Thread.sleep(2000);
     FileInputStream fis=new FileInputStream("./data/JaleelDetails.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
     String fname = wb.getSheet("shopper").getRow(1).getCell(0).getStringCellValue();
    String lname= wb.getSheet("shopper").getRow(1).getCell(1).getStringCellValue();
      long phno =(long) wb.getSheet("shopper").getRow(1).getCell(2).getNumericCellValue();
    String pwd = wb.getSheet("shopper").getRow(1) .getCell(3).getStringCellValue();
    String email= wb.getSheet("shopper").getRow(1) .getCell(4).getStringCellValue();
  
    driver.findElement(By.id("First Name")).sendKeys(fname);
    driver.findElement(By.id("Last Name")).sendKeys(lname);
    driver.findElement(By.id("Male")).click();
    driver.findElement(By.id("Phone Number")).sendKeys(String.valueOf(phno));
    driver.findElement(By.id("Email Address")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(pwd);
    driver.findElement(By.id("Confirm Password")).sendKeys(pwd);
    driver.findElement(By.id("Terms and Conditions")).click();
    driver.findElement(By.id("btnDisabled")).click();
    
     
	}

}
