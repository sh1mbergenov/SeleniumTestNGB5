package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99PageNewCustomer {
    public Guru99PageNewCustomer() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='New Customer']")
    public WebElement newCustomer;
    @FindBy(css = "input[name='name']")
    public WebElement name;
    @FindBy(xpath = "//label[@id='message']")
    public WebElement message;
    @FindBy(xpath = "//span[text()='Close']")
    public WebElement alert;

}
