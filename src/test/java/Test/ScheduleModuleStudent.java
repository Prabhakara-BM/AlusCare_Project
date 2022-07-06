package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;

//@Listeners(TestNGListener.Listeners.class)

public class ScheduleModuleStudent extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;

	public ScheduleModuleStudent() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();

		HP = LC.newLoginUsingMobile(prop.getProperty("SMTPhonenum"), prop.getProperty("OTP"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}

	@Test(priority = 6)
	public void validateEditInOccuranceStudent() throws InterruptedException {
		wait(3000);
		System.out.println("The test case 1 is started ");
		SP.clickOnSceduleModule();
		SP.filtersInSceduleStudent();
		SP.searchForSubject();
		System.out.println("The test case 1 was completetd  ");

	}

}