package com.espoCRM.pages;

import java.util.List;

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
	
/* US009 --> From here Element of Contacts Menu */
	
	@FindBy(xpath="//a[@href='#Contact']")
	public WebElement ContactsMenuBtn;
	
	@FindBy(xpath="//div[contains(text(),'No Data')]")
	public WebElement tableNoData;
	
	@FindBy(xpath="//table[@class='table']")
	public WebElement table;
	
	@FindBy(xpath="//div[@class='pull-left']")
	public WebElement contactsText;
	
	@FindBy(xpath="//input[@class='form-control text-filter']")
	public WebElement searchBox;
	
	@FindBy(xpath="//button[@class='btn btn-primary search btn-icon']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	public WebElement resetBtn;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle add-filter-button']")
	public WebElement addFieldBtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary action']")
	public WebElement createBtn;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle filters-button btn-default']")
	public WebElement allBtn;
	
	
/* FROM here starts Elements of create contact Window  */
	
	@FindBy(xpath = "//select[@name='salutationName']")
	public WebElement contactsSalutationField;
	
	@FindBy(xpath = "//select[@name='salutationName']//option")
	public List<WebElement> salutationsChoose;
	
	@FindBy(xpath = "//select[@name='salutationName']//option[@value='Dr.']")
	public WebElement salutationDr;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastNameField;
	
	@FindBy(xpath = "//button[@class='btn btn-primary action']")
	public WebElement saveBtn;
	
	@FindBy(xpath = "//div[@data-name='accounts']//input[@placeholder='Select']")
	public WebElement accountsSelectBox;
	
	@FindBy(xpath = "//div[@class='autocomplete-suggestion']")
	public List<WebElement> chooseOneAccount;
	
	@FindBy(xpath = "//input[@class='form-control email-address']")
	public WebElement emailField;
	
	@FindBy(xpath = "//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement phoneField;
		
	@FindBy(xpath = "//textarea[@name='addressStreet']")
	public WebElement addressField;
	
	@FindBy(xpath = "//input[@name='addressCity']")
	public WebElement cityField;
	
	@FindBy(xpath = "//input[@name='addressState']")
	public WebElement stateField;
	
	@FindBy(xpath = "//input[@name='addressPostalCode']")
	public WebElement postalField;
	
	@FindBy(xpath = "//input[@name='addressCountry']")
	public WebElement countryField;
	
	@FindBy(xpath = "//textarea[@class='main-element form-control auto-height']")
	public WebElement descriptionField;
	
	@FindBy(xpath = "//div[@class='btn-group main-btn-group']//button[@class='btn btn-danger']")
	public WebElement anywaySaveBtn;
	
//	@FindBy(xpath = "//table[@class='table']//td[@data-name='name']")
	@FindBy(xpath = "//td[@class='cell']//a[@class='link']")
	public List<WebElement> listOfContacts;
	
	@FindBy(xpath = "//div[@class='middle']//div[@class='panel-body panel-body-form']")
	public WebElement contactsOverview;
	
	@FindBy(xpath = "//div[@class='cell col-sm-6 form-group']")
	public List<WebElement> contactsOverviewElements;
	
	@FindBy(xpath = "//tr[@class='list-row']//td[@data-name='r-checkbox']")
	public List<WebElement> checkBoxElements;
	
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle actions-button']")
	public WebElement actionBtn;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[@data-action='remove']")
	public WebElement actionRemove;
	
	@FindBy(xpath ="//button[@class='btn btn-danger']")
	public WebElement removePopupBtn;
	
	
/* FROM here starts Elements of ...  */

}
