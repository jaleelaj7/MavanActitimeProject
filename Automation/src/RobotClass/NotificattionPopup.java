package RobotClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificattionPopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
		ChromeOptions option =new ChromeOptions();
		option.addArguments(" disable notificatiion");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.yatra.com/");
		//driver.close();

	}

}
