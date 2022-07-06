package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Aulas_Base.BaseTest {
	@FindBy(xpath = "//div[@class='m-t-5']/input")
	WebElement Eamil;
	@FindBy(xpath = "//div[@class='m-t-20']/span/input")
	WebElement Password;
	@FindBy(xpath = "(//button[contains(@class,'bold-bold')])[2]")
	WebElement LoginButton;
	@FindBy(xpath = "(//div[contains(@class,'ant-col')]/img)[1]")
	WebElement Aulaslogo;
	@FindBy(xpath = "//div[contains(@class,'ant')]//following::h2[text()='Sign in to your account']")
	WebElement testSigninyouraccount;
	@FindBy(xpath = "(//a[text()='Privacy Policy'])[1]")
	WebElement PrivacyPage;
	@FindBy(xpath = "(//a[text()='Terms & Conditions'])[1]")
	WebElement TermsAndConditions;
	@FindBy(xpath = "//div[@class='ant-tabs-tab']")
	WebElement Mobilebutton;
	@FindBy(xpath = "//button[contains(@class,'ant-btn')]/span[text()='Forgot Password ?']")
	WebElement PasswordButton;
	@FindBy(xpath = "//a[text()='www.aulas.in']")
	WebElement ProjectLink;
	@FindBy(xpath = "(//span[text()='REQUEST DEMO'])[2]")
	WebElement RequestDemo;
	@FindBy(xpath = "(//div[contains(@class,'flex')])[2]/a[2]")
	WebElement AndroidApp;
	@FindBy(xpath = "(//div[contains(@class,'flex')])[2]/a[3]")
	WebElement IOSApp;
	


  Actions ac=new Actions(driver);
  
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateAulasImage() {
		return Aulaslogo.isDisplayed();
	}

	public void validatePrivacyPage() {
		PrivacyPage.click();
	}

	public void validateTermsadnConditions() {
		TermsAndConditions.click();
	}

	public String validateSigninyouraccount() {
		return testSigninyouraccount.getText();
	}

	public MobilePage validatePhoneButton() {
		Mobilebutton.click();
		return new MobilePage();
	}

	/*
	 * public PasswordPage validateforgetpassword() { PasswordButton.click(); return
	 * new PasswordPage(); }
	 */
	public void ClickApp() {
		AndroidApp.click();
	}

	public void IOSApp() {
		IOSApp.click();
	}

	public void validateLink() {
		ProjectLink.click();
	}

	public HomePage1 login(String email, String Pd) {
		Eamil.sendKeys(email);
		Password.sendKeys(Pd);
		LoginButton.click();

		return new HomePage1();
	}

	public HomePage1 CreateNewLogin(String em, String pw) {
		Eamil.sendKeys(em);
		Password.sendKeys(pw);
		LoginButton.click();
		return new HomePage1();
	}

}
