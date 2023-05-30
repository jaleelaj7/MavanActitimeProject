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

public class ShopperStackLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}							

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://shoppersstack.com/");
     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.findElement(By.id("loginBtn")).click();
     FileInputStream fis =new FileInputStream("./data/JaleelDetails.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
   String email = wb.getSheet("shopper").getRow(1).getCell(4).getStringCellValue();
   String pwd = wb.getSheet("shopper").getRow(1).getCell(3).getStringCellValue();
     driver.findElement(By.id("Email")).sendKeys(email);   
     driver.findElement(By.id("Password")).sendKeys(pwd);
     driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
     driver.findElement(By.xpath("//div[text()=\"C\"]")).click();
     driver.findElement(By.xpath("(//li[@role=\"menuitem\"])[1]")).click();
     driver.findElement(By.xpath("//div[contains(text(),'My Addresses')]")).click();
     driver.findElement(By.xpath("//button[contains(text(),'Add Address')]")).click();
     String fullname = wb.getSheet("shopper").getRow(3).getCell(1).getStringCellValue();
     String houseinfo = wb.getSheet("shopper").getRow(4).getCell(1).getStringCellValue();
     String street = wb.getSheet("shopper").getRow(5).getCell(1).getStringCellValue();
     String landmark = wb.getSheet("shopper").getRow(6).getCell(1).getStringCellValue();
     int pincode = (int) wb.getSheet("shopper").getRow(7).getCell(1).getNumericCellValue();
     long phno = (long)wb.getSheet("shopper").getRow(8).getCell(1).getNumericCellValue();
     
     driver.findElement(By.id("Name")).sendKeys(fullname);
     driver.findElement(By.id("House/Office Info")).sendKeys(houseinfo);
     driver.findElement(By.id("Street Info")).sendKeys(street);
     driver.findElement(By.id("Landmark")).sendKeys(landmark);
     driver.findElement(By.xpath("//option[@id='USA']")).click();
     driver.findElement(By.id("New York")).click();
     driver.findElement(By.id("Hamburg")).click();
     driver.findElement(By.id("Pincode")).sendKeys(String.valueOf(pincode));
     driver.findElement(By.id("Phone Number")).sendKeys(String.valueOf(phno));
     driver.findElement(By.id("addAddress")).click();
     
     
     
     
     
     
     
}
}

