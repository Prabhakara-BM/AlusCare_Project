package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;
import Pages.TestPage;

public class TestModuleAdmin extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	TestPage TP;

	public TestModuleAdmin(){
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();
		TP = new TestPage();
		HP = LC.newLogin(prop.getProperty("username"), prop.getProperty("password"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}

	@Test
	public void createPageTest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("--The create page test 1 is started --");
		//date();
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Objective");
		TP.enterDetailsOfTest();
		TP.fillTimeAndDate();
}
	@Test(priority=2)
	public void createPageTestSub() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("--The create page test 1 is started --");
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Subjective");
		TP.enterDetailsOfTestsUBJECTIVE();
	//TP.enterDetailsOfTest();
		TP.fillDateAndTineForSub();
			
	

	}
	@Test(priority=3)
	public void cloneObectiveType() throws InterruptedException {
		Thread.sleep(3000);
		TP.clickOnTestButton();
		TP.CloningObjectType();
		
	}
	@Test(priority=4)
	public void viewAll() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("--The create page test 4 is started --");	
		TP.clickOnTestButton();
		TP.clickOnViewAll();
		TP.selectSyllabusLoop();
		//TP.dateFilter();
		TP.filterByClass();
		TP.searchByName("Hello");
		//TP.clickOnPublish("YES");
		
		}
	@Test(priority=5)
	public void publish() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("--The create page test 5 is started --");	
		TP.clickOnTestButton();	
		TP.clickOnViewAll();
		TP.clickOnPublish("YES");
		
	}
	@Test(priority=6)
	public void doCloning() throws InterruptedException {
		wait(3000);
		System.out.println("--The create page test 6 is started --");
		TP.clickOnTestButton();	
		TP.clickOnViewAll();
		TP.clickOnThreeClone();
	}
	@Test(priority=7)
	public void readyForPublishEdit() throws InterruptedException {
		wait(3000);
		System.out.println("--The create page test 7 is started --");
		TP.clickOnTestButton();	
		TP.readyToBePub("Edit Details");
		}
	@Test(priority=8)
	public void readyForPublishClone() throws InterruptedException {
		wait(3000);
		System.out.println("--The create page test 8 is started --");
		TP.clickOnTestButton();	
		TP.readyToBePub("Clone");
		}
	@Test(priority=9)
	public void readyForPublishDelete() throws InterruptedException {
		wait(3000);
		System.out.println("--The create page test 9 is started --");
		TP.clickOnTestButton();	
		TP.readyToBePub("Delete");
		}
	/*@Test(priority=10)
	public void questionAndAnswer() throws InterruptedException {
		wait(3000);
		System.out.println("--The create page test 10 is started --");
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Objective");
		//TP.enterDetailsOfTest("FirstTest");
		}
	@Test(priority=11)
	public void dateFormate() {
		
		wait(3000);
		date();
	}*/
	
}