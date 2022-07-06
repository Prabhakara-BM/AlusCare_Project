package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class CoursePage extends Aulas_Base.BaseTest
{
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[1]/li[4]")
	WebElement Course;
	@FindBy(xpath="//button[@class='ant-btn']")
	WebElement AddCourse;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement CourseName;
	@FindBy(xpath="(//input[@class='ant-input'])[4]")
	WebElement CourseDuration;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
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
	@FindBy(xpath="//div[text()='Annually']")
	WebElement AnnuallyPlan;
	@FindBy(xpath="(//div[text()='One time'])[2]")
	WebElement OneTimePlan;
	@FindBy(xpath="//div[text()='One time']")
	WebElement OneTimePlan1;
	@FindBy(xpath="//div[text()='Customize']")
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
	@FindBy(xpath="(//button[@class='ant-btn'])[2]")
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
	
	
	public CoursePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CourseModule() throws InterruptedException
	{

	// Year Monthly
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Selenium Java Course");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" Selenium is a automated testing framework");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan1 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan1);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		MonthlyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
	//Year QuarterlyPlan
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Android Development");
		Thread.sleep(2000);
		CourseDuration.sendKeys("2");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning. Develop your Android App with No Coding.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan2 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan2);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		QuarterlyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
	// Year 	HalfYearlyPlan
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("IOS Development");
		Thread.sleep(2000);
		CourseDuration.sendKeys("3");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan3 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan3);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		HalfYearlyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
	// Year AnnuallyPlan
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Web Development");
		Thread.sleep(2000);
		CourseDuration.sendKeys("4");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan5 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan5);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		AnnuallyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
	// Year One time Plan
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("JEE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan6 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan6);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan1.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
	// Year  Customize
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("AZURE COURSE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan7 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan7);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		CustomizePlan.click();
		Thread.sleep(2000);
		FirstInstalment.sendKeys("10000");
		Thread.sleep(2000);
		ADDINSTALLMENT.click();
		Thread.sleep(2000);
		SecondInstalment.sendKeys("10000");
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
	// Month one time plan
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Automation Testing");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys("This automation test engineer training program is designed to provide you with a complete knowledge of software testing technologies such as Selenium Web Driver, TestNG, Maven, AutoIT, Selenium Grid, Appium, and Docker to help you build a robust testing framework.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan8 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan8);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
	// Month Customize
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("AZURE COURSE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan9 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan9);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		CustomizePlan.click();
		Thread.sleep(2000);
		FirstInstalment.sendKeys("10000");
		Thread.sleep(2000);
		ADDINSTALLMENT.click();
		Thread.sleep(2000);
		SecondInstalment.sendKeys("10000");
		Thread.sleep(2000);
		AddButton.click();
	// Day one time
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("GRAPHIC DESIGN");
		Thread.sleep(2000);
		CourseDuration.sendKeys("20");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInDays.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan10 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan10);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan.click();
		Thread.sleep(2000);
		AddButton.click();
	// Day customize
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("GRAPHIC DESIGN");
		Thread.sleep(2000);
		CourseDuration.sendKeys("20");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInDays.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		WebElement CourseFeePlan11 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan11);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
    // Search course
		Course.click();
		Thread.sleep(2000);
		CourseSearch.sendKeys("Automation Testing");
		Thread.sleep(2000);
		CourseSearchButton.click();
		Thread.sleep(2000);
	// Course Update
		Course.click();
		Thread.sleep(2000);
		OpenCourse.click();
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		WebElement CourseFeePlan12 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan12);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		MonthlyPlan.click();
		Thread.sleep(2000);
		CourseUpdate.click();
		Thread.sleep(3000);
	// Course Delete
		Course.click();
		Thread.sleep(3000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteYes.click();
		Thread.sleep(1000);
		Course.click();
		Thread.sleep(3000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteNo.click();
		Thread.sleep(1000);
		Course.click();
		Thread.sleep(3000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteNo.click();
		Thread.sleep(1000);
	// Cancel Course
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
	}
	

















	
	public void ClickonCourse() throws InterruptedException
	{
		Thread.sleep(1000);
		Course.click();
		Thread.sleep(1000);

	}
	
	
	public void AddCourse() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Automation Testing");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys("This automation test engineer training program is designed to provide you with a complete knowledge of software testing technologies such as Selenium Web Driver, TestNG, Maven, AutoIT, Selenium Grid, Appium, and Docker to help you build a robust testing framework.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void CancelCourse() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		
	}
	public void AddCourseMonthlyPlanforYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Selenium Java Course");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" Selenium is a automated testing framework");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		MonthlyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseQuarterlyPlanforYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Android Development");
		Thread.sleep(2000);
		CourseDuration.sendKeys("2");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning. Develop your Android App with No Coding.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		QuarterlyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseHalfYearlyPlanforYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("IOS Development");
		Thread.sleep(2000);
		CourseDuration.sendKeys("3");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		HalfYearlyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseAnnuallyPlanforYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("Web Development");
		Thread.sleep(2000);
		CourseDuration.sendKeys("4");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		AnnuallyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseOneTimePlanforYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("JEE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan1.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseCustomizePlanforYear() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("NEET");
		Thread.sleep(2000);
		CourseDuration.sendKeys("2");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		CustomizePlan.click();
		Thread.sleep(2000);
		FirstInstalment.sendKeys("10000");
		Thread.sleep(2000);
		ADDINSTALLMENT.click();
		Thread.sleep(2000);
		SecondInstalment.sendKeys("10000");
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseOneTimePlanforMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("AWS COURSE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("2");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(4000);
		OneTimePlan1.click();
		//driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[5]")).click();
		Thread.sleep(4000);
		AddButton.click();
	}
	public void AddCourseCustomizePlanforMonth() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("AZURE COURSE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("1");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		CustomizePlan.click();
		Thread.sleep(2000);
		FirstInstalment.sendKeys("10000");
		Thread.sleep(2000);
		ADDINSTALLMENT.click();
		Thread.sleep(2000);
		SecondInstalment.sendKeys("10000");
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseOneTimePlanforDay() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("GRAPHIC DESIGN");
		Thread.sleep(2000);
		CourseDuration.sendKeys("20");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInDays.click();
		Thread.sleep(2000);
		Description.sendKeys("  We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan.click();
		Thread.sleep(2000);
		AddButton.click();
	}
	public void AddCourseCustomizePlanforDay() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys("DRAWING COURSE");
		Thread.sleep(2000);
		CourseDuration.sendKeys("25");
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInDays.click();
		Thread.sleep(2000);
		Description.sendKeys(" We make Building Software as Easy to Learning.");
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys("20000");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		CustomizePlan.click();
		Thread.sleep(2000);
		FirstInstalment.sendKeys("10000");
		Thread.sleep(2000);
		ADDINSTALLMENT.click();
		Thread.sleep(2000);
		SecondInstalment.sendKeys("10000");
		Thread.sleep(2000);
		AddButton.click();
	}
	
	public void SearchCourse() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		CourseSearch.sendKeys("Automation Testing");
		Thread.sleep(2000);
		CourseSearchButton.click();
		Thread.sleep(2000);
		
	}
	
	public void CourseUpdate() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		OpenCourse.click();
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		MonthlyPlan.click();
		Thread.sleep(2000);
		CourseUpdate.click();
		Thread.sleep(3000);
		
	}
	public void CourseDeleteYes() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(3000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteYes.click();
		Thread.sleep(1000);
	}
	public void CourseDeleteNo() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(3000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteNo.click();
		Thread.sleep(1000);
	}
	public void CourseBack() throws InterruptedException
	{
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(3000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteNo.click();
		Thread.sleep(1000);
	}
	
	/*
	public void addCourse(String name) {
		
		driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys(name);
		Thread.sleep(2000);		
	}
	
	
	public void alretHandles() {
		try{
			   //Wait 10 seconds till alert is present
			WebDriver driver = new ChromeDriver()
			   WebDriverWait wait = new WebDriverWait(driver,10);
			   Alert alert = wait.until(ExpectedConditions.alertIsPresent());

			   //Accepting alert.
			   alert.accept();
			   System.out.println("Accepted the alert successfully.");
			}catch(Throwable e){
			   System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
			}
		*/
	}
	
	//}

		
	
