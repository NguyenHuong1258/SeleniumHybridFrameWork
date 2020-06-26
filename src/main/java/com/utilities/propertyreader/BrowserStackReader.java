package com.utilities.propertyreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BrowserStackReader {

    private Properties properties;
    private final String configPropertiesFilePath = "src/main/resources/properties/BrowserStack";

    // Read and load properties file
    public BrowserStackReader() {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(configPropertiesFilePath));
            properties = new Properties();

            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw  new RuntimeException("Configuration file is not found at: " + configPropertiesFilePath);
        }
    }

    /* Get USERNAME*/
    public String getUsername(){
        String username = properties.getProperty("USERNAME");
        if(username != null) {
            return username;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }

    /* Get AUTOMATE_KEY*/
    public String getAUTOMATE_KEY() {
        String autoKey = properties.getProperty("AUTOMATE_KEY");
        if(autoKey != null) {
            return autoKey;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }

    }

    /* Get ENDPOINT*/
    public String getEndPoint() {
        String endpoint= properties.getProperty("ENDPOINT");
        if(endpoint != null) {
            return endpoint;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }
}
