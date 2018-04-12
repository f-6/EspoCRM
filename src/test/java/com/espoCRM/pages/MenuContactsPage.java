package com.espoCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.espoCRM.utilities.Driver;

public class MenuContactsPage {

	private WebDriver driver = Driver.getDriver();
	
	public MenuContactsPage() {
		PageFactory.initElements(driver, this);
	}
}
