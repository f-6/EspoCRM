package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
	public WebElement HomePageAddBtn;


	@FindBy(xpath = "//button[@class='btn btn-default pull-right add']")
	public WebElement AddDashletAddBtn;
	
	@FindBy(xpath = "//span[@aria-hidden='true']")
	public WebElement AddDeshletCloseBtn;
	
	
	@FindBy(xpath = "dropdown-toggle btn btn-link btn-sm menu-button")
	public WebElement DropDownBtnOnDeshlet;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
	public WebElement RemoveBtnOnDeshlet;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public WebElement CofirmRemovingBtnOnDeshlet;
	

	public void addAllDeshlets() {
		List<WebElement> listings = driver.findElements(By.xpath("AddDashletAddBtn"));
		//Variable atyn berse bolobu je xpath jazywkerekbi?
		for(WebElement each : listings) {
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
}