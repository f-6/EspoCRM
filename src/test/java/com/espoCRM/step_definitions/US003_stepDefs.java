package com.espoCRM.step_definitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.utilities.BrowserUtils;
import com.espoCRM.utilities.ExcelUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.espoCRM.utilities.Config;

public class US003_stepDefs {


	HomePage home = new HomePage();
	List<String> expectedOptions = new  ArrayList<>();

	@When("^User clicks on Add Dashlet button$")
	public void user_clicks_on_Add_Dashlet_button() {
		System.out.println("User clicks on Add Dashlet button");
		home.homePageAddBtn.click();
	}

	@When("^User adds Calendar$")
	public void user_adds_Calendar() {
		System.out.println("User clicks on Add Calendar button");
		home.addCalendarBtn.click();
	}

	@When("^User clicks Drop Down menu on a Calendar$")
	public void user_clicks_Drop_Down_menu_on_a_Calendar() {
		home.dropDownBtnOnCalendarDeshlet.click();
	}

	@Then("^User should verify all options in the menu$")
	public void user_should_verify_all_options_in_the_menu() {
		home.dropDownBtnOnCalendarDeshlet.click();
		int count = home.optionsOnDDMenuOfCalendar.size();
		for(int i = 0; i < count; i++) {
			String[] option = home.optionsOnDDMenuOfCalendar.get(i).getText().split("\n");
			expectedOptions.add(option[0]);
		}
		for(WebElement each : home.optionsOnDDMenuOfCalendar) {
			String expectedOptions = Config.getProperty("options");
			System.out.println(each.getText());
			Assert.assertTrue(expectedOptions.contains(each.getText()));
		}


	}


	@When("^User clicks on View Calendar$")
	public void user_clicks_on_View_Calendar() {
		home.dropDownBtnOnCalendarDeshlet.click();
		home.viewButtonOnCalendarMenu.click();
	}

	@When("^User clicks any date and create new Meeting with valid credentials in excel sheet \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_clicks_any_date_and_create_new_Meeting_with_valid_credentials_in_excel_sheet_and(String file,
			String sheet) {
		ExcelUtils.openExcelFile(file, sheet);
		System.out.println(ExcelUtils.getCellData(0, 2));
		System.out.println(ExcelUtils.getCellData(1, 0));
	}

	@When("^User clicks Full Form and click on Save button$")
	public void user_clicks_Full_Form_and_click_on_Save_button() {
		home.dateOnCalendar.click();
		BrowserUtils.waitForVisibility(home.fullFormBtnOnCalendar, 3).click();
		home.nameBoxOnCalendar.sendKeys("g");
		BrowserUtils.waitForVisibility(home.saveBtnOnCalendar, 3).click();
	}

	@Then("^User should verify given credentials are present in Overview box$")
	public void user_should_verify_given_credentials_are_present_in_Overview_box() {

	}
}
