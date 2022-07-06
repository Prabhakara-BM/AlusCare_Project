package Pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginClass extends Aulas_Base.BaseTest
{
	@FindBy(xpath="(//div[contains(@class,'ant-col')]/img)[1]")
	WebElement Logo;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement PrivacyPolicy;
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement TermsAndConditions;
	@FindBy(xpath="//div[@class='m-t-5']/input")
	WebElement Email;
	@FindBy(xpath="//div[@class='m-t-20']/span/input")
	WebElement Password;
	@FindBy(xpath="(//button[contains(@class,'bold-bold')])[2]")
	WebElement LoginClick;
	@FindBy(xpath="(//button[contains(@class,'ant-btn')]/span)[1]")
	WebElement ForgotPassword;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[2]")
	WebElement AulasCareLink;
	@FindBy(xpath="(//div[@class='ant-tabs-tab'])[1]")
	WebElement Register;
	@FindBy(xpath="//span[text()='Mobile']")
	WebElement Mobile;
    @FindBy(xpath="//input[@class='form-control']")
	WebElement EnterMobileNumber;
	@FindBy(xpath="//button[contains(@class,'ant-btn-block r-c-c bold-bold')]")
	WebElement sendOTP;
	@FindBy(xpath="//input[@class='aulas-login__input-verify-otp']")
	WebElement EnterOTP;
	@FindBy(xpath="(//button[contains(@class,'ant-btn-block r-c-c bold-bold m-t-20')])[1]")
	WebElement VerifyOTP;
	@FindBy(xpath="//div[@class='m-t-20 m-b-5']/div[2]")
	WebElement LogOutButton;  
	@FindBy(xpath="//span[text()='Logout']")
	WebElement LogOut;
	
	
 Actions ac=new Actions(driver);

	
	public LoginClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean aulasLogo()
	{
		return Logo.isDisplayed();
		
	}
	
	public void Privacypolicy() throws InterruptedException
	{
		Thread.sleep(4000);
		PrivacyPolicy.click();
	}
	
	public void TermsAndConditions() throws InterruptedException
	{
		Thread.sleep(4000);
		TermsAndConditions.click();
	}
	
	public HomePage1 newLogin(String email,String password) throws InterruptedException
	{
		Thread.sleep(4000);
		Email.sendKeys(email);
		Password.sendKeys(password);
		LoginClick.click();
		return new HomePage1();
	}
	
	public HomePage1 newLoginUsingMobile(String phonenumber,String OTP) throws InterruptedException
	{
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[4]")).click();
		System.out.println("clicked on Mobile button ");
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='+1 (702) 123-4567']")).sendKeys(phonenumber);
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-round ant-btn-block r-c-c bold-bold']")).click();
		//driver.findElement(By.xpath("(//*[contains(.,'Send OTP')])[15]")).click();
		String Text=driver.findElement(By.cssSelector(".ant-notification-notice-description")).getText();
		System.out.println("The Send OTP message is "+Text);
		driver.findElement(By.xpath("//*[@class='aulas-login__input-verify-otp']")).sendKeys(OTP);
		wait(3000);
		driver.findElement(By.xpath("(//*[contains(.,'Verify OTP')])[15]")).click();
		
		
		return new HomePage1();
	}
	
	
	
	
	public void ForgotPassword() throws InterruptedException
	{
		Thread.sleep(4000);
		ForgotPassword.click();
	}
	
	public void AulasCareLink() throws InterruptedException
	{
		Thread.sleep(4000);
		AulasCareLink.click();
	}
	
	public void Register() throws InterruptedException
	{
		Thread.sleep(4000);
		Register.click();
	}
	
	public void MobileRegister() throws InterruptedException
	{
		Thread.sleep(4000);
		Mobile.click();
		EnterMobileNumber.sendKeys("9886599380");
		Thread.sleep(4000);
		sendOTP.click();
		Thread.sleep(4000);
		EnterOTP.sendKeys("592726");
		Thread.sleep(4000);
		VerifyOTP.click();
	}


	public HomePage1 MobileRegister(String MobileNumber, String DefaultOTP) throws InterruptedException {
		WaitTil(2000);
		Mobile.click();
		WaitTil(2000);
		EnterMobileNumber.sendKeys(MobileNumber);
		WaitTil(2000);
		sendOTP.click();
		WaitTil(2000);
		EnterOTP.sendKeys(DefaultOTP);
		WaitTil(2000);
		VerifyOTP.click();
		WaitTil(3000);
		return new HomePage1();
	}

	public void LogOut() {
		WaitTil(3000);
		ac.moveToElement(LogOutButton).click().build().perform();
		WaitTil(2000);
		LogOut.click();

	}

}
