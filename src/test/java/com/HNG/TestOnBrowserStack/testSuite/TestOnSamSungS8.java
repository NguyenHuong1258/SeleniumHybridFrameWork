package com.HNG.TestOnBrowserStack.testSuite;

import com.HNG.TestOnBrowserStack.baseTest.BaseTestBrowserStack;
import com.HNG.TestOnBrowserStack.pom.CrossBrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


public class TestOnSamSungS8 extends BaseTestBrowserStack {
    private  static WebDriver driver;
    CrossBrowserManager crossBrowserManager;

    @BeforeClass
    public  void setup() throws Exception {
        crossBrowserManager = new CrossBrowserManager();
        driver = getRemoveDriver(crossBrowserManager.getGalaxyS8().SSGalaxyS8());
    }

    @Test
    public void testOpenGoogle(){
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Samsung Galaxy S8");
        element.submit();
        System.out.println(driver.getTitle());

    }

}
