package com.HNG.pom.letskodeit;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetailPage extends AbstractBasePage {
    public CourseDetailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */
    @FindBy(xpath = "//*[@class='course-title']")
    private WebElement detailTitle;

    @FindBy(xpath = "//*[@id='enroll-button']")
    private WebElement enrollbtn;

    /***
     * Methods
     * */

    public String getTitle(){
        return getTextInElement(detailTitle);
    }

    public void clickEnroll(){
        clickButton(enrollbtn);

    }


}
