package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NotificationPage;
import Pages.SchedulePage;
//@Listeners(TestNGListener.Listeners.class)

public class NotificationModuleDataOper extends Aulas_Base.BaseTest {
	LoginClass LC;

	HomePage1 HP;

	AnnouncementPage AP;
	SchedulePage SP;
	NotificationPage NP;

	public NotificationModuleDataOper() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();

		AP = new AnnouncementPage();

		LC = new LoginClass();
		SP = new SchedulePage();
		NP=new NotificationPage();
		//HP = LC.newLoginUsingMobile(prop.getProperty("Np"), prop.getProperty("OTP"));
		HP = LC.newLoginUsingMobile(prop.getProperty("ND"), prop.getProperty("OTP"));


		/*
		 * JavascriptExecutor js= (JavascriptExecutor)driver; Thread.sleep(1000);
		 * WebElement Communication =
		 * driver.findElement(By.xpath("//div[text()='Communication']"));
		 * Thread.sleep(1000); js.executeScript("arguments[0].scrollIntoView(true)",
		 * Communication);
		 */

	}
	@Test(priority=1)
	public void checkAllNotifiations() {
		System.out.println("First test case 1 started ");
		NP.clickOnNotification();
		NP.clickAllNotifications();
		NP.numberOfBlocksInAllNotifications();
	}
/*	@Test(priority=2)
	public void selectValuesIndropdown() {
		System.out.println("First test case 2 started ");
		NP.clickOnNotification();
		NP.clickAllNotifications();
		NP.clickAllSelectOneByOne();
	}
	@Test(priority=3)
	public void announcements() {
		System.out.println("First test case 3 started ");
		NP.clickOnNotification();
		NP.clickOnAnnouncement();
		NP.clickAllSelectOneByOne();
		}
	@Test(priority=4)
	public void assignments() {
		System.out.println("First test case 4 started ");
		NP.clickOnNotification();
		NP.clickOnAssignments();
		NP.clickAllSelectOneByOne();
		System.out.println("First test case 4 Completed ");
		}
	@Test(priority=5)
	public void Test() {
		System.out.println("First test case 5 started ");
		NP.clickOnNotification();
		NP.clickOnTest();
		NP.clickAllSelectOneByOne();
		System.out.println("First test case 5 Completed ");
		}
	@Test(priority=6)
	public void practiceTest() {
		System.out.println("First test case 6 started ");
		NP.clickOnNotification();
		NP.clickOnPractceTest();
		NP.clickAllSelectOneByOne();
		System.out.println("First test case 6 Completed ");
		}*/
	
	@AfterSuite
	public void taerDown() {
		//driver.quit();
		
		NP.logout();
		//driver.quit();
		System.out.println("After suite was executed----");
	}
	
	/*@Test(priority=7)
	public void DigitalLibrery() {
		System.out.println("First test case 7 started ");
		NP.clickOnNotification();
		NP.clickOnDigitalLibrery();
		NP.clickAllSelectOneByOne();
		System.out.println("First test case 7 Completed ");
		}
	@Test(priority=8)
	public void others() {
		System.out.println("First test case 8 started ");
		NP.clickOnNotification();
		NP.clickOnOthersInDataOper();
		NP.clickAllSelectOneByOne();
		System.out.println("First test case 8 Completed ");
		}
	@Test(priority=9)
	public void SearchOneMore() {
		System.out.println("First test case 9 started ");
		NP.clickOnNotification();
		NP.getRegisteredStatus();
		
		System.out.println("First test case 9 Completed ");
		}*/
	
	

}