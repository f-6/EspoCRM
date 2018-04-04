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
	
	
}
