package com.pom.facebook.homepage;

import com.web.ui.WebElementHelpers;
import com.web.ui.WebElementVerifications;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class HomePage extends WebElementHelpers {
    private final static java.util.logging.Logger LOGGER = Logger.getLogger(WebElementVerifications.class.getName());
    public HomePage( WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()= 'Trang chủ']")
    public WebElement homePageIcon;

    @FindBy(xpath = "//*[@role='textbox']")
    public WebElement statusTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitStatusButton;

    @FindBy(xpath = "//*[@data-testid='post_message']")
    public WebElement lastestStatusText;

    private String statusXpath = "//*[@data-testid='post_message']//descendant::p[text()='%s']";

    public By getStatusByValue(String value) {
        return By.xpath(String.format(statusXpath, value));
    }

    public void verifyHomePageDisPlayed() {
        verifyElementIsVisible(homePageIcon, "Success");
    }
}
