package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class AnnouncementTest extends Aulas_Base.BaseTest{
	LoginClass LC;
	
    HomePage1 HP;
	
	AnnouncementPage AP;

	
	public AnnouncementTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()throws InterruptedException{
		initilization();
		

		AP=new AnnouncementPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		
	}
	
	/*
	@Test(priority=1,groups="Announcement Module")
	public void AnnouncementClick() throws InterruptedException{
		Thread.sleep(1000);
		AP.AnnouncementClick();
		Thread.sleep(1000);
	}
	
	
	@Test(priority=2,groups="Announcement Module")
	public void validateAnnouncementText()throws InterruptedException{
		Thread.sleep(1000);
		AP.validateAnnouncementText();
		Thread.sleep(1000);
	}
	
	@Test(priority=3,groups="Announcement Module")
	public void AnnouncementCreation() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation();
		Thread.sleep(2000);
		
	}
	@Test(priority=4,groups="Announcement Module")
	public void AnnouncementforTeacher() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementforTeacher();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=5,groups="Announcement Module")
	public void AnnouncementforStudent() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementforStudent();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=6,groups="Announcement Module")
	public void AnnouncementforDataOperator() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementforDataOperator();
		Thread.sleep(2000);
		
	}
	@Test(priority=7,groups="Announcement Module")
	public void AnnouncementforOperation() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementforOperation();
		Thread.sleep(2000);
		
	}
	@Test(priority=8,groups="Announcement Module")
	public void SaveAsDraftCreation() throws InterruptedException{
		Thread.sleep(2000);
		AP.SaveAsDraftCreation();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=9,groups="Announcement Module")
	public void SaveAsDraftforTeacher() throws InterruptedException{
		Thread.sleep(2000);
		AP.SaveAsDraftforTeacher();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=10,groups="Announcement Module")
	public void SaveAsDraftforStudent() throws InterruptedException{
		Thread.sleep(2000);
		AP.SaveAsDraftforStudent();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=11,groups="Announcement Module")
	public void SaveAsDraftforDataOperator() throws InterruptedException{
		Thread.sleep(2000);
		AP.SaveAsDraftforDataOperator();
		Thread.sleep(2000);
		
	}
	@Test(priority=12,groups="Announcement Module")
	public void SaveAsDraftforOperation() throws InterruptedException{
		Thread.sleep(2000);
		AP.SaveAsDraftforOperation();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=13,groups="Announcement Module")
	public void AnnouncementClose() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementClose();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=14,groups="Announcement Module")
	public void DraftAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.DraftAnnouncement1();
		Thread.sleep(2000);
		
	}
	@Test(priority=15,groups="Announcement Module")
	public void SavasDraftAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.SaveasDraftAnnouncement();
		Thread.sleep(2000);
		
	}
	@Test(priority=16,groups="Announcement Module")
	public void DeleteAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.DeleteAnnouncement();
		Thread.sleep(2000);
		
	}
	@Test(priority=17,groups="Announcement Module")
	public void SearchDraftAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.SearchDraftAnnouncement();
		Thread.sleep(2000);
		
	}
	@Test(priority=18,groups="Announcement Module")
	public void OpenAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.OpenAnnouncement();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=19,groups="Announcement Module")
	public void CloseAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.CloseAnnouncement();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=20,groups="Announcement Module")
	public void SearchAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.SearchAnnouncement();
		Thread.sleep(2000);
		
	} 
	@Test(priority=21,groups="Announcement Module")
	public void DraftFilters() throws InterruptedException{
	
		Thread.sleep(2000);
		AP.DraftFilter();
		Thread.sleep(2000);
	} 
	@Test(priority=22,groups="Announcement Module")
	public void AnnouncedFilters() throws InterruptedException{
	
		Thread.sleep(2000);
		AP.AnnouncedFilters();
		Thread.sleep(2000);
	} 
	@Test(priority=22,groups="Announcement Module")
	public void validateAnnouncementDescription() throws InterruptedException{
	
		Thread.sleep(2000);
		AP.validateAnnouncementDescription();
		Thread.sleep(2000);
	} 
	
	*/
}