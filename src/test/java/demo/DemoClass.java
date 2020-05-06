package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class DemoClass {
    private static Logger logger = LogManager.getLogger(DemoClass.class.getName());
    @Test
    public void Demo() {
        logger.info("I'm debugging demo package");
        System.out.println("Demo method in DemoClass package demo");
    }
}
