package core;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static DriverFactory ourInstance = new DriverFactory();

    public static DriverFactory getInstance() {
        return ourInstance;
    }

    private DriverFactory() {
    }

    public Browser getBrowser(BrowserType browserType) {
        Map<BrowserType, Browser> browserSettings = new HashMap<>();
        browserSettings.put(BrowserType.CHROME, new Chrome());
        browserSettings.put(BrowserType.FIREFOX, new Firefox());

        return browserSettings.get(browserType);
    }

    public Browser getBrowser2(String name) {
        if (name.equalsIgnoreCase("CHROME")) {
            return new Chrome();
        }
        if (name.equalsIgnoreCase("FIREFOX")) {
            return new Firefox();
        } else {
            return new Chrome();
        }
    }
}
