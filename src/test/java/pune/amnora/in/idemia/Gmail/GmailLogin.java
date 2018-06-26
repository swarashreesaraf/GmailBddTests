package pune.amnora.in.idemia.Gmail;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLogin extends BaseTest{
	
	@BeforeTest
	public void before() throws IOException{
		init();	
	}
	
	@AfterTest
	public void after(){
		driver.quit();
	}
	
	
	@Test
	public void testLoginWithValidCredsAndLogout() throws InterruptedException {	
		getPages().getLoginPage().clickSignIn();
		getPages().getLoginPage().setEmailFieldValue("swarashreesaraf1@gmail.com");
		getPages().getLoginPage().clickNext();
		Thread.sleep(4000);
		getPages().getLoginPage().setPasswordFieldValue("9665861489#");
		getPages().getLoginPage().clickNext();
		Thread.sleep(6000);
		getPages().getInboxPage().clickSettings();
		getPages().getInboxPage().clickLogout();	
	}
	
	
	

//	@Test
//	public void f2() throws InterruptedException {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/swarshrisaraf/Downloads/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
//		driver.navigate().to("https://mail.google.com");
//		driver.findElement(By.cssSelector("a.gmail-nav__nav-link__sign-in"))
//				.click();
//		driver.findElement(By.name("identifier"))
//				.sendKeys("swarashreesara.com");
//
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		Thread.sleep(4000);
//		WebElement errorMessage1 = driver.findElement(By
//				.xpath("//div[contains(text(),\"Couldn't\")]"));
//
//		Assert.assertEquals(errorMessage1.getText(),
//				"Couldn't find your Google Account");
//
//		driver.navigate().refresh();
//		driver.findElement(By.cssSelector("a[data-g-label='Sign in']")).click();
//
//		driver.findElement(By.id("identifierId")).sendKeys(
//				"swarashreesaraf1@gmail.com");
//
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(
//				"9665869#");
//
//		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//
//		WebElement errorMessage2 = driver
//				.findElement(By
//						.xpath("//div[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]"));
//		Assert.assertEquals(errorMessage2.getText(),
//				"Wrong password. Try again or click Forgot password to reset it.");
//		driver.navigate().refresh();
//
//		driver.quit();
//
//	}
}
