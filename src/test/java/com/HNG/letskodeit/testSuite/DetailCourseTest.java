package com.HNG.letskodeit.testSuite;

import com.HNG.letskodeit.pom.CourseDetailPage;
import com.HNG.letskodeit.pom.CoursesPage;
import com.HNG.letskodeit.pom.HomePage;
import com.HNG.letskodeit.pom.PageObjectManager;
import com.base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DetailCourseTest extends BaseTest {
    private  static WebDriver driver;
    private static Logger logger = LogManager.getLogger(com.testcases.LoginTest.class.getName());
    PageObjectManager pageObjectManager;
    HomePage homePage;
    CoursesPage coursesPage;
    CourseDetailPage detailCourseTest;


    @BeforeClass
    public void setUp() {
        driver = getDriver();
        pageObjectManager= new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        coursesPage = pageObjectManager.getCoursesPage();
        detailCourseTest = pageObjectManager.getCourseDetailPage();
    }

    @Test
    public void checkDetailTitle(){
        homePage.openHomePage();
        homePage.clickViewAllCourses();
        coursesPage.fillSearchKey("Selenium");
        coursesPage.clickSearch();
        coursesPage.chooseCourse(3);
        String chosenCourse = coursesPage.getChosenCourseTitle();
        String detailTitle = detailCourseTest.getTitle();
        boolean isMatched = chosenCourse.contains(detailTitle);
        Assert.assertEquals(isMatched, true);

    }
}
