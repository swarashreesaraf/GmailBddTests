package pune.amnora.in.idemia.Gmail;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin1 {
	
	@Test
	public void f3() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"/Users/swarshrisaraf/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.navigate().to("https://mail.google.com");

		driver.navigate().refresh();
		driver.findElement(
				By.xpath("//a[contains(text(),'Create an account')]")).click();

		String winHandleBefore = driver.getWindowHandle();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(
				"swara");

		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(
				"saraf");

		driver.findElement(By.cssSelector("input[name='Username']")).sendKeys(
				"swarasaraf");

		WebElement password = driver.findElement(By
				.cssSelector("input[name='Passwd']"));
		WebElement ConfirmPassword = driver.findElement(By
				.cssSelector("input[name='ConfirmPasswd']"));

		String[] passwordValues = { "1234", "1234abcd", "1234abcd" };
		String[] confirmPasswordValues = { "1234", "1234abcd", "1234abc" };
		String[] errorMessages = {
				"Use 8 characters or more for your password",
				"Please choose a stronger password. Try a mix of letters, numbers, and symbols.",
				"Those passwords didn't match. Try again." };

		for (int i = 0; i < 3; i++) {
			password.sendKeys(passwordValues[i]);
			ConfirmPassword.sendKeys(confirmPasswordValues[i]);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]"))
					.click();

			WebElement errorMessageElement = driver.findElement(By
					.xpath("//div[contains(text(),\"" + errorMessages[i]
							+ "\")]"));
			assertEquals(errorMessageElement.getText(), errorMessages[i]);

			password.clear();
			ConfirmPassword.clear();
		}

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		driver.quit();
	}

	@Test
	public void f4() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"/Users/swarshrisaraf/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.navigate().to("http://10.122.151.95:8084/login");
		driver.navigate().refresh();
		driver.quit();

	}

}
