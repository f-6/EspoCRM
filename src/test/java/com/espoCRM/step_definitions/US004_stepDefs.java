package com.espoCRM.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US004_stepDefs {
	private HomePage home = new HomePage();
	private WebDriver driver = Driver.getDriver();
	
	@Given("^User logged in espoCRM$")
	public void user_logged_in_espoCRM() {
		driver.get(Config.getProperty("url"));
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("abc123" + Keys.ENTER);
	}
	
	@Then("^User should verify Calendar Box displayed$")
	public void user_should_verify_Calendar_Box_displayed() {
		Assert.assertTrue(home.calendarDashLet.isDisplayed());
	}

	@Then("^If there are scheduled events on the calendar User should click on each event and remove$")
	public void if_there_are_scheduled_events_on_the_calendar_User_should_click_on_each_event_and_remove() {
		
	    Assert.assertTrue(true);
	}

	@Then("^User should verify pop up box is displayed$")
	public void user_should_verify_pop_up_box_is_displayed() {
	    
	}

	@Then("^User should confirm\\.$")
	public void user_should_confirm() {
	    
	}

	@Then("^User should verify if event has removed$")
	public void user_should_verify_if_event_has_removed() {
	    
	}

	@When("^User clicks on calendar menu option and click on Options$")
	public void user_clicks_on_calendar_menu_option_and_click_on_Options() {
	    
	}

	@Then("^User should change \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and  What to display remove all by clicking\\.$")
	public void user_should_change_and_What_to_display_remove_all_by_clicking(String arg1, String arg2, String arg3) {
	    
	}

	@Then("^User clicks on save Btn$")
	public void user_clicks_on_save_Btn() {
	    
	}

	@Then("^User should verify Not Valid error message\\.$")
	public void user_should_verify_Not_Valid_error_message() {
	    
	}

	@Then("^User checks Calls$")
	public void user_checks_Calls() {
	    
	}

	@Then("^User should verify Calendar is month option and no Calls is shown\\( beacause User didnot create one\\)$")
	public void user_should_verify_Calendar_is_month_option_and_no_Calls_is_shown_beacause_User_didnot_create_one() {
	    
	}
}
