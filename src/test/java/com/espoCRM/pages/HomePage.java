package com.espoCRM.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.espoCRM.utilities.Driver;


public class HomePage {

	private WebDriver driver = Driver.getDriver();
	
	public HomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	//Start related to  US002 and US003
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
	public WebElement homePageAddBtn;


	@FindBy(xpath = "//button[@class='btn btn-default pull-right add']")
	public List<WebElement> addDashletAddBtn;
	
	@FindBy(xpath = "//span[@aria-hidden='true']")
	public List<WebElement> addDeshletCloseBtn;
	
	
	@FindBy(xpath = "dropdown-toggle btn btn-link btn-sm menu-button")
	public List <WebElement> dropDownBtnOnDeshlet;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
	public List<WebElement> removeBtnOnDeshlet;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public WebElement cofirmRemovingBtnOnDeshlet;

	//End related  to US002/US003
	
	
	
	public void login() {
		System.out.println("Im loggin in");
	}
}