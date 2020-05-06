package testsuites;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass1 {
    private static Logger logger = LogManager.getLogger(DemoClass1.class.getName());

    @Test(groups = {"Smoke"})
    public void demo1() {
        logger.debug("I'm debugging");
        if(5>4)
            logger.info("Object is present");
        logger.error("Object is not present");
        logger.fatal("this is fatal");

    }

    @Test(groups = {"Smoke"})
    public void webLoginApp() {
        logger.info("Web login app");
    }

    @Test(groups = {"Smoke"})
    public void mobileLoginApp() {
        logger.info("mobile login app");
        //Assert.assertTrue(false);
    }


    @Test(timeOut = 4000)
    public void bpiLoginApp() {
        logger.info("test alphabet, bbbbbb");
    }

    @Test(enabled  = false)
    public void apiLoginApp() {
        logger.info("api login loan - alphabet - aaaaaa");
    }


}
