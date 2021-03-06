package com.espoCRM.pages;

import java.util.List;
import java.util.NoSuchElementException;

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

	/* US001 --> From here Element of HOME PAGE window */
	@FindBy(id = "global-search-input")
	public WebElement searchBox;

	@FindBy(xpath = "//a[@class='btn btn-link global-searcy-button']")
	public WebElement searchBtn;

	@FindBy(xpath = "//a[@class='notifications-button']")
	public WebElement notificationBtn;

	@FindBy(xpath = "//a[@id='nav-quick-create-dropdown']")
	public WebElement createDropdownBtn;

	@FindBy(xpath = "//a[@id='nav-menu-dropdown']")
	public WebElement menuDropdownBtn;

	@FindBy(xpath = "//button[@data-action='editTabs']")
	public WebElement editTabBtn;

	@FindBy(xpath = "//button[.='Cancel']")
	public WebElement editCancelBtn;

	@FindBy(xpath = "//button[@data-action='addDashlet']")
	public WebElement addTabBtn;

	@FindBy(xpath = "//button[.='Cancel']")
	public WebElement addCancelBtn;

	@FindBy(xpath = "//img")
	public WebElement homePageLogo;

	@FindBy(xpath = "//ul[@class='nav navbar-nav tabs']//a[contains(@class,'nav-link')]")
	public List<WebElement> leftMenuBarElements;

	@FindBy(xpath = "//a[@id='nav-more-tabs-dropdown']")
	public WebElement leftMenuDropdown;

	@FindBy(xpath = "//li[@class='dropdown more open']//span[@class='full-label']")
	public List<WebElement> lefMenuDropdownElements;

	@FindBy(xpath = "(//div[@class='panel-heading']//h4[@class='panel-title'])[1]")
	public WebElement dragPlace;

	@FindBy(xpath = "(//div[@class='panel-heading']//h4[@class='panel-title'])[2]")
	public WebElement dropPlace;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	public WebElement menuBarContacts;

	/**
	 * To verify this element has daslets on board or not, you can use
	 * attribute&value: -->data-gs-current-height="0" -->style="height: 0px;" if
	 * their values are equal to 0, than it means there is no dashlets on the board.
	 */
	@FindBy(xpath = "//div[contains(@class,'dashlets grid-stack grid-stack-4 row grid')]")
	public WebElement dasletBoard;

	@FindBy(xpath = "//a[@class='btn btn-primary action']")
	public WebElement createBtn;

	// Start related to US002 and US003
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-plus']")
	public WebElement homePageAddBtn;

	@FindBy(xpath = "(//div[@class='grid-stack-item-content dashlet-container']/div[@data-name='Calendar'])[1]")
	public WebElement calendarDashLet;

	@FindBy(xpath="//button[@data-name='Calendar']")
	public WebElement addCalendarBtn;

	@FindBy(xpath = "//button[@class='btn btn-default pull-right add']")
	public List<WebElement> addDashletAddBtn;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	public List<WebElement> addDeshletCloseBtn;


	@FindBy(xpath = "//button[@class='dropdown-toggle btn btn-link btn-sm menu-button']")
	public List<WebElement> dropDownBtnOnDeshlet;
	
	@FindBy(xpath = "(//div[@data-name='Calendar'])[1]//button[@class='dropdown-toggle btn btn-link btn-sm menu-button']")
	public WebElement dropDownBtnOnCalendarDeshlet;
	

	@FindBy(xpath = "//div[@class='grid-stack-item ui-draggable ui-resizable ui-resizable-autohide']")
	public List<WebElement> dashletsOnTheBoard;

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
	public List<WebElement> removeBtnOnDeshlet;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public  WebElement cofirmRemovingBtnOnDeshlet;

	@FindBy(xpath="//div[@class='modal-content']//div[@class='modal-body body']//li")
	public List <WebElement> listOfOptions;

	@FindBy(xpath="//span[@data-action='refresh']")
	public List<WebElement> nameOfDashlet;
	
	@FindBy(xpath="(//div[@data-name='Calendar'])[1]//a[@class='action']")
	public List<WebElement> optionsOnDDMenuOfCalendar;
	
	@FindBy(xpath="(//a[@data-action='viewCalendar'])[1]")
	public WebElement viewButtonOnCalendarMenu;
	
	@FindBy(xpath="//button[@data-name='fullForm']")
	public WebElement fullFormBtnOnCalendar;
	
	@FindBy(xpath="//button[@data-action='save']")
	public WebElement saveBtnOnCalendar;
	
	
	@FindBy(xpath="(//td[@class='fc-widget-content'])[5]")
	public WebElement dateOnCalendar;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement nameBoxOnCalendar;
	
//	@FindBy(xpath="(//a[@data-action='viewCalendar'])[1]")
//	public WebElement viewButtonOnCalendarMenu;
	
//	@FindBy(xpath="//button[@data-name='fullForm']")
//	public WebElement fullFormBtnOnCalendar;
	
//	@FindBy(xpath="//button[@data-action='save']")
//	public WebElement saveBtnOnCalendar;
	
//	
//	@FindBy(xpath="(//td[@class='fc-widget-content'])[8]")
//	public WebElement dateOnCalendar;
	
	@FindBy(xpath="(//td[@class='fc-widget-content'])[9]")
	public WebElement secondDateOnCalendar;
	
//	@FindBy(xpath="//input[@name='name']")
//	public WebElement nameBoxOnCalendar;
//	
	@FindBy(xpath="(//input[@class='main-element form-control'])[2]")
	public WebElement dateStartsBoxOnCalendar;
	
	@FindBy(xpath="(//input[@class='main-element form-control'])[3]")
	public WebElement dateEndsBoxOnCalendar;
	
	@FindBy(xpath="//button[@data-name='save']")
	public WebElement secondSaveBtnOnCalendar;
	
	@FindBy(xpath="	//header[@class='modal-header']")
	public WebElement topOnCalendar;
	
	@FindBy(xpath="(//div[@data-name='name'])[2]")
	public WebElement nameOverviewOnCalendar;
	
	@FindBy(xpath="(//div[@data-name='dateStart'])[2]")
	public WebElement startOverviewOnCalendar;
	
	@FindBy(xpath="(//div[@data-name='dateEnd'])[2]")
	public WebElement endOverviewOnCalendar;
	
	
	

	// End related to US002/US003


}