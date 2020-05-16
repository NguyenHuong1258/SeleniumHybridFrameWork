package com.web.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public abstract class WebElementHelpers extends WebElementVerifications {
    private final static Logger LOGGER = Logger.getLogger(WebElementHelpers.class.getName());
    private final Actions action = new Actions(driver);

    public WebElementHelpers(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void sendKeyToTextBox(final WebElement editBox, final String valueToType) {
        waitForElementToBeVisible(editBox);
        LOGGER.info("Clear text in text box");
        editBox.clear();
        LOGGER.info(String.format("Send keys: %s into text box", valueToType));
        editBox.sendKeys(valueToType);
    }

    //Click Command by WebElement
    public void clickButton(final WebElement clickbtn){
        waitForElementToBeClickable(clickbtn);
        LOGGER.info("Button is clicked.");
        clickbtn.click();
    }



}
