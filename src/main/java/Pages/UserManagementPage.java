package Pages;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Aulas_Base.BaseTest;

public class UserManagementPage extends BaseTest {

	@FindBy(xpath = "//a[@href='/user-management']")
	WebElement UserManagement;
	@FindBy(xpath = "(//*[@class='ant-layout-content'])[1]")
	WebElement PageContent;
	@FindBy(xpath = "(//span[@class='anticon anticon-arrow-left'])[1]")
	WebElement Backbutton;
	/**************** Manually Add A User Creation ************************/

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[1]")
	WebElement AddUser;
	@FindBy(xpath = "(//span[@class='anticon anticon-right'])[2]")
	WebElement Teacher;
	@FindBy(xpath = "(//span[@class='anticon anticon-right'])[1]")
	WebElement Student;
	@FindBy(xpath = "(//span[@class='anticon anticon-right'])[3]")
	WebElement DataOperator;
	@FindBy(xpath = "(//span[@class='anticon anticon-right'])[4]")
	WebElement Operation;
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement Name;
	@FindBy(xpath = "//input[@class='PhoneInputInput']")
	WebElement Number;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement Email;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[1]")
	WebElement Admin;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[2]")
	WebElement Planner;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[3]")
	WebElement Feemanager;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[4]")
	WebElement Institutesupport;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[5]")
	WebElement Attendancemarker;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[6]")
	WebElement LeaveManager;
	@FindBy(xpath = "//span[text()='ADD']")
	WebElement AddButton;
	@FindBy(xpath = "(//div[@class='ant-modal-content']/div[3]/button[1])[1]")
	WebElement CancelButton1;
	@FindBy(xpath = "(//div[@class='ant-modal-content']/div[3]/button[1])[2]")
	WebElement CancelButton;
	@FindBy(xpath = "(//*[text()='CANCEL'])[1]")
	WebElement CANCEL;
	@FindBy(xpath = "(//span[@class='anticon anticon-close ant-modal-close-icon'])[2]")
	WebElement IntoMark;

	/* ***************View More******************************* */
	@FindBy(xpath = "(//h4[text()='VIEW MORE'])[1]")
	WebElement StudentViewMore;
	@FindBy(xpath = "(//h4[text()='VIEW MORE'])[2]")
	WebElement TeacherViewMore;
	@FindBy(xpath = "(//h4[text()='VIEW MORE'])[3]")
	WebElement DataOperatorViewMore;
	@FindBy(xpath = "(//h4[text()='VIEW MORE'])[4]")
	WebElement OperationViewMore;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement AddButtonViewMore;
	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement CancelButtonViewMore;
	@FindBy(xpath = "(//span[@class='anticon anticon-close ant-modal-close-icon'])[1]")
	WebElement IntoMarkViewMore;

	@FindBy(xpath = "//div[@class='ant-page-header-back-button']")
	WebElement ViewMoreBackButton;

	/* Registration Requests */

	@FindBy(xpath = "//span[@style='color: rgb(16, 137, 255); font-size: 13px; font-weight: 500; margin-left: 20px; cursor: pointer;']")
	WebElement ChangeSettings;
	@FindBy(xpath = "//div[@class='ant-select approvalMenu ant-select-single ant-select-show-arrow']")
	WebElement SettingsSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Autoapproval;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[2]")
	WebElement Manualapproval;
	@FindBy(xpath = "//button[@class='ant-modal-close']")
	WebElement SettingsIntoMark;
	@FindBy(xpath = "(//span[@class='anticon anticon-close-circle styleCloseCircleOutlinedB'])[1]")
	WebElement RedIntoMark;
	@FindBy(xpath = "(//span[@class='anticon anticon-check-circle styleCheckCircleOutlinedB'])[1]")
	WebElement GreenRightMark;
	@FindBy(xpath = "(//span[@class='anticon anticon-check-circle styleCheckCircleOutlinedB'])[2]")
	WebElement GreenRightMark1;
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement YesButton;
	@FindBy(xpath = "//span[text()='No']")
	WebElement NoButton;
	@FindBy(xpath = "(//button[@class='ant-modal-close'])[2]")
	WebElement IntoMarkButton;

	/* Registration Requests View All && Student ViewAll */

	@FindBy(xpath = "//h3[@style='color: rgb(16, 137, 255); cursor: pointer;']")
	WebElement ViewAll;
	@FindBy(xpath = "//div[@class='ant-tabs-tab ant-tabs-tab-active']")
	WebElement Pending;
	@FindBy(xpath = "//div[@class='ant-tabs-tab']")
	WebElement Rejected;
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	WebElement AllSelector;
	@FindBy(xpath = "//input[@class='ant-input ant-input-lg']")
	WebElement SearchByName;
	@FindBy(xpath = "//span[@class='ant-input-group-addon']")
	WebElement Search;
	@FindBy(xpath = "(//span[@class='ant-input-suffix'])[1]")
	WebElement SearchCancel;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ViewAllYesButton;

	/* Growth summary */

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement GrowthSelector;
	@FindBy(xpath = "//div[text()='Week']")
	WebElement GrowthWeek;
	@FindBy(xpath = "//div[text()='Month']")
	WebElement GrowthMonth;
	@FindBy(xpath = "//span[@class='anticon anticon-calendar']")
	WebElement GrowthCalendar;
	@FindBy(xpath = "//input[@placeholder='Start Date']")
	WebElement GrowthStartDateSelector;
	@FindBy(xpath = "//div[@class='ant-picker-input']")
	WebElement GrowthEndDateSelector;
	@FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view'])[1]")
	WebElement GrowthStartDate2;
	@FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view'])[9]")
	WebElement GrowthEndDate11;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement GrowthOK;

	/* ***************Student View More******************************* */

	@FindBy(xpath = "//p[@style='color: rgb(16, 137, 255); font-weight: bold; cursor: pointer;']")
	WebElement UnassignedStudentViewAll;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement UnassignedStudentAllSelector;
	@FindBy(xpath = "//div[@class='ant-page-header-back-button']")
	WebElement ViewAllBackButton;
	@FindBy(xpath = "(//*[@class='ant-layout-content']/div/div[5]/div/div/div)[1]")
	WebElement Section;
	/******** View more *********/
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement NewestFirstSelector;
	@FindBy(xpath = "(//div[@class='userCardStyle'])[1]")
	WebElement User1;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[3]")
	WebElement Oldestfirst;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[4]")
	WebElement Newestfirst;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[5]")
	WebElement Alphabeticalorders;

	/* ************************ Student Profile *********************** */

	@FindBy(xpath = "(//div[@class='userCardStyle'])[1]")
	WebElement Student1;

	/*********** Basic information ***********/
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement ProfileName;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement Gender;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Male;
	@FindBy(xpath = "(//input[@class='PhoneInputInput'])[1]")
	WebElement PhoneNo;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement ProfileEmailId;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement BloodGroup;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[4]")
	WebElement Aplus;

	@FindBy(xpath = "(//input[@class='ant-input'])[3]")
	WebElement CurrentHouseNo;
	@FindBy(xpath = "(//input[@class='ant-input'])[4]")
	WebElement CurrentState;
	@FindBy(xpath = "(//input[@class='ant-input'])[5]")
	WebElement CurrentPincode;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[6]")
	WebElement CurrentNoPinCode;
	@FindBy(xpath = "(//input[@class='ant-input'])[6]")
	WebElement CurrentDistrict;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[7]")
	WebElement SameAsCurrentAddress;
	@FindBy(xpath = "(//input[@class='ant-input'])[7]")
	WebElement PermanentHouseNo;
	@FindBy(xpath = "(//input[@class='ant-input'])[8]")
	WebElement PermanentState;
	@FindBy(xpath = "(//input[@class='ant-input'])[9]")
	WebElement PermanentPincode;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[8]")
	WebElement PermenenttNoPinCode;
	@FindBy(xpath = "(//input[@class='ant-input'])[10]")
	WebElement PermanentDistrict;
	@FindBy(xpath = "(//input[@class='ant-input'])[11]")
	WebElement EmergencyContactName;
	@FindBy(xpath = "(//input[@class='PhoneInputInput'])[2]")
	WebElement EmergencyContactPhoneNo;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement Relationship;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[16]")
	WebElement Brother;
	
	/**** Course and fee *********/
	@FindBy(xpath = "//h3[text()='Course and fee']")
	WebElement Courseandfee;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement ClassSelector;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[1]/div/div/div/div[1]")
	WebElement Class1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement SectionSelector;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[2]/div/div/div/div[1]")
	WebElement Section1;
	@FindBy(xpath = "(//div[@class='ant-picker datePicker'])[1]")
	WebElement DateSelector;
	@FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today'])[1]")
	WebElement CourseStartDateToday;
	@FindBy(xpath = "(//button[@class='ant-picker-header-next-btn'])[1]")
	WebElement nextMonth;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[10]")
	WebElement nextMonthDate;
	@FindBy(xpath = "(//*[text()='SAVE'])[1]")
	WebElement CourseSave;
	@FindBy(xpath = "(//span[text()='ADD A COURSE'])[1]")
	WebElement AddACourse;
	@FindBy(xpath = "((//*[@class='box-shadow'])[2]/div/div[2])[1]")
	WebElement AddACourse1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement CourseNameSelector;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[3]/div[1]")
	WebElement CourseName;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[1]/div[1]")
	WebElement CourseName1;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[1]/div[2]")
	WebElement CourseName2;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[1]/div[3]")
	WebElement CourseName3;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement Shiftcourse;
	@FindBy(xpath = "(//div[@class='box-shadow flex_row_center'])[1]")
	WebElement CourseOpen;
	@FindBy(xpath = "//*[@class='ant-modal-body']/div/div[4]/div/div[2]/button[1]")
	WebElement ActivateButton;

	@FindBy(xpath = "(//*[text()='NO'])[1]")
	WebElement CourseDeleteNo;
	@FindBy(xpath = "(//*[text()='YES'])[1]")
	WebElement CourseDeleteYes;
	@FindBy(xpath = "(//*[text()='DELETE'])[2]")
	WebElement CourseDelete;
	
	
	@FindBy(xpath = "(//button[@class='ant-btn'])[4]")
	WebElement CourseCancel;
	
	@FindBy(xpath = "(//button[@class='ant-btn'])[3]")
	WebElement UNASSIGN;
	@FindBy(xpath = "(//button[@class='ant-btn'])[2]")
	WebElement Save;
	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement Delete;

	@FindBy(xpath = "//*[@class='ant-dropdown-trigger']")
	WebElement DottedLogout;
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement Logout;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public UserManagementPage() {
		PageFactory.initElements(driver, this);
	}

	/************ USERS CREATIONS ******************/

	public void clickUserManagement() throws InterruptedException {
		Wait(UserManagement);
		UserManagement.click();
	}
    public void addaUser(String selectRole) throws InterruptedException
    {
    	Wait(AddUser);
    	AddUser.click();
    	if(selectRole.equalsIgnoreCase("StudentCreation")) {
    		WaitTil(2000);
    		Student.click();
    		WaitTil(2000);
    		fillUserDetails();			
    	}
    	if(selectRole.equalsIgnoreCase("TeacherCreation")) {
    		WaitTil(2000);
    		Teacher.click();
    		WaitTil(2000);
    		fillUserDetails();
    	}
    	if(selectRole.equalsIgnoreCase("TeacherCreation1")) {
    		WaitTil(2000);
    		Teacher.click();
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Admin.click();
    		WaitTil(2000);
    		Feemanager.click();
    		
    		
    	}
    	if(selectRole.equalsIgnoreCase("TeacherCreation2")) {
    		WaitTil(2000);
    		Teacher.click();
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Planner.click();
    		WaitTil(2000);
    		Institutesupport.click();
    		WaitTil(2000);
    		LeaveManager.click();
    		
    	}
    	if(selectRole.equalsIgnoreCase("DataOperatorCreation")) {
    		WaitTil(2000);
    		DataOperator.click();
    		WaitTil(2000);
    		fillUserDetails();			
    	}
    	if(selectRole.equalsIgnoreCase("DataOperatorCreation1")) {
    		WaitTil(2000);
    		DataOperator.click();
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Admin.click();
    		WaitTil(2000);
    		Feemanager.click();
    		
    	}
    	if(selectRole.equalsIgnoreCase("DataOperatorCreation2")) {
    		WaitTil(2000);
    		DataOperator.click();
    		WaitTil(2000);
    		fillUserDetails();
    		Planner.click();
    		WaitTil(2000);
    		Institutesupport.click();
    		WaitTil(2000);
    		Attendancemarker.click();
    		WaitTil(2000);
    		LeaveManager.click();
    	}
    	if(selectRole.equalsIgnoreCase("OperationCreation")) {
    		WaitTil(2000);
    		Operation.click();
    		WaitTil(2000);
    		fillUserDetails();
    	}
    	if(selectRole.equalsIgnoreCase("OperationCreation1")) {
    		WaitTil(2000);
    		Operation.click();
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Admin.click();
    		WaitTil(2000);
    		Feemanager.click();
    		
    	}
    	if(selectRole.equalsIgnoreCase("OperationCreation2")) {
    		WaitTil(2000);
    		Operation.click();
    		WaitTil(2000);
    		fillUserDetails();
    		Planner.click();
    		WaitTil(2000);
    		Institutesupport.click();
    		WaitTil(2000);
    		Attendancemarker.click();
    		WaitTil(2000);
    		LeaveManager.click();
    	}
    	WaitTil(2000);
    	AddButton.click();
    	WaitTil(2000);
		verifyPopUp();
		WaitTil(2000);
    	
    }
    
    public void fillUserDetails()
    {

		String chars = "abcdefghijklmnopqrstuvwxyz";
		//String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
			//name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
    	WaitTil(2000);
    	Name.sendKeys("Einstein"+" "+name);
    	WaitTil(2000);
    	long phoneNumber=Math.round(Math.random()*1000000000L);
		Number.sendKeys("9"+phoneNumber);
		WaitTil(2000);
		String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
		Random id = new Random();
		StringBuilder Gmail = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Gmail.append(mail.charAt(id.nextInt(mail.length())));
		}
		Email.sendKeys("brigosha."+Gmail+"@gmail.com");
		WaitTil(2000);
    }
	
	
	public void verifyPopUp() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);

		} else {
			System.out.println("The The failure messgae is: " + message);
			CancelButton.click();
			Thread.sleep(2000);
		}
	}
	public void popupContent()
	{
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
	}

	
	public void generate()
	{
		long i=Math.round(Math.random()*900000000L);
		String j = UUID.randomUUID().toString();
		final String k= UUID.randomUUID().toString().replace("-", "");
		UUID l = UUID.randomUUID();
	
		System.out.println("i=9"+i);
		System.out.println("j="+j);
		System.out.println("k="+k+"@gmail.com");
		System.out.println("l="+l);
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
		for (int m = 0; m < 8; m++)
		{
			Random r = new Random();
			StringBuilder sl = new StringBuilder(8);
		
				sl.append(alphabet.charAt(r.nextInt(alphabet.length())));
			System.out.println("sb="+sl);
			
			}
		
		  String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		System.out.println("sb="+sb);
		
		}
		
	}

	public void validateClickCancelStudent() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Student.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Student.click();
		Thread.sleep(2000);
		IntoMark.click();

	}
	public void validateClickCancelTeacher() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Teacher.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Teacher.click();
		Thread.sleep(2000);
		IntoMark.click();
		Thread.sleep(2000);

	}
	public void validateClickCancelDataOperator() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		DataOperator.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		DataOperator.click();
		Thread.sleep(2000);
		IntoMark.click();
		Thread.sleep(2000);

	}
	public void validateClickCancelOperation() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Operation.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Operation.click();
		Thread.sleep(2000);
		IntoMark.click();
		Thread.sleep(2000);

	}


	/************** USERS VIEW MORE PAGE ***********************/
	public void vieworeAddaUser(String selectRole) throws InterruptedException
    {
    	Wait(AddUser);
    	AddUser.click();
    	if(selectRole.equalsIgnoreCase("UserCreation")) {
    		WaitTil(2000);
    		fillUserDetails();			
    	}
    	if(selectRole.equalsIgnoreCase("TeacherCreation1")) {
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Feemanager.click();
    		WaitTil(2000);
    		Admin.click();
    		
    	}
    	if(selectRole.equalsIgnoreCase("TeacherCreation2")) {
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Institutesupport.click();
    		WaitTil(2000);
    		Planner.click();
    		WaitTil(2000);
    		LeaveManager.click();
    		
    	}
    	if(selectRole.equalsIgnoreCase("DataOperatorCreation1")) {
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Feemanager.click();
    		WaitTil(2000);
    		Admin.click();
    	}
    	if(selectRole.equalsIgnoreCase("DataOperatorCreation2")) {
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Attendancemarker.click();
    		WaitTil(2000);
    		Institutesupport.click();
    		WaitTil(2000);
    		Planner.click();
    		WaitTil(2000);
    		LeaveManager.click();
    	}
    	if(selectRole.equalsIgnoreCase("OperationCreation1")) {
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Feemanager.click();
    		WaitTil(2000);
    		Admin.click();
    	}
    	if(selectRole.equalsIgnoreCase("OperationCreation2")) {
    		WaitTil(2000);
    		fillUserDetails();
    		WaitTil(2000);
    		Attendancemarker.click();
    		WaitTil(2000);
    		Institutesupport.click();
    		WaitTil(2000);
    		Planner.click();
    		WaitTil(2000);
    		LeaveManager.click();
    	}
    	WaitTil(2000);
    	AddButton.click();
    	WaitTil(2000);
		verifyPopUp1();
		WaitTil(2000);
    	
    }

	public void studentViewMoreClick() throws InterruptedException {
	
		WaitTil(4000);
		Wait(StudentViewMore);
		StudentViewMore.click();
		WaitTil(2000);
	}

	public void viewmoreCancelStudentCreation() throws InterruptedException {
		Wait(AddUser);
		AddUser.click();
		WaitTil(2000);
		CancelButton1.click();
		WaitTil(2000);
		AddUser.click();
		WaitTil(2000);
		IntoMarkViewMore.click();

	}
     public void verifyPopUp1() throws InterruptedException
     {
    	 WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
 		String act = messagElement.getText();
 		System.out.println("The actual text is:" + act);
 		String exp = "success";
 		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
 		String message = text.getText();
 		if (exp.equals(act)) {
 			System.out.println("The success message is:  " + message);

 		} else {
 			System.out.println("The The failure messgae is: " + message);
 			CancelButton1.click();
 			Thread.sleep(2000);
 		} 
     }

	public void validateUnassignedStudent() throws InterruptedException {
		WaitTil(2000);
		WebElement Unassigned = driver.findElement(By.xpath("//h2[text()='Unassigned']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Unassigned);
		WaitTil(2000);
		Student1.click();
		WaitTil(2000);
		deleteUser();
		WaitTil(2000);
		UnassignedStudentViewAll.click();
		WaitTil(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
		int size = ele.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			WaitTil(2000);
			GrowthSelector.click();
			ele.get(i).click();
			WaitTil(2000);
		}
		WaitTil(2000);
		searchName();
		WaitTil(2000);
		Student1.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		WebElement AllClasses = driver.findElement(By.xpath("//h2[text()='All Classes']"));
		js.executeScript("arguments[0].scrollIntoView(true)", AllClasses);
		WaitTil(2000);
		Section.click();
		WaitTil(2000);
		Student1.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		searchName();
		WaitTil(2000);
		Backbutton.click();
		WebElement Unassigned1 = driver.findElement(By.xpath("//h2[text()='Unassigned']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Unassigned1);
		Thread.sleep(2000);
		User1.click();
		Thread.sleep(2000);
		studentBasicInfo();
		Thread.sleep(2000);
		enterAdressDeatils();
		Thread.sleep(2000);
		studentEmargencyContacts();
		Thread.sleep(1000);
		popupContent();
		Thread.sleep(1000);
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		Backbutton.click();
		

	}
	public void searchName()
	{
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WaitTil(2000);
		SearchByName.sendKeys(name);
		WaitTil(2000);
		Search.click();
		WaitTil(2000);
		SearchCancel.click();
		WaitTil(2000);
	}


	// ********** TEACHER VIEWMORE ***************//
	public void clickTeacherViewMore() throws InterruptedException {
		WaitTil(2000);
		UserManagement.click();
		WaitTil(2000);
		Wait(TeacherViewMore);
		TeacherViewMore.click();
		WaitTil(2000);

	}

	public void validateViewMorePage() throws InterruptedException {
		Thread.sleep(2000);
		growthSummary();
		Thread.sleep(2000);
		WebElement AllTeachers = driver.findElement(By.xpath("(//h3[text()='Newest first'])[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AllTeachers);
		Thread.sleep(2000);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Oldestfirst.click();
		Thread.sleep(6000);
		Wait(NewestFirstSelector);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Newestfirst.click();
		Thread.sleep(6000);
		Wait(NewestFirstSelector);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Alphabeticalorders.click();
		Thread.sleep(6000);
		Wait(User1);
		User1.click();
		Thread.sleep(2000);
		deleteUser();
		Thread.sleep(2000);
		popupContent();
		Thread.sleep(2000);
		Wait(User1);
		User1.click();
		Thread.sleep(2000);
		fillBasicInfo();
		Thread.sleep(2000);
		selectPrivalagePage();
		Thread.sleep(2000);
		enterAdressDeatils();
		Thread.sleep(2000);
		enterEmargencyContacts();
		Thread.sleep(1000);
		//popupContent();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(1000);
		searchName();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(2000);
	}
	public void adminValidateViewMorePage() throws InterruptedException {
		Thread.sleep(2000);
		growthSummary();
		Thread.sleep(2000);
		WebElement AllTeachers = driver.findElement(By.xpath("(//h3[text()='Newest first'])[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AllTeachers);
		Thread.sleep(2000);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Oldestfirst.click();
		Thread.sleep(6000);
		Wait(NewestFirstSelector);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Newestfirst.click();
		Thread.sleep(6000);
		Wait(NewestFirstSelector);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Alphabeticalorders.click();
		Thread.sleep(6000);
		Wait(User1);
		User1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-layout-content']/div/div[2]/div/div[1]/h3)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-layout-content']/div/div[2]/div/div[1]/h3)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-layout-content']/div/div[2]/div/div[1]/h3)[3]")).click();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(1000);
		searchName();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(2000);
	}

	public void viewmoreCancelTeacherCreation() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		CancelButton1.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		IntoMarkViewMore.click();
		Thread.sleep(2000);

	}

	// ************ DATA OPERATOR VIEW MORE ***********//

	public void clickDataoperatorViewMore() throws InterruptedException {
		
		Thread.sleep(2000);
		Wait(DataOperatorViewMore);
		DataOperatorViewMore.click();
		Thread.sleep(2000);

	}

	public void viewmoreCancelDataoperatorCreation() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		CancelButton1.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		IntoMarkViewMore.click();
		Thread.sleep(2000);

	}

	// *********************** OPERATION VIEW MORE **********************//

	public void clickOperationViewMore() throws InterruptedException {

		Thread.sleep(6000);
		Wait(OperationViewMore);
		OperationViewMore.click();
		Thread.sleep(6000);
	}

	public void viewmoreCancelOperationCreation() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		CancelButton1.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		IntoMarkViewMore.click();
		Thread.sleep(2000);

	}

	/************************ Validate-UserManagementPage ************************/
	public void growthSummary() throws InterruptedException {
		Wait(GrowthCalendar);
		GrowthCalendar.click();
		Wait(GrowthStartDateSelector);
		GrowthStartDateSelector.click();
		Wait(GrowthStartDate2);
		GrowthStartDate2.click();
		Wait(GrowthOK);
		GrowthOK.click();
		Wait(GrowthEndDate11);
		GrowthEndDate11.click();
		Wait(GrowthOK);
		GrowthOK.click();
		Wait(GrowthSelector);
		GrowthSelector.click();
		Wait(GrowthMonth);
		GrowthMonth.click();
		WaitTil(2000);
	}

	public void validateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		StudentViewMore.click();
		WaitTil(2000);
		ViewMoreBackButton.click();
		WaitTil(2000);
		TeacherViewMore.click();
		WaitTil(2000);
		ViewMoreBackButton.click();
		WaitTil(2000);
		DataOperatorViewMore.click();
		WaitTil(2000);
		ViewMoreBackButton.click();
		WaitTil(2000);
		OperationViewMore.click();
		WaitTil(2000);
		ViewMoreBackButton.click();
		WaitTil(2000);
		ChangeSettings.click();
		WaitTil(2000);
		SettingsIntoMark.click();
		WaitTil(2000);
		ViewAll.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		growthSummary();
		WaitTil(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitTil(2000);
		WebElement RecentlyAddedUser = driver.findElement(By.xpath("//h2[text()='Recently added user(s)']"));
		WaitTil(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", RecentlyAddedUser);
		WaitTil(2000);
		driver.findElement(By.xpath("(//div[@class='userCardStyle'])[1]")).click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);

	}

	public void registrationRequestsApprovals() throws InterruptedException {
		WebElement registrationRequestsContent = driver.findElement(By.xpath("(//*[@class='ant-col ant-col-md-24 ant-col-lg-10'])[1]"));
		String RequestsContent = registrationRequestsContent.getText();
		System.out.println("Content Of registrationRequests is : " + RequestsContent);
		WaitTil(2000);
		ChangeSettings.click();
		WaitTil(2000);
		WebElement ApprovalElement = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		String ApprovalType = ApprovalElement.getText();
		System.out.println(" Actual Approval Request type is : " + ApprovalType);
		String ExpectedApproval = "Auto approval";
		System.out.println("Expected Approval Request type is : " + ExpectedApproval);
		if (ExpectedApproval.equals(ApprovalType)) {
			Wait(SettingsSelector);
			SettingsSelector.click();
			Wait(Manualapproval);
			Manualapproval.click();
			WaitTil(2000);
			popupContent();

		} else {
			Wait(SettingsSelector);
			SettingsSelector.click();
			Wait(Autoapproval);
			Autoapproval.click();
			WaitTil(2000);
			popupContent();
		}
		WebElement ele = driver.findElement(By.xpath("(//div[@class='ant-col ant-col-md-24 ant-col-lg-10']/div/div/div/h3)[1]"));
		String actual = ele.getText();
		System.out.println("The Total Requests are :-" + actual);
		String exp = "Registration request(s) (" + "0" + ")";
		if (exp.equals(actual)) {
			System.out.println("There is No Registration request(s)");
			
		}
		else
		{
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			GreenRightMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			YesButton.click();
			WaitTil(2000);
			popupContent();
			WebElement ele1 = driver.findElement(By.xpath("(//div[@class='ant-col ant-col-md-24 ant-col-lg-10']/div/div/div/h3)[1]"));
			String actual1 = ele1.getText();
			System.out.println("The Total Requests are :-" + actual1);
			String exp1 = "Registration request(s) (" + "0" + ")";
			if (exp1.equals(actual1)) {
				System.out.println("There is No Registration request(s)");
				
			}
			else
			{
				WaitTil(2000);
				GreenRightMark.click();
				WaitTil(2000);
				YesButton.click();
				WaitTil(2000);
				popupContent();	
			}
			
		}
	}

	/* Registration Requests View All */

	public void validateRegistrationRequestsPage() throws InterruptedException {
		Wait(ViewAll);
		ViewAll.click();
		WaitTil(2000);
		Pending.click();
		WaitTil(2000);
		WebElement ele5 = driver.findElement(By.xpath("//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']/div/div[1]"));
		String actual3= ele5.getText();
		System.out.println("The Total Requests are :-" + actual3);
		WaitTil(2000);
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='text-md'])[1]"));
		String actual1 = ele1.getText();
		System.out.println("The Total Requests are :-" + actual1);
		String exp1 = "Registration request(s) (0)";
		if (exp1.equals(actual1)) {
			System.out.println("There is No Registration request(s)");
			
		}
		else
		{
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			GreenRightMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			YesButton.click();
			WaitTil(2000);
			popupContent();
			WebElement ele2 = driver.findElement(By.xpath("(//div[@class='text-md'])[1]"));
			String actual= ele2.getText();
			System.out.println("The Total Requests are :-" + actual);
			String exp = "Registration request(s) (0)";
			if (exp.equals(actual)) {
				System.out.println("There is No Registration request(s)");	
			}
			else
			{
				WaitTil(2000);
				GreenRightMark.click();
				WaitTil(2000);
				YesButton.click();
				WaitTil(2000);
				popupContent();
			}
		}
		
		Rejected.click();
		WaitTil(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
		int size = ele.size();
		for (int i=0; i<size; i++) {
			WaitTil(2000);;
			AllSelector.click();
			WaitTil(2000);
			ele.get(i).click();
			WaitTil(2000);
		}
		searchName();
		WaitTil(2000);
		SearchCancel.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
	}

	

	// ************ Student PROFILE UPDATE *********************//
	
	  public void deleteUser() throws InterruptedException {
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[text()='DELETE']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='No']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='DELETE']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Yes']")).click();
			Thread.sleep(2000);
	  }
	
	  public void verifyPopUp2() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);

			} else {
				System.out.println("The The failure messgae is: " + message);
				CANCEL.click();
				Thread.sleep(2000);
			}
		}
		public void studentCourseAndFeeDetailsUpdate() throws InterruptedException {
			Thread.sleep(2000);
			studentViewMoreClick();
			Thread.sleep(2000);
			WebElement Unassigned = driver.findElement(By.xpath("//h2[text()='Unassigned']"));
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView(true)", Unassigned);
			Thread.sleep(2000);
			User1.click();
			Thread.sleep(2000);
			Courseandfee.click();
			Thread.sleep(2000);
			ClassSelector.click();
			Thread.sleep(2000);
			Class1.click();
			Thread.sleep(2000);
			SectionSelector.click();
			Thread.sleep(2000);
			Section1.click();
			WaitTil(2000);
			driver.navigate().refresh();
			WaitTil(4000);
			Backbutton.click();
			
		    /*
			DateSelector.click();
			Thread.sleep(2000);
			CourseStartDateToday.click();
			Thread.sleep(2000);
			CourseSave.click();
			Thread.sleep(2000);
			popupContent();
			
			WaitTil(2000);
			WebElement AllClasses = driver.findElement(By.xpath("//h2[text()='All Classes']"));
			js.executeScript("arguments[0].scrollIntoView(true)", AllClasses);
			WaitTil(2000);
			Section.click();
			WaitTil(2000);
			Student1.click();
			WaitTil(2000);
			Courseandfee.click();
			WaitTil(2000);
			WebElement ele=driver.findElement(By.xpath("(//*[@class='box-shadow'])[2]/div[2]/div/div[1]"));
			String text=ele.getText();
			System.out.println(text);
			String ExpText="";
			System.out.println(ExpText);
			if(text.equals(ExpText))
			{
				WaitTil(4000);
				AddACourse.click();
				WaitTil(4000);
				CANCEL.click();
				WaitTil(2000);
				AddACourse.click();
				WaitTil(2000);
				CourseNameSelector.click();
				WaitTil(2000);
				CourseName1.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				CourseStartDateToday.click();
				WaitTil(2000);
				CourseSave.click();
				WaitTil(2000);
				popupContent();
				
			}
			else
			{
				WaitTil(2000);
				AddACourse1.click();
				WaitTil(2000);
				CANCEL.click();
				WaitTil(2000);
				AddACourse1.click();
				WaitTil(2000);
				CourseNameSelector.click();
				WaitTil(2000);
				CourseName2.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				CourseStartDateToday.click();
				WaitTil(2000);
				CourseSave.click();
				WaitTil(2000);
				verifyPopUp2();
				WaitTil(2000);
				AddACourse1.click();
				WaitTil(2000);
				CourseNameSelector.click();
				WaitTil(2000);
				CourseName3.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				CourseStartDateToday.click();
				WaitTil(2000);
				Shiftcourse.click();
				WaitTil(2000);
				CourseSave.click();
				WaitTil(2000);
				verifyPopUp2();
				WaitTil(2000);
				CourseOpen.click();
				WaitTil(2000);
				CANCEL.click();
				WaitTil(2000);
				CourseOpen.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				nextMonth.click();
				WaitTil(2000);
				nextMonthDate.click();
				WaitTil(2000);
				ActivateButton.click();
				verifyPopUp2();
				WaitTil(2000);
				CourseOpen.click();
				WaitTil(2000);
				CourseDelete.click();
				WaitTil(2000);
				CourseDeleteNo.click();
				WaitTil(2000);
				CourseDeleteYes.click();
				WaitTil(2000);
			}
			*/
		}
          
	
		
		public void studentBasicInfo() throws InterruptedException {
			Thread.sleep(3000);
			String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random rnd = new Random();
			StringBuilder name = new StringBuilder(8);
			for (int n = 0; n < 8; n++)
			{
				name.append(chars.charAt(rnd.nextInt(chars.length())));
			}
			WebElement Element1 = driver.findElement(By.xpath("(//*[@placeholder='Enter name'])[1]"));
			Element1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Element1.sendKeys(Keys.DELETE);
			Element1.sendKeys("ABDUL KALAM"+" "+name);
			Thread.sleep(3000);
			long phoneNumber=Math.round(Math.random()*1000000000L);
			WebElement Element2 = driver.findElement(By.xpath("(//*[@placeholder='Enter phone number'])[1]"));
			Element2.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Element2.sendKeys(Keys.DELETE);
			Element2.sendKeys("+91 8"+phoneNumber);
			Thread.sleep(3000);
			String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
			Random id = new Random();
			StringBuilder Gmail = new StringBuilder(9);
			for (int n = 0; n < 9; n++)
			{
				Gmail.append(mail.charAt(id.nextInt(mail.length())));
			}
			WaitTil(2000);
			WebElement Element3 = driver.findElement(By.xpath("(//*[@placeholder='Enter Email ID'])[1]"));
			Element3.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Element3.sendKeys(Keys.DELETE);
			Element3.sendKeys("abdulkalam."+Gmail+"@brigosha.com");
			//gender selector
			driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();  // gender
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();        // Blood group selector
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[4]")).click();   // blood group 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@placeholder='Select a date']")).click();
			for (int i = 0; i < 18; i++) {
                WaitTil(1000);
				driver.findElement(By.xpath("//*[@class='ant-picker-header-super-prev-btn']")).click();
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-picker-cell ant-picker-cell-in-view'])[12]")).click();
			
			System.out.println("-- Basic Details Updated --");
		}
		
		public void studentEmargencyContacts() throws InterruptedException {
			Thread.sleep(3000);
			String chars = "abcdefghijklmnopqrstuvwxyz";
			Random rnd = new Random();
			StringBuilder name = new StringBuilder(7);
			for (int n = 0; n < 7; n++)
			{
				name.append(chars.charAt(rnd.nextInt(chars.length())));
			}
			WebElement EmergencyContact = driver.findElement(By.xpath("//h2[text()='Emergency Contact']")); 
			js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);
			WebElement Name=driver.findElement(By.xpath("(//*[@placeholder='Enter name'])[2]"));
			Name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Name.sendKeys(Keys.DELETE);
			Name.sendKeys("swami vivekananda"+" "+name);
			Thread.sleep(3000);
			long phoneNumber=Math.round(Math.random()*1000000000L);
			WebElement PhNumber=driver.findElement(By.xpath("(//*[@placeholder='Enter phone number'])[2]"));
			PhNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			PhNumber.sendKeys(Keys.DELETE);
			PhNumber.sendKeys("+91 7"+phoneNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])[3]/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn'])[2]")).click();
			System.out.println("--------Emergency Details Updated -----");
		}
	
	
	
	

	public void fillBasicInfo() throws InterruptedException {
		Thread.sleep(3000);
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(7);
		for (int n = 0; n < 7; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WebElement Element1 = driver.findElement(By.xpath("(//*[@placeholder='Enter name'])[1]"));
		Element1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Element1.sendKeys(Keys.DELETE);
		Element1.sendKeys("swami vivekananda"+" "+name);
		Thread.sleep(3000);
		long phoneNumber=Math.round(Math.random()*1000000000L);
		WebElement Element2 = driver.findElement(By.xpath("(//*[@placeholder='Enter phone number'])[1]"));
		Element2.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Element2.sendKeys(Keys.DELETE);
		Element2.sendKeys("+91 7"+phoneNumber);
		Thread.sleep(3000);
		String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
		Random id = new Random();
		StringBuilder Gmail = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Gmail.append(mail.charAt(id.nextInt(mail.length())));
		}
		WebElement Element3 = driver.findElement(By.xpath("(//*[@placeholder='Enter Email ID'])[1]"));
		Element3.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Element3.sendKeys(Keys.DELETE);
		Element3.sendKeys("swami."+Gmail+"@brigosha.com");
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();  //gender selector
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();  // gender
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();       // Blood group selector
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[4]")).click();   // blood group 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker datePicker'])[1]")).click();
		for (int i = 0; i < 18; i++) {
			WebElement ele=driver.findElement(By.xpath("//*[@class='ant-picker-header-super-prev-btn']"));
			Wait(ele);
			ele.click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-cell ant-picker-cell-in-view'])[12]")).click();
		
		System.out.println("-- Basic Details Updated --");
	}

	public void selectPrivalagePage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Privileges = driver.findElement(By.xpath("//h2[text()='Privileges']")); 
		js.executeScript("arguments[0].scrollIntoView();", Privileges);
        Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]")).click();
		System.out.println("-- Privileges Updated ---");
	}

	public void enterAdressDeatils() throws InterruptedException {
		Thread.sleep(3000);
		 List<String> House = new ArrayList<>();
		 House.add("56");
		 House.add("67");
		 House.add("78");
		 House.add("03");
		 House.add("45");
		 House.add("22");
		 House.add("89");
	     Random rand = new Random();
	     String HouseNumber=House.get(rand.nextInt(House.size()));
	     System.out.println("Selected House Number is :- "+HouseNumber);
		WebElement Currentaddress = driver.findElement(By.xpath("//h2[text()='Current address']")); 
		js.executeScript("arguments[0].scrollIntoView();", Currentaddress);
		WebElement HouseNo= driver.findElement(By.xpath("(//*[@placeholder='Enter House No./Locality/Area'])[1]"));
		HouseNo.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		HouseNo.sendKeys(Keys.DELETE);
		HouseNo.sendKeys(HouseNumber);
		Thread.sleep(3000);
		/*
		 List<String> pin = new ArrayList<>();
		 pin.add("505528");
		 pin.add("500001");
		 pin.add("560001");
		 pin.add("506001");
		 pin.add("110002");
	     Random pincode = new Random();
	     String pinNumber=pin.get(pincode.nextInt(pin.size()));
	     System.out.println("Selected PinCode is :- "+pinNumber);
	     WebElement PinCodeNumber= driver.findElement(By.xpath("(//*[@placeholder='Enter Pincode'])[1]"));
	     PinCodeNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	     PinCodeNumber.sendKeys(Keys.DELETE);
	     PinCodeNumber.sendKeys(pinNumber);
	     */
	     driver.findElement(By.xpath("//div[@id='currentAddress']/div/div[2]/div/label")).click();
		WaitTil(3000);
		
		List<String> State = new ArrayList<>();
		State.add("Telangana");
		State.add("Assam");
		State.add("Karnataka");
		State.add("Maharashtra");
		State.add("Kerala");
		State.add("Odisha");
		State.add("Goa");
	    Random randamState = new Random();
	    String SelectedState=State.get(randamState.nextInt(State.size()));
	    System.out.println("Selected State is :- "+SelectedState);
		WebElement state = driver.findElement(By.xpath("(//*[@placeholder='Enter State'])[1]"));
		state.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		state.sendKeys(Keys.DELETE);
		state.sendKeys(SelectedState);
		Thread.sleep(3000);
		List<String> Distric = new ArrayList<>();
		Distric.add("Hyderabad");
		Distric.add("Warangal");
		Distric.add("Karimnagar");
		Distric.add("Rajanna Sircilla");
		Distric.add("Siddipet");
		Distric.add("Bengaluru");
		Distric.add("Bengaluru");
	    Random randomDistric = new Random();
	    String SelectedDistric=Distric.get(randomDistric.nextInt(Distric.size()));
	    System.out.println("Selected Distric is :- "+SelectedDistric);
		WebElement distric = driver.findElement(By.xpath("(//*[@placeholder='Enter District'])[1]"));
		distric.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		distric.sendKeys(Keys.DELETE);
		distric.sendKeys(SelectedDistric);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[7]")).click();
		System.out.println("--Current Address Updated --");
		
	}

	public void enterEmargencyContacts() throws InterruptedException {
		Thread.sleep(3000);
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(7);
		for (int n = 0; n < 7; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WebElement EmergencyContact = driver.findElement(By.xpath("//h2[text()='Emergency Contact']")); 
		js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);
		WebElement Name=driver.findElement(By.xpath("(//*[@placeholder='Enter name'])[2]"));
		Name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Name.sendKeys(Keys.DELETE);
		Name.sendKeys("ambedkar"+" "+name);
		Thread.sleep(3000);
		long phoneNumber=Math.round(Math.random()*1000000000L);
		WebElement PhNumber=driver.findElement(By.xpath("(//*[@placeholder='Enter phone number'])[2]"));
		PhNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		PhNumber.sendKeys(Keys.DELETE);
		PhNumber.sendKeys("+91 8"+phoneNumber);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Brother'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn'])[2]")).click();
		System.out.println("--------Emergency Details Updated -----");
	}

	

	
	

}
