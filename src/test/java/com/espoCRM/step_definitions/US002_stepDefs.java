package com.espoCRM.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.espoCRM.utilities.*;
import com.espoCRM.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class US002_stepDefs {
	WebDriver driver = Driver.getDriver();
	HomePage hpage = new HomePage();

	@Given("^User should able to add new Dashlet window$")
	public void user_should_able_to_add_new_Dashlet_window() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(ConfigurationReader.getProperty("url"));


	}

	@Given("^User should able to add all Dashlets$")
	public void user_should_able_to_add_all_Dashlets() {
		for(WebElement each : hpage.addDeshletCloseBtn) {
			hpage.homePageAddBtn.click();
			each.click();
		}
	}

	@Then("^User should see that all Dashlet are added$")
	public void user_should_see_that_all_Dashlet_are_added() {

	}

	@Given("^User should able to Remove all dashlets$")
	public void user_should_able_to_Remove_all_dashlets() {

		for(WebElement each : hpage.dropDownBtnOnDeshlet) {
			each.click();
		}

		for(WebElement each :hpage. removeBtnOnDeshlet) {
			each.click();

		}
	}

	@Given("^User should able to see all dashlets are removed$")
	public void user_should_able_to_see_all_dashlets_are_removed() {

	}

	@Then("^User should able to move Dashlet window$")
	public void user_should_able_to_move_Dashlet_window() {

	}
}
