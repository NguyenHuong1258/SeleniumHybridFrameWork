package com.HNG.letskodeit.pom;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CoursesPage extends AbstractBasePage {
    private String KeySearch;
    private int chosenElement;

    public CoursesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */

    @FindBy(xpath = "//*[@placeholder='Find a course']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@title='Search']")
    private WebElement searchbtn;

    @FindBy(xpath = "//*[@class='course-listing']")
    private List<WebElement> coursesList;

    @FindBy(xpath = "//*[@aria-level='2']")
    private WebElement chosenTitle;


    /***
     * Methods
     * */

    public void fillSearchKey(String KeySearch){
        sendKeyToTextBox(searchField, KeySearch);
        this.KeySearch = KeySearch;
    }

    public void clickSearch(){
        clickButton(searchbtn);
    }

    public boolean isMatched(){
        byte numOfMatch =0;
        for (WebElement course : coursesList) {
           String elementTitle= getTextInElement(course);
            if (elementTitle.contains(KeySearch)){
                numOfMatch++;
            }
        }
        if (coursesList.isEmpty()&& numOfMatch==0){
            return true;
        }
        else if (numOfMatch ==coursesList.size()){
            return true;
        }
        else {return false;}

    }

    public void chooseCourse(int courseNum){
        chosenElement = courseNum;
        clickButton(coursesList.get(courseNum));
    }

    public WebElement chosenCourseElement(){
        return coursesList.get(chosenElement);
    }

    public String getChosenCourseTitle(){
        return getTextInElement(chosenCourseElement());
    }

}
