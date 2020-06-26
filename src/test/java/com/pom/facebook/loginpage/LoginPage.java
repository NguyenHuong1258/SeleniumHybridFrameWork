package com.pom.facebook.loginpage;

import com.web.ui.WebElementHelpers;
import com.web.ui.WebElementVerifications;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static com.pom.facebook.loginpage.LoginPageConstants.LOGIN_FAILURE_MSG;

public class LoginPage extends WebElementHelpers {
    private final static java.util.logging.Logger LOGGER = Logger.getLogger(WebElementVerifications.class.getName());
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "pass")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void navigateLoginPage( String url) {
    }
    public void enterEmail(String email) {
        LOGGER.info(String.format("Enter email: %s", email));
        sendKeyToTextBox(emailTextBox, email);
    }

    public void enterPassword(String password) {
        LOGGER.info("Enter Password: " );
        sendKeyToTextBox(passwordTextBox, password);
    }

    public void clickLoginButton() {
        LOGGER.info("Click Login Button");
        clickButton(loginButton);
    }

    public void verifyLoginPageDisplayed() {
        LOGGER.info("Verify login page is display");
        verifyElementIsVisible(loginButton, LOGIN_FAILURE_MSG );
    }
}
