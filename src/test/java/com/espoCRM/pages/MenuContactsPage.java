package com.espoCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.espoCRM.utilities.Driver;

public class MenuContactsPage {

	private WebDriver driver = Driver.getDriver();
	
	public MenuContactsPage() {
		PageFactory.initElements(driver, this);
	}
	/* US001 --> From here Element of LOGIN window */
	
	@FindBy(xpath = "select[@name='salutationName']")
	public WebElement contactsSalutationField;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameField;
	
}
