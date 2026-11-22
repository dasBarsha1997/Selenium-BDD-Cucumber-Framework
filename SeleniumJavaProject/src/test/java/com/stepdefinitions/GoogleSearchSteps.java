package com.stepdefinitions;
import io.cucumber.java.en.Given;

import org.testng.Assert;

import io.cucumber.java.en.*;

import com.pages.GoogleSearchPage;
import com.utilities.DriverManager;

public class GoogleSearchSteps {
	GoogleSearchPage googlePage;

	@Given("User launches browser")
	public void user_launches_browser() {

		DriverManager.getDriver();
	}

	@When("User opens Google website")
	public void user_opens_google_website() {

		googlePage = new GoogleSearchPage(DriverManager.getDriver());

		googlePage.openGoogle();
	}

	@Then("Google home page should be displayed")
	public void validate_home_page() {

		String title = DriverManager.getDriver().getTitle();

		Assert.assertTrue(title.contains("Google"));
	}

}
