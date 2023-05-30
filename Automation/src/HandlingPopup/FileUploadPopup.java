package HandlingPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/naukri.html");
		File f=new File("./data/jaleeli.docx");
		 
		 String absolutepath = f.getAbsolutePath();
		 System.out.println(absolutepath);
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		
		 
		
	}

}
