package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;
//@Listeners(TestNGListener.Listeners.class)

public class ScheduleModuleDataOperator extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;

	public ScheduleModuleDataOperator() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();

		HP = LC.newLoginUsingMobile(prop.getProperty("SMDPhonenum"), prop.getProperty("OTP"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}
	@Test
	
	public void createScheduleProfileDataOper() throws InterruptedException {

		System.out.println("createScheduleProfile test was started ");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		//SP.clickOnXbutton();
		SP.selectSubject();
		SP.selectClass();
		SP.selectTeacher();
		SP.selectModeOfTheClass("Conference");
		SP.selectDateAndTime();
		SP.selectStartAndEndTime();
		SP.repeatOnDay();
		SP.lastDaySelection();
		SP.clickOnXbutton();
		//SP.clickOnSave();
		System.out.println("createScheduleProfile confirence created ");

	}
	@Test(priority=2)
	public void createSceduleForBroadcastDOP() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("createScheduleProfile test was started ");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		SP.selectClass();
		SP.selectTeacher();

		//SP.selectMode("Conference");
		SP.selectModeOfTheClass("Broadcast");
		SP.selectDateAndTime();
		SP.selectStartAndEndTime();
		SP.repeatOnDay();
		SP.lastDaySelection();
		SP.clickOnXbutton();
		//SP.clickOnSave();
		System.out.println("createScheduleProfile Broadcost created ");
		
		
	}
	@Test(priority=3)
	public void createSceduleForOfflineDOP() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("createScheduleProfile offline test was started ");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		SP.selectClass();
		SP.selectTeacher();
		SP.selectModeOfTheClass("Offline");
		SP.selectDateAndTime();
		SP.selectStartAndEndTime();
		SP.repeatOnDay();
		SP.lastDaySelection();
		SP.clickOnXbutton();
		//SP.clickOnSave();
		System.out.println("createScheduleProfile offline created ");
		
		
		
	}
	/*@Test(priority=4)
	public void demo() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("random test was started ");
		randomNumber();
		getCurrentDate();
		}*/
	@Test(priority=5)
	public void createSceduleForZoom40DOP() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case 5 is started");
		SP.clickOnSceduleModule();
		SP.clickOnCreateButton();
		SP.selectSubject();
		SP.selectClass();
		SP.selectTeacher();
		SP.selectModeOfTheClass("Zoom 40");
		SP.selectDateAndTime();
		SP.selectStartAndEndTimeForZoom();
		SP.repeatOnDay();
		SP.lastDaySelection();
		SP.clickOnXbutton();
		//SP.clickOnSave();
		System.out.println("Test case 5 is finished  ");
		}
	@Test(priority=6)
	public void validateEditInOccuranceDOP() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("The test case 6 is started for execution ");
		try {
			SP.clickOnSceduleModule();
			SP.EditInOccuranceSchedule();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 7 was completetd  ");

	}
	@Test(priority = 7)
	public void validateEditScheduleDOP() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 7 is started for execution ");
		try {
			SP.clickOnSceduleModule();
			SP.editSchedule();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 7 was completetd  ");

	}
	
	@Test(priority = 8)
	public void doSearchFilterOperDOP() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 8 is started for execution ");
		SP.clickOnSceduleModule();
		SP.doFilterInDate();
		SP.doSearch();
		SP.doSearchInStandard();
		
		System.out.println("The test case 8 was completetd  ");

	}
	
	
	/*@Test(priority = 8)
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);	
	   // SP.forcefullyFail();
	}*/
	@Test(priority = 9)
	public void doSearchFilterOper2DOP() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 8 is started for execution ");
		SP.clickOnSceduleModule();
		SP.clickOnTimeTable();
		SP.selectStabdard2();
		SP.doFilterInDate2();
		//SP.doSearch();
		//SP.doSearchInStandard();
		
		System.out.println("The test case 8 was completetd  ");

	}
	
	
	
}