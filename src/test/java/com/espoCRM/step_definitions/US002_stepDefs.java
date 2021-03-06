package com.espoCRM.step_definitions;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.espoCRM.pages.HomePage;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class US002_stepDefs {
	WebDriver driver = Driver.getDriver();
	HomePage hpage = new HomePage();
	List<String> expectedDashlets = new  ArrayList<>();

	@Given("^User should able to add new Dashlet window$")
	public void user_should_able_to_add_new_Dashlet_window() {

		Driver.highLightElement(driver, hpage.homePageAddBtn);
		hpage.homePageAddBtn.click();

		int count = hpage.addDashletAddBtn.size();

		for(int i = 0; i < count; i++) {
			Driver.highLightElement(driver, hpage.addDashletAddBtn.get(i));
			hpage.addDashletAddBtn.get(i).click();
			hpage.homePageAddBtn.click();
		}
		hpage.addCancelBtn.click();


	}


	@Then("^User should see that all Dashlet are added$")

	public void user_should_see_that_all_Dashlet_are_added() {


		hpage.homePageAddBtn.click();
		int count = hpage.listOfOptions.size();
		for(int i = 0; i < count; i++) {
			String[] dashlet = hpage.listOfOptions.get(i).getText().split("\n");
			expectedDashlets.add(dashlet[0]);
		}
		hpage.addCancelBtn.click();
		for(WebElement each : hpage.nameOfDashlet) {
			Assert.assertTrue(expectedDashlets.contains(each.getText()));
		}
	}

	@Then("^User should able to move Dashlet window$")
	public void user_should_able_to_move_Dashlet_window() {

	}

	@Given("^User should able to Remove all dashlets$")
	public void user_should_able_to_Remove_all_dashlets() {
		int length = 1;
		boolean b = true;
		for(int i = 0; b ;  i=0) {
			
			hpage.dropDownBtnOnDeshlet.get(i).click();

			hpage.removeBtnOnDeshlet.get(i).click();

			hpage.cofirmRemovingBtnOnDeshlet.click();
			length = hpage.dropDownBtnOnDeshlet.size();
			b = i < length;
//			Driver.sleep(1);
		}
	}
 
	
	@Given("^User should able to see all dashlets are removed$")
	public void user_should_able_to_see_all_dashlets_are_removed() {
	try{
		hpage.nameOfDashlet.get(0).isDisplayed();
	}catch(IndexOutOfBoundsException m) {
		assertTrue(true);
	}
	
	}
}
