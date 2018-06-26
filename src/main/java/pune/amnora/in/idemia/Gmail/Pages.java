package pune.amnora.in.idemia.Gmail;

import org.openqa.selenium.WebDriver;

public class Pages {
	
WebDriver driver;

public Pages(WebDriver driver){
	this.driver = driver;	
}

public LoginPage getLoginPage(){
return new LoginPage(driver);
}

public InboxPage getInboxPage(){
return new InboxPage(driver);
}

}
