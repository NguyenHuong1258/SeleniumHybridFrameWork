package com.stepdefinitions.facebook;

import com.base.BaseTest;
import com.pom.facebook.homepage.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

@RunWith(Cucumber.class)
public class HomePageStepDefs extends BaseTest {
    private final static Logger LOGGER = Logger.getLogger(HomePageStepDefs.class.getName());
    public WebDriver driver;
    HomePage homePage;
    public HomePageStepDefs() {
        LOGGER.info("Constructor: construct HomePage StepDef");


    }
}
