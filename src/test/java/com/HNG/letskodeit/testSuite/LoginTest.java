package com.HNG.letskodeit.testSuite;

import com.HNG.letskodeit.pom.HomePage;
import com.HNG.letskodeit.pom.LoginPage;
import com.HNG.letskodeit.pom.PageObjectManager;
import com.HNG.letskodeit.pom.ProfilePage;
import com.base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {
    private  WebDriver driver;
    private static Logger logger = LogManager.getLogger(LoginTest.class.getName());
     PageObjectManager pageObjectManager;
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
    public void loginSuccess () {
        homePage.openHomePage();
        homePage.clickLogin();
        loginPage.login("test@email.com","abcabc");
        loginPage.submit();
        String myCourses = profilePage.getMyCoursesTitle();
        Assert.assertEquals(myCourses, "My Courses");
        //"My Courses"
    }


}
