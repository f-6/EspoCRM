package com.espoCRM.step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.pages.LoginPage;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class US001_stepDefs {

	WebDriver driver = Driver.getDriver();
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();

	/*
	 * LOGIN PAGE===--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 */
	@Given("^User is on application login page$")
	public void user_is_on_application_login_page() {
		driver.get(Config.getProperty("urlLogin"));
	}

	@Given("^User should see EspoCRM title$")
	public void user_should_see_EspoCRM_title() {
		// System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals(Config.getProperty("title")));
	}

	@Given("^User should see EspoCRM logo$")
	public void user_should_see_EspoCRM_logo() {
		Assert.assertTrue(login.logo.isDisplayed());
	}

	@Given("^User should see Username, Password boxes$")
	public void user_should_see_Username_Password_boxes() {
		Assert.assertTrue(login.userNameBox.isDisplayed());
		Assert.assertTrue(login.userPasswordBox.isDisplayed());
	}

	@Then("^User should see Login button, Forgot Password\\? text link$")
	public void user_should_see_Login_button_Forgot_Password_text_link() {
		Assert.assertTrue(login.loginBtn.isDisplayed());
		Assert.assertTrue(login.forgotPasswordLink.isDisplayed());
		Driver.highLightElement(driver, login.forgotPasswordLink);
		login.forgotPasswordLink.click();
		// System.out.println("======clikked forgot password");
	}

	@Given("^User should see Submit, Close, Username, Email address, Password Change Request text, x close buttons$")
	public void user_should_see_Submit_Close_Username_Email_address_Password_Change_Request_text_x_close_buttons() {
		Assert.assertEquals(login.passwordChangeText.getAttribute("textContent"),
				Config.getProperty("passwordChangeText"));
		Driver.sleep(2);
		Assert.assertTrue(login.submitBtn.isDisplayed());
		Assert.assertTrue(login.closeBtn.isDisplayed());
		Assert.assertTrue(login.xBtn.isDisplayed());
		Assert.assertTrue(login.passwordChangeUserNameBox.isDisplayed());
		Assert.assertTrue(login.passwordChangeEMailBox.isDisplayed());

	}

	@Given("^User should able to enter Username, Email Address$")
	public void user_should_able_to_enter_Username_Email_Address() {
		Driver.highLightElement(driver, login.passwordChangeUserNameBox);
		login.passwordChangeUserNameBox.sendKeys(Config.getProperty("username"));

		Driver.sleep(1);
		Driver.highLightElement(driver, login.passwordChangeEMailBox);
		login.passwordChangeEMailBox.sendKeys(Config.getProperty("email"));
	}

	@Then("^User should click Close button$")
	public void user_should_click_Close_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, login.closeBtn);
		login.closeBtn.click();
	}

	@Given("^User enters Username, Password$")
	public void user_enters_Username_Password() {
		Driver.highLightElement(driver, login.userNameBox);
		login.userNameBox.sendKeys(Config.getProperty("username"));

		Driver.sleep(1);
		Driver.highLightElement(driver, login.userPasswordBox);
		login.userPasswordBox.sendKeys(Config.getProperty("password"));

		Driver.highLightElement(driver, login.loginBtn);
		login.loginBtn.click();
	}

	/*
	 * HOME PAGE===--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 */
	@Then("^User should see HomePage of site$")
	public void user_should_see_HomePage_of_site() {
		Driver.sleep(1);
		driver.get(Config.getProperty("urlHome"));
	}

	@Given("^User should see Search box, Search button$")
	public void user_should_see_Search_box_Search_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, home.searchBox);
		Assert.assertTrue(home.searchBox.isDisplayed());

		Driver.sleep(1);
		Driver.highLightElement(driver, home.searchBtn);
		Assert.assertTrue(home.searchBtn.isDisplayed());
	}

	@Given("^User should see and click Notification button$")
	public void user_should_see_and_click_Notification_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, home.notificationBtn);
		Assert.assertTrue(home.notificationBtn.isDisplayed());
	}

	@Given("^User should see and click Create \\+ sign button$")
	public void user_should_see_and_click_Create_sign_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, home.createDropdownBtn);
		Assert.assertTrue(home.createDropdownBtn.isDisplayed());
	}

	@Given("^User should see and click Menu button$")
	public void user_should_see_and_click_Menu_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, home.menuDropdownBtn);
		Assert.assertTrue(home.menuDropdownBtn.isDisplayed());
	}

	@Given("^User should see and click Edit Dashboard button$")
	public void user_should_see_and_click_Edit_Dashboard_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, home.editTabBtn);
		Assert.assertTrue(home.editTabBtn.isDisplayed());
		home.editTabBtn.click();

		Driver.sleep(1);
		Driver.highLightElement(driver, home.editCancelBtn);
		home.editCancelBtn.click();

	}

	@Given("^User should see and click Add Dashlet button$")
	public void user_should_see_and_click_Add_Dashlet_button() {
		Driver.sleep(1);
		Driver.highLightElement(driver, home.addTabBtn);
		Assert.assertTrue(home.addTabBtn.isDisplayed());
		home.addTabBtn.click();

		Driver.sleep(1);
		Driver.highLightElement(driver, home.addCancelBtn);
		home.addCancelBtn.click();
	}

	@Given("^User should see EspoCRM homepage logo$")
	public void user_should_see_EspoCRM_homepage_logo() {
		Driver.highLightElement(driver, home.homePageLogo);
		Assert.assertTrue(home.homePageLogo.isDisplayed());
	}

	@Given("^User should see Menu List on left side of the window$")
	public void user_should_see_Menu_List_on_left_side_of_the_window() {

		Actions action = new Actions(driver);
		int count = 0;

		for (WebElement we : home.leftMenuBarElements) {
			Driver.highLightElement(driver, we);
			action.moveToElement(we).build().perform();
			System.out.println("=============> " + we.getText());
			count++;
			if (count == 11) {
				Driver.highLightElement(driver, home.leftMenuDropdown);
				home.leftMenuDropdown.click();
				for (WebElement we1 : home.lefMenuDropdownElements) {
					Driver.highLightElement(driver, we1);
					action.moveToElement(we1).build().perform();
					System.out.println("=============> " + we1.getText());
					break;
				}
			}
		}
		home.homePageLogo.click();
	}

	@Then("^User should see Dashlet Windows on screen$")
	public void user_should_see_Dashlet_Windows_on_screen() {
		// Assert.assertTrue(System.out.println(home.dasletBoard.getAttribute("data-gs-current-height")));
		Actions action = new Actions(driver);
		Assert.assertTrue(home.dasletBoard.isEnabled());
		action.clickAndHold(home.dragPlace).release(home.dropPlace).build().perform();
		// action.dragAndDrop(home.dragPlace, home.dropPlace).build().perform();
		// action.dragAndDropBy(home.dragPlace, 1, 1);
		Driver.quit(3);
	}

}
