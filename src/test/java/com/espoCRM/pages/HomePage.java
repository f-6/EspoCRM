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
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
	public WebElement homePageAddBtn;


	@FindBy(xpath = "//button[@class='btn btn-default pull-right add']")
	public WebElement addDashletAddBtn;
	
	@FindBy(xpath = "//span[@aria-hidden='true']")
	public List<WebElement> addDeshletCloseBtn;
	
	
	@FindBy(xpath = "dropdown-toggle btn btn-link btn-sm menu-button")
	public WebElement dropDownBtnOnDeshlet;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
	public WebElement removeBtnOnDeshlet;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public WebElement cofirmRemovingBtnOnDeshlet;
	

	public void addAllDeshlets() {
//		List<WebElement> listings = driver.findElements(By.xpath("//span[@aria-hidden='true']"));
		//Variable atyn berse bolobu je xpath jazywkerekbi?
		
		for(WebElement each : addDeshletCloseBtn) {
			each.click();
		}
	}

	public void closeAllDeshlets() {
		List<WebElement> listings = driver.findElements(By.xpath("DropDownBtnOnDeshlet"));
		//Variable atyn berse bolobu je xpath jazywkerekbi?
		for(WebElement each : listings) {
			each.click();
		}
		List<WebElement> listing = driver.findElements(By.xpath("RemoveBtnOnDeshlet"));
		//Variable atyn berse bolobu je xpath jazywkerekbi?
		for(WebElement each : listing) {
			each.click();
		}
	}
	public void login() {
		System.out.println("Im loggin in");
	}
}