package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage1 extends Aulas_Base.BaseTest
{

	

	@FindBy(xpath="//ul[contains(@class,'ant-menu')]/li[1]")
	WebElement Users;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[1]/li[2]")
	WebElement FeeManagement;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[1]/li[5]")
	WebElement Schedule;
	@FindBy(xpath="(//li[contains(@class,'ant-menu-item')])[4]")
	WebElement Classrooms;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[1]")
	WebElement Announcements;
	@FindBy(xpath="(//li[contains(@class,'ant-menu-item')])[6]")
	WebElement Attendance;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[2]/li[1]")
	WebElement DigitalLibrary;
	@FindBy(xpath="(//li[contains(@class,'ant-menu-item')])[8]")
	WebElement Assignments;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[2]/li[2]")
	WebElement Test;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[2]")
	WebElement aulasCare;
	@FindBy(xpath="(//div[contains(@class,'ant-dropdown')])[1]")
	WebElement profileIcon;
	@FindBy(xpath="//span[@class='anticon anticon-bell']")
	WebElement Notification;
	@FindBy(xpath="(//span[contains(@class,'ant-avatar')])[1]/img")
	WebElement imgIcon;
	@FindBy(xpath="//span[@class='ant-dropdown-menu-title-content']")
	WebElement Myprofile;
	@FindBy(xpath="(//div[@class='menuItems cursor-pointer'])[1]")
	WebElement UsersProfile;
	@FindBy(xpath="(//div[@class='menuItems cursor-pointer'])[2]")
	WebElement InstitutesDetails;
	@FindBy(xpath="(//div[@class='menuItems cursor-pointer'])[3]")
	WebElement Subscriptions;
	@FindBy(xpath="(//div[@class='menuItems cursor-pointer'])[4]")
	WebElement BankDetails;
	@FindBy(xpath="(//div[@class='menuItems cursor-pointer'])[5]")
	WebElement Settings;
	@FindBy(xpath="(//div[@class='menuItems cursor-pointer'])[6]")
	WebElement SupportDetails;
	@FindBy(xpath="(//span[@class='ant-dropdown-menu-title-content'])[1]")
	WebElement Logout;
	@FindBy(xpath="//span[text()='View All']")
	WebElement ViewAll;
	@FindBy(xpath="(//div[@class='m-l-10 notifyCardWrap'])[1]")
	WebElement OpenNotification;
	@FindBy(xpath="//button[@class='ant-btn mod-notifyApprove-btn']")
	WebElement Close;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[3]")
	WebElement NotificationPages;
	@FindBy(xpath="//ul[contains(@class,'ant-menu')]//li[10]")
	WebElement TestLink;

	Actions ac = new Actions(driver);
	
	
	
	public HomePage1()
	{
	PageFactory.initElements(driver, this);
	}
	

	public void Users()
	{
//		ac = new Actions(driver);
    	ac.moveToElement(Users).click().build().perform();
		Users.click();
//		ac.moveToElement(Users).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
//		ac.moveToElement(Users).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		right click
 //     ac.moveToElement(Users).contextClick().build().perform();
	}
	
	
	

	@SuppressWarnings("deprecation")
	public void Schedule()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Schedule.click();
	}
	public void Classrooms()
	{
	//	WebDriverWait w =new WebDriverWait(driver,5);
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		Classrooms.click();
	}
	
	public  void Announcements() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcements.click();
//		return Announcements();
	}
	public void Attendance()
	{
		Attendance.click();
	}
	
	

/*
	public Pages.TestPages Test()
	{	
		Test.click();
		return TestPages;
		
	}
*/	
	public void aulasCare() throws InterruptedException
	{
		Thread.sleep(5000);
		aulasCare.click();
	}

	public void profileIcon()
	{
		profileIcon.click();
	}
	
	public void MyProfile() throws InterruptedException
	{
		Thread.sleep(5000);
		Myprofile.click();
	}
	
	public void UsersProfile()
	{
		UsersProfile.click();
	}
	
	public void InstitutesDetails()
	{
		InstitutesDetails.click();
	}
	public void Subscriptions()
	{
		Subscriptions.click();
	}
	
	public void BankDetails()
	{
		BankDetails.click();
	}
	public void Settings()
	{
		Settings.click();
	}
	public void SupportDetails()
	{
		SupportDetails.click();
	}
	public void Logout()
	{
		Logout.click();
	}
	
	public void Notification() 
	{
		Notification.click();
	}
	
	public void ViewAll() 
	{
		ViewAll.click();
	}
	public void OpenNotification() 
	{
		OpenNotification.click();
	}
	public void Close() 
	{
		Close.click();
	}
	public void NotificationPages() 
	{
		NotificationPages.click();
	}
	
	public void imgIcon() throws InterruptedException
	{
		Thread.sleep(5000);
		imgIcon.click();
	}
	

	public String profileICon() throws InterruptedException
	{

	Thread.sleep(5000);
	profileIcon.click();
	Myprofile.click();
	//Thread.sleep(5000);
	//Logout.click();
	return Myprofile.getText();

	}

	public void notificationicon() throws InterruptedException
	{
		Thread.sleep(5000);
		Notification.click();
		// viewAllNotification.click();
		// ClickNotification.click();
		// Thread.sleep(2000);
		// Closebtn.click();
		// Activitybtn.click();
		// PageDrpDn.click();
		// SelPageDrpdn.click();
		NotificationPages.click();
	}

}
