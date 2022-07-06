package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class AnnouncementPage extends Aulas_Base.BaseTest
{
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[1]")
	WebElement Announcement;
	@FindBy(xpath="//div[contains(@class,'ant-page-header-compact')]")
	WebElement AnnouncementText;
	//**************validateAnyOneAnnouncement******************//
	@FindBy(xpath="//div[@class='ant-tabs-tab']")
	WebElement Announced;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement anyoneAnnouncement;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement CloseButton;
		//*******************CreateNewAnnounced*********************************//
	@FindBy(xpath="//span[text()='+ Create']")
	WebElement CreateButton;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement EnterTitle;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement EnterTitle1;
	@FindBy(xpath="//div[contains(@class,'container')]/div[1]")
	WebElement EnterDescription;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[2]")
	WebElement SelectTarget;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[3]")
	WebElement SelectTarget1;
	//Target
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[1]")
	WebElement TargetAll;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[2]")
	WebElement TargetTeacher;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[3]")
	WebElement TargetStudent;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[3]")
	WebElement StudentClassSelector;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[4]")
	WebElement StudentClassSelector1;
	@FindBy(xpath="(//div[text()='All'])[2]")
	WebElement StudentClass;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[4]")
	WebElement TargetDataOperator;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[5]")
	WebElement TargetOperation;
	@FindBy(xpath="//span[text()='Save As Draft']")
	WebElement SaveAsDraftbtn;
	@FindBy(xpath="//span[text()='Announce Now']")
	WebElement AnnounceBtn;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement CloseAnnounceBtn;

	//*******************Header/font Change*********************************//
	@FindBy(xpath="//span[@class='ql-picker-label']")
	WebElement SelectHeading;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[1]")
	WebElement Heading1;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[2]")
	WebElement Heading2;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[3]")
	WebElement NormalHeading;
	@FindBy(xpath="//button[@class='ql-bold']")
	WebElement Bold;
	@FindBy(xpath="//button[@class='ql-italic']")
	WebElement Italic;
	@FindBy(xpath="//button[@class='ql-underline']")
	WebElement Underline;
	@FindBy(xpath="(//button[@class='ql-list'])[1]")
	WebElement Numbers;
	@FindBy(xpath="(//button[@class='ql-list'])[2]")
	WebElement bulletpoints;
	@FindBy(xpath="//button[@class='ql-link']")
	WebElement links;
	///////////////***********Draft************//////////
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[1]")
	WebElement Draft;
	@FindBy(xpath="(//div[@class='sc-bqiRlB dTUKFo cursor-pointer'])[1]")
	WebElement Draft1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default']")
	WebElement SaveAsDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement DeleteDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement AnounceNowDraft;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement DraftEnterSearch;
	@FindBy(xpath="(//span[@class='ant-input-suffix'])[1]")
	WebElement DraftEnterSearchClose;
	@FindBy(xpath="(//span[@class='ant-input-group-addon'])[1]")
	WebElement DraftSearch;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	WebElement DraftFilter;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement DraftFilterAll;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[2]")
	WebElement DraftFilterTeacher;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[3]")
	WebElement DraftFilterStudent;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[4]")
	WebElement DraftFilterDataOperator;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[5]")
	WebElement DraftFilterOperation;
	
	
    ///////////////***********Announce************//////////
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	WebElement Announce;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement Announce1;
	@FindBy(xpath="//button[@class='ant-modal-close']")
	WebElement IntoMarkClose;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement AnnounceEnterSearch;
	@FindBy(xpath="(//span[@class='ant-input-suffix'])[2]")
	WebElement AnnounceEnterSearchClose;
	@FindBy(xpath="(//span[@class='ant-input-group-addon'])[2]")
	WebElement AnnounceSearch;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement AnnounceFilter;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[6]")
	WebElement AnnounceFilterAll;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[7]")
	WebElement AnnounceFilterTeacher;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[8]")
	WebElement AnnounceFilterStudent;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[9]")
	WebElement AnnounceFilterDataOperator;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[10]")
	WebElement AnnounceFilterOperation;
	
	
	public AnnouncementPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void AnnouncementModule() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", Communication);
      	Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(8000);
  // Create Announcement for All
		CreateButton.click();
		Thread.sleep(2000);
		EnterTitle.sendKeys("This is a  Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(6000);
	// Teacher
		CreateButton.click();
		Thread.sleep(2000);
		EnterTitle1.sendKeys("This is a  Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Teachers Come And Meet Head of the Department Today");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetTeacher.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(6000);
	// Student
		CreateButton.click();
		Thread.sleep(2000);
		EnterTitle1.sendKeys("This is a  Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Semister Results Are Released.");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetStudent.click();
	    Thread.sleep(2000);
	    StudentClassSelector1.click();
		Thread.sleep(2000);
		StudentClass.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(6000);
	// Data Operator
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Data Operators have Meeting with Head of the Department Today Evening 4 PM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetDataOperator.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(6000);
	// Operator
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Operation have Meeting with Head of the Department Today Morning 10 AM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetOperation.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(6000);
		// SaveAsDraft All 
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(6000);
		// SaveAsDraftforTeacher
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Teachers Come And Meet Head of the Department Today");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetTeacher.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(6000);
		// SaveAsDraftforStudent
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Semister Results Are Released.");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetStudent.click();
	    Thread.sleep(2000);
	    StudentClassSelector1.click();
		Thread.sleep(2000);
		StudentClass.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(6000);
		//  SaveAsDraftforDataOperator
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Data Operators have Meeting with Head of the Department Today Evening 4 PM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetDataOperator.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(6000);
		// SaveAsDraftforOperation
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Operation have Meeting with Head of the Department Today Morning 10 AM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetOperation.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(6000);
		// AnnouncementClose
		CreateButton.click();
		Thread.sleep(2000);
		CloseAnnounceBtn.click();
		Thread.sleep(2000);
		
		// Update DraftAnnouncement 
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a Testing Department. \r\n"
				+ "This is a Testing.\r\n"
				+ "﻿This is a Aulas.");
		Thread.sleep(2000);
		SelectHeading.click();
		Thread.sleep(2000);
		Heading1.click();
		Thread.sleep(2000);
		Bold.click();
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Italic.click();
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Underline.click();
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		AnounceNowDraft.click();
		Thread.sleep(6000);	
		// Update SaveasDraftAnnouncement
		Thread.sleep(2000);
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		SaveAsDraft.click();
		Thread.sleep(6000);	
		// DeleteAnnouncement
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		DeleteDraft.click();
		Thread.sleep(6000);	
		// DraftFilter
		Draft.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterAll.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterTeacher.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterStudent.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterDataOperator.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterOperation.click();
		Thread.sleep(2000);
		// AnnouncedFilters
		Announce.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterAll.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterTeacher.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterStudent.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterDataOperator.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterOperation.click();
		Thread.sleep(2000);
        // SearchDraftAnnouncement
		Draft.click();
		Thread.sleep(2000);
		DraftEnterSearch.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		DraftEnterSearchClose.click();
		Thread.sleep(2000);
		DraftEnterSearch.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		DraftSearch.click();
		Thread.sleep(4000);
		// OpenAnnouncement
		Announce.click();
		Thread.sleep(2000);
		AnnounceEnterSearch.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		AnnounceEnterSearchClose.click();
		Thread.sleep(2000);
		AnnounceEnterSearch.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		AnnounceSearch.click();
		Thread.sleep(2000);
		Announce.click();
		Thread.sleep(2000);
		Announce1.click();
		Thread.sleep(2000);
		IntoMarkClose.click();
		Thread.sleep(2000);
	}
	
}	
	/*
	public String validateAnnouncementText() throws InterruptedException
	{
		Thread.sleep(5000);
		Announcement.click();
		Thread.sleep(2000);
		return AnnouncementText.getText();
		
	}
	
	public void validateAnyOneAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(5000);
		Announced.click();
		Thread.sleep(2000);
		anyoneAnnouncement.click();
		Thread.sleep(2000);
		CloseButton.click();
	}
	
	public void AnnouncementCreation() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(2000);
	}
	public void AnnouncementforTeacher() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Teachers Come And Meet Head of the Department Today");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetTeacher.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(2000);
	}
	public void AnnouncementforStudent() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Semister Results Are Released.");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetStudent.click();
	    Thread.sleep(2000);
	    StudentClassSelector.click();
		Thread.sleep(2000);
		StudentClass.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(2000);
	}
	public void AnnouncementforDataOperator() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Data Operators have Meeting with Head of the Department Today Evening 4 PM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetDataOperator.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(2000);
	}
	public void AnnouncementforOperation() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Operation have Meeting with Head of the Department Today Morning 10 AM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetOperation.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(2000);
	}
	public void SaveAsDraftCreation() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(2000);
	}
	public void SaveAsDraftforTeacher() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Teachers Come And Meet Head of the Department Today");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetTeacher.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(2000);
	}
	public void SaveAsDraftforStudent() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Semister Results Are Released.");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetStudent.click();
	    Thread.sleep(2000);
	    StudentClassSelector.click();
		Thread.sleep(2000);
		StudentClass.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(2000);
	}
	public void SaveAsDraftforDataOperator() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Data Operators have Meeting with Head of the Department Today Evening 4 PM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetDataOperator.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(2000);
	}
	public void SaveAsDraftforOperation() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys("All Operation have Meeting with Head of the Department Today Morning 10 AM . Please Attend the Meeting .");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetOperation.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(2000);
	}
	public void AnnouncementClose() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		CloseAnnounceBtn.click();
		Thread.sleep(4000);
	}
	public void DraftAnnouncement1() throws InterruptedException
	{

		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		AnounceNowDraft.click();
		Thread.sleep(2000);	
		

	}
	public void SaveasDraftAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		SaveAsDraft.click();
		Thread.sleep(2000);	

	}
	public void DeleteAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		DeleteDraft.click();
		Thread.sleep(2000);	

	}
	public void SearchDraftAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Draft.click();
		Thread.sleep(2000);
		DraftEnterSearch.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		DraftSearch.click();
		Thread.sleep(2000);	

	}
	public void OpenAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Announce.click();
		Thread.sleep(2000);
		Announce1.click();
		Thread.sleep(2000);	

	}
	public void CloseAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Announce.click();
		Thread.sleep(2000);
		Announce1.click();
		Thread.sleep(2000);
		IntoMarkClose.click();
		Thread.sleep(2000);

	}
	public void SearchAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Announce.click();
		Thread.sleep(2000);
		AnnounceEnterSearch.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		AnnounceSearch.click();
		Thread.sleep(2000);	


	}
		public void DraftFilter() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Draft.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterAll.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterTeacher.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterStudent.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterDataOperator.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterOperation.click();
		Thread.sleep(2000);
	}
	public void AnnouncedFilters() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(2000);
		Announce.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterAll.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterTeacher.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterStudent.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterDataOperator.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterOperation.click();
		Thread.sleep(2000);
		
	
	}
	
	public void validateAnnouncementDescription() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("Testing Department");
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a Testing Department. \r\n"
				+ "This is a Testing.\r\n"
				+ "﻿This is a Aulas.");
		Thread.sleep(2000);
		SelectHeading.click();
		Thread.sleep(2000);
		Heading1.click();
		Thread.sleep(2000);
		Bold.click();
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Italic.click();
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Underline.click();
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Numbers.click();
		Thread.sleep(2000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		AnnounceBtn .click();
		Thread.sleep(4000);
	}
     
	*/
	
	
	
   

