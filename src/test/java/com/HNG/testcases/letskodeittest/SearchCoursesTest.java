package com.HNG.testcases.letskodeittest;
import com.HNG.pom.letskodeit.CoursesPage;
import com.HNG.pom.letskodeit.HomePage;
import com.HNG.pom.letskodeit.LoginPage;
import com.HNG.pom.letskodeit.PageObjectManager;
import com.base.BaseTest;
import com.utilities.propertyreader.PropertyReaderManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchCoursesTest extends BaseTest {
    private  static WebDriver driver;
    private static Logger logger = LogManager.getLogger(com.testcases.LoginTest.class.getName());
    PageObjectManager pageObjectManager;
    HomePage homePage;
    CoursesPage coursesPage;


    @BeforeClass
    public void setUp() {
        driver = getDriver();
        pageObjectManager= new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        coursesPage = pageObjectManager.getCoursesPage();
    }

    @Test
    public void searchCourse(){
        homePage.openHomePage();
        homePage.clickViewAllCourses();
        coursesPage.fillSearchKey("Selenium");
        coursesPage.clickSearch();
        boolean isMatchedSearchKey = coursesPage.isMatched();
        Assert.assertEquals(isMatchedSearchKey, true);

    }
}
