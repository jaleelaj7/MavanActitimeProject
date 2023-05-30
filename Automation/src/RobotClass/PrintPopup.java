package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
     ChromeDriver driver =new ChromeDriver();
     driver.get("https://www.selenium.dev/downloads/");
     Thread.sleep(2000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_P);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_TAB);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_1);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_MINUS);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_2);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_Y);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 driver.close();
	}

}
