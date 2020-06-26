package com.pom.common;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.Month;

public class CommonPageHelper extends AbstractBasePage {
    public CommonPageHelper(WebDriver driver) {
        super(driver);
    }

    public void openCalendar(WebElement webCalendarButton) {
        if(!isCalendarOpen(webCalendarButton)) {
            webCalendarButton.click();
        }
    }

    public void selectMonthInCalendar(LocalDate month) {
        // get current month

        // compare current with destination

        //which arrow to use
    }

    public boolean isCalendarOpen(WebElement webCalendarButton) {
        return webCalendarButton.isDisplayed();
    }

    public LocalDate getCurrentPeriod(WebElement currentPeriodElement) {
        String[] currentPeriod = currentPeriodElement.getText().split(" ");
        return LocalDate.of(
                Integer.parseInt(currentPeriod[1]),
                Month.valueOf(currentPeriod[0].toUpperCase()),
                1);
    }

}
