package com.espoCRM.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.pages.MenuAccountPage;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class US008_step_Defs {
	WebDriver driver = Driver.getDriver();
	HomePage home = new HomePage();
	MenuAccountPage account = new MenuAccountPage();

	@Given("^User is on application Account page$")
	public void user_is_on_application_Account_page() {
		Driver.highLightElement(driver, account.accountBtn);
		account.accountBtn.click();

	} 

	@Given("^User should see EspoCRM title in home page$")
	public void user_should_see_EspoCRM_title_in_home_page() {
		Assert.assertTrue(driver.getTitle().contains(Config.getProperty("title")));
	}

	@Given("^User should see EspoCRM logo in home page$")
	public void user_should_see_EspoCRM_logo_in_home_page() {
		Driver.highLightElement(driver, account.espoCRMLogo);
		account.espoCRMLogo.isDisplayed();
	}

	@Given("^User should see Search box$")
	public void user_should_see_Search_box() {
		Driver.highLightElement(driver, account.accountSearchBox);
		account.accountSearchBox.isDisplayed();
	}

	@Then("^User should see All, Reset,Add Field buttons$")
	public void user_should_see_All_Reset_Add_Field_buttons() {
		Driver.highLightElement(driver, account.accountAllBtn);
		Assert.assertTrue(account.accountAllBtn.isDisplayed());
		Driver.highLightElement(driver, account.accountResetBtn);
		Assert.assertTrue(account.accountResetBtn.isDisplayed());
		Driver.highLightElement(driver, account.accountAddFieldBtn);
		Assert.assertTrue(account.accountAddFieldBtn.isDisplayed());
	}

	@Then("^User should see Create Account button$")
	public void user_should_see_Create_Account_button() {
		Driver.highLightElement(driver, account.accountCreate);
		Assert.assertTrue(account.accountCreate.isDisplayed());

	}

	@Then("^User should see List Of Accounts$")
	public void user_should_see_List_Of_Accounts() {
		Driver.highLightElement(driver, account.accountList);
		Assert.assertTrue(account.accountList.isDisplayed());
		
	}

	@Given("^User should see Username, Email address, Phone, Web-site, Billing address\\(which includes: street name, city, state, postal code and country\\), Shipping address\\(which includes: street name, city, state, postal code and country\\),Details: Type, Sic code, Industry and Descriptions boxes$")
	public void user_should_see_Username_Email_address_Phone_Web_site_Billing_address_which_includes_street_name_city_state_postal_code_and_country_Shipping_address_which_includes_street_name_city_state_postal_code_and_country_Details_Type_Sic_code_Industry_and_Descriptions_boxes() {
		account.accountCreate.click();
		Driver.highLightElement(driver, account.accountUsername);
		Assert.assertTrue(account.accountUsername.isDisplayed());
		account.accountUsername.sendKeys(Config.getProperty("username"));
		Driver.highLightElement(driver, account.accountEmail);
		Assert.assertTrue(account.accountEmail.isDisplayed());
		account.accountEmail.sendKeys(Config.getProperty("email"));
		Driver.highLightElement(driver, account.accountPhoneNumberBox);
		Assert.assertTrue(account.accountPhoneNumberBox.isDisplayed());
		account.accountPhoneNumberBox.sendKeys(Config.getProperty("phoneNumber"));
		Driver.highLightElement(driver, account.accountPhoneNumberOptions);
		Assert.assertTrue(account.accountPhoneNumberOptions.isDisplayed());
		Driver.highLightElement(driver, account.accountWebsite);
		Assert.assertTrue(account.accountWebsite.isDisplayed());
		account.accountWebsite.sendKeys(Config.getProperty("webSite"));

		// Billing address on Account Create Page

		Driver.highLightElement(driver, account.accountBillingAddressStreet);
		Assert.assertTrue(account.accountBillingAddressStreet.isDisplayed());
		account.accountBillingAddressStreet.sendKeys(Config.getProperty("street"));
		Driver.highLightElement(driver, account.accountBillingCity);
		Assert.assertTrue(account.accountBillingCity.isDisplayed());
		account.accountBillingCity.sendKeys(Config.getProperty("city"));
		Driver.highLightElement(driver, account.accountBillingAddressState);
		Assert.assertTrue(account.accountBillingAddressState.isDisplayed());
		account.accountBillingAddressState.sendKeys(Config.getProperty("state"));
		Driver.highLightElement(driver, account.accountBillingAddressPostalCode);
		Assert.assertTrue(account.accountBillingAddressPostalCode.isDisplayed());
		account.accountBillingAddressPostalCode.sendKeys(Config.getProperty("PostalCode"));
		Driver.highLightElement(driver, account.accountBillingAddressCountry);
		Assert.assertTrue(account.accountBillingAddressCountry.isDisplayed());
		account.accountBillingAddressCountry.sendKeys(Config.getProperty("country"));

		// Shipping address on Account Create Page

		Driver.highLightElement(driver, account.accountShippingAddressStreet);
		Assert.assertTrue(account.accountShippingAddressStreet.isDisplayed());
		account.accountShippingAddressStreet.sendKeys(Config.getProperty("street"));
		Driver.highLightElement(driver, account.accountShippingAddressCity);
		Assert.assertTrue(account.accountShippingAddressCity.isDisplayed());
		account.accountShippingAddressCity.sendKeys(Config.getProperty("city"));
		Driver.highLightElement(driver, account.accountShippingState);
		Assert.assertTrue(account.accountShippingState.isDisplayed());
		account.accountBillingAddressState.sendKeys(Config.getProperty("state"));
		Driver.highLightElement(driver, account.accountShippingAddressPostalCode);
		Assert.assertTrue(account.accountShippingAddressPostalCode.isDisplayed());
		account.accountShippingAddressPostalCode.sendKeys(Config.getProperty("PostalCode"));
		Driver.highLightElement(driver, account.accountShippingAddressCountry);
		Assert.assertTrue(account.accountShippingAddressCountry.isDisplayed());
		account.accountShippingAddressCountry.sendKeys(Config.getProperty("country"));

		// Details on Account Create Page

		Driver.highLightElement(driver, account.accountType);
		Assert.assertTrue(account.accountType.isDisplayed());
		Driver.highLightElement(driver, account.accountSicCode);
		Assert.assertTrue(account.accountSicCode.isDisplayed());
		account.accountSicCode.sendKeys(Config.getProperty("sicCode"));
		Driver.highLightElement(driver, account.accountIndustry);
		Assert.assertTrue(account.accountIndustry.isDisplayed());
		Driver.highLightElement(driver, account.accountDescription);
		Assert.assertTrue(account.accountDescription.isDisplayed());

		// Save button

		Driver.highLightElement(driver, account.accountButtonSave);
		Assert.assertTrue(account.accountButtonSave.isDisplayed());

	}

	@Given("^User should not be able to enter wrong credantials to all requred boxes\\(exampl: letters to PhoneNumber box, numbers of simbols to Name box, Email should contain '@' simbol\\.\\.\\.\\)$")
	public void user_should_not_be_able_to_enter_wrong_credantials_to_all_requred_boxes_exampl_letters_to_PhoneNumber_box_numbers_of_simbols_to_Name_box_Email_should_contain_simbol() {

	}

	@Then("^User should click Save button$")
	public void user_should_click_Save_button() {
		Driver.highLightElement(driver, account.accountButtonSave);
		Assert.assertTrue(account.accountButtonSave.isDisplayed());
		account.accountButtonSave.click();
	}

	@Then("^User enters key words about his account to Search box$")
	public void user_enters_key_words_about_his_account_to_Search_box() {
		account.accountSearchBoxAfterSaving.sendKeys("MacBook");

	}

	@Then("^click on Search button$")
	public void click_on_Search_button() {
		account.accountSearchBtnAfterSaving.click();
	}

	@Then("^User should see his Account on Result list$")
	public void user_should_see_his_Account_on_Result_list() {
		account.accountSearchResult.isDisplayed();
	}
}
