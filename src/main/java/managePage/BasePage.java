package managePage;

import core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private WebDriver webDriver;

    public BasePage() {
        this.webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
