package Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class FeeManagementPage extends BaseTest {

	UserManagementPage UM = new UserManagementPage();

	@FindBy(xpath = "//a[contains(@href, '/fee-management')]")
	WebElement FeeManagement;
	@FindBy(xpath = "(//span[@class='anticon anticon-arrow-right'])[1]")
	WebElement GeneratePayment;
	@FindBy(xpath = "(//*[text()='Individual'])[1]")
	WebElement Individual;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[2]")
	WebElement ClassSelector;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div/div[1])[1]")
	WebElement SelectClass;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[3]")
	WebElement StudentSelector;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div/div[1])[2]")
	WebElement SelectStudent;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement EnterAmount;
	@FindBy(xpath = "(//div[@class='ant-picker-input'])[2]")
	WebElement DueDate;
	@FindBy(xpath = "(//*[@class='ant-picker-header-next-btn'])[1]")
	WebElement NextMonth;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[10]")
	WebElement SelectDate;
	@FindBy(xpath = "(//input[@class='ant-input'])[3]")
	WebElement EnterDescription;
	@FindBy(xpath = "//div[@class='ant-modal-body']/div/div[5]/div/div[2]/div[2]")
	WebElement ClickDiscount;
	@FindBy(xpath = "//div[@class='ant-modal-body']/div/div[6]/div/div[2]/div[2]")
	WebElement ClickDiscount1;
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement DiscountName;
	@FindBy(xpath = "//textarea[@class='ant-input']")
	WebElement DiscountDetails;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement Amount;
	@FindBy(xpath = "(//button[@class='ant-btn'])[3]")
	WebElement Save;
	@FindBy(xpath = "((//div[@class='ant-modal-body']/div/div[5])/div/div[4]/div[2])[1]")
	WebElement ClickAddition;
	@FindBy(xpath = "//div[@class='ant-modal-body']/div/div[6]/div/div[4]/div[2]")
	WebElement ClickAddition1;
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement AdditionName;
	@FindBy(xpath = "//textarea[@class='ant-input']")
	WebElement AdditionDetails;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement AdditionAmount;
	@FindBy(xpath = "(//button[@class='ant-btn'])[3]")
	WebElement AddSaveButton;
	
	@FindBy(xpath = "//span[@class='anticon anticon-arrow-left']")
	WebElement ClickBackButtoN;

	/******************** generate payment request class ************/

	@FindBy(xpath = "(//*[text()=' Class'])[1]")
	WebElement ClickONclass;
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement ENterAmount;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement DEscription;


	/************ FEEmanagement page ***********/
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[1]")
	WebElement ClickcalenderFilters;
	@FindBy(xpath = "//div[text()='Week']")
	WebElement ClickOnWeeks;
	@FindBy(xpath = "//div[text()='Months']")
	WebElement ClickOnMonths;
	@FindBy(xpath = "//input[@placeholder='Start date']")
	WebElement ClickOnDateCalendars;
	@FindBy(xpath = "(//button[@class='ant-picker-header-prev-btn'])[1]")
	WebElement MonthBack;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[9]")
	WebElement Startdate;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[14]")
	WebElement EndDate;
	@FindBy(xpath = "(//*[@class='ant-picker'])[1]")
	WebElement YearSelector;
	@FindBy(xpath = "(//*[@class='ant-picker-cell-inner'])[1]")
	WebElement Year;

	/******************* Generate OFFLINEPAYMENT **************************/
	
	@FindBy(xpath = "(//span[@class='anticon anticon-arrow-right'])[2]")
	WebElement AddOfflinePaymnet;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[2]")
	WebElement ClickOnClass1;
	@FindBy(xpath = "(//div[@class='rc-virtual-list']/div/div/div/div[1])[1]")
	WebElement SelectClass1;
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement StudentName;
	@FindBy(xpath = "(//div[@class='rc-virtual-list']/div/div/div/div[1])[2]")
	WebElement SelectStudentName;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement EnterDescription1;
	@FindBy(xpath = "(//div[@class='rc-virtual-list']/div/div/div/div[1])[3]")
	WebElement SelectDiscription;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[12]")
	WebElement ClickOnCreate;
	@FindBy(xpath = "(//input[@class='ant-input'])[3]")
	WebElement EnterAmount1;
	@FindBy(xpath = "(//div[@class='ant-picker datePicker'])[1]")
	WebElement PaidDate;
	@FindBy(xpath = "//a[@class='ant-picker-today-btn']")
	WebElement SelectPaidDate;
	@FindBy(xpath = "(//*[text()='Debit/Credit card'])[1]")
	WebElement DebitCreditcard;
	@FindBy(xpath = "(//*[text()='Bank transfer'])[1]")
	WebElement Banktransfer;
	@FindBy(xpath = "(//*[text()='Cheque'])[1]")
	WebElement Cheque;
	@FindBy(xpath = "(//*[text()='UPI'])[1]")
	WebElement UPI;
	@FindBy(xpath = "//*[@class='ant-modal-footer']/button[1]")
	WebElement 	CANCEL;
	@FindBy(xpath = "//*[@class='ant-modal-footer']/button[2]")
	WebElement ADD;
	

	/*********************** Transaction **********************/
	@FindBy(xpath = "//*[@href='/fee-management']")
	WebElement FeeManagement2;
	@FindBy(xpath = "(//span[@class='anticon anticon-arrow-right'])[3]")
	WebElement Transaction;
	@FindBy(xpath = "(//*[@class='anticon anticon-calendar'])[1]")
	WebElement ClickOnCalendar;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range']")
	WebElement StartDate;
	@FindBy(xpath = "(//*[@class='ant-picker-content']/tbody/tr/td)[10]")
	WebElement SlectstartDate;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement ClickOnOk;
	@FindBy(xpath = "(//*[@class='ant-picker-content']/tbody/tr/td)[18]")
	WebElement SelectendDate;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement ClickOk;
	@FindBy(xpath = "//span[text()=' DOWNLOAD REPORT']")
	WebElement ClickOnDownloadReport;
	@FindBy(xpath = "(//input[@placeholder='Select a date'])[1]")
	WebElement SelectStartDate;
	@FindBy(xpath = "//span[@class='ant-picker-prev-icon']")
	WebElement ClickBackButton;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[9]")
	WebElement SelectDate1;
	@FindBy(xpath = "(//input[@placeholder='Select a date'])[2]")
	WebElement SelectEndDate;
	@FindBy(xpath = "(//button[@class='ant-picker-header-prev-btn'])[2]")
	WebElement ClickBackButton1;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[54]")
	WebElement SelectDate2;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement ClickOnDownload1;
	@FindBy(xpath = "(//*[text()=' ADD OFFLINE PAYMENT'])[1]")
	WebElement ClickOnAddOfflinePaymnet;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[1]")
	WebElement Clickclass;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[2]")
	WebElement ClickStudent;
	

	/***************** All Students ******************/
	@FindBy(xpath = "(//span[@class='anticon anticon-arrow-right'])[4]")
	WebElement ClickOnAllStudent;
	@FindBy(xpath = "(//*[@class='scroll-bar-universal'])[1]/div[1]/div/div[1]")
	WebElement ClickClass;
	@FindBy(xpath = "//span[@class='ant-select-selection-search']")
	WebElement ClickcalenderFilter;
	@FindBy(xpath = "//div[text()='Week']")
	WebElement ClickOnWeek;
	@FindBy(xpath = "//span[@class='ant-select-selection-search']")
	WebElement ClickcalenderFilter1;
	@FindBy(xpath = "//div[text()='Months']")
	WebElement ClickOnMonth;
	@FindBy(xpath = "//span[@class='anticon anticon-close-circle']")
	WebElement ClickOnDateCalendar;
	@FindBy(xpath = "(//*[@data-icon='calendar'])[1]")
	WebElement Calendar;
	@FindBy(xpath = "(//*[text()='CANCEL'])[1]")
	WebElement CANCEL1;
	@FindBy(xpath = "(//*[text()='No'])[1]")
	WebElement No;
	@FindBy(xpath = "(//*[text()='Yes'])[1]")
	WebElement Yes;

	/********************** Indiaul student **************/
	@FindBy(xpath = "//input[@class='ant-input']")
	WebElement Serach;
	@FindBy(xpath = "//span[@class='anticon anticon-search']")
	WebElement SeachButton;
	@FindBy(xpath = "//input[@class='ant-checkbox-input']")
	WebElement ClickOnCheckBox;
	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement ClickOnClearAll;
	@FindBy(xpath = "//input[@class='ant-checkbox-input']")
	WebElement ClickOnCheckBox1;
	@FindBy(xpath = "(//button[@class='ant-btn'])[2]")
	WebElement ClickOnGenerate;
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement ClickOnAmountField;
	@FindBy(xpath = "(//div[@class='ant-picker-input'])[2]")
	WebElement Duedate;
	@FindBy(xpath = "//div[@class='ant-picker-footer']")
	WebElement ClickToday;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement Description;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement SendRequest;

	/******************* ClickOnStudentName ****************/
	@FindBy(xpath = "(//div[@style='margin-left: 20px;'])[1]")
	WebElement ClickOnStudentName;
	// @FindBy(xpath="(//span[@class='ant-select-selection-item'])[2]")
	// WebElement ClickOnGender;
	// @FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']//div[1]//div[1]")
	// WebElement SelectGendar;
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	WebElement ClickOnBloodGroup;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[10]")
	WebElement SelectBloodGroup;
	@FindBy(xpath = "(//button[@class='ant-btn'])[2]")
	WebElement Clicksave;
	@FindBy(xpath = "//h3[text()='Course and fee']")
	WebElement ClickOnCourseAndFee;
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	WebElement Clickclass1;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[5]")
	WebElement SelectClaas1;
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement ClickOnSection;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[12]")
	WebElement SelectSection;
	@FindBy(xpath = "//div[text()='+ ADD A COURSE']")
	WebElement ClickOnAddCourse;
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickOnCourseName;
	@FindBy(xpath = "//div[text()='????? ??????']")
	WebElement SelectCourse;
	@FindBy(xpath = "//div[@class='ant-picker-input']")
	WebElement ClickCalendar;
	@FindBy(xpath = "//a[@class='ant-picker-today-btn']")
	WebElement Clicktoday;
	@FindBy(xpath = "(//button[@class='ant-btn'])[4]")
	WebElement Save1;
	@FindBy(xpath = "//span[@class='anticon anticon-arrow-left']")
	WebElement BackButton;

	/****************** FEE Details ******************/
	@FindBy(xpath = "//h3[text()='Fee Details']")
	WebElement ClickOnFeeDetails;
	@FindBy(xpath = "//div[text()='EDIT PLAN']")
	WebElement ClickOnEditPlan;
	@FindBy(xpath = "(//div[@class='flex_row_center'])[12]")
	WebElement ClickOnAddInstalment;
	@FindBy(xpath = "(//div[@class='flex_row_center'])[23]")
	WebElement AddIntsalment;
	@FindBy(xpath = "(//button[@class='ant-btn'])[4]")
	WebElement ClickSAve;

	/***************** view All details ***************/

	@FindBy(xpath = "//div[text()='VIEW ALL']")
	WebElement ClickViewAll;
	@FindBy(xpath = "(//span[@class='ant-typography ant-typography-ellipsis ant-typography-single-line'])[1]")
	WebElement ClikonStudentName;
	@FindBy(xpath = "//button[@class='ant-btn']")
	WebElement ClickOnCancel;
	@FindBy(xpath = "//span[@class='ant-input-affix-wrapper']")
	WebElement ClickOnSearch;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-icon-only ant-input-search-button']")
	WebElement ClickOnSearchButton;
	@FindBy(xpath = "//span[@aria-label='calendar']")
	WebElement ClickOnCalendar1;
	@FindBy(xpath = "//div[@class='ant-popover-inner-content']")
	WebElement StartDate1;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[1]")
	WebElement SlectstartDate1;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement ClickOnOk1;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[2]")
	WebElement SelectendDate1;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement ClickOk1;
	@FindBy(xpath = "//input[@class='ant-input']")
	WebElement ClickSearch;
	@FindBy(xpath = "//span[@class='ant-input-group-addon']")
	WebElement ClickSearchButton;
	@FindBy(xpath = "(//span[@class='ant-input-suffix'])[1]")
	WebElement SearchCancel;
	
	/************* Settings ***************/
	@FindBy(xpath = "//a[contains(@href, '/fee-management')]")
	WebElement FeeManagement4;
	@FindBy(xpath = "//button[@class='ant-btn']")
	WebElement ClickOnSettings;
	@FindBy(xpath = "(//input[@class='ant-radio-input'])[1]")
	WebElement PayableByStudents;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement ClickYes;
	@FindBy(xpath = "//span[@class='anticon anticon-setting']")
	WebElement ClickOnSetting;
	@FindBy(xpath = "(//input[@class='ant-radio-input'])[2]")
	WebElement PayableByInstitute;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement ClickYess;

	// ***View All ***********//
	@FindBy(xpath = "(//div[text()='VIEW ALL'])[2]")
	WebElement View;

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public FeeManagementPage() {
		PageFactory.initElements(driver, this);
	}


	public void validateFeemanagementPage() throws InterruptedException {
		WaitTil(2000);
		FeeManagement.click();
		WaitTil(2000);
		overView();
		WaitTil(2000);
		ClickOnSettings.click();
		WaitTil(2000);
		No.click();
		WaitTil(2000);
		ClickOnSettings.click();
		WaitTil(2000);
		PayableByStudents.click();
		WaitTil(2000);
		Yes.click();
		WaitTil(4000);
		ClickOnSetting.click();
		WaitTil(2000);
		PayableByInstitute.click();
		WaitTil(2000);
		Yes.click();
		

	}
	public void overView()
	{
		WaitTil(2000);
		WebElement ele=driver.findElement(By.xpath("(//div[@class='ant-row'])[1]/div[1]/div/div[1]/div[1]/div[2]"));
		String text=ele.getText();
		System.out.println("Total Requests are:- "+text);
		WebElement ele1=driver.findElement(By.xpath("(//div[@class='ant-row'])[1]/div[1]/div/div[2]/div[1]"));
		String text1=ele1.getText();
		System.out.println("Total Payments Pending Details:- "+text1);
		WebElement ele2=driver.findElement(By.xpath("(//div[@class='ant-row'])[1]/div[1]/div/div[2]/div[2]"));
		String text2=ele2.getText();
		System.out.println("Total Payments Paid Details:- "+text2);
		WebElement ele3=driver.findElement(By.xpath("(//div[@class='ant-row'])[1]/div[1]/div/div[2]/div[3]"));
		String text3=ele3.getText();
		System.out.println("Total Payments OverDue Details:- "+text3);
		WebElement ele4=driver.findElement(By.xpath("(//div[@class='ant-row'])[1]/div[1]/div/div[2]/div[4]"));
		String text4=ele4.getText();
		System.out.println("Total Payments Cancelled Details:- "+text4);
		WebElement ele5=driver.findElement(By.xpath("(//div[@class='ant-row'])[1]/div[1]/div/div[2]/div[5]"));
		String text5=ele5.getText();
		System.out.println("Total Payments Refunded Details:- "+text5);
		WaitTil(2000);
		ClickcalenderFilters.click();
		WaitTil(2000);
		ClickOnWeeks.click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-input ant-picker-input-active'])[1]")).click();
		WaitTil(2000);
		MonthBack.click();
		WaitTil(2000);
		Startdate.click();
		WaitTil(2000);
		EndDate.click();
		WebElement Calender=driver.findElement(By.xpath("//*[@class='careAdminSummaryCard']/div[2]"));
		String cal=Calender.getText();
		System.out.println(cal);
		WaitTil(2000);
		ClickcalenderFilters.click();
		WaitTil(2000);
		ClickOnMonths.click();
		WaitTil(2000);
		YearSelector.click();
		WaitTil(2000);
		Year.click();
		WaitTil(2000);
		WebElement Calender1=driver.findElement(By.xpath("//*[@class='careAdminSummaryCard']/div[2]"));
		String cal1=Calender1.getText();
		System.out.println(cal1);
	}

	public void GeneratePaymentRequest() throws InterruptedException {
		WaitTil(2000);
		FeeManagement.click();
		WaitTil(2000);
		GeneratePayment.click();
		WaitTil(2000);
		Individual.click();
		WaitTil(2000);
		ClassSelector.click();
		WaitTil(2000);
		SelectClass.click();
		WaitTil(2000);
		StudentSelector.click();
		WaitTil(2000);
		SelectStudent.click();
		WaitTil(2000);
		String fee ="123456789";
		Random id = new Random();
		StringBuilder amount = new StringBuilder(4);
		for (int n = 0; n < 4; n++)
		{
			amount.append(fee.charAt(id.nextInt(fee.length())));
		}
		WaitTil(2000);
		EnterAmount.sendKeys(amount);
		WaitTil(2000);
		DueDate.click();
		WaitTil(2000);
		NextMonth.click();
		WaitTil(2000);
		SelectDate.click();
		WaitTil(2000);
	    String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(18);
		for (int n = 0; n < 18; n++)
		{
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription.sendKeys(name);
		WaitTil(2000);
		feeAmount();
		WaitTil(2000);
		SendRequest.click();
		WaitTil(2000);
		UM.popupContent();
		
	}
	public void feeAmount() throws InterruptedException{
		WaitTil(2000);
		WebElement Scrolldown = driver.findElement(By.xpath("(//*[text()='Processing fee'])[1]"));
		WaitTil(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown);
		WaitTil(2000);
		ClickDiscount.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name1 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		DiscountName.sendKeys(name1);
		WaitTil(2000);
		StringBuilder name = new StringBuilder(18);
		for (int n = 0; n < 18; n++)
		{
			
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		DiscountDetails.sendKeys(name);
		WaitTil(2000);
		String fee1 ="123456789";
		Random id1 = new Random();
		StringBuilder amount1 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			amount1.append(fee1.charAt(id1.nextInt(fee1.length())));
		}
		Amount.sendKeys(amount1);
		WaitTil(2000);
		Save.click();
		WaitTil(2000);
		WebElement Scrolldown1 = driver.findElement(By.xpath("(//*[text()='Processing fee'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown1);
		WaitTil(2000);
		ClickAddition.click();
		WaitTil(2000);
		StringBuilder name2 = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			name2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		AdditionName.sendKeys(name2);
		WaitTil(2000);
		AdditionDetails.sendKeys(name);
		WaitTil(2000);
		StringBuilder amount2 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			amount2.append(fee1.charAt(id1.nextInt(fee1.length())));
		}
		AdditionAmount.sendKeys(amount2);
		WaitTil(2000);
		AddSaveButton.click();
	}

	public void PaymentRequestForClass() throws InterruptedException {
		WaitTil(2000);
		FeeManagement.click();
		WaitTil(2000);
		GeneratePayment.click();
		WaitTil(2000);
		ClickONclass.click();
		WaitTil(2000);
		ClassSelector.click();
		WaitTil(2000);
		SelectClass.click();
		WaitTil(2000);
		String fee ="123456789";
		Random id = new Random();
		StringBuilder amount = new StringBuilder(4);
		for (int n = 0; n < 4; n++)
		{
			amount.append(fee.charAt(id.nextInt(fee.length())));
		}
		WaitTil(2000);
		ENterAmount.sendKeys(amount);
		WaitTil(2000);
		DueDate.click();
		WaitTil(2000);
		NextMonth.click();
		WaitTil(2000);
		SelectDate.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(18);
		for (int n = 0; n < 18; n++)
		{
			
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		DEscription.sendKeys(name);
		WaitTil(2000);
		feeAmount();
		WaitTil(2000);
		SendRequest.click();
		WaitTil(2000);
		UM.popupContent();

	}

	/********************** Add OFFLINEPAYMENT *******************/
	public void AddOfflinePaymnet() throws InterruptedException {
		WebElement Scrolldown1 = driver.findElement(By.xpath("(//*[text()=' Add Offline Payment'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown1);
		WaitTil(2000);
		AddOfflinePaymnet.click();
		WaitTil(2000);
		ClickOnClass1.click();
		WaitTil(2000);
		SelectClass1.click();
		WaitTil(2000);
		StudentName.click();
		WaitTil(2000);
		SelectStudentName.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name1 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription1.sendKeys(name1);
		WaitTil(2000);
		SelectDiscription.click();
		WaitTil(2000);
		EnterDescription1.click();
		WaitTil(2000);
		SelectDiscription.click();
		WaitTil(2000);
		String fee ="123456789";
		Random id = new Random();
		StringBuilder amount = new StringBuilder(4);
		for (int n = 0; n < 4; n++)
		{
			amount.append(fee.charAt(id.nextInt(fee.length())));
		}
		WaitTil(2000);
		EnterAmount1.sendKeys(amount);
		WaitTil(2000);
		PaidDate.click();
		WaitTil(2000);
		SelectPaidDate.click();
		WaitTil(2000);
		feeAmount1();
		
	}
	public void feeAmount1() throws InterruptedException{
		WaitTil(2000);
		WebElement Scrolldown = driver.findElement(By.xpath("(//*[text()='Total payable'])[1]"));
		WaitTil(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown);
		WaitTil(2000);
		ClickDiscount1.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name1 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		DiscountName.sendKeys(name1);
		WaitTil(2000);
		StringBuilder name = new StringBuilder(18);
		for (int n = 0; n < 18; n++)
		{
			
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		DiscountDetails.sendKeys(name);
		WaitTil(2000);
		String fee1 ="123456789";
		Random id1 = new Random();
		StringBuilder amount1 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			amount1.append(fee1.charAt(id1.nextInt(fee1.length())));
		}
		Amount.sendKeys(amount1);
		WaitTil(2000);
		Save.click();
		WaitTil(2000);
		WebElement Scrolldown1 = driver.findElement(By.xpath("(//*[text()='Total payable'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown1);
		WaitTil(2000);
		ClickAddition1.click();
		WaitTil(2000);
		StringBuilder name2 = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			name2.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		AdditionName.sendKeys(name2);
		WaitTil(2000);
		AdditionDetails.sendKeys(name);
		WaitTil(2000);
		StringBuilder amount2 = new StringBuilder(3);
		for (int n = 0; n < 3; n++)
		{
			amount2.append(fee1.charAt(id1.nextInt(fee1.length())));
		}
		AdditionAmount.sendKeys(amount2);
		WaitTil(2000);
		AddSaveButton.click();
	}
	public void AddAllOfflinePaymnets() throws InterruptedException {
		WaitTil(2000);
		FeeManagement.click();
		WaitTil(2000);
		AddOfflinePaymnet();
		WaitTil(2000);
		ADD.click();
		WaitTil(2000);
		UM.popupContent();
		WaitTil(2000);
		AddOfflinePaymnet();
		WaitTil(2000);
		DebitCreditcard.click();
		WaitTil(2000);
		ADD.click();
		WaitTil(2000);
		UM.popupContent();
		WaitTil(2000);
		AddOfflinePaymnet();
		WaitTil(2000);
		Banktransfer.click();
		WaitTil(2000);
		ADD.click();
		WaitTil(2000);
		UM.popupContent();
		WaitTil(2000);
		AddOfflinePaymnet();
		WaitTil(2000);
		Cheque.click();
		WaitTil(2000);
		ADD.click();
		WaitTil(2000);
		UM.popupContent();
		WaitTil(2000);
		AddOfflinePaymnet();
		WaitTil(2000);
		UPI.click();
		WaitTil(2000);
		ADD.click();
		WaitTil(2000);
		UM.popupContent();
	
	}

	/***************** Transaction *****************/

	public void Transaction() throws InterruptedException {
		WaitTil(2000);
		FeeManagement2.click();
		WaitTil(2000);
		WebElement Scrolldown1 = driver.findElement(By.xpath("(//*[text()=' Add Offline Payment'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown1);
		WaitTil(2000);
		Transaction.click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[@class='anticon anticon-caret-down'])[1]")).click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='Online'])[1]")).click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='Offline'])[1]")).click();
		WaitTil(2000);
		ClickOnCalendar.click();
		WaitTil(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='dropmenuBp']"));
		int elesize = ele.size();
		for (int i = 0; i < elesize; i++) {
			WaitTil(1000);
			ele.get(i).click();
		}
		WaitTil(2000);
		StartDate.click();
		WaitTil(2000);
		SlectstartDate.click();
		WaitTil(2000);
		ClickOnOk.click();
		WaitTil(2000);
		SelectendDate.click();
		WaitTil(2000);
		ClickOk.click();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='CLEAR ALL'])[1]")).click();
		WaitTil(2000);
		System.out.println("--------completed -----------");
		/*
		ClickOnDownloadReport.click();
		List<WebElement> RadioButton = driver.findElements(By.xpath("//*[@class='ant-radio-wrapper']"));
		int size1 = RadioButton.size();
		WaitTil(2000);
		//WebElement Scrolldown2 =CANCEL1;
	//	js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown2);
	//	CANCEL1.click();
		WaitTil(2000);
		for (int i = 0; i < size1; i++) {
			WaitTil(2000);
			ClickOnDownloadReport.click();
			WaitTil(2000);
			RadioButton.get(i).click();
			WaitTil(2000);
			driver.findElement(By.xpath("(//*[text()='DOWNLOAD'])[1]")).click();

		}
		*/
		WaitTil(2000);
		ClickOnDownloadReport.click();
		WaitTil(2000);
        driver.findElement(By.xpath("//*[@class='ant-radio-wrapper'][1]")).click();
        WaitTil(2000);
		/*
		SelectStartDate.click();
		Thread.sleep(2000);
		ClickBackButton.click();
		Thread.sleep(2000);
		SelectDate1.click();
		Thread.sleep(2000);
		SelectEndDate.click();
		Thread.sleep(2000);
		ClickBackButton1.click();
		Thread.sleep(2000);
		SelectDate2.click();
		*/
		ClickOnDownload1.click();
		WaitTil(2000);
		AddOfflinePaymnet1() ;
		WaitTil(2000);
		ADD.click();
		WaitTil(2000);
		UM.popupContent();
		WaitTil(2000);
		BackButton.click();
	}
	public void AddOfflinePaymnet1() throws InterruptedException {
		WaitTil(2000);
		ClickOnAddOfflinePaymnet.click();
		WaitTil(2000);
		Clickclass.click();
		WaitTil(2000);
		SelectClass1.click();
		WaitTil(2000);
		ClickStudent.click();
		WaitTil(2000);
		SelectStudentName.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name1 = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name1.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		EnterDescription1.sendKeys(name1);
		WaitTil(2000);
		SelectDiscription.click();
		WaitTil(2000);
		String fee ="123456789";
		Random id = new Random();
		StringBuilder amount = new StringBuilder(4);
		for (int n = 0; n < 4; n++)
		{
			amount.append(fee.charAt(id.nextInt(fee.length())));
		}
		WaitTil(2000);
		EnterAmount1.sendKeys(amount);
		WaitTil(2000);
		PaidDate.click();
		WaitTil(2000);
		SelectPaidDate.click();
		WaitTil(2000);
	
		
	}

	public void studentAll() throws InterruptedException {
		WaitTil(2000);
		FeeManagement.click();
		WaitTil(2000);
		WebElement Scrolldown1 = driver.findElement(By.xpath("(//*[text()=' Add Offline Payment'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown1);
		WaitTil(2000);
		ClickOnAllStudent.click();
		WaitTil(2000);
		List<WebElement> Classcount = driver.findElements(By.xpath("//div[@class='box-shadow']"));
		int count = Classcount.size();
		System.out.println("---------count of the section ---------" + count);
		WaitTil(2000);
		ClickClass.click();
		WaitTil(2000);
		overView();
		WaitTil(2000);
		generateRequestInClass();
		WaitTil(2000);
		WebElement ele=driver.findElement(By.xpath("(//*[@class='box-shadow'])[1]/div/div/span[1]"));
		String text=ele.getText();
		System.out.println(text);
		String exp="(0)";
		if(exp.equals(text)) {
	
		System.out.println("No Recent activities Are in The Class");
		}
		else {
		recentActivitiesInClass();
		WaitTil(2000);
		BackButton.click();
		}
		WaitTil(2000);
		searchName();
		WaitTil(2000);
		BackButton.click();
		WaitTil(2000);
		BackButton.click();
		

	}
	public void generateRequestInClass()
	{
		WebElement ele=driver.findElement(By.xpath("//*[@class='ant-layout-content']/div/div[3]/div[1]"));
		String text=ele.getText();
		System.out.println(text);
		String exp="All students (0)";
		if(exp.equals(text)) {
	
		System.out.println("No Students Are there");
		}
		else {
			WaitTil(2000);
			ClickOnCheckBox.click();
			WaitTil(2000);
			ClickOnClearAll.click();
			WaitTil(2000);
			ClickOnCheckBox1.click();
			WaitTil(2000);
			ClickOnGenerate.click();
			WaitTil(2000);
			String fee ="123456789";
			Random id = new Random();
			StringBuilder amount = new StringBuilder(4);
			for (int n = 0; n < 4; n++)
			{
				amount.append(fee.charAt(id.nextInt(fee.length())));
			}
			ClickOnAmountField.sendKeys(amount);
			WaitTil(2000);
			Duedate.click();
			WaitTil(2000);
			ClickToday.click();
			WaitTil(2000);
			String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random rnd = new Random();
			StringBuilder name1 = new StringBuilder(8);
			for (int n = 0; n < 8; n++)
			{
				name1.append(captals.charAt(rnd.nextInt(captals.length())));
			}
			Description.sendKeys(name1);
			WaitTil(2000);
			SendRequest.click();
			WaitTil(2000);
			UM.popupContent();
		}
	}
	public void recentActivitiesInClass()
	{
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='VIEW ALL'])[1]")).click();
		WaitTil(2000);
		Calendar.click();
		WaitTil(2000);
		List<WebElement> boxes1 = driver.findElements(By.xpath("//*[@class='dropmenuBp']"));
		int boxSize1 = boxes1.size();
		System.out.println("The size of the element is: " + boxSize1);
		for (int i = 0; i <boxSize1; i++) {
			WaitTil(2000);
			boxes1.get(i).click();
			System.out.println("The number of check boxes selected are:" + i);
		}
		driver.findElement(By.xpath("(//*[@class='anticon anticon-caret-down'])[1]")).click();
		List<WebElement> boxes = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int boxSize = boxes.size();
		System.out.println("The size of the element is: " + boxSize);
		for (int i = 0; i <boxSize; i++) {
			WaitTil(2000);
			boxes.get(i).click();
			System.out.println("The number of check boxes selected are:" + i);
		}
	    driver.navigate().refresh();
	    WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='Pending'])[1]")).click();
		WaitTil(2000);
		WebElement Scrolldown2 = driver.findElement(By.xpath("(//*[text()='Action'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown2);
		WaitTil(2000);
		CANCEL1.click();
		WaitTil(2000);
		No.click();
		WaitTil(2000);
		WebElement Scrolldown4 = driver.findElement(By.xpath("(//*[text()='Action'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown4);
		WaitTil(2000);
		CANCEL1.click();
		WaitTil(2000);
		Yes.click();
		UM.popupContent();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='Cancelled'])[1]")).click();
		WaitTil(2000);
		WebElement Scrolldown3 = driver.findElement(By.xpath("(//*[text()='Processing fee'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)",  Scrolldown3);
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[text()='CLOSE'])[1]")).click();
		WaitTil(2000);
		searchName();
		
		
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
		ClickSearch.sendKeys(name);
		WaitTil(2000);
		ClickSearchButton.click();
		WaitTil(2000);
		SearchCancel.click();
		WaitTil(2000);
	}

	public void recentActivity() throws InterruptedException {
		WaitTil(2000);
		FeeManagement.click();
		WaitTil(2000);
		recentActivitiesInClass();
		WaitTil(2000);
		driver.findElement(By.xpath("(//*[@class='classFilter'])[1]")).click();
		WaitTil(2000);
		List<WebElement> boxes1 = driver.findElements(By.xpath("//*[@class='ant-checkbox-input']"));
		int boxSize1 = boxes1.size();
		System.out.println("The size of the element is: " + boxSize1);
		for (int i = 0; i <6; i++) {
			WaitTil(2000);
			boxes1.get(i).click();
			System.out.println("The number of check boxes selected are:" + i);
		}
		WaitTil(2000);
		BackButton.click();
		
	}

	


	

	

}
