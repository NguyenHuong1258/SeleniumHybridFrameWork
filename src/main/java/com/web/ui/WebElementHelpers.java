package com.web.ui;

import org.openqa.selenium.Dimension;
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


    //GetTagName Command
    public String getTagName(final WebElement element){
        waitForElementToBeVisible(element);
        LOGGER.info("Tag name of the element: "+ element.getTagName());
        return element.getTagName();
    }

    //getSize Command
    public Dimension getSize(final WebElement element){
        waitForElementToBeVisible(element);
        Dimension elementSize = element.getSize();
        LOGGER.info("Width of the element: " + elementSize.getWidth());
        LOGGER.info("Height of the element: " + elementSize.getHeight());
        return elementSize;
    }

}
