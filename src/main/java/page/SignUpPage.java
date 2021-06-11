package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BrowserFactory;

public class SignUpPage extends BrowserFactory {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@id='u_0_2_MP']/text()")
	WebElement CREATE_ACC_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	WebElement FIRST_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	WebElement LAST_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='reg_email__']")
	WebElement EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='reg_email_confirmation__']")
	WebElement RECONFRIM_EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@name='reg_passwd__']")
	WebElement NEW_PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@name='birthday_month']")
	WebElement BIRTH_MONTH_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@name='birthday_day']")
	WebElement BIRTH_DAY_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@name='birthday_year']")
	WebElement BIRTH_YEAR_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@value='1']")
	WebElement GENDER_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@name='websubmit']")
	WebElement SIGNUP_BUTTON;

	public void clickOnCreateNewAccount() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement CREATE_ACC_FIELD = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New Account")));
		CREATE_ACC_FIELD.click();

	}

	public void insertFirstName() {
		FIRST_NAME_FIELD.sendKeys("Grace");

	}

	public void insertLastName() {
		LAST_NAME_FIELD.sendKeys("Tshering");

	}

	public void insertEmail() {
		EMAIL_FIELD.sendKeys("gracekim89@gmail.com");

	}

	public void confirmEmail() {
		RECONFRIM_EMAIL_FIELD.sendKeys("gracekim89@gmail.com");
		
	}

	public void createPassword() {
		NEW_PASSWORD_FIELD.sendKeys("Techfiostrial12345");

	}

	public void insertBirthMonth() {
		Select BIRTH_MONTH_FIELD = new Select(driver.findElement(By.name("birthday_month")));
		BIRTH_MONTH_FIELD.selectByValue("7");
	}

	public void insertBirthDay() {
		Select BIRTH_DAY_FIELD = new Select(driver.findElement(By.name("birthday_day")));
		BIRTH_DAY_FIELD.selectByValue("10");
	}

	public void insertBirthYear() {
		Select BIRTH_DAY_FIELD = new Select(driver.findElement(By.name("birthday_year")));
		BIRTH_DAY_FIELD.selectByValue("1989");
	}

	public void selectGender() {
		GENDER_FIELD.click();
	}

	public void clickOnSignUp() {
		SIGNUP_BUTTON.click();
	}
}