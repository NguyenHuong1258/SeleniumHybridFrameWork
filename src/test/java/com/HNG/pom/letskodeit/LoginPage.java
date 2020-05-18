package com.HNG.pom.letskodeit;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractBasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */

    @FindBy(xpath = "//*[@id='user_email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='user_password']")
    private WebElement passWordField;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement submitButton;

    /***
     * Method
     */

    public void login(String email, String password) {
        sendKeyToTextBox(emailField, email);
        sendKeyToTextBox(passWordField, password);
    }

    public void submit(){
        clickButton(submitButton);
    }
}
