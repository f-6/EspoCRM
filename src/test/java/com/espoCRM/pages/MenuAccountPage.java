package com.espoCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.espoCRM.utilities.Driver;

public class MenuAccountPage {

	private WebDriver driver = Driver.getDriver();

	public MenuAccountPage() {
		PageFactory.initElements(driver, this);
	}
	/* Account Page task case US008 and US007 */
	// Account button on left side

	@FindBy(xpath = "//img")
	public WebElement espoCRMLogo;

	@FindBy(xpath = "//li[@data-name='Account']")
	public WebElement accountBtn;
	// All Button
	@FindBy(xpath = "//div[@class='input-group-btn left-dropdown']")
	public WebElement accountAllBtn;
	// Search box on Account Page
	@FindBy(xpath = "//input[@name='textFilter']")
	public WebElement accountSearchBox;
	// Search button on Account Page
	@FindBy(xpath = "//button[@class='btn btn-primary search btn-icon']")
	public WebElement accountSearchBtn;
	// Reset button on Account Page
	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement accountResetBtn;
	// Add Field button on Account Page
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle add-filter-button']")
	public WebElement accountAddFieldBtn;

	// Account List on Account Page

	@FindBy(xpath = "//td[@data-name='name']")
	public WebElement accountList;

	// Account Create on Account Page

	@FindBy(xpath = "//div[@class='header-buttons btn-group pull-right']")
	public WebElement accountCreate;

	// UserName on Account Create Page

	@FindBy(xpath = "//input[@name='name']")
	public WebElement accountUsername;

	// Email on Account Create Page

	@FindBy(xpath = "//input[@type='email']")
	public WebElement accountEmail;

	// Phone number on Account Create Page

	@FindBy(xpath = "//select[@class='form-control']")
	public WebElement accountPhoneNumberOptions;

	@FindBy(xpath = "//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement accountPhoneNumberBox;

	// Web-Site on Account Create Page
	@FindBy(xpath = "//input[@name='website']")
	public WebElement accountWebsite;

	// Billing address on Account Create Page

	@FindBy(xpath = "//textarea[@name='billingAddressStreet']")
	public WebElement accountBillingAddressStreet;

	@FindBy(xpath = "//input[@name='billingAddressCity']")
	public WebElement accountBillingCity;

	@FindBy(xpath = "//input[@name='billingAddressState']")
	public WebElement accountBillingAddressState;

	@FindBy(xpath = "//input[@name='billingAddressPostalCode']")
	public WebElement accountBillingAddressPostalCode;

	@FindBy(xpath = "//input[@name='billingAddressCountry']")
	public WebElement accountBillingAddressCountry;

	// Shipping address on Account Create Page

	@FindBy(xpath = "//textarea[@name='shippingAddressStreet']")
	public WebElement accountShippingAddressStreet;

	@FindBy(xpath = "//input[@name='shippingAddressCity']")
	public WebElement accountShippingAddressCity;

	@FindBy(xpath = "//input[@name='shippingAddressState']")
	public WebElement accountShippingState;

	@FindBy(xpath = "//input[@name='shippingAddressPostalCode']")
	public WebElement accountShippingAddressPostalCode;

	@FindBy(xpath = "//input[@name='shippingAddressCountry']")
	public WebElement accountShippingAddressCountry;

	// Details on Account Create Page

	@FindBy(xpath = "//select[@name='type']")
	public WebElement accountType;

	@FindBy(xpath = "//input[@name='sicCode']")
	public WebElement accountSicCode;

	@FindBy(xpath = "//select[@name='industry']")
	public WebElement accountIndustry;

	@FindBy(xpath = "//textarea[@class='main-element form-control auto-height']")
	public WebElement accountDescription;

	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement accountButtonSave;

	@FindBy(xpath = "//button[@data-action='cancel']")
	public WebElement accountButtonCancel;

	// Next page after creating new account and saving

	@FindBy(xpath = "//input[@id='global-search-input']")
	public WebElement accountSearchBoxAfterSaving;

	@FindBy(xpath = "//div[@class='input-group-btn']")
	public WebElement accountSearchBtnAfterSaving;

	@FindBy(xpath = "//div[@id='global-search-panel']")
	public WebElement accountSearchResult;

}
