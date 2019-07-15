package core;

import model.LoginData;
import org.openqa.selenium.WebDriver;
import utilFiles.PropertyAccesor;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class loginExample {
    public static void main(String[] args) {

        List<LoginData> dataCollection = new ArrayList<LoginData>();
        dataCollection.add(new LoginData("admin@phptravels.com", "demoadmin"));
        dataCollection.add(new LoginData("admin@phptravels.com", "demoadmin"));

        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        for (LoginData data : dataCollection) {
            webDriver.findElement(By.name("email")).clear();
            webDriver.findElement(By.name("email")).sendKeys(data.getUsername());
            System.out.println(data.getUsername());
            webDriver.findElement(By.name("password")).clear();
            webDriver.findElement(By.name("password")).sendKeys(data.getPassword());
            System.out.println(data.getPassword());

            webDriver.findElement(By.className("btn btn-primary btn-block ladda-button fadeIn animated")).click();
        }

        webDriver.quit();
    }
}
