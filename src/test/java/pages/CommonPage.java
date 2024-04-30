package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage extends BasePage {
    public CommonPage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "PIM")
    public WebElement pimTab;

    @FindBy(xpath = "//a[@href='/web/index.php/leave/viewLeaveModule']")
    public  WebElement leaveTab;

    @FindBy(xpath = "//a[@href='/web/index.php/dashboard/index']")
    public WebElement dashboardTab;
    @FindBy(xpath = "//span[text()='Directory']")
    public WebElement directoryTab;

    @Override
    public void search(String ... parameters){

    }


}
