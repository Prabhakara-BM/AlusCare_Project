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
import Pages.RegistrationPage;
import Pages.SchedulePage;
import Pages.TestPage;

public class TestModuleOperator extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	TestPage TP;
	RegistrationPage RP;

	public TestModuleOperator() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();
		TP = new TestPage();
		RP = new RegistrationPage();
		HP = LC.newLoginUsingMobile(prop.getProperty("TMOPhonenum"), prop.getProperty("OTP"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}
	
	@Test(priority = 1)
	public void createTestOperator() throws InterruptedException {
		wait(3000);
		System.out.println("Create test using Operator credentials is started:Test case 1");
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Objective");
		TP.enterDetailsOfTest();
		TP.fillTimeAndDate();
		System.out.println("Create test using Operator credentials is completetd:Test case 1");

	}

	@Test(priority = 2)
	public void createSubTestOperator() throws InterruptedException {
		wait(3000);
		System.out.println("Create Subjective test using  operator credentials is started:Test case 2");
		getCurrentDate();
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Subjective");
		TP.enterDetailsOfTestsUBJECTIVE();
		// TP.enterDetailsOfTest();
		TP.fillDateAndTineForSub();
		System.out.println("Create Subjective test using  operator credentials is Completed:Test case 2");
	}
	@Test(priority = 3)
	public void editDetailsOpe() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Edit details using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptions("Edit Details");
		System.out.println("Edit details using data operator credentials is completed");

	}
	
	@Test(priority = 4)
	public void cloneOp() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("cloningTest using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptionsForTeacher("Clone");
		System.out.println("cloningTest using data operator credentials is completed");

	}
	
	@Test(priority = 5)
	public void deleteDataOp() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("deleteTest using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptions("Delete");
		System.out.println("deleteTest using data operator credentials is completed");

	}
	@Test(priority = 6)
	public void questionAndAnswDataOp() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test case 6 is started  using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.setQuesAndAnsew();
		TP.question1();
		TP.optionsABCD();
		TP.coorectAnsAndExit();
		TP.publicshNow("CANCEL");
		System.out.println("test case 6 is started  using data operator credentials is completetd ");

	}
	
	
	@Test(priority=7)
	public void IMPORTQuestions() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 7 started ");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.performImportTask("Sample Question Papers");
		TP.selectOptionInNCERT();
		}
	
	@Test(priority=8)
	public void searchBy() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 7 started ");
		TP.clickOnTestButton();
		TP.performSearchOpe("tyty");
		
	}
	@Test(priority=9)
	public void searchByName() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 9 started ");
		TP.clickOnTestButton();
		TP.performSearchOpeName("Class-Prabha");
		
	}
	@Test(priority=10)
	public void checkOverAllStatus() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 10 started ");
		TP.clickOnTestButton();
		TP.getOverallStatus();
	}
	
	/*@Test(priority=11)
	public void IMPORTQuestions1() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 11 started ");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.performImportTask("Subject-wise Question Papers");
		TP.selectOptionInNCERT();
		}*/
	@Test(priority=12)
	public void searchingOperationsDataOp() throws InterruptedException {
		wait(3000);
		System.out.println("The test case 12 is started");
		TP.clickOnTestButton();
		wait(3000);
		TP.doSearchOperation();
		System.out.println("The test case 12 is completed");
	}
}