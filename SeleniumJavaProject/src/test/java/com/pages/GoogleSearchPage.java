package com.pages;

import org.openqa.selenium.WebDriver;

import com.utilities.ConfigReader;

public class GoogleSearchPage {

	    WebDriver driver;

	    public GoogleSearchPage(WebDriver driver) {

	        this.driver = driver;
	    }

	    public void openGoogle() {

	    	driver.get(ConfigReader.getProperty("url"));
	    }
	
}
