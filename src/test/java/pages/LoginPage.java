package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends BasePage {
    public LoginPage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="username")
   public WebElement username;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(css = "button[type=submit]")
    public WebElement loginButton;
    @FindBy(xpath = "//p[text()='Invalid credentials']")
    public WebElement invalidLoginText;


    public  void login(String userName, String pwd){
        username.sendKeys(userName);
        password.sendKeys(pwd);
        loginButton.click();
    }
    @Override
    public void search(String ... parameters){

    }
}
