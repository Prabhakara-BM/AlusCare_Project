package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.RegistrationPage;
import Pages.SchedulePage;
import Pages.TestPage;

public class RegistrationTest extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	TestPage TP;
	RegistrationPage RP;

	public RegistrationTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();
		TP = new TestPage();
		RP=new RegistrationPage();
		//HP = LC.newLogin(prop.getProperty("username"), prop.getProperty("password"));

		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}
	@Test
	public void fillRegistartionDetails() {
		wait(3000);
		System.out.println("-fill regisration deatils test is started --");
		RP.clickOnRegister();
		RP.fillRegisrtaionForm();
		System.out.println("-fill regisration deatils test is completed --");
		
	}
	
	
}