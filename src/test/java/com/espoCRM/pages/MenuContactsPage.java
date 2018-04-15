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
	
}
