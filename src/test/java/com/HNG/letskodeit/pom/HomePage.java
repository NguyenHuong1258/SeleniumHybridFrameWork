package com.HNG.letskodeit.pom;

import com.basepage.AbstractBasePage;
import com.utilities.propertyreader.ConfigPropertiesReader;
import com.utilities.propertyreader.PropertyReaderManager;
import com.utilities.webdrivers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractBasePage {
    WebDriver driver;
    PropertyReaderManager propertyReaderManager;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */
    @FindBy(xpath = "//*[contains(text(),'Login')]")
    private WebElement loginbtn;

    @FindBy(xpath = "//*[contains(text(),'View All Courses')]")
    private WebElement viewCoursesbtn;


    /***
     * Methods
     * */

    public void openHomePage(){
        driver.navigate().to(propertyReaderManager.getInstance().getConfigPropertiesReader().getApplicationURL());
    }

    public void clickLogin(){
        clickButton(loginbtn);
    }

    public void clickViewAllCourses(){
        clickButton(viewCoursesbtn);
    }

    public String getLoginText(){
        return  getTextInElement(loginbtn);
    }

}
