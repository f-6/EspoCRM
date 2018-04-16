package com.espoCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.espoCRM.utilities.Driver;

public class ChekingEmails {
	private WebDriver driver = Driver.getDriver();

	public ChekingEmails() {
		PageFactory.initElements(driver, this);
	}

	// 1 Scenarion Cheking emails
	// Email button on EspoCRM home page
	@FindBy(xpath = "//li[@data-name='Email']")
	public WebElement emailBtn;
	// Compose button on Email page
	@FindBy(xpath = "//div[@class='header-buttons btn-group pull-right']")
	public WebElement composeBtn;
	// From button on Compose
	@FindBy(xpath = "//select[@name='from']")
	public WebElement fromBtn;
	// CC button on Compose
	@FindBy(xpath = "//div[@data-name='cc']//input[@type='text']")
	public WebElement ccBtn;
	// To button on Compose
	@FindBy(xpath = "//div[@data-name='to']//input[@type='text']")
	public WebElement toBtn;
	// BCC button on Compose
	@FindBy(xpath = "//div[@data-name='bcc']//input[@type='text']")
	public WebElement bccBtn;
	// Account button on Compose
	@FindBy(xpath = "//select[@name='parentType']")
	public WebElement accountBtn;
	// Select button on Compose
	@FindBy(xpath = "//input[@class='main-element form-control middle-element']")
	public WebElement selectBtn;
	// Array Up button on Compose
	@FindBy(xpath = "//button[@title='Select']")
	public WebElement arrayUpBtn;
	// Remove button on Compose
	@FindBy(xpath = "//button[@data-action='clearLink']")
	public WebElement removeBtn;
	// Select Template button on Compose
	@FindBy(xpath = "//input[@name='selectTemplateName']")
	public WebElement selectTemplateBtn;
	// Array Up button on Select Template Compose page
	@FindBy(xpath = "//div[@data-name='selectTemplate']//span[@class='input-group-btn']")
	public WebElement arrayUpSelectTemplate;
	// Subject button on Compose
	@FindBy(xpath = "//div[@data-name='subject']//input[@type='text']")
	public WebElement subjectBtn;
	// Body button on Compose
	@FindBy(xpath = "//div[@class='cell col-sm-12 form-group']//div[@data-name='body']")
	public WebElement bodyBtn;
	// Attachments button on Compose
	@FindBy(xpath = "//div[@class='cell col-sm-6 form-group']//div[@data-name='attachments']")
	public WebElement attachmentsBtn;
	// Html button on Compose
	@FindBy(xpath = "//div[@class='cell col-sm-6 form-group']//div[@data-name='isHtml']")
	public WebElement htmlBtn;
	// Save Draft button on Compose
	@FindBy(xpath = "//button[@data-name='saveDraft']")
	public WebElement saveDraftBtn;

	// 2 Scenarion Cheking Draft box
	// Draft button on Emails
	@FindBy(xpath = "//li[@data-id='drafts']//a[.='Drafts']")
	public WebElement draftBtn;
	//Cheking New Created Email on Emails.
	@FindBy(xpath = "(//div[@class='list']//a[@title='Cybertek'])[1]")
	public WebElement chekingNewEmail;
//	// Opening recently created email. 
//	@FindBy(xpath = "(//div[@class='list']//a[@title='Cybertek'])[1]")
//	public WebElement openingRecentlyCreatedEmail;
	// Send button on Emails page
	@FindBy(xpath = "//div[@class='col-sm-4']//a")
	public WebElement sendBtn;
	// Sent button on Emails
	@FindBy(xpath = "//li[@data-id='sent']//a[@class='side-link pull-right count']")
	public WebElement sentEmails;
//	// To button on Compose
//	@FindBy(xpath = "///div[@class='header-buttons btn-group pull-right']")
//	public WebElement email;
//	// To button on Compose
//	@FindBy(xpath = "//li[@data-name='Email']")
//	public WebElement email;
//	// To button on Compose
//	@FindBy(xpath = "//li[@data-name='Email']")
//	public WebElement email;
}