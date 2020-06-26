package com.HNG.TestOnBrowserStack.testSuite;

import com.HNG.TestOnBrowserStack.baseTest.BaseTestBrowserStack;
import com.HNG.TestOnBrowserStack.pom.CrossBrowserManager;
import com.utilities.propertyreader.BrowserStackReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestOnFireFox extends BaseTestBrowserStack {
    private  static WebDriver driver;
    CrossBrowserManager crossBrowserManager;

    @BeforeClass
    public  void setup() throws Exception {
        crossBrowserManager = new CrossBrowserManager();
        driver = getRemoveDriver(crossBrowserManager.getFireFox().cap_FireFox());
    }

    @Test
    public void testOpenGoogleFireFox(){
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("FireFox.");
        element.submit();
        System.out.println(driver.getTitle());
    }

}
