package AlternativeSite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinith\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement firstName = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + firstName);
		// Send first name
		firstName.sendKeys("Dinith");
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastName);
		// Send last name
		lastName.sendKeys("Malisha");
		
		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phoneNumber);
		// Send phone number
		phoneNumber.sendKeys("0433422541");
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send email
		email.sendKeys("dinith2025@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		System.out.println("Found element: " + pass);
		// Send password
		pass.sendKeys("Di0W12!ghU");
		
		WebElement confirmPass = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confirmPass);
		// Send confirm password
		confirmPass.sendKeys("Di0Www");
		
		WebElement type = driver.findElement(By.className("sc-kkGfuU"));
		type.click();
			
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */		
		WebElement createAccount = driver.findElement(By.className("ActionButton__StyledButton-r7njn9-0iJIqgV"));
		createAccount.click();
		
		/*
		 * Take screenshot using selenium API.
		 */
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Dinith\\Desktop\\SIT333\\SIT333 2.1P\\2.1P-resources\\Screenshots\\screenshot1.png"));
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
