package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


//import Aulas_Base.TestBase;

public class ClassroomPage extends Aulas_Base.BaseTest
{
	//Actions ac;
	@FindBy(xpath="//div[text()='Automation Testing']")
	WebElement AutomationClass;
	@FindBy(xpath="//div[text()='CSE']")
	WebElement CSESection;
	@FindBy(xpath="//*[contains(@href, '/classroom')]")
	WebElement Classrooms;
	@FindBy(xpath="//span[text()='Create New Class']")
	WebElement CreateClassButton;
	@FindBy(xpath="(//div[contains(@class,'m')]/input)[1]")
	WebElement ClassNameField;
	@FindBy(xpath="(//div[contains(@class,'m')]/input)[2]")
	WebElement SectionField;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement CourseSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Course1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary btn-radius-15__height-38']")
	WebElement Createbutton;
	@FindBy(xpath="//span[text()='Add Now']")
	WebElement AddNowbutton;
	@FindBy(xpath="//span[text()='Maybe Later']")
	WebElement MaybeLaterbutton;
	///*************Create Subjects*******************///
	@FindBy(xpath="//span[text()='Create']")
	WebElement CreateSubjectbutton;
	@FindBy(xpath="(//input[contains(@class,'ant')])[1]")
	WebElement AddSubjectName1;
	@FindBy(xpath="//div[text()='+ Add Another Subject']")
	WebElement AddanotherSubject;
	@FindBy(xpath="//input[contains(@class,'ant')][2]")
	WebElement AddSubjectName2;
	@FindBy(xpath="(//span[text()='Create'])[2]")
	WebElement Create;
	///*********Add Chapters**************************///
	@FindBy(xpath="(//div[text()='+ Add Chapters'])[1]")
	WebElement AddChapters;
	@FindBy(xpath="(//input[@class='ant-input input-text-grey m-t-10'])[1]")
	WebElement ChapterName1;
	@FindBy(xpath="//div[text()='+ Add Another Chapter']")
	WebElement AddAnotherChapterBtn;
	@FindBy(xpath="(//input[@class='ant-input input-text-grey m-t-10'])[2]")
	WebElement ChapterName2;
	@FindBy(xpath="//span[text()='Add']")
	WebElement Add;
	@FindBy(xpath="(//div[@class='box-sequare__batch r-c-c-c cursor-pointer'])[1]")
	WebElement ClickonClass;
	@FindBy(xpath="//span[text()='Browse']")
	WebElement ClickBrowse;
	//*******************Resources ***************************//
	@FindBy(xpath="(//div[@class='r-c-c-c box-sequare__resources cursor-pointer'])[1]")
	WebElement ClickonSection;
	@FindBy(xpath="//span[text()='Add to Section']")
	WebElement AddtoSection;
	@FindBy(xpath="(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement Subject1;
	@FindBy(xpath="(//label[@class='ant-checkbox-wrapper'])[2]")
	WebElement Subject2;
	@FindBy(xpath="(//label[@class='ant-checkbox-wrapper'])[3]")
	WebElement Subject3;
	@FindBy(xpath="//span[text()='Yes']")
	WebElement YesButton;
	@FindBy(xpath="//span[text()='No']")
	WebElement NoButton;
	@FindBy(xpath="(//div[@class='ant-collapse-header'])[1]")
	WebElement ChaptersOpen;
	@FindBy(xpath="//div[@class='cursor-pointer m-r-20']")
	WebElement ResourcesBack;
	//***************Edit Curriculum*******************//
	@FindBy(xpath="//span[text()='Edit Curriculum']")
	WebElement EditCurriculum;
	@FindBy(xpath="(//div[@class='r-jsb m-b-20 cursor-pointer'])[1]")
	WebElement ClickSubject;
	@FindBy(xpath="//div[@class='text-mdl']")
	WebElement EditIcon;
	@FindBy(xpath="//input[contains(@class,'ant-input')]")
	WebElement Edittextfield;
	@FindBy(xpath="//span[text()='Save']")
	WebElement Savebutton;
	@FindBy(xpath="//div[@class='text-mdl m-l-20']")
	WebElement DeleteICon;
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement ConfirmButton;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancelbutton;
	@FindBy(xpath="//div[@class='ant-dropdown-trigger r-c-c icon-round-bg__grey cursor-pointer']")
	WebElement Dottedbutton;
	@FindBy(xpath="(//span[@class='ant-dropdown-menu-title-content'])[1]")
	WebElement BrowseSubjects;
	     //-----> Resources Page ---->
	@FindBy(xpath="(//span[@class='ant-dropdown-menu-title-content'])[2]")
	WebElement CreateSubject;
	      //----> Create Subjects ---->
	@FindBy(xpath="//button[@class='ant-btn btn-radius-15__height-38 m-r-20 dark-grey']")
	WebElement EditChapters1;
	@FindBy(xpath="(//span[@class='ant-checkbox'])[1]")
	WebElement SelectChapter1;
	@FindBy(xpath="(//input[@class='ant-input input-text-grey m-l-20'])[1]")
	WebElement EditChapter1;
	@FindBy(xpath="//span[text()='Done']")
	WebElement Done;
	@FindBy(xpath="//span[text()='Delete']")
	WebElement Delete;
	@FindBy(xpath="(//div[contains(@class,'cursor')])[2]")
	WebElement LeftArrowbutton;
	
	///**************Add Students **************************//
	@FindBy(xpath="(//span[text()='Add Students'])[1]")
	WebElement AddStudentsbutton;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement SearchByName;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelStudentName;
	@FindBy(xpath="//span[text()='Add']")
	WebElement Addbutton;
	
	///*************View Deatils  **************///
	@FindBy(xpath="//div[text()='View Details']")
	WebElement ViewDetails;
	@FindBy(xpath="//span[contains(@class,'ant-input-affix-wrapper-lg')]")
	WebElement SearchStuName;
	@FindBy(xpath="(//span[@class='ant-checkbox'])[2]")
	WebElement SelectStudent1;
	@FindBy(xpath="//span[text()='Transfer']")
	WebElement Transfer;
	@FindBy(xpath="//div[@class='r-c-c icon-square-bg__yellow cursor-pointer m-r-20 ant-tooltip-open']")
	WebElement TransferIcon;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	WebElement StandardSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectClass1;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement SectionSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[11]")
	WebElement Section1;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancel;
	@FindBy(xpath="(//span[text()='Transfer'])[2]")
	WebElement Transferbutton1;
	@FindBy(xpath="//span[text()='Unassign']")
	WebElement Unassign;
	@FindBy(xpath="//div[@class='r-c-c icon-square-bg__red cursor-pointer ant-tooltip-open']")
	WebElement UnassignIcon;
	@FindBy(xpath="//span[text()='Yes']")
	WebElement Yes;
	@FindBy(xpath="//span[text()='No']")
	WebElement No;

	///*********** Puls Icon ******************************///
	@FindBy(xpath="(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[2]")
	WebElement PlusIcon;
	@FindBy(xpath="(//span[@class='ant-checkbox'])[1]")
	WebElement CloneSubject1;
	@FindBy(xpath="//input[@class='ant-input input-text-grey']")
	WebElement NewSectionName;
	@FindBy(xpath="//div[@class='ant-select ant-select-auto-complete input-text-grey autoCompleteClassroom ant-select-single ant-select-show-search']")
	WebElement CourseNameSelector;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Course;
	@FindBy(xpath="//span[text()='Clone']")
	WebElement CloneButton;
	/////**********Class Edit Icon****************///
	@FindBy(xpath="(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[1]")
	WebElement ClassEditIcon;
	@FindBy(xpath="//input[@class='ant-input input-text-grey']")
	WebElement ClassName;
	@FindBy(xpath="//div[@class='r-c-c icon-square-bg__yellow cursor-pointer m-l-20 m-r-20 ant-tooltip-open']")
	WebElement TransferIcon1;
	@FindBy(xpath="//label[@class='ant-checkbox-wrapper m-b-20']")
	WebElement KeeptheSubjects;
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement Confirm;
	@FindBy(xpath="(//span[text()='Cancel'])[2]")
	WebElement Cancel1;
	@FindBy(xpath="//span[text()='Save']")
	WebElement Save;
	
    /////**********Section Edit Icon****************///
	@FindBy(xpath="(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[1]")
	WebElement SectionEditIcon;
	@FindBy(xpath="(//input[@class='ant-input input-text-grey'])[1]")
	WebElement ClassName1;
	@FindBy(xpath="(//input[@class='ant-input input-text-grey'])[2]")
	WebElement SectionName1;
	@FindBy(xpath="//span[text()='Update']")
	WebElement Update;
	
	
	
	
	public ClassroomPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void ClickonClassrooms() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
	}
	public void CreateaNewClass() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		CreateClassButton.click();
		Thread.sleep(2000);
		ClassNameField.sendKeys(generateRandomPassword(6));
		Thread.sleep(2000);
		SectionField.sendKeys(generateRandomPassword(1));
		Thread.sleep(2000);
		CourseSelector.click();
		Thread.sleep(2000);
		Course1.click();
		Thread.sleep(2000);
		Createbutton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ant-btn btn-radius-15__height-38 m-r-50 dark-grey']")).click();
		//driver.findElement(By.xpath("")).click();
	}
	public void CreateaNewClass1() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		CreateClassButton.click();
		Thread.sleep(2000);
		ClassNameField.sendKeys(generateRandomPassword(6));
		Thread.sleep(2000);
		SectionField.sendKeys(generateRandomPassword(1));
		Thread.sleep(2000);
		CourseSelector.click();
		Thread.sleep(2000);
		Course1.click();
		Thread.sleep(2000);
		Createbutton.click();
		Thread.sleep(2000);
		AddNowbutton.click();
		Thread.sleep(2000);
	}
	public void CreateaNewClass2() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		CreateClassButton.click();
		Thread.sleep(2000);
		ClassNameField.sendKeys(generateRandomPassword(5));
		//ClassNameField.sendKeys("APJ Abdule Kalam");
		Thread.sleep(2000);
		SectionField.sendKeys(generateRandomPassword(1));
		Thread.sleep(2000);
		CourseSelector.click();
		Thread.sleep(2000);
		Course1.click();
		Thread.sleep(2000);
		Createbutton.click();
		Thread.sleep(2000);
		MaybeLaterbutton.click();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void AddStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	AddStudentsbutton.click();
      	Thread.sleep(2000);
      	SearchByName.sendKeys("OrtO");
      	Thread.sleep(2000);
      	SelStudentName.click();
      	Thread.sleep(2000);
      	driver.findElement(By.xpath("//*[@class='text-md dark-grey']")).click();
      /*	Addbutton.click();
      	Thread.sleep(2000);*/
      	
      	
	}
	public void AddAssignedStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	AddStudentsbutton.click();
      	Thread.sleep(2000);
      	SearchByName.sendKeys("a");
      	Thread.sleep(2000);
      	SelStudentName.click();
      	Thread.sleep(2000);
      	Addbutton.click();
      	Thread.sleep(2000);
      	
	}
	public void ViewDetailsAddStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	AddStudentsbutton.click();
      	Thread.sleep(2000);
      	SearchByName.sendKeys("m");
      	Thread.sleep(2000);
      	SelStudentName.click();
      	Thread.sleep(2000);
      	Addbutton.click();
      	Thread.sleep(2000);
      	
	}
	public void ViewDetailsAddAssignedStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	AddStudentsbutton.click();
      	Thread.sleep(2000);
      	SearchByName.sendKeys("m");
      	Thread.sleep(2000);
      	SelStudentName.click();
      	Thread.sleep(2000);
      	Addbutton.click();
      	Thread.sleep(2000);
      	
	}
	public void TransferStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	Transfer.click();
      	Thread.sleep(2000);
      	StandardSelector.click();
      	Thread.sleep(2000);
      	SelectClass1.click();
      	Thread.sleep(2000);
      	SectionSelector.click();
      	Thread.sleep(2000);
      	Section1.click();
      	Thread.sleep(2000);
      	Transferbutton1.click();
      	Thread.sleep(2000);
	}
	public void TransferCancelStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	Transfer.click();
      	Thread.sleep(2000);
      	Cancel.click();
      	Thread.sleep(2000);
	}
	public void UnassignStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	Unassign.click();
      	Thread.sleep(2000);
      	Yes.click();
      	Thread.sleep(2000);
	}
	public void UnassignNoStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	Unassign.click();
      	Thread.sleep(2000);
      	No.click();
      	Thread.sleep(2000);
	}
	public void IconTransferStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	TransferIcon.click();
      	Thread.sleep(2000);
      	StandardSelector.click();
      	Thread.sleep(2000);
      	SelectClass1.click();
      	Thread.sleep(2000);
      	SectionSelector.click();
      	Thread.sleep(2000);
      	Section1.click();
      	Thread.sleep(2000);
      	Transferbutton1.click();
      	Thread.sleep(2000);
	}
	public void IconTransferCancelStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	TransferIcon.click();
      	Thread.sleep(2000);
      	Cancel.click();
      	Thread.sleep(2000);
	}
	public void IconUnassignStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	UnassignIcon.click();
      	Thread.sleep(2000);
      	Yes.click();
      	Thread.sleep(2000);
	}
	public void IconUnassignNoStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	SelectStudent1.click();
      	Thread.sleep(2000);
      	UnassignIcon.click();
      	Thread.sleep(2000);
      	No.click();
      	Thread.sleep(2000);
	}
	public void ViewDetailsBack() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
      	ViewDetails.click();
      	Thread.sleep(2000);
      	LeftArrowbutton.click();
      	Thread.sleep(2000);
   
	}
	public void CreateSubject() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
      	Thread.sleep(1000);
      	CreateSubjectbutton.click();
      	Thread.sleep(2000);
      	AddSubjectName1.sendKeys("Automation Testing");
      	Thread.sleep(2000);
      	AddanotherSubject.click();
      	Thread.sleep(2000);
      	AddSubjectName2.sendKeys("Android Development");
      	Thread.sleep(2000);
      	Create.click();
      	Thread.sleep(2000);
	}
	public void AddChapters() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
      	Thread.sleep(1000);
      	AddChapters.click();
      	Thread.sleep(2000);
      	ChapterName1.sendKeys("Automation Testing");
      	Thread.sleep(2000);
      	AddAnotherChapterBtn.click();
      	Thread.sleep(2000);
      	ChapterName2.sendKeys("Android Development");
      	Thread.sleep(2000);
      	Add.click();
      	Thread.sleep(2000);
	}
	public void BrowseSubjects() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
      	Thread.sleep(1000);
      	ClickBrowse.click();
      	Thread.sleep(2000);
      	ClickonSection.click();
      	Thread.sleep(2000);
      	AddtoSection.click();
      	Thread.sleep(3000);
		List<WebElement> li =driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int size = li.size();
		System.out.println(li);
		for(int i=0;i<size;i++)
		{
			li.get(i).click();
		}
		Thread.sleep(2000);
		YesButton.click();
		Thread.sleep(2000);
	}
	public void BrowseNoSubjects() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
      	Thread.sleep(1000);
      	ClickBrowse.click();
      	Thread.sleep(2000);
      	ClickonSection.click();
      	Thread.sleep(2000);
      	AddtoSection.click();
		Thread.sleep(2000);
		NoButton.click();
		Thread.sleep(2000);
	}
	public void ChaptersOpeninSubject() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
      	Thread.sleep(1000);
      	ClickBrowse.click();
      	Thread.sleep(2000);
      	ClickonSection.click();
      	Thread.sleep(2000);
      	ChaptersOpen.click();
		Thread.sleep(2000);

	}
	public void ResourceBack() throws InterruptedException
	{
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
      	Thread.sleep(1000);
      	CSESection.click();
      	Thread.sleep(2000);
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
      	Thread.sleep(1000);
      	ClickBrowse.click();
      	Thread.sleep(2000);
      	ClickonSection.click();
      	Thread.sleep(2000);
      	ResourcesBack.click();
		Thread.sleep(2000);

	}
	
	
	/*
	public void validateCreateaClass(String className,String section,String stream) throws InterruptedException
	{
		Thread.sleep(5000);
		CreateClassButton.click();
		ClassNameField.sendKeys(className);
		SectionField.sendKeys(section);
		StreamField.sendKeys(stream);
		Createbutton.click();
		Thread.sleep(3000);
		AddNowbutton.click();
		Thread.sleep(3000);
		CreateSubjectbutton.click();
		Thread.sleep(2000);
		AddSubject.sendKeys("Maths");
		Thread.sleep(2000);
		AddanotherSubjectClick.click();
		AddSubjectName.sendKeys("Physics");
		Thread.sleep(2000);
		Create1.click();
	}
	
	public void validateClass() throws InterruptedException
	{
		Clickanyclass.click();
		Thread.sleep(3000);
		ClickBrowser.click();
		Thread.sleep(3000);
		ClickClass.click();
		AddSectionButton.click();
		Thread.sleep(3000);
		List<WebElement> li =driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int size = li.size();
		System.out.println(li);
		for(int i=0;i<size;i++)
		{
			li.get(i).click();
		}
		YesButton.click();
		//NoButton.click();
	}
	
	public void validateEditcurriculum() throws InterruptedException
	{
		Thread.sleep(5000);
		EditCurriculum.click();
		ClickSubject.click();
//		EditIcon.click();
//		Thread.sleep(3000);
//		Edittextfield.clear();
//		Edittextfield.sendKeys("maths");
//		Savebutton.click();	
	}
	
	public void validateEditChapters() throws InterruptedException
	{
		Thread.sleep(5000);
		EditChapters.click();
		Thread.sleep(2000);
		AddChapter.click();
		Thread.sleep(4000);
		AddChapterName.sendKeys("Testing");
		Thread.sleep(4000);
		List<WebElement> e = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int s = e.size();
		System.out.println(e);
		for(int i=0;i<s;i++)
		{
			e.get(i).click();
		}
		DoneButton.click();
		//Deletebutton.click();
		LeftArrowbutton.click();
	}
	public void validateDeleteSubject() throws InterruptedException
	{
		Thread.sleep(5000);
		DeleteICon.click();
		ConfirmButton.click();
		LeftArrowbutton.click();
	}
	
	public void validateAddStudent() throws InterruptedException
	{
		Thread.sleep(5000);
		Clickanyclass.click();
		Thread.sleep(2000);
		AddStudentsbutton.click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper']"));
		Actions ac =  new Actions(driver);
		ac.moveToElement(ele).click().sendKeys("fhgfhhfg").build().perform();
		//ele.sendKeys("f");
		//Thread.sleep(5000);
    	SelStudentName.click();
//		Thread.sleep(2000);
		Addbutton.click();
		Thread.sleep(2000);
		ViewDetailslink.click();
//		//SearchStuName.sendKeys("");
//		Thread.sleep(4000);
//		List<WebElement> e = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
//		int s = e.size();
//		System.out.println(e);
//		for(int i=0;i<s;i++)
//		{
//			e.get(i).click();
//		}
		Transferbtn.click();
		Thread.sleep(2000);
		StandardClass.click();
		Thread.sleep(2000);
		SelClass.click();
		Thread.sleep(2000);
		SelSectionClass.click();
		Thread.sleep(2000);
		SelectSection.click();
		Thread.sleep(2000);
		Transferbutton.click();
		//LeftArrowbutton.click();
		//Cancelbutton.click();
		//Deletebttn.click();
		//Deletebtn.click();
		//Transferbttn.click();
	}
	public void validateEdit() throws InterruptedException
	{
		Thread.sleep(5000);
		Editicon.click();
		EditSecField.sendKeys("A3");
		Savebutton.click();
		Thread.sleep(3000);
		Editicon.click();
		Thread.sleep(3000);
		Transferbtn.click();
		SelectClassDrpDwn.click();
		Thread.sleep(2000);
		SelClass.click();
		Sectionname.sendKeys("A");
		Transferbutton.click();

	}
	public void validateAddbuttonClasses() throws InterruptedException
	{
		Thread.sleep(4000);
		plusicon.click();
		Thread.sleep(4000);
		List<WebElement>ele =driver.findElements(By.xpath("//div[@class='ant-row']/div/div/label/span/input"));
		int sel= ele.size();
		System.out.println(sel);
		for(int i=0;i<sel;i++)
		{
			ele.get(i).click();
		}
		NewSecName.sendKeys("7-D");
		//   CloneButton.click();
		//Cancelbutton.click();
	}
	*/

	
	/*********************************New Coding**************************************/
	public void clickingClassRoom() {
		wait(3000);
		driver.findElement(By.xpath("//*[contains(@href, '/classroom')]")).click();
		System.out.println("Clicked on classRoom Module");
		
		}
	public void clickOnCreateNewClass() {
		wait(3000);
		driver.findElement(By.xpath("//span[text()='Create New Class']")).click();
		wait(3000);
		System.out.println("Clicked on create new class");
	}
	
	public void enterClassRoomDetails() {
		wait(3000);
		generateRandomPassword(3);
		driver.findElement(By.xpath("//*[@placeholder='Example-VII']")).sendKeys(generateRandomPassword(3));
		wait(3000);
		System.out.println("class name is entered--");
		driver.findElement(By.xpath("//*[@placeholder='Maximum 3 characters']")).sendKeys(generateRandomPassword(3));
		wait(3000);
		System.out.println("Section name is entered--");
		driver.findElement(By.xpath("//*[@class='ant-select-selection-search-input']")).sendKeys(generateRandomPassword(3));
		wait(3000);
		System.out.println("Course name is entered--");
		
	}
	
	public void clickONSAVE() {
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary btn-radius-15__height-38']")).click();
		System.out.println("Clicked on save button...--");
		
	}
	
	public void cilckMayBeLater() {
		
		wait(3000);
		driver.findElement(By.xpath("//*[text()='Maybe Later']")).click();
		System.out.println("Clicked on Maybe Later button...--");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
