package com.HNG.TestOnBrowserStack.baseTest;

import com.utilities.propertyreader.PropertyReaderManager;
import com.utilities.webdrivers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class BaseTestBrowserStack {
    public static final String USERNAME = PropertyReaderManager.getInstance().browserStackReader().getUsername();
    public static final String AUTOMATE_KEY = PropertyReaderManager.getInstance().browserStackReader().getAUTOMATE_KEY();
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + PropertyReaderManager.getInstance().browserStackReader().getEndPoint();

    private WebDriver driver;

    public WebDriver getRemoveDriver( DesiredCapabilities caps) throws MalformedURLException {
        if (driver == null) {
            driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        }
        return driver;
    }

    @AfterSuite
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
