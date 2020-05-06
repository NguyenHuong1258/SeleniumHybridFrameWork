package testcases;

import base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends BasePage {
    public  WebDriver driver;
    private static Logger logger = LogManager.getLogger(LoginTest.class.getName());

    @BeforeTest
    public void setUp() {
        driver = getDriver();
    }

    @AfterTest
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Test
    public void loginAsManager () {
        logger.info("Inside loggin test ");
        logger.info("Navigate to Login page");
        driver.navigate().to("https://tiki.vn");
        logger.info("Click on loggin button");
        // method click: act 1, act 2, act 3, act 4, act 5, act 6, another method
        // Logger.step(" Step: " + Click on loggin button");
        // Logger.substep(" Substep:" + log fo0r act1);
        driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
        String text = driver.findElement(By.xpath(OR.getProperty("mainHeading"))).getText();

        System.out.println(System.getProperty("user.dir"));
        Assert.assertEquals(text, "abc");
        logger.debug("Login successfully executed ");

    }
}
