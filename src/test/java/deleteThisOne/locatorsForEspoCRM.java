package deleteThisOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class locatorsForEspoCRM {
	
	@FindBy(xpath="//img[@class='logo']")
	public WebElement logo;
	
	@FindBy(id="field-userName")
	public WebElement userNameBox;
	
	@FindBy(id="field-password")
	public WebElement userPasswordBox;
	
	@FindBy(id="btn-login")
	public WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='btn btn-link pull-right']")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath="//h4[@class='modal-title']")
	public WebElement passwordChangeText;
	
	@FindBy(xpath="//button[@data-name='submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath="//button[@data-name='cancel']")
	public WebElement closeBtn;
	
	@FindBy(xpath="//span[@aria-hidden='true']")
	public WebElement xBtn;
	
	@FindBy(xpath="//input[@name='userName']")
	public WebElement passwordChangeUserNameBox;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	public WebElement passwordChangeEMailBox;
	//////////////////////
	
	@FindBy(id="global-search-input")
	public WebElement searchBox;
	
	@FindBy(xpath="//a[@class='btn btn-link global-searcy-button']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//a[@class='notifications-button']")
	public WebElement notificationBtn;
	
	@FindBy(xpath="//a[@id='nav-quick-create-dropdown']")
	public WebElement createDropdownBtn;
	
	@FindBy(xpath="//a[@id='nav-menu-dropdown']")
	public WebElement menuDropdownBtn;
	
	@FindBy(xpath="//button[@data-action='editTabs']")
	public WebElement editTabBtn;
	
	@FindBy(xpath="//button[@data-action='addDashlet']")
	public WebElement addTabBtn;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav tabs']//a[contains(@class,'nav-link')]")
	public WebElement leftMenuBarElements;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	public WebElement menuBarContacts;
	
	
	/**To verify this element has daslets on board or not, you can use attribute&value:
	 *									-->data-gs-current-height="0"
	 *									-->style="height: 0px;"
	 *if their values are equal to 0, than it means there is no dashlets on the board.
	 */
	@FindBy(xpath="//div[@class='dashlets grid-stack grid-stack-4 row grid-stack-instance-1068']")
	public WebElement dasletBoard;
	
	@FindBy(xpath="//a[@class='btn btn-primary action']")
	public WebElement createBtn;
	
	/**FROM here THESE WebElements found in Account Create page: US009
	 */
	@FindBy(xpath="select[@name='salutationName']")
	public WebElement salutationField;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastNameField;
	
	/* Account Page task case US008 and US007 */
	//Account button on left side
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
	
	//Next page after creating new account and saving
	
	@FindBy(xpath="//input[@id='global-search-input']")
	public WebElement accountSearchBoxAfterSaving;
	
	 @FindBy(xpath="//div[@class='input-group-btn']")
	 public WebElement accountSearchBtnAfterSaving;
	 
	 @FindBy(xpath="//div[@id='global-search-panel']")
	 public WebElement accountSearchResult;
}
