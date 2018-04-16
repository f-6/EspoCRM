package com.espoCRM.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.espoCRM.pages.ChekingEmails;
import com.espoCRM.pages.HomePage;
import com.espoCRM.utilities.Config;
import com.espoCRM.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US010_stepDefs {
	WebDriver driver = Driver.getDriver();
	HomePage home = new HomePage();
	ChekingEmails emails = new ChekingEmails();
	@Given("^User should able go to Email button$")
	public void user_should_able_go_to_Email_button() {
		Driver.highLightElement(driver, emails.emailBtn);
		emails.emailBtn.click();
	}

	@When("^User should able click to Compose button$")
	public void user_should_able_click_to_Compose_button() {
		Driver.highLightElement(driver, emails.emailBtn);
		Assert.assertTrue(emails.emailBtn.isDisplayed());
		emails.composeBtn.click();
	}

	@Then("^User should able to Fill all the fields and Save$")
	public void user_should_able_to_Fill_all_the_fields_and_Save() {
		Driver.highLightElement(driver, emails.fromBtn);
		Assert.assertTrue(emails.fromBtn.isDisplayed());
		emails.fromBtn.sendKeys(Config.getProperty("email"));
		Driver.highLightElement(driver, emails.ccBtn);
		Assert.assertTrue(emails.ccBtn.isDisplayed());
		emails.ccBtn.sendKeys(Config.getProperty("CC"));
		Driver.highLightElement(driver, emails.toBtn);
		Assert.assertTrue(emails.toBtn.isDisplayed());
		emails.toBtn.sendKeys(Config.getProperty("email10"));
		Driver.highLightElement(driver, emails.bccBtn);
		Assert.assertTrue(emails.bccBtn.isDisplayed());
		emails.bccBtn.sendKeys(Config.getProperty("BCC"));
		Driver.highLightElement(driver, emails.accountBtn);
		Assert.assertTrue(emails.accountBtn.isDisplayed());
		Driver.highLightElement(driver, emails.selectBtn);
		Assert.assertTrue(emails.selectBtn.isDisplayed());
		Driver.highLightElement(driver, emails.arrayUpBtn);
		Assert.assertTrue(emails.arrayUpBtn.isDisplayed());
		//emails.arrayUpBtn.click();
		//driver.findElement(By.xpath("//tr[@data-id='5ad1df01d779fe95a']")).click();
		Driver.highLightElement(driver, emails.removeBtn);
		Assert.assertTrue(emails.removeBtn.isDisplayed());
		Driver.highLightElement(driver, emails.selectTemplateBtn);
		Assert.assertTrue(emails.selectTemplateBtn.isDisplayed());
//		driver.findElement(By.xpath("//tr[@data-id='5ab961ca196af41f1']")).click();
		Driver.highLightElement(driver, emails.subjectBtn);
		Assert.assertTrue(emails.subjectBtn.isDisplayed());
		emails.subjectBtn.sendKeys(Config.getProperty("subject"));
		Driver.highLightElement(driver, emails.bodyBtn);
		Assert.assertTrue(emails.bodyBtn.isDisplayed());
		Driver.highLightElement(driver, emails.attachmentsBtn);
		Assert.assertTrue(emails.attachmentsBtn.isDisplayed());
		Driver.highLightElement(driver, emails.htmlBtn);
		Assert.assertTrue(emails.htmlBtn.isDisplayed());
//		Driver.highLightElement(driver, emails.saveDraftBtn);
//		Assert.assertTrue(emails.saveDraftBtn.isDisplayed());
//		emails.saveDraftBtn.click();
//		driver.findElement(By.xpath("//a[@class='close']")).click();
	}

	@Then("^User should able to Save as a Draft$")
	public void user_should_able_to_Save_as_a_Draft() {
		Driver.highLightElement(driver, emails.saveDraftBtn);
		Assert.assertTrue(emails.saveDraftBtn.isDisplayed());
		emails.saveDraftBtn.click();
		driver.findElement(By.xpath("//a[@class='close']")).click();
	}
	
	
	@Then("^User should able click to Draft button on Emails page$")
	public void user_should_able_click_to_Draft_button_on_Emails_page() {
		Driver.highLightElement(driver, emails.draftBtn);
		emails.draftBtn.click(); 
	}
	
	
	@Then("^User should able to check recently added mail in Draft menu //$")
	public void user_should_able_to_check_recently_added_mail_in_Draft_menu() {
		Driver.highLightElement(driver, emails.chekingNewEmail);
		Assert.assertTrue(emails.chekingNewEmail.isDisplayed());
		emails.chekingNewEmail.click();
	}

	@Then("^User should check is last Draft is in Draft box //$")
	public void user_should_check_is_last_Draft_is_in_Draft_box() {
		Driver.highLightElement(driver, emails.chekingNewEmail);
		Assert.assertTrue(emails.chekingNewEmail.isDisplayed());
	}

	@Then("^User should able to open recently added mail //$")
	public void user_should_able_to_open_recently_added_mail() {
		Driver.highLightElement(driver, emails.chekingNewEmail);
		emails.chekingNewEmail.click();
	}

	@Then("^User should able try to send again //$")
	public void user_should_able_try_to_send_again() throws InterruptedException {
		Driver.highLightElement(driver, emails.sendBtn);
		emails.sendBtn.click();
		driver.wait(3);
		emails.emailBtn.click();
	}

	@Then("^User should able to check Draft box again$")
	public void user_should_able_to_check_Draft_box_again() {
	    emails.draftBtn.click();
	}

	@Then("^User should able to check Last send mail in Send Box$")
	public void user_should_able_to_check_Last_send_mail_in_Send_Box() {
		emails.emailBtn.click();
	}
}
