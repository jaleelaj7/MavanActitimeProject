package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("jaleelaj18@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("777300Er@");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[contains(text(),'A')]")).click();
		driver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Address')]")).click();
		driver.findElement(By.id("Name")).sendKeys("cristano");
		driver.findElement(By.id("House/Office Info")).sendKeys("trumptower");
		driver.findElement(By.id("Street Info")).sendKeys("texsesss");
		driver.findElement(By.id("Landmark")).sendKeys("AJ-7 Tower");
		driver.findElement(By.id("USA"));
		driver.findElement(By.id("California"));
		driver.findElement(By.id("Los Angeles"));
		driver.findElement(By.id("Pincode")).sendKeys("571231");
		driver.findElement(By.id("Phone Number")).sendKeys("7259341367");
		driver.findElement(By.id("addAddress")).click();
		

	}

}
