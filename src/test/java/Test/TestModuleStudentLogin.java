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

public class TestModuleStudentLogin extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	TestPage TP;
	RegistrationPage RP;

	public TestModuleStudentLogin() {
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
		HP = LC.newLoginUsingMobile(prop.getProperty("TMSPhonenum"), prop.getProperty("OTP"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}

	@Test
	public void createPageTestStudent() throws InterruptedException {

		wait(3000);
		System.out.println("Test case 1 is started ");
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Objective");
		TP.enterDetailsOfTest();
		TP.fillTimeAndDate();

	}

	@Test(priority = 2)
	public void createPageTestSubStudent() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("--The create page test 1 is started --");
		TP.clickOnTestButton();
		TP.clickOnCreateTest();
		TP.chooseTestType("Subjective");
		TP.enterDetailsOfTestsUBJECTIVE();
		// TP.enterDetailsOfTest();
		TP.fillDateAndTineForSub();

		// randomNumber();

	}

	@Test(priority = 3)
	public void editDetailsStudent() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Edit details using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptions("Edit Details");
		System.out.println("Edit details using data operator credentials is completed");

	}
	@Test(priority = 4)
	public void cloneStudent() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("cloningTest using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptions("Clone");
		System.out.println("cloningTest using data operator credentials is completed");

	}
	@Test(priority = 5)
	public void deleteStudent() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("deleteTest using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.selectOptions("Delete");
		System.out.println("deleteTest using data operator credentials is completed");

	}
	@Test(priority = 6)
	public void questionAndAnswStudent() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test case 6 is started  using data operator credentials is started");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.setQuesAndAnsew();
		TP.question1();
		TP.optionsABCD();
		TP.coorectAnsAndExit();
		TP.clickSendForReview("CANCEL");
		System.out.println("test case 6 is started  using data operator credentials is completetd ");

	}
	
	
	@Test(priority=7)
	public void IMPORTQuestionsStudent() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 7 started ");
		TP.clickOnTestButton();
		TP.selectEditDetailsDOP();
		TP.performImportTask("Sample Question Papers");
		TP.selectOptionInNCERT();
		}
	
	@Test(priority=8)
	public void searchByStudent() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 7 started ");
		TP.clickOnTestButton();
		TP.performSearchOpe("tyty");
		
	}
	@Test(priority=9)
	public void searchByNameStudent() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 9 started ");
		TP.clickOnTestButton();
		TP.performSearchOpeName("Class-Prabha");
		
	}
	@Test(priority=10)
	public void checkOverAllStatusStudent() throws InterruptedException {
		wait(3000);
		System.out.println("Test case 10 started ");
		TP.clickOnTestButton();
		TP.getOverallStatus();
	}
	

	@Test(priority = 11)
	public void cloneObectiveTypeStudent() throws InterruptedException {
		Thread.sleep(3000);
		TP.clickOnTestButton();
		//TP.CloningObjectType();
		TP.selectEditDetailsDOP();
		TP.selectOptions("Clone");
	}
	
	@Test(priority=12)
	public void searchingOperations() throws InterruptedException {
		wait(3000);
		System.out.println("The test case 12 is started");
		TP.clickOnTestButton();
		wait(3000);
		TP.doSearchOperation();
		System.out.println("The test case 12 is completed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}