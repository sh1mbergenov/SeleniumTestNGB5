package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage extends BasePage {
    public AdminPage(){
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @Override
    public void search(String... parameters) {
        String username = parameters[0];
        String userRole = parameters[1];
        String employeeName = parameters[2];
        String status = parameters[3];
    }
}
