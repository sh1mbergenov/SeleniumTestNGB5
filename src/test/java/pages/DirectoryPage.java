package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DirectoryPage extends BasePage {
    public DirectoryPage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    public WebElement jobTitle;
    @FindBy(xpath = "//div[text()='Chief Financial Officer']")
    public WebElement chiefFinancialOfficer;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement searchButton;
    @FindBy(xpath = "//span[text()='HR Manager']")
    public WebElement hrManager;
    @FindBy(className = "orangehrm-directory-card-body")
    public WebElement employeeAddress;

   @Override
    public void search(String ... parameters){
       String employeeName = parameters[0];
       String jobTitle = parameters[1];
       String location = parameters[2];
   }
}
