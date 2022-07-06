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

public class TestModuleTeacher extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	TestPage TP;
	RegistrationPage RP;

	public TestModuleTeacher() {
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
		HP = LC.newLoginUsingMobile(prop.getProperty("TMTPhonenum"), prop.getProperty("OTP"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}

	@Test(priority = 1)
	public void createTestTeacher() throws InterruptedException {
		wait(3000);
		System.out.println("Create test using Teacher credentials is started:Test case 1");
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Objective");
		TP.enterDetailsOfTest();
		TP.fillTimeAndDate();
		System.out.println("Create test using Teacher credentials is completetd:Test case 1");

	}

	@Test(priority = 2)
	public void createSubTestDataOp() throws InterruptedException {
		wait(3000);
		System.out.println("Create Subjective test using data operator credentials is started:Test case 2");
		getCurrentDate();
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Subjective");
		TP.enterDetailsOfTestsUBJECTIVE();
		// TP.enterDetailsOfTest();
		TP.fillDateAndTineForSub();
		System.out.println("Create Subjective test using data operator credentials is Completed:Test case 2");
	}

	@Test(priority = 3)
	public void editDetailsTeacher() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Edit details using data operator credentials is started:Test case 3");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		// TP.selectOptions("Edit Details");
		TP.selectOptionsForTeacher("Edit Details");
		System.out.println("Edit details using data operator credentials is completed:Test case 3");

	}

	@Test(priority = 4)
	public void cloneTeacher() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("cloningTest using data operator credentials is started:Test case 4");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptionsForTeacher("Clone");
		System.out.println("cloningTest using data operator credentials is completed:Test case 4");

	}

	@Test(priority = 5)
	public void deleteTeacher() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("deleteTest using data operator credentials is started:Test case 5");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptionsForTeacher("Delete");
		System.out.println("deleteTest using data operator credentials is completed:Test case 5");

	}

	@Test(priority = 6)
	public void questionAndAnswTeacher() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test case 6 is started  using data operator credentials is started:Test case 6");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.setQuesAndAnsew();
		TP.question1();
		TP.optionsABCD();
		TP.coorectAnsAndExit();
		TP.publicshNow("CANCEL");
		System.out.println("test case 6 is started  using data operator credentials is completetd :Test case 6");

	}

	@Test(priority = 7)
	public void IMPORTQuestionsTeacher() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 7 started ");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.performImportTask("Sample Question Papers");
		TP.selectOptionInNCERT();
		System.out.println("Test case 7 completed ");
	}

	@Test(priority = 8)
	public void searchByTeacher() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 8 started ");
		TP.clickOnTestButton();
		TP.performSearchOpe("tyty");
		System.out.println("Test case 8 completed ");
	}

	@Test(priority = 9)
	public void searchByNameTeacher() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 9 started ");
		TP.clickOnTestButton();
		TP.performSearchOpeName("Class-Prabha");
		System.out.println("Test case 9 completed ");
	}

	@Test(priority = 10)
	public void searchingOperationsStudent() throws InterruptedException {
		wait(3000);
		System.out.println("The test case 10 is started");
		TP.clickOnTestButton();
		wait(3000);
		TP.doSearchOperation();
		TP.cilckAllLabels();
		System.out.println("The test case 10 is completed");
	}
	@Test(priority = 11)
	public void printTitles() throws InterruptedException {
		wait(3000);
		System.out.println("The test case 11 is started");
		TP.clickOnTestButton();
		wait(3000);
		TP.getTitleOfAllTest();
		System.out.println("The test case 11 is completed");
	}
	@Test(priority = 12)
	public void printClassNames() throws InterruptedException {
		wait(3000);
		System.out.println("The test case 12 is started");
		TP.clickOnTestButton();
		wait(3000);
		TP.printAllClassNames();
		System.out.println("The test case 12 is completed");
	}

}