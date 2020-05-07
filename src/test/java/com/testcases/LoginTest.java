package com.testcases;



import com.base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTest extends BaseTest {
    private  WebDriver driver;
    private static Logger logger = LogManager.getLogger(LoginTest.class.getName());

    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Test
    public void loginAsManager () {

    }
}
