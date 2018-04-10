package com.espoCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.espoCRM.utilities.Driver;

public class LoginPage {

	private WebDriver driver = Driver.getDriver();

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	/* US001 --> From here Element of LOGIN window */
	@FindBy(xpath = "//div[@class='logo-container']")
	public WebElement logo;

	@FindBy(id = "field-userName")
	public WebElement userNameBox;

	@FindBy(id = "field-password")
	public WebElement userPasswordBox;

	@FindBy(id = "btn-login")
	public WebElement loginBtn;

	@FindBy(xpath = "//a[@class='btn btn-link pull-right']")
	public WebElement forgotPasswordLink;

	/* US001 --> From here Element of FORGOT PASSWORD window */
	@FindBy(css = "h4[class='modal-title']")
	public WebElement passwordChangeText;

	@FindBy(xpath = "//button[@data-name='submit']")
	public WebElement submitBtn;

	@FindBy(xpath = "//button[@data-name='cancel']")
	public WebElement closeBtn;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	public WebElement xBtn;

	@FindBy(xpath = "//input[@name='userName']")
	public WebElement passwordChangeUserNameBox;

	@FindBy(xpath = "//input[@name='emailAddress']")
	public WebElement passwordChangeEMailBox;
}
