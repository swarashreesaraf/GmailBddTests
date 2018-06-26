package pune.amnora.in.idemia.Gmail.StepDefinition;

import pune.amnora.in.idemia.Gmail.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseTest {
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	   init(); 
	  // getPages().getLoginPage().clickSignIn();
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		getPages().getLoginPage().setEmailFieldValue("swarashreesaraf1@gmail.com");
		getPages().getLoginPage().clickNext();
		Thread.sleep(3000);
		getPages().getLoginPage().setPasswordFieldValue("9665861489#");
		Thread.sleep(3000);
		getPages().getLoginPage().clickNext();
		
	    
	}

	@Then("^user navigated to the home page of gmail$")
	public void user_navigated_to_the_home_page_of_gmail() throws Throwable {
	    getPages().getInboxPage().clickSettings();
	    getPages().getInboxPage().clickLogout();
	}


}
