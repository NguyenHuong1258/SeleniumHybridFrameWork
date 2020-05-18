package com.HNG.testcases.letskodeittest;

import com.HNG.pom.letskodeit.HomePage;
import com.HNG.pom.letskodeit.LoginPage;
import com.HNG.pom.letskodeit.PageObjectManager;
import com.HNG.pom.letskodeit.ProfilePage;
import com.base.BaseTest;
import com.utilities.filereaders.ExcelReader;
import com.utilities.propertyreader.PropertyReaderManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {
    private  static WebDriver driver;
    private static Logger logger = LogManager.getLogger(LogOutTest.class.getName());
    ExcelReader excelReader;
    PageObjectManager pageObjectManager;
    PropertyReaderManager propertyReaderManager;
    HomePage homePage;
    LoginPage loginPage;
    ProfilePage profilePage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        pageObjectManager= new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        loginPage = pageObjectManager.getLoginPage();
        profilePage = pageObjectManager.getProfilePage();
    }

    @Test
    public void logoutSuccess () {
        homePage.openHomePage();
        homePage.clickLogin();
        loginPage.login("test@email.com","abcabc");
        loginPage.submit();
        profilePage.clickProfileMenu();
        profilePage.clickLogout();
        String login = homePage.getLoginText();
        Assert.assertEquals(login, "Login");
    }
}
