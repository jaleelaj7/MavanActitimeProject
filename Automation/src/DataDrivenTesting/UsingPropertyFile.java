package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class UsingPropertyFile {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./data/AutoDetails.property");
		
		Properties p=new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("enterimg")).click();
		
		// Taking Details from Excel
		
		FileInputStream fis1= new FileInputStream("./data/JaleelDetails.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis1);
		
		
		String name = wb.getSheet("Aj7").getRow(1).getCell(0).getStringCellValue();
		String LastName = wb.getSheet("Aj7").getRow(1).getCell(1).getStringCellValue();
		String address = wb.getSheet("Aj7").getRow(1).getCell(2).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
		
		String exptext = "Register";
				
		String acttext = driver.findElement(By.xpath("//h2[text()='Register']")).getText();
		
		FileOutputStream fos = new FileOutputStream("./data/JaleelDetails.xlsx");
		if(exptext.equals(acttext)) {
			wb.getSheet("Aj7").getRow(1).getCell(3).setCellValue("Pass");
			wb.write(fos);
			wb.close();
			System.out.println("OK");
		}
		
		else {
			wb.getSheet("Aj7").getRow(1).getCell(3).setCellValue("Fail");
			wb.write(fos);
			wb.close();
			System.out.println("NOT OK");
		}
	}

}
