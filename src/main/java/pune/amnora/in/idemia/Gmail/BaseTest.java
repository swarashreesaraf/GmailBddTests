package pune.amnora.in.idemia.Gmail;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public void init() throws IOException{
		
		// Properties is a java utility which can be used to read files.
		// We are creating an instance of properties and loading our config.properties file in it
		Properties testProp = new Properties();
		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
		testProp.load(fis);
			
		
		// Here, we are initiating the driver based on "browser" value mentioned in config.properties file
		if(testProp.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",testProp.getProperty("chromedriverPath"));
			driver = new ChromeDriver();
		}
		if(testProp.getProperty("browser").equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().fullscreen();
		
		// Here, we are getting the URL from confg.properties file and passing it to driver.navigate().to() method
		driver.navigate().to(testProp.getProperty("testUrl"));
		driver.manage().timeouts().implicitlyWait(Long.parseLong(testProp.getProperty("implicitWait")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(testProp.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);

	}
	
	public Pages getPages(){
		return new Pages(driver);
	}
	


}
