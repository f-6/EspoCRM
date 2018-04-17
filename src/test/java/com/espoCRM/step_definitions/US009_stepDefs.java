package com.espoCRM.step_definitions;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.pages.LoginPage;
import com.espoCRM.pages.MenuContactsPage;
import com.espoCRM.utilities.BrowserUtils;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class US009_stepDefs {

	WebDriver driver = Driver.getDriver();
	MenuContactsPage con = new MenuContactsPage();
	LoginPage login = new LoginPage();
	HomePage home = new HomePage();
	Actions action = new Actions(driver);
	int size = Integer.parseInt(Config.getProperty("lengthSize"));
	int size2 = Integer.parseInt(Config.getProperty("lengthSize"));
	

	
// Scenario 1
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Given("^User should see existing Contacts$")
	public void user_should_see_existing_Contacts() {


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
	public void contacts_Text_should_be_visible_on_the_top_of_the_page() {
		Driver.highLightElement(driver, con.contactsText);
		Assert.assertTrue(con.contactsText.isDisplayed());
	}

	@Then("^User should see All dropdown, Search Box, Search button, Reset button, ADD FIELD button, Create Contact button$")
	public void user_should_see_Search_Box_Search_button_Reset_button_ADD_FIELD_button_Create_Contact_button() {
		Driver.highLightElement(driver, con.allBtn);
		Assert.assertTrue(con.allBtn.isDisplayed());
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

// Scenario 2
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Given("^User should be able to Click on Create Contact button$")
	public void user_should_be_able_to_Click_on_Create_Contact_button() {
		con.ContactsMenuBtn.click();
		Driver.highLightElement(driver, con.createBtn);
		con.createBtn.click();
	}

	@Given("^User should be able to fill the empty Field boxes$")
	public void user_should_be_able_to_fill_the_empty_Field_boxes() {
		int size = Integer.parseInt(Config.getProperty("lengthSize"));
		int size2 = Integer.parseInt(Config.getProperty("lengthSize"));
		Driver.sleep(1);
		
		Driver.highLightElement(driver, con.contactsSalutationField);
		Select select = new Select(con.contactsSalutationField);
		con.contactsSalutationField.click();
		Assert.assertTrue(con.contactsSalutationField.isDisplayed());

//		select.selectByVisibleText(Config.getProperty("salutation"));
//		Assert.assertEquals(select.getFirstSelectedOption().getText(), Config.getProperty("salutation"),
//				"Salutation is not matching");
		
		int salutationSize = con.salutationsChoose.size();
		
		Random rg = new Random();
		int count = 0;
		for (int idx = 1; idx <= salutationSize; ++idx){
			int randomInt = rg.nextInt(salutationSize);
			 for (WebElement el : con.salutationsChoose) {
				 count++;
				 if (randomInt == count) {
					 el.click();
					 break;
				 }
			 }
		}

		Driver.highLightElement(driver, con.firstNameField);
		con.firstNameField.sendKeys(Driver.generateRandomString(size));

		Driver.highLightElement(driver, con.lastNameField);
		con.lastNameField.sendKeys(Driver.generateRandomString(size));

		Driver.highLightElement(driver, con.accountsSelectBox);
		con.accountsSelectBox.sendKeys(Config.getProperty("accountsField"));

		for (WebElement el : con.chooseOneAccount) {
			if (el.getText().equalsIgnoreCase(Config.getProperty("accountsField"))) {
				el.click();
				break;
			}
		}

		Driver.highLightElement(driver, con.emailField);
		System.out.println(Driver.generateEmail(size));
		con.emailField.sendKeys(Driver.generateEmail(size));
		

		Driver.highLightElement(driver, con.phoneField);
		con.phoneField.sendKeys(Driver.generateRandomString(size2));

		Driver.highLightElement(driver, con.addressField);
		con.addressField.sendKeys(Config.getProperty("address"));

		Driver.highLightElement(driver, con.cityField);
		con.cityField.sendKeys(Config.getProperty("city"));

		Driver.highLightElement(driver, con.stateField);
		con.stateField.sendKeys(Config.getProperty("state"));

		Driver.highLightElement(driver, con.postalField);
		con.postalField.sendKeys(Config.getProperty("postalCode"));

		Driver.highLightElement(driver, con.countryField);
		con.countryField.sendKeys(Config.getProperty("country"));

		Driver.highLightElement(driver, con.descriptionField);
		con.descriptionField.sendKeys(Config.getProperty("description"));

	}

	@Then("^User should Click to save button$")
	public void user_should_Click_to_save_button() {
		Driver.sleep(1);
		if(con.saveContainer.isDisplayed()) {
			Driver.highLightElement(driver, con.saveBtn);
			Driver.sleep(1);
			con.saveBtn.click();
		} else {
		Driver.highLightElement(driver, con.anywaySaveBtn);
		con.anywaySaveBtn.click();
		Driver.sleep(1);
		}
	}

// Scenario 3
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Given("^User goes back to Contact Page$")
	public void user_goes_back_to_Contact_Page() {
		Driver.highLightElement(driver, con.ContactsMenuBtn);
		con.ContactsMenuBtn.click();
	}

	@Given("^User should see Contacts Table List$")
	public void user_should_see_Contacts_Table_List() {
		Assert.assertTrue(con.table.isDisplayed());
	}

	@Given("^User should able to click one Contact from the list$")
	public void user_should_able_to_click_one_Contact_from_the_list() {
		
		String fullName = Config.getProperty("firstName")+" "+Config.getProperty("lastName");
		
		for(WebElement contact : con.listOfContacts) {
			System.out.println(contact.getText());
			if(contact.getText().equals(fullName)) {
//				Assert.assertEquals(fullName, contact.getText());
				Driver.highLightElement(driver, contact);
				contact.click();
				break;
			}
		}
	}

	@Then("^User should see credential of that contact$")
	public void user_should_see_credential_of_that_contact() {
		Assert.assertTrue(con.contactsOverview.isDisplayed());
		for (WebElement el : con.contactsOverviewElements) {
			Driver.highLightElement(driver, el);
			Assert.assertTrue(el.isDisplayed());
		}
	}

// Scenario 4
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Given("^User goes back to Contact Page to create with not valid credentials$")
	public void user_goes_back_tp_Contact_Page_to_create_with_not_valid_credentials() {
//		driver.navigate().back();
	}
	
	@Given("^User should be able to Click on Create Contact button on page$")
	public void user_should_be_able_to_Click_on_Create_Contact_button_on_page() {
		Driver.sleep(2);
		Driver.highLightElement(driver, con.ContactsMenuBtn);
		con.ContactsMenuBtn.click();
		Driver.sleep(1);
		Driver.highLightElement(driver, con.createBtn);
		con.createBtn.click();
	}

	@Given("^User should be able to fill the empty Field boxes with numbers$")
	public void user_should_be_able_to_fill_the_empty_Field_boxes_with_numbers() {
		Driver.sleep(1);
		Driver.highLightElement(driver, con.contactsSalutationField);
		Select select = new Select(con.contactsSalutationField);
		con.contactsSalutationField.click();

		select.selectByVisibleText(Config.getProperty("salutation"));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), Config.getProperty("salutation"),
				"Salutation is not matching");

		Driver.highLightElement(driver, con.firstNameField);
		con.firstNameField.sendKeys(Driver.generateRandomString(size2));
		

		Driver.highLightElement(driver, con.lastNameField);
		con.lastNameField.sendKeys(Driver.generateRandomString(size2));

		Driver.highLightElement(driver, con.accountsSelectBox);
		con.accountsSelectBox.sendKeys(Config.getProperty("accountsFieldN"));

		for (WebElement el : con.chooseOneAccount) {
			System.out.println(el.getText());
			if (el.getText().equalsIgnoreCase(Config.getProperty("accountsFieldN"))) {
				el.click();
				break;
			}
		}

		Driver.highLightElement(driver, con.emailField);
		con.emailField.sendKeys(Config.getProperty("emailN"));

		Driver.highLightElement(driver, con.phoneField);
		con.phoneField.sendKeys(Driver.generateRandomString(size2));

		Driver.highLightElement(driver, con.addressField);
		con.addressField.sendKeys(Config.getProperty("addressN"));

		Driver.highLightElement(driver, con.cityField);
		con.cityField.sendKeys(Config.getProperty("cityN"));

		Driver.highLightElement(driver, con.stateField);
		con.stateField.sendKeys(Config.getProperty("stateN"));

		Driver.highLightElement(driver, con.postalField);
		con.postalField.sendKeys(Config.getProperty("postalCodeN"));

		Driver.highLightElement(driver, con.countryField);
		con.countryField.sendKeys(Config.getProperty("countryN"));

		Driver.highLightElement(driver, con.descriptionField);
		con.descriptionField.sendKeys(Config.getProperty("descriptionN"));

	}

	@Then("^User should NOT able to save when he/she clicks to SAVE button at the end$")
	public void user_should_NOT_able_to_save_when_he_she_clicks_to_SAVE_button_at_the_end() {
		Driver.sleep(1);
		Driver.highLightElement(driver, con.saveBtn);
		Driver.sleep(1);
		
		con.saveBtn.click();
		Driver.highLightElement(driver, con.anywaySaveBtn);
		con.anywaySaveBtn.click();
		Driver.sleep(1);
//		try
//		{
//		   WebDriverWait wait = new WebDriverWait(driver, 5);
//		   wait.until(ExpectedConditions.elementToBeClickable(con.saveBtn));
//		   return true;
//		}
//		catch (Exception e)
//		{
//		  return false;
//		}
		
		Assert.fail("USER should enter VALID Credentials!!!");
	}
	
// Scenario 5
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Given("^User goes back tp Contact Page$")
	public void user_goes_back_tp_Contact_Page() {
//		driver.navigate().back();
		con.ContactsMenuBtn.click();
	}

	@Given("^User should not see Contact with NOT valid credentials$")
	public void user_should_not_see_Contact_with_NOT_valid_credentials() {
		String notValidContact = Config.getProperty("firtsNameN") +" " + Config.getProperty("lastNameN");
		for (WebElement el : con.listOfContacts) {
			if (el.getText().equals(notValidContact)) {
				Assert.fail("THIS COntact should NOT be on the List!!!");
			}
		}
	}

	@Given("^User should check one contact, click Action dropdown$")
	public void user_should_check_one_contact_click_Action_dropdown() {
		int checkBOxLenth = con.checkBoxElements.size();
		System.out.println(checkBOxLenth);
		
		Random rg = new Random();
		int count = 0;
		for (int idx = 0; idx <= checkBOxLenth; ++idx){
			int randomInt = rg.nextInt(checkBOxLenth);
//			System.out.println("Generated : " + randomInt);
			 for (WebElement el : con.checkBoxElements) {
				 count++;
				 if (randomInt == count) {
//					 System.out.println("Integer.parseInt(random)");
					 el.click();
					 break;
				 }
			 }
		}
		Driver.highLightElement(driver, con.actionBtn);
		con.actionBtn.click();
		
		Driver.highLightElement(driver, con.actionRemove);
		con.actionRemove.click();
		
			
	}

	@Then("^User should remove contact from table$")
	public void user_should_remove_contact_from_table() {
		Driver.highLightElement(driver, con.removePopupBtn);
		con.removePopupBtn.click();
	}
}
