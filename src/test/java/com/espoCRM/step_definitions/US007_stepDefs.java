package com.espoCRM.step_definitions;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;

	import com.espoCRM.pages.HomePage;
	import com.espoCRM.pages.MenuAccountPage;
	import com.espoCRM.utilities.Config;
	import com.espoCRM.utilities.Driver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;

	public class US007_stepDefs {
		WebDriver driver = Driver.getDriver();
		HomePage home = new HomePage();
		MenuAccountPage account = new MenuAccountPage(); 
		
		@Given("^User should see EspoCRM title in Account page$")
		public void user_should_see_EspoCRM_title_in_Account_page() {
			Driver.highLightElement(driver, account.accountBtn);
			account.accountBtn.click();
		}

		@Given("^User should see EspoCRM logo in Account page$")
		public void user_should_see_EspoCRM_logo_in_Account_page() {
		account.ESPOCRMLogo.isDisplayed();
		}

		@Given("^User should see Search box in Account page$")
		public void user_should_see_Search_box_in_Account_page() {
			Driver.highLightElement(driver, account.accountSearchBox);
			account.accountSearchBox.isDisplayed();
		}

		@Given("^User should see Positive Username, Email address, Phone, Web-site, Billing address\\(which includes: street name, city, state, postal code and country\\), Shipping address\\(which includes: street name, city, state, postal code and country\\),Details: Type, Sic code, Industry and Descriptions boxes$")
		public void user_should_see_Positive_Username_Email_address_Phone_Web_site_Billing_address_which_includes_street_name_city_state_postal_code_and_country_Shipping_address_which_includes_street_name_city_state_postal_code_and_country_Details_Type_Sic_code_Industry_and_Descriptions_boxes() {
			Driver.highLightElement(driver, account.accountBtn);
			account.accountBtn.click();
			Driver.highLightElement(driver, account.accountCreate);
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
			driver.findElement(By.xpath("//option[@value='Customer']")).click();
			Driver.highLightElement(driver, account.accountSicCode);
			Assert.assertTrue(account.accountSicCode.isDisplayed());
			account.accountSicCode.sendKeys(Config.getProperty("sicCode"));
			Driver.highLightElement(driver, account.accountIndustry);
			Assert.assertTrue(account.accountIndustry.isDisplayed());
			driver.findElement(By.xpath("//option[@value='Automotive']")).click();
//			account.accountIndustry.sendKeys(Config.getProperty(""));
			Driver.highLightElement(driver, account.accountDescription);
			Assert.assertTrue(account.accountDescription.isDisplayed());
			account.accountDescription.sendKeys(Config.getProperty("Description"));
			
			// Save button

			Driver.highLightElement(driver, account.accountButtonSave);
			Assert.assertTrue(account.accountButtonSave.isDisplayed());

		}
		@Given("^User should able to enter his positive credantials to all requred boxes$")
		public void user_should_able_to_enter_his_positive_credantials_to_all_requred_boxes() {
		    
		}
	}
