package com.stepdefinitions.facebook;

import com.base.BaseTest;
import com.pom.facebook.homepage.HomePage;
import com.pom.facebook.loginpage.LoginPage;
import com.pom.facebook.loginpage.LoginPageConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

@RunWith(Cucumber.class)
public class LoginStepDefs extends BaseTest {

    private final static Logger LOGGER = Logger.getLogger(LoginStepDefs.class.getName());
    HomePage homePage;
    LoginPage loginPage;

    @Given("^User navigate to login page of facebook.com with url \"([^\"]*)\"$")
    public void user_navigate_to_login_page_of_facebook_com_with_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        BaseTest.getDriver().navigate().to(string);
    }

    @Given("Login page is loaded")
    public void login_page_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        loginPage = new LoginPage(driver);
        loginPage.verifyLoginPageDisplayed();
    }

    @When("^Login to Facebook with user email: \"([^\"]*)\" and password: \"([^\"]*)\"$")
    public void login_to_Facebook_with_user_email_and_password(String string, String string2) {
        loginPage.enterEmail(string);
        loginPage.enterPassword(string);
    }

    @Then("Facebook homepage is display")
    public void facebookHomepageIsDisplay() {
        homePage = new HomePage(driver);
        homePage.verifyHomePageDisPlayed();
    }
}
