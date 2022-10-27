	package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;

@Listeners(listerns_Demo.Listerns_Test.class)

public class ScheduleModuleAdmin extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	
	public ScheduleModuleAdmin() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();

		HP = LC.newLogin(prop.getProperty("username"), prop.getProperty("password"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}

	@Test(priority=1)
	public void createScheduleProfile() throws InterruptedException {

		System.out.println("createScheduleProfile by confirence was started");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		SP.selectClass();
		//SP.selectTeacher();
        SP.selectTeacherO();
		//SP.selectMode("Conference");
		SP.selectModeOfTheClass("Conference");
		//SP.selectDateAndTime();
		selectStartDate();
		SP.selectStartAndEndTime();
		SP.repeatOnDay();
		//SP.lastDaySelection();
		selectEndDate();
		SP.clickOnSave();
		
		//SP.getDiscriptionMessage();
		
		System.out.println("createScheduleProfile by confirence completed ");

	}
	
	@AfterTest
	public void loggingout() {
		
		wait(3000);
		System.out.println("doing logoutWasDone---");
		Dologout();
		System.out.println("logoutWasDone---");
		
	}
	
	/*@Test(priority=2)
	public void createSceduleForBroadcast() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("createScheduleProfile test was started ");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		
		SP.selectClass();
		//SP.selectTeacher();
        SP.selectTeacherO();
		//SP.selectMode("Conference");
		SP.selectModeOfTheClass("Broadcast");
		selectStartDate();
		//SP.selectDateAndTime();
		SP.selectStartAndEndTime();
		SP.repeatOnDay();
		//SP.lastDaySelection();
		selectEndDate();
		SP.clickOnSave();
		//SP.getDiscriptionMessage();
		System.out.println("createScheduleProfile Broadcost created ");
		//LC.newLogin2("","");
		
		
	}
	@Test(priority=3)
	public void createSceduleForOffline() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("createScheduleProfile offline test was started ");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		SP.selectClass();
		//SP.selectTeacher();
		SP.selectTeacherO();
		SP.selectModeOfTheClass("Offline");
		//SP.selectDateAndTime();
		selectStartDate();
		SP.selectStartAndEndTime();
		SP.repeatOnDay();
		//SP.lastDaySelection();
		selectEndDate();
		SP.clickOnSave();
		SP.getDiscriptionMessage();
		System.out.println("createScheduleProfile offline created ");
		
		
		
	}
	@Test(priority=4)
	public void demo() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("random test was started ");
		randomNumber();
		getCurrentDate();
		}
	@Test(priority=5)
	public void createSceduleForZoom40() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case 5 is started");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		SP.selectClass();
		//SP.selectTeacher();
		SP.selectTeacherO();
		SP.selectModeOfTheClass("Zoom 40");
		//SP.selectDateAndTime();
		selectStartDate();
		SP.selectStartAndEndTimeForZoom();
		SP.repeatOnDay();
		//SP.lastDaySelection();
		selectEndDate();
		SP.clickOnSave();
		SP.getDiscriptionMessage();
		System.out.println("Test case 5 is finished  ");
		}
	
	@Test(priority=6)
	public void validateEditInOccurance() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("The test case 6 is started for execution ");
		try {
			SP.clickOnSceduleModule();
			SP.EditInOccuranceSchedule();
			SP.getDiscriptionMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 7 was completetd  ");

	}
	@Test(priority = 7)
	public void validateEditSchedule() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 7 is started for execution ");
		try {
			SP.clickOnSceduleModule();
			SP.editSchedule();
			SP.getDiscriptionMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 7 was completetd  ");

	}*/
	
/*@Test(priority = 8)
	public void doSearchFilterOper() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 8 is started for execution ");
		SP.clickOnSceduleModule();
		SP.doFilterInDate();
		SP.doSearch();
		SP.doSearchInStandard();
		
		System.out.println("The test case 8 was completetd  ");

	}*/
	
	
	/*@Test(priority = 8)
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);	
	   // SP.forcefullyFail();
	}*/
	@Test(priority = 9, enabled = false)
	public void doSearchFilterOper2() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 8 is started for execution ");
		SP.clickOnTimeTable();
		SP.selectStabdard2();
		SP.doFilterInDate2();
		//SP.doSearch();
		//SP.doSearchInStandard();
		
		System.out.println("The test case 8 was completetd  ");

	}
	/*@Test(priority = 10)
	public void doingDateSelection() {
		wait(3000);
		currentTimeAndDate24();
	}
	
@Test(priority = 10)
	
	public void basicNeedsToCrateSchedule() {
		wait(3000);
		SP.createStudent();
		SP.createCourse();
		SP.createNewClass();
	}*/
}
	
	
	
