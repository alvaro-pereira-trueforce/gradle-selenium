package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Browser{

    @Override
    public WebDriver getWeDriver() {
        return new FirefoxDriver();
    }
}
