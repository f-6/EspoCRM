package com.espoCRM.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.pages.LoginPage;
import com.espoCRM.pages.MenuContactsPage;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class US009_stepDefs {

	WebDriver driver = Driver.getDriver();
	MenuContactsPage con = new MenuContactsPage();
	LoginPage login = new LoginPage();
	HomePage home = new HomePage();
	Actions action = new Actions(driver);

	
	
//Scenario 1
	@Given("^User should see existing Contacts$")
	public void user_should_see_existing_Contacts() {
		driver.get(Config.getProperty("urlLogin"));
		login.userNameBox.sendKeys(Config.getProperty("username"));
		login.userPasswordBox.sendKeys(Config.getProperty("password"));
		login.loginBtn.click();
		
		Driver.highLightElement(driver, con.ContactsMenuBtn);
		con.ContactsMenuBtn.click();
		Driver.sleep(1);
		Assert.assertTrue(con.table.isDisplayed());
	}

	@Given("^Users should see Contacts on the title of the page$")
	public void users_should_see_Contacts_on_the_title_of_the_page() {
		Assert.assertTrue(driver.getTitle().equals(Config.getProperty("titleContacts")));
	}

	@Given("^Contacts Text should be visible on the top of the page$")
	public void contacts_Text_shoul_be_visible_on_the_top_of_the_page() {
		Driver.highLightElement(driver, con.contactsText);
		Assert.assertTrue(con.contactsText.isDisplayed());
	}

	@Then("^User should see Search Box, Search button, Reset button, ADD FIELD button, Create Contact button$")
	public void user_should_see_Search_Box_Search_button_Reset_button_ADD_FIELD_button_and_Create_Contact_button() {
		Driver.highLightElement(driver, con.searchBox);
		Assert.assertTrue(con.searchBox.isDisplayed());
		Driver.highLightElement(driver, con.searchBtn);
		Assert.assertTrue(con.searchBtn.isDisplayed());
		Driver.highLightElement(driver, con.resetBtn);
		Assert.assertTrue(con.resetBtn.isDisplayed());
		Driver.highLightElement(driver, con.addFieldBtn);
		Assert.assertTrue(con.addFieldBtn.isDisplayed());
		Driver.highLightElement(driver, con.createBtn);
		Assert.assertTrue(con.createBtn.isDisplayed());
		
	}

//Scenario 2
	@Given("^User should be able to Click on Create Contact button$")
	public void user_should_be_able_to_Click_on_Create_Contact_button() {
		
		Driver.highLightElement(driver, con.createBtn);
		con.createBtn.click();
	}

	@Given("^User should be able to fill the empty Field boxes$")
	public void user_should_be_able_to_fill_the_empty_Field_boxes() {
		Driver.highLightElement(driver, con.contactsSalutationField);
		con.contactsSalutationField.click();
		int count = 0;
		//SOLVE this part
	
		for (WebElement el : con.salutationsChoose) {
			Select select = new Select(con.contactsSalutationField);
			Driver.highLightElement(driver, el);
			action.moveToElement(el).build().perform();
		
			if(el.getText().equals(Config.getProperty("salutation"))) {
				
			}
		}
		
		
	}
	
	@Then("^User should Click to save button$")
	public void user_should_Click_to_save_button() {
		con.saveBtn.click();
		con.ContactsMenuBtn.click();
	}

	@Given("^User should see Contacts Table List$")
	public void user_should_see_Contacts_Table_List() {
		
	}

	@Given("^User should able to click one Contact from the list$")
	public void user_should_able_to_click_one_Contact_from_the_list() {

	}

	@Then("^User should see credential of that contact$")
	public void user_should_see_credential_of_that_contact() {

	}

	@Given("^User goes back tp Contact Page to create with not valid credentials$")
	public void user_goes_back_tp_Contact_Page_to_create_with_not_valid_credentials() {

	}

	@Given("^User should be able to Click on Create Contact button on page$")
	public void user_should_be_able_to_Click_on_Create_Contact_button_on_page() {

	}

	@Given("^User should be able to fill the empty Field boxes with numbers$")
	public void user_should_be_able_to_fill_the_empty_Field_boxes_with_numbers() {

	}

	@Then("^User should NOT able to save when he/she clicks to SAVE button at the end$")
	public void user_should_NOT_able_to_save_when_he_she_clicks_to_SAVE_button_at_the_end() {

	}

	@Given("^User should see new Created Contacts on the Contacts Table list$")
	public void user_should_see_new_Created_Contacts_on_the_Contacts_Table_list() {

	}

	@Given("^User should see Contact with valid credentials$")
	public void user_should_see_Contact_with_valid_credentials() {

	}

	@Given("^User should not see Contact with NOT valid credentials$")
	public void user_should_not_see_Contact_with_NOT_valid_credentials() {

	}

	@Given("^User should check one contact, click Action dropdown$")
	public void user_should_check_one_contact_click_Action_dropdown() {

	}

	@Then("^User should remove contact from table$")
	public void user_should_remove_contact_from_table() {

		Driver.quit(7);
	}
	
	
	
	
	@Given("^User goes back to Contact Page$")
	public void user_goes_back_to_Contact_Page() {
	   
	}

	@Given("^User goes back tp Contact Page$")
	public void user_goes_back_tp_Contact_Page() {
	  
	}

}
