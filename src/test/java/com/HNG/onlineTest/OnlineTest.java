package com.HNG.onlineTest;

import com.utilities.propertyreader.PropertyReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OnlineTest {
    public WebDriver webDriver ;
    public WebDriverWait webWait;

 @Test
    public void test(){
     System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver81.exe");
     webDriver = new ChromeDriver();
     webDriver.navigate().to("https://www.google.com/");

    }

}
