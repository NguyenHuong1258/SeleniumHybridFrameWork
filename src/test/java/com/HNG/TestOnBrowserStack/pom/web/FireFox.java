package com.HNG.TestOnBrowserStack.pom.web;

import org.openqa.selenium.remote.DesiredCapabilities;


public class FireFox {

    private DesiredCapabilities caps;

    public FireFox() {
    }

    public DesiredCapabilities cap_FireFox() throws Exception {
        caps = new DesiredCapabilities();
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "77.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x800");
        caps.setCapability("project", "Test with Firefox");
        caps.setCapability("name", "Demo Firefox");
        caps.setCapability("project", "HNG with BrowserStack");
        caps.setCapability("build", "HNG");

        return caps;

    }
}
