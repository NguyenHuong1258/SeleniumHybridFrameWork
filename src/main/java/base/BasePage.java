package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.propertyreader.PropertyReaderManager;
import utilities.webdrivers.WebDriverManager;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    /*
    * WebDriver - done
    * Properties - done
    * Logs - Log4j - done
    * ExtentReport - done
    * DB -
    * Waits -
    * Excel, CSV -
    * Mail -
    *
    * */

    private WebDriver driver;
    public WebDriverManager webDriverManager;
    public Properties OR;
    private static Logger logger = LogManager.getLogger(BasePage.class.getName());;
    private static final String screenShotsFolder = "Screenshots";

    public WebDriver getDriver() {
        if (driver == null) {
            webDriverManager = new WebDriverManager();
            driver = webDriverManager.getDriver();
            OR = PropertyReaderManager.getInstance().getObjectRepositoryReader().getProperties();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(PropertyReaderManager.getInstance().getConfigPropertiesReader().getImplicitWaitTime(), TimeUnit.SECONDS);
        }
        return driver;
    }

    @AfterSuite
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }


    public String getScreenshotPath(String result, WebDriver driver) throws IOException {

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\Screenshots\\"+result+".png";
        FileHandler.copy(source,new File(destinationFile));
        return destinationFile;

    }

}
