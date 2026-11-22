package com.hooks;

import com.utilities.ConfigReader;
import com.utilities.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {

        String browser =
                ConfigReader.getProperty("browser");

        DriverManager.setDriver(browser);
    }

    @After
    public void tearDown() {

        DriverManager.quitDriver();
    }
}