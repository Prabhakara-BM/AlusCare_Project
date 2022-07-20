package Pages;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Aulas_Base.BaseTest;

public class CoursePage extends BaseTest
{
	@FindBy(xpath="//a[@href ='/course']")
	WebElement Course;
	@FindBy(xpath="(//button[@class='ant-btn'])[1]")
	WebElement AddCourse;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement CourseName;
	@FindBy(xpath="(//input[@class='ant-input'])[4]")
	WebElement CourseDuration;
	@FindBy(xpath="//*[@class='ant-modal-body']/div/div[2]/div[2]/div[2]/div[2]/div/div")
	WebElement CourseDurationIn;
	@FindBy(xpath="//div[text()='Day(s)']")
	WebElement CourseDurationInDays;
	@FindBy(xpath="//div[text()='Month(s)']")
	WebElement CourseDurationInMonths;
	@FindBy(xpath="//div[text()='Year(s)']")
	WebElement CourseDurationInYears;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement Description;
	@FindBy(xpath="(//div[@class='ant-picker datePicker'])[1]")
	WebElement StartDate;
	@FindBy(xpath="(//button[@class='ant-picker-header-next-btn'])[1]")
	WebElement NextMonth;
	@FindBy(xpath="(//div[@class='ant-picker-cell-inner'])[9]")
	WebElement Date1;
	@FindBy(xpath="(//div[@class='ant-picker datePicker'])[2]")
	WebElement EndDate;
	@FindBy(xpath="(//button[@class='ant-picker-header-super-next-btn'])[2]")
	WebElement NextYear;
	@FindBy(xpath="(//div[@class='ant-picker-cell-inner'])[71]")
	WebElement Date2;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement TotalCourseFee;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement BillingPlan;
	@FindBy(xpath="//div[text()='Monthly']")
	WebElement MonthlyPlan;
	@FindBy(xpath="//div[text()='Quarterly']")
	WebElement QuarterlyPlan;
	@FindBy(xpath="//div[text()='Half Yearly']")
	WebElement HalfYearlyPlan;
	@FindBy(xpath="(//div[text()='Annually'])[1]")
	WebElement AnnuallyPlan;
	@FindBy(xpath="(//div[text()='One time'])[1]")
	WebElement OneTimePlan;
	@FindBy(xpath="//div[text()='One time']")
	WebElement OneTimePlan1;
	@FindBy(xpath="(//div[text()='Customize'])[1]")
	WebElement CustomizePlan;
	@FindBy(xpath="(//input[@class='ant-input'])[5]")
	WebElement FirstInstalment;
	@FindBy(xpath="//div[text()='+ADD INSTALLMENT']")
	WebElement ADDINSTALLMENT;
	@FindBy(xpath="(//input[@class='ant-input'])[6]")
	WebElement SecondInstalment;
	@FindBy(xpath="(//button[@class='ant-btn'])[2]")
	WebElement CancelButton;
	@FindBy(xpath="(//button[@class='ant-btn'])[3]")
	WebElement AddButton;
	//**************Deletecourse********************//
	@FindBy(xpath="(//div[@class='box-shadow courseCardB'])[1]")
	WebElement OpenCourse;
	@FindBy(xpath="(//*[text()='UPDATE'])[1]")
	WebElement CourseUpdate;
	@FindBy(xpath="//div[@class='ant-page-header-back-button']")
	WebElement BackButton;
	
	
	@FindBy(xpath="(//button[@class='ant-btn'])[1]")
	WebElement CourseDelete;
	@FindBy(xpath="//span[@class='ant-input-affix-wrapper ant-input-affix-wrapper-lg']/input")
	WebElement CourseSearch;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-lg ant-btn-icon-only ant-input-search-button']")
	WebElement CourseSearchButton;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement CourseDeleteYes;
	@FindBy(xpath="(//button[@class='ant-btn'])[3]")
	WebElement CourseDeleteNo;
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	public CoursePage()
	{
		PageFactory.initElements(driver, this);
	}
	UserManagementPage UM=new UserManagementPage();
	
	public void ClickonCourse() throws InterruptedException
	{
		WaitTil(2000);
		Course.click();
		WaitTil(2000);

	}
	public void CancelCourse() throws InterruptedException
	{
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		WaitTil(2000);
		AddCourse.click();
		WaitTil(2000);
		CancelButton.click();
		WaitTil(2000);
		
	}
	 public void CourseCreation() throws InterruptedException
	    {
			AddCourse.click();
			WaitTil(2000);
			String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
					Random rnd = new Random();
					StringBuilder name = new StringBuilder(8);
					for (int n = 0; n < 8; n++)
					{
						name.append(captals.charAt(rnd.nextInt(captals.length())));
					}
			CourseName.sendKeys(name);
			WaitTil(2000);
			String captals1 = "123456789";
					Random rnd1 = new Random();
					StringBuilder Duration = new StringBuilder(2);
					for (int n = 0; n < 2; n++)
					{
						Duration.append(captals1.charAt(rnd1.nextInt(captals1.length())));
					}
			CourseDuration.sendKeys(Duration);
			WaitTil(2000);
    		CourseDurationIn.click();
    		WaitTil(2000);
    		CourseDurationInMonths.click();
    		WaitTil(2000);
			StringBuilder Des = new StringBuilder(15);
			for (int n = 0; n < 15; n++)
			{
				Des.append(captals.charAt(rnd.nextInt(captals.length())));
			}
			Description.sendKeys(Des);
			WaitTil(2000);
			StartDate.click();
			WaitTil(2000);
			NextMonth.click();
			WaitTil(2000);
			Date1.click();
			WaitTil(2000);
			StringBuilder Fee = new StringBuilder(5);
			for (int n = 0; n < 5; n++)
			{
				Fee.append(captals1.charAt(rnd1.nextInt(captals1.length())));
			}
			TotalCourseFee.sendKeys(Fee);
			WaitTil(2000);
			WebElement Billingplan = driver.findElement(By.xpath("//*[text()='Billing plan']"));
			js.executeScript("arguments[0].scrollIntoView(true)", Billingplan);
			WaitTil(2000);
			BillingPlan.click();
			WaitTil(2000);
			CustomizePlan.click();
			WaitTil(2000);
			StringBuilder Fee1 = new StringBuilder(3);
			for (int n = 0; n < 3; n++) {
				Fee1.append(captals1.charAt(rnd1.nextInt(captals1.length())));
			}
			FirstInstalment.sendKeys(Fee1);
			WaitTil(2000);
			ADDINSTALLMENT.click();
			WaitTil(2000);
			SecondInstalment.sendKeys(Fee1);
			WaitTil(2000);
			AddButton.click();
			WaitTil(2000);
			UM.popupContent();
			
	    	}

	
	public void SearchCourse() throws InterruptedException
	{
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		WaitTil(2000);
		CourseSearch.sendKeys(name);
		WaitTil(2000);
		CourseSearchButton.click();
		WaitTil(2000);
		
	}
	
	public void CourseUpdate() throws InterruptedException
	{
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		OpenCourse.click();
		WaitTil(2000);
		String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random rnd = new Random();
				StringBuilder name = new StringBuilder(8);
				for (int n = 0; n < 8; n++)
				{
					name.append(captals.charAt(rnd.nextInt(captals.length())));
				}
	    WebElement CourseName1=CourseName;
	    CourseName1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    CourseName1.sendKeys(Keys.DELETE);
	    WaitTil(2000);
		CourseName1.sendKeys(name);
		WaitTil(2000);
		String captals1 = "123456789";
				Random rnd1 = new Random();
				StringBuilder Duration = new StringBuilder(2);
				for (int n = 0; n < 2; n++)
				{
					Duration.append(captals1.charAt(rnd1.nextInt(captals1.length())));
				}
	    WebElement CourseDuration1=CourseDuration;
	    CourseDuration1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    CourseDuration1.sendKeys(Keys.DELETE);
		WaitTil(2000);	
		CourseDuration1.sendKeys(Duration);
		WaitTil(2000);
		StringBuilder Des = new StringBuilder(15);
		for (int n = 0; n < 15; n++)
		{
			Des.append(captals.charAt(rnd.nextInt(captals.length())));
		}
		Description.sendKeys(Des);
		WaitTil(2000);
		/*
		CourseDurationIn.click();
		WaitTil(2000);
		CourseDurationInYears.click();
		WaitTil(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	WaitTil(2000);
		BillingPlan.click();
		WaitTil(2000);
		MonthlyPlan.click();
		WaitTil(2000);
		*/
		CourseUpdate.click();
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		WaitTil(2000);
		
	}
	public void CourseDelete() throws InterruptedException
	{
		WaitTil(2000);
		Course.click();
		WaitTil(2000);
		OpenCourse.click();
		WaitTil(2000);
		CourseDelete.click();
		WaitTil(2000);
		CourseDeleteNo.click();
		WaitTil(2000);
		CourseDelete.click();
		WaitTil(2000);
		CourseDeleteYes.click();
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		WaitTil(2000);
	}

	
	
	
	
	
	}
	
	

		
	
