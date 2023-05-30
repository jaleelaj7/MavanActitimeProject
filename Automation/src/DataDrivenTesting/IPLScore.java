package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPLScore {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		String result = driver.findElement(By.xpath("(//div[@id='match_menu_container']//div)[33]")).getText();

		System.out.println(result);
		
		FileInputStream fis=new FileInputStream("./data/IPLResult.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	
		
		FileOutputStream fos=new FileOutputStream("./data/IPLResult.xlsx");
		
		if(result.contains("Mumbai")) {
			wb.getSheet("Sheet1").getRow(3).getCell(1).setCellValue("Won");
			wb.getSheet("Sheet1").getRow(2).getCell(1).setCellValue("Fail");
			wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("Fail");
			wb.write(fos);
			wb.close();
			System.out.println("Mumbai");
		}
		
		else if(result.contains("Bangalore")) {
			
			wb.getSheet("Sheet1").getRow(3).getCell(1).setCellValue("Fail");
			wb.getSheet("Sheet1").getRow(2).getCell(1).setCellValue("Fail");
			wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("Won");
			wb.write(fos);
			wb.close();
			System.out.println("Bangalore");
		}
	}

}
