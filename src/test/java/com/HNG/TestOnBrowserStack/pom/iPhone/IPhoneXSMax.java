package com.HNG.TestOnBrowserStack.pom.iPhone;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IPhoneXSMax {
    private DesiredCapabilities caps;

    public IPhoneXSMax() {   }

    public DesiredCapabilities cap_iPhoneXsMAX() throws Exception {
         caps = new DesiredCapabilities();
        caps.setCapability("os_version", "12");
        caps.setCapability("device", "iPhone XS Max");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("project", "HNG with BrowserStack");
        caps.setCapability("build", "HNG");
        caps.setCapability("name", "Test with iPhoneXs MAX");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.networkLogs", "true");
        caps.setCapability("browserstack.console", "info");
        return caps;
    }
}
