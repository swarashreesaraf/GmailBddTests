package pune.amnora.in.idemia.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {
	
	WebDriver driver;

	// WebElements using @FindBy annotation in testng are written below.
	// All WebElements are made private so that they will NOT be accessible from outside of this class
	// So, we have written public methods to deal with these WebElements.
	@FindBy(css="span.gb_db")
	private WebElement settingsButton;

	@FindBy(css="a#gb_71")
	private WebElement logoutButton;
	
	
	// Constructor of InboxPage
	// We are passing the driver object initialized in BaseTest. 
	// In this way, the driver is referred to this page.
	public InboxPage(WebDriver driver){	
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	// Methods written to deal with different WebElements on LoginPage
	
	public void clickSettings(){
		settingsButton.click();
	}
		
	public void clickLogout(){
		logoutButton.click();
	}
	

	
	
	
}
