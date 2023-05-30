package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//div[text()=\"Add New\"]")
	private WebElement AddNewBtn;
	@FindBy (xpath = "//div[text()=\"+ New Customer\"]")
	private WebElement NewCustomerOption;
	@FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
	private WebElement CustomerNameTbx;
	@FindBy(xpath = "(//textarea[@class=\"textarea\"])[9]")
	private WebElement CustomerDescriptionTbx;
	@FindBy(xpath = "(//div[@class=\"dropdownButton\"])[15]")
	private WebElement SelectCustomerDD;
	@FindBy(xpath = "(//div[text()=\"Big Bang Company\"])[2]")
	private WebElement bigBangCompany;
	@FindBy(xpath = "//div[text()=\"Create Customer\"]")
	private WebElement CreateCustomerBtn;
    @FindBy(xpath = "(//div[@class='titleEditButtonContainer'])/div[1]")
    private WebElement actualCustomerCreated;
    
	
	
	public void tasklistpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewbtn()
	{
		return AddNewBtn;
	}
	public WebElement getnewcustomerOption()
	{
		return NewCustomerOption;
	}
	public WebElement getcustomerNeametbx()
	{
		return CustomerNameTbx;
	}
	public WebElement getcustomerDescriptionTbx()
	{
		return CustomerDescriptionTbx;
	}
	public WebElement getSelectCustomerDescription()
	{
		return SelectCustomerDD;
	}
	public WebElement getbigBangCompany()
	
	{
	return bigBangCompany;
	}
	public WebElement getCreatecustomerBtn()
	{
		return CreateCustomerBtn;
	}
	public WebElement getActualcustomercreated()
	{
		return actualCustomerCreated;
	}

}


	