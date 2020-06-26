package com.HNG.TestOnBrowserStack.testSuite;

import com.HNG.TestOnBrowserStack.baseTest.BaseTestBrowserStack;
import com.HNG.TestOnBrowserStack.pom.CrossBrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestOnIPhoneXSMAX extends BaseTestBrowserStack {
    private  static WebDriver driver;
    CrossBrowserManager crossBrowserManager;

    @BeforeClass
    public  void setup() throws Exception {
        crossBrowserManager = new CrossBrowserManager();
        driver = getRemoveDriver(crossBrowserManager.getIPhoneXSMax().cap_iPhoneXsMAX());
    }

    @Test
    public void testOpenGoogleOnIphone(){
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Iphone XsMAX");
        element.submit();
        System.out.println(driver.getTitle());
    }

}
