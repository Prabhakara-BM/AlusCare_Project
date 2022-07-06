package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.CoursePage;
import Pages.HomePage1;
import Pages.LoginClass;


public class CoursesTest extends Aulas_Base.BaseTest {
	
	LoginClass LC;
    HomePage1 HP;
	CoursePage CP;
	AnnouncementPage AP;
	
	public CoursesTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		
		CP=new CoursePage();
		
		AP=new AnnouncementPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
		
	}
	
	
	
	
	@Test(priority=1,groups="Courses Module")
	public void CourseModule() throws InterruptedException{
		Thread.sleep(2000);
		CP.CourseModule();
		Thread.sleep(2000);
		
	}
	@Test(priority=2,groups="Announcement Module")
	public void AnnouncementModule() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementModule();
		Thread.sleep(2000);
	}
		
	
}






	
	
	/*@Test(priority=1,groups="Courses Module")
	public void ClickonCourse() throws InterruptedException{
		Thread.sleep(1000);
		CP.ClickonCourse();
		Thread.sleep(1000);
	}
	@Test(priority=2,groups="Courses Module")
	public void AddCourse() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourse();
		Thread.sleep(1000);
	}
	@Test(priority=3,groups="Courses Module")
	public void CancelCourse() throws InterruptedException{
		Thread.sleep(1000);
		CP.CancelCourse();
		Thread.sleep(1000);
	}
	@Test(priority=4,groups="Courses Module")
	public void AddCourseMonthlyPlanforYear() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseMonthlyPlanforYear();
		Thread.sleep(1000);
	}
	@Test(priority=5,groups="Courses Module")
	public void AddCourseQuarterlyPlanforYear() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseQuarterlyPlanforYear();
		Thread.sleep(1000);
	}
	@Test(priority=6,groups="Courses Module")
	public void AddCourseHalfYearlyPlanforYear() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseHalfYearlyPlanforYear();
		Thread.sleep(1000);
	}
	@Test(priority=7,groups="Courses Module")
	public void AddCourseAnnuallyPlanforYear() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseAnnuallyPlanforYear();
		Thread.sleep(1000);
	}
	@Test(priority=8,groups="Courses Module")
	public void AddCourseOneTimePlanforYear() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseOneTimePlanforYear();
		Thread.sleep(1000);
	}
	@Test(priority=9,groups="Courses Module")
	public void AddCourseCustomizePlanforYear() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseCustomizePlanforYear();
		Thread.sleep(1000);
	}
	
	@Test(priority=10,groups="Courses Module")
	public void AddCourseOneTimePlanforMonth() throws InterruptedException{
		Thread.sleep(2000);
		CP.AddCourseOneTimePlanforMonth();
		Thread.sleep(2000);
	}
	
	@Test(priority=11,groups="Courses Module")
	public void AddCourseCustomizePlanforMonth() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseCustomizePlanforMonth();
		Thread.sleep(1000);
	}
	@Test(priority=12,groups="Courses Module")
	public void AddCourseOneTimePlanforDay() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseOneTimePlanforDay();
		Thread.sleep(1000);
	}
	@Test(priority=13,groups="Courses Module")
	public void AddCourseCustomizePlanforDay() throws InterruptedException{
		Thread.sleep(1000);
		CP.AddCourseCustomizePlanforDay();
		Thread.sleep(1000);
	}
	@Test(priority=14,groups="Courses Module")
	public void SearchCourse() throws InterruptedException{
		Thread.sleep(1000);
		CP.SearchCourse();
		Thread.sleep(1000);
	}
	@Test(priority=15,groups="Courses Module")
	public void CourseUpdate() throws InterruptedException{
		Thread.sleep(1000);
		CP.CourseUpdate();
		Thread.sleep(1000);
	}
	@Test(priority=16,groups="Courses Module")
	public void CourseDeleteYes() throws InterruptedException{
		Thread.sleep(1000);
		CP.CourseDeleteYes();
		Thread.sleep(1000);
	}
	@Test(priority=17,groups="Courses Module")
	public void CourseDeleteNo() throws InterruptedException{
		Thread.sleep(1000);
		CP.CourseDeleteNo();
		Thread.sleep(1000);
	}
	@Test(priority=18,groups="Courses Module")
	public void CourseBack() throws InterruptedException{
		Thread.sleep(2000);
		CP.CourseBack();
		Thread.sleep(2000);
	}
 */
	

