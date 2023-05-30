package Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="")
private WebElement untbx;
@FindBy(id="")
private WebElement pwtbx;
@FindBy(xpath="")
private WebElement lgbtn;
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void SetLogin(String un,String pwd) {
 untbx.sendKeys(un);
 pwtbx.sendKeys(pwd);
 lgbtn.click();
}
}
