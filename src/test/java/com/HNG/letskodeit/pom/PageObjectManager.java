package com.HNG.letskodeit.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private CoursesPage coursesPage;
    private CourseDetailPage courseDetailPage;
    private CheckoutPage checkoutPage;
    private ProfilePage profilePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage==null)? homePage = new HomePage(driver): homePage;
    }

    public LoginPage getLoginPage(){
        return (loginPage==null)? loginPage = new LoginPage(driver): loginPage;
    }

    public CoursesPage getCoursesPage(){
        return (coursesPage == null)? coursesPage = new CoursesPage(driver): coursesPage;
    }

    public CourseDetailPage getCourseDetailPage(){
        return (courseDetailPage == null)? courseDetailPage = new CourseDetailPage(driver): courseDetailPage;
    }

    public CheckoutPage getCheckoutPage(){
        return (checkoutPage == null)? checkoutPage = new CheckoutPage(driver): checkoutPage;
    }

    public ProfilePage getProfilePage(){
        return (profilePage == null)? profilePage = new ProfilePage(driver): profilePage;
    }


}
