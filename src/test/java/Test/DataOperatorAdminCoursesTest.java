package Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.CoursePage;
import Pages.HomePage1;
import Pages.LoginClass;



public class DataOperatorAdminCoursesTest extends BaseTest {
	
	LoginClass LC;
    HomePage1 HP;
	CoursePage CP;
	AnnouncementPage AP;
	
	public DataOperatorAdminCoursesTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws InterruptedException
	{
		initilization();
	
		
		CP=new CoursePage();
		
		AP=new AnnouncementPage();

		LC = new LoginClass();
		
		HP = LC.MobileRegister(prop.getProperty("CMNUM"), prop.getProperty("OTP"));
		
	}	
	

	@Test(priority=1)
	public void CourseCreations() throws InterruptedException{
		System.out.println("Test case 1 course module started ");
		//CP.ClickonCourse();
		CP.CancelCourse();
		WaitTil(2000);
		driver.navigate().refresh();
		WaitTil(2000);
		CP.CourseCreation();
		WaitTil(2000);
		System.out.println("Test case 1 course module completed ");
		
	}

	@Test(priority=2,groups="DataOperatorAdmin Courses Module")
	public void CourseUpdate() throws InterruptedException{
		System.out.println("Test case 2 course module started ");
		WaitTil(2000);
		CP.CourseUpdate();
		WaitTil(2000);
		System.out.println("Test case 2 course module completed ");
	}
	@Test(priority=3,groups="DataOperatorAdmin Courses Module")
	public void CourseDelete() throws InterruptedException{
		WaitTil(2000);
		System.out.println("Test case 3 course module started ");
		CP.CourseDelete();
		WaitTil(2000);
		System.out.println("Test case 3 course module completed ");
	}
	@Test(priority=4,groups="DataOperatorAdmin Courses Module")
	public void SearchCourse() throws InterruptedException{
		WaitTil(2000);
		System.out.println("Test case 4 course module started ");
		CP.SearchCourse();
		WaitTil(2000);
		System.out.println("Test case 4 course module completed ");
	}

	@AfterSuite
	public void taerDown() {
		//driver.quit();
		Dologout();
		System.out.println("After suite was executed data operators----");
	}
	
}
	
	

