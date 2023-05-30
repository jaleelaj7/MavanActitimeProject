package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath = "//div[@id=\"container_tasks\"]")
private WebElement taskbtn;
@FindBy(id = "logoutLink")
private WebElement lgbtn;
public void homepage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void clickTask()
{
	taskbtn.click();
}
public void setlogout()
{
	lgbtn.click();
}

}
