package com.HNG.testcases.letskodeittest;

import com.HNG.pom.letskodeit.*;
import com.base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {
    private  static WebDriver driver;
    private static Logger logger = LogManager.getLogger(com.testcases.LoginTest.class.getName());
    PageObjectManager pageObjectManager;
    HomePage homePage;
    CoursesPage coursesPage;
    CourseDetailPage detailCourseTest;
    CheckoutPage checkoutPage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        pageObjectManager= new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        coursesPage = pageObjectManager.getCoursesPage();
        detailCourseTest = pageObjectManager.getCourseDetailPage();
        checkoutPage = pageObjectManager.getCheckoutPage();
    }
    @Test
    public void checkout() throws InterruptedException {
        //GotoHomepage
        homePage.openHomePage();
        homePage.clickViewAllCourses();

        //Search course
        coursesPage.fillSearchKey("Selenium");
        coursesPage.clickSearch();

        //Select course
        coursesPage.chooseCourse(3);
        detailCourseTest.clickEnroll();

        //Checkout
        checkoutPage.enterEmail("test1@email.com");
        checkoutPage.enterName("test1");

        driver.switchTo().frame("__privateStripeFrame8");
        checkoutPage.enterCardNum("5454545454545454");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("__privateStripeFrame9");
        checkoutPage.enterExpDate("0222");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("__privateStripeFrame10");
        checkoutPage.enterCVC("345");
        driver.switchTo().defaultContent();

        checkoutPage.selectCountryCredit("United States");

        driver.switchTo().frame("__privateStripeFrame11");
        checkoutPage.enterPostal("72201");
        driver.switchTo().defaultContent();

        checkoutPage.checkAgreedToTerms();
        checkoutPage.confirmPurchase();

        String actualError = checkoutPage.getErrormgs();
        String expectationError = "The card was declined.";
        Assert.assertEquals(actualError, expectationError);

    }

}
