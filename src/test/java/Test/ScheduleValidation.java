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

public class ScheduleValidation extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;

	public ScheduleValidation() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();

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
	public void validateEditInOccurance() throws InterruptedException {

		Thread.sleep(3000);

		System.out.println("The test case 1 is started for execution ");
		try {
			SP.EditInOccuranceSchedule();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 1 was completetd  ");

	}

	@Test(priority = 2)
	public void validateEditSchedule() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 2 is started for execution ");
		try {
			SP.editSchedule();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 2 was completetd  ");

	}

	@Test(priority = 3)
	public void clickOnSaveButttonINOccurance() throws InterruptedException {
		System.out.println("The test case 3 is started for execution ");
		SP.editOccuranceClickOnSave();
		System.out.println("The test case 3 is completed ");

	}

	@Test(priority = 4)
	public void seachForScedule() throws InterruptedException {
		Thread.sleep(3000);

		System.out.println("The test case 3 is started for execution ");
		try {
			SP.searchByScedule("Adoni");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case 3 was completetd  ");
	}

	@Test(priority = 5)
	public void seachForCalender() {
try {
	SP.verifyCalender();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}