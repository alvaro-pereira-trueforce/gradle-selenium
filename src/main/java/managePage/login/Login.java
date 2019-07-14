package managePage.login;

import managePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='email']")
    private WebElement emailTextField;

    public void setEmail(String email) {
        emailTextField.sendKeys(email);
    }

}
