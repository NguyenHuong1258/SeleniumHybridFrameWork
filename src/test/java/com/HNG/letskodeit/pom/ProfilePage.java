package com.HNG.letskodeit.pom;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage extends AbstractBasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */

    @FindBy(xpath = "//*[contains(text(),'My Courses')]")
    private WebElement MyCourses;

    @FindBy(xpath = "//*[@class='gravatar']")
    private WebElement avatarbtn;

    @FindBy(xpath = "//*[@class='dropdown open']")
    private WebElement profileMenu;

    @FindBy(xpath = "//*[contains(text(),'Log Out')]")
    private WebElement logoutbtn;

    /***
     * Methods
     * */

    public String getMyCoursesTitle(){
      return  getTextInElement(MyCourses);
    }

    public void clickProfileMenu(){
        clickButton(avatarbtn);
    }

    public void clickLogout(){
        clickButton(logoutbtn);
    }

}
