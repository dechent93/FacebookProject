package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.SignUpPage;
import util.BrowserFactory;

public class LoginInTest extends BrowserFactory {

	WebDriver driver;
	SignUpPage signUpPage;

	@BeforeMethod
	public void setUp() {

		driver = BrowserFactory.init();
		signUpPage = PageFactory.initElements(driver, SignUpPage.class);

	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {

		signUpPage.clickOnCreateNewAccount();
		signUpPage.insertFirstName();
		signUpPage.insertLastName();
		signUpPage.insertEmail();
		signUpPage.confirmEmail();
		signUpPage.createPassword();
		signUpPage.insertBirthMonth();
		signUpPage.insertBirthDay();
		signUpPage.insertBirthYear();
		signUpPage.selectGender();
		signUpPage.clickOnSignUp();
		
		Thread.sleep(5000);

		BrowserFactory.tearDown();

	}

}
