package Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.CoursePage;
import Pages.HomePage1;
import Pages.LoginClass;



public class OperationsAdminCoursesTest extends BaseTest {
	
	LoginClass LC;
    HomePage1 HP;
	CoursePage CP;
	AnnouncementPage AP;
	
	public OperationsAdminCoursesTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws InterruptedException
	{
		initilization();
	
		
		CP=new CoursePage();
		
		AP=new AnnouncementPage();

		LC = new LoginClass();
		
		HP = LC.MobileRegister(prop.getProperty("OperationAdmin"), prop.getProperty("DefaultOTP"));
		
	}	

	@Test(priority=1,groups="OperationsAdmin Courses Module")
	public void CourseCreations() throws InterruptedException{
		CP.CancelCourse();
		WaitTil(2000);
		driver.navigate().refresh();
		WaitTil(2000);
		CP.CourseCreation();
		WaitTil(2000);
		
	}

	@Test(priority=2,groups="OperationsAdmin Courses Module")
	public void CourseUpdate() throws InterruptedException{
		WaitTil(2000);
		CP.CourseUpdate();
		WaitTil(2000);
	}
	@Test(priority=3,groups="OperationsAdmin Courses Module")
	public void CourseDelete() throws InterruptedException{
		WaitTil(2000);
		CP.CourseDelete();
		WaitTil(2000);
	}
	@Test(priority=4,groups="OperationsAdmin Courses Module")
	public void SearchCourse() throws InterruptedException{
		WaitTil(2000);
		CP.SearchCourse();
		WaitTil(2000);
	}

	@AfterSuite
	public void taerDown() {
		driver.quit();
	}
}
	
	

