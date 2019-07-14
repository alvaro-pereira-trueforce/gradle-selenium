package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements Browser {

    @Override
    public WebDriver getWeDriver() {
        return new ChromeDriver();
    }
}
