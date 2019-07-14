package core;

import org.openqa.selenium.WebDriver;
import utilFiles.PropertyAccesor;


public class DriverManager {
    private static DriverManager ourInstance = new DriverManager();
    private WebDriver webDriver;

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        BrowserType browserType = BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        webDriver = browser.getWeDriver();

    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
