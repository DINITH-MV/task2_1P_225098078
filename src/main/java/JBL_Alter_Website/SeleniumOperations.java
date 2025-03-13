package JBL_Alter_Website;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void JBL_signUp_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinith\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		// Find first input field which is firstname
		WebElement firstName = driver.findElement(By.id("dwfrm_profile_customer_firstname"));
		System.out.println("Found element: " + firstName);
		// Send first name
		firstName.sendKeys("Dinith");
		
		WebElement lastName = driver.findElement(By.id("dwfrm_profile_customer_lastname"));
		System.out.println("Found element: " + lastName);
		// Send last name
		lastName.sendKeys("Malisha");
		
		WebElement email = driver.findElement(By.id("dwfrm_profile_customer_email"));
		System.out.println("Found element: " + email);
		// Send email
		email.sendKeys("dinith@gmail.com");		
		
		WebElement emailConf = driver.findElement(By.id("dwfrm_profile_customer_emailconfirm"));
		System.out.println("Found element: " + emailConf);
		// Send email
		emailConf.sendKeys("dinith@gmail.com");		
		
		WebElement pass = driver.findElement(By.id("dwfrm_profile_login_password"));
		System.out.println("Found element: " + pass);
		// Send password
		pass.sendKeys("Di0W12!ghU");
		
		WebElement passConf = driver.findElement(By.id("dwfrm_profile_login_passwordconfirm"));
		System.out.println("Found element: " + passConf);
		// Send password
		passConf.sendKeys("Di0W12!gh");
		
		WebElement createAccount = driver.findElement(By.className("btn-default"));
		System.out.println("Found element: " + createAccount);
		createAccount.click();		
		
		/*
		 * Take screenshot using selenium API.
		 */
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Dinith\\Desktop\\SIT333\\SIT333 2.1P\\2.1P-resources\\Screenshots\\screenshot2.png"));
			System.out.println("Image saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
