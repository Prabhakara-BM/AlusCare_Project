package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.ClassroomPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class ClassroomsTest extends Aulas_Base.BaseTest {
	LoginClass LC;
	
    HomePage1 HP;
	
	ClassroomPage CR;
	public ClassroomsTest() {
		super();
		
	}
	@BeforeSuite
	public void setup() throws InterruptedException{
		initilization();
		CR=new ClassroomPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}
	@Test(priority=1, groups="Classrooms Module")
	public void ClickonClassroom() throws InterruptedException{
System.out.println("Test case 1 started ");
		Thread.sleep(2000);
		CR.ClickonClassrooms();
		System.out.println("Test case 1 completed ");
		
	}
   @Test(priority=2, groups="Classrooms Module")
	public void CreateaNewClass() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Test case 2 started ");
		CR.ClickonClassrooms();
		CR.CreateaNewClass();
		System.out.println("Test case 2 completed ");
		
	}
	
	/*@Test(priority=3, groups="Classrooms Module")
	public void CreateaNewClass2() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Test case 4 started ");
		CR.CreateaNewClass2();
		System.out.println("Test case 4 completed ");
		
	}*/
   /*@Test(priority=4, groups="Classrooms Module")
	public void AddStudent() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Test case 5 started ");
		CR.AddStudent();
		System.out.println("Test case 5 completed ");
		
	}
	
	@Test(priority=6, groups="Classrooms Module")
	public void AddAssignedStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.AddAssignedStudent();
		
	}
	@Test(priority=7, groups="Classrooms Module")
	public void ViewDetailsAddStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.ViewDetailsAddStudent();
		
	}
	@Test(priority=8, groups="Classrooms Module")
	public void ViewDetailsAddAssignedStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.ViewDetailsAddAssignedStudent();
		
	}
	@Test(priority=9, groups="Classrooms Module")
	public void TransferStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.TransferStudent();
		
	}
	@Test(priority=10, groups="Classrooms Module")
	public void TransferCancelStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.TransferCancelStudent();
		
	}
	@Test(priority=11, groups="Classrooms Module")
	public void UnassignStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.UnassignStudent();
		
	}
	@Test(priority=12, groups="Classrooms Module")
	public void UnassignNoStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.UnassignNoStudent();
		
	}
	@Test(priority=13, groups="Classrooms Module")
	public void IconTransferStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.IconTransferStudent();
		
	}
	@Test(priority=14, groups="Classrooms Module")
	public void IconTransferCancelStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.IconTransferCancelStudent();
		
	}
	@Test(priority=15, groups="Classrooms Module")
	public void IconUnassignStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.CreateaNewClass();
		
	}
	@Test(priority=16, groups="Classrooms Module")
	public void IconUnassignNoStudent() throws InterruptedException{
		Thread.sleep(2000);
		CR.IconUnassignNoStudent();
		
	}
	@Test(priority=17, groups="Classrooms Module")
	public void ViewDetailsBack() throws InterruptedException{
		Thread.sleep(2000);
		CR.ViewDetailsBack();
		
	}
	@Test(priority=18, groups="Classrooms Module")
	public void CreateSubject() throws InterruptedException{
		Thread.sleep(2000);
		CR.CreateSubject();
		
	}
	@Test(priority=19, groups="Classrooms Module")
	public void AddChapters() throws InterruptedException{
		Thread.sleep(2000);
		CR.AddChapters();
		
	}
	@Test(priority=20, groups="Classrooms Module")
	public void BrowseSubjects() throws InterruptedException{
		Thread.sleep(2000);
		CR.CreateaNewClass();
		
	}
	@Test(priority=21, groups="Classrooms Module")
	public void BrowseNoSubjects() throws InterruptedException{
		Thread.sleep(2000);
		CR.BrowseNoSubjects();
		
	}
	@Test(priority=22, groups="Classrooms Module")
	public void ChaptersOpeninSubject() throws InterruptedException{
		Thread.sleep(2000);
		CR.ChaptersOpeninSubject();
		
	}
	@Test(priority=23, groups="Classrooms Module")
	public void ResourceBack() throws InterruptedException{
		Thread.sleep(2000);
		CR.ResourceBack();
		
	}
*/	

	
}
