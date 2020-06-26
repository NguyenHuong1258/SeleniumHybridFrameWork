package com.HNG.TestOnBrowserStack.pom.Android;


import org.openqa.selenium.remote.DesiredCapabilities;

public class SamSungGalaxyS8  {

    public SamSungGalaxyS8() {
    }

    //Declare DesiredCapabilities variable.
    public DesiredCapabilities SSGalaxyS8() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S8");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "HNG with BrowserStack");
        caps.setCapability("build", "HNG");
        caps.setCapability("name", "HNG test with Samsung Galaxy S8");
        return caps;
    }
}
