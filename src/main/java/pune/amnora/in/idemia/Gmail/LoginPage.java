package pune.amnora.in.idemia.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	// WebElements using @FindBy annotation in testng are written below.
	// All WebElements are made private so that they will NOT be accessible from outside of this class
	// So, we have written public methods to deal with these WebElements.
	
	@FindBy(name="identifier")
	private WebElement emailField;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement nextButton;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	private WebElement signInButton;
	
	// Constructor of LoginPage
	// We are passing the driver object initialized in BaseTest. 
	// In this way, the driver is referred to this page.
	public LoginPage(WebDriver driver){	
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	// Methods written to deal with different WebElements on LoginPage
	public void setEmailFieldValue(String email){
		emailField.sendKeys(email);
	}
	
	public void setPasswordFieldValue(String pswd){
		passwordField.sendKeys(pswd);
	}
	
	public void clickNext(){
		nextButton.click();
	}
	
	public void clickSignIn(){
		signInButton.click();
	}
	

}
