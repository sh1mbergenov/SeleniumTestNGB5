package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PimPage {

    public PimPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Faker faker = new Faker();
  public String fName = faker.name().firstName();
   public String lName = faker.name().lastName();
    public String empId = faker.number().digits(5);

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;
    @FindBy(name = "firstName")
    public WebElement firstName;
    @FindBy(name = "lastName")
    public WebElement lastName;
    @FindBy(xpath = "//label[text()='Employee Id']//following::input[@class='oxd-input oxd-input--active']")
    public WebElement employeeID;
    @FindBy(xpath = "//button[text()=' Cancel ']")
    public WebElement cancelButton;
    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveButton;
    @FindBy(css = "h6[class='oxd-text oxd-text--h6 --strong']")
    public WebElement fullNameText;


    public void addEmployee(){
        addButton.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
      SeleniumUtils.cleanAndSendKeys(Driver.getDriver(), employeeID, empId);
        saveButton.click();
    }


}
