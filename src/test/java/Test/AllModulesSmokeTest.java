package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.ClassroomPage;
import Pages.CoursePage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;
import Pages.UserManagementPage;
import Util.TestUtil;

public class AllModulesSmokeTest extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	UserManagementPage UM;
	ClassroomPage CR;
	CoursePage CP;
	SchedulePage SP;

	
	public AllModulesSmokeTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		UM = new UserManagementPage();
		LC = new LoginClass();
		
		CR=new ClassroomPage();
		
		CP=new CoursePage();
		SP = new SchedulePage();
	
		HP = LC.newLogin(prop.getProperty("username"), prop.getProperty("password"));
	

	}
	
	/*******************************User managemenement**************/
	@Test(priority = 1) 
	public void userCreations() throws InterruptedException {
		System.out.println("User managemenement: Test case 1 User Management  started ");
		WaitTil(2000);
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateClickCancelStudent();
		WaitTil(2000);
		UM.addaUser("StudentCreation");
		WaitTil(2000);
		UM.validateClickCancelTeacher();
		WaitTil(2000);
		UM.addaUser("TeacherCreation");
		WaitTil(2000);
		/*UM.addaUser("TeacherCreation1");
		WaitTil(2000);
		UM.addaUser("TeacherCreation2");
		WaitTil(2000);*/
		UM.validateClickCancelDataOperator();
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation");
		/*WaitTil(2000);
		UM.addaUser("DataOperatorCreation1");
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation2");
		WaitTil(2000);*/
		UM.validateClickCancelOperation();
		WaitTil(2000);
		UM.addaUser("OperationCreation");
		WaitTil(4000);
		System.out.println("User managemenement:Test case 1 completed ");
		/*WaitTil(2000);
		UM.addaUser("OperationCreation1");
		WaitTil(2000);
		UM.addaUser("OperationCreation2");*/
	}
	@Test(priority = 2)
	public void validateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("User managemenement:Test case 2 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateUserManagementPage();
		WaitTil(4000);
		System.out.println("User managemenement:Test case 2 Completed ");
			
	}
	@Test(priority = 3) 
	public void registrationRequestsApprovals() throws InterruptedException {
		WaitTil(2000);
		System.out.println("User managemenement:Test case 3 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.registrationRequestsApprovals();
		WaitTil(4000);
		System.out.println("User managemenement:Test case 3 Completed ");
	}

	@Test(priority = 4) 
	public void validateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("User managemenement:Test case 4 started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(4000);
		System.out.println("User managemenement:Test case 4 Completed ");
		
	}
	
	/*************************ClassRoom**********************/
	 @Test(priority=5)
		public void CreateaNewClass() throws InterruptedException{
			Thread.sleep(2000);
			System.out.println("ClassRoom:Test case 5 started ");
			CR.ClickonClassrooms();
			CR.CreateaNewClass();
			WaitTil(4000);
			System.out.println("ClassRoom:Test case 5 completed ");
			
		}
	 @Test(priority=6)
		public void AddStudent() throws InterruptedException{
			Thread.sleep(2000);
			System.out.println("ClassRoom:Test case 6 started ");
			CR.AddStudent();
			WaitTil(4000);
			System.out.println("ClassRoom:Test case 6 completed ");
			
		}
	 
	 /*******************CourseModule*******************************/
	 
	 @Test(priority=7)
		public void CourseCreations() throws InterruptedException{
			System.out.println("CourseModule:Test case 7 started ");
			//CP.ClickonCourse();
			CP.CancelCourse();
			WaitTil(2000);
			driver.navigate().refresh();
			WaitTil(2000);
			CP.CourseCreation();
			WaitTil(5000);
			System.out.println("CourseModule:Test case 7 completed ");
			
		}
	 
	 @Test(priority=8)
		public void CourseUpdate() throws InterruptedException{
			System.out.println("CourseModule:Test case 8 started ");
			WaitTil(2000);
			CP.CourseUpdate();
			WaitTil(4000);
			System.out.println("CourseModule:Test case 8 completed ");
		}
		
	 /*******************************ScheduleModule*******************/
	 @Test(priority=9)
		public void createScheduleProfile() throws InterruptedException {

			System.out.println("ScheduleModule:Test case 9 is started...");
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
			WaitTil(4000);
			System.out.println("ScheduleModule:Test case 9 is completed...");

		}
	 @Test(priority=10)
	 public void createSceduleForBroadcast() throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("ScheduleModule:Test case 10 is started ");
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
			WaitTil(4000);
			System.out.println("ScheduleModule:Test case 10 is completed...");
			//LC.newLogin2("","");
			
			
		}
	 
}