package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

	private static WebDriver driver;
	public static void setDriver(String browser) {

	    switch (browser.toLowerCase()) {

	    case "chrome":
	        driver = new ChromeDriver();
	        break;

	    case "edge":
	        driver = new EdgeDriver();
	        break;

	    default:
	        throw new RuntimeException(
	                "Browser not supported: " + browser);
	    }

	    driver.manage().window().maximize();
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

	
	
}