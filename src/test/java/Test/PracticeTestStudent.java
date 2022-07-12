package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.PracticeTestPage;

public class PracticeTestStudent  extends BaseTest{
	LoginClass LC;
    HomePage1 HP;
    PracticeTestPage PC;
  

	
	public PracticeTestStudent () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		PC=new  PracticeTestPage();

		LC = new LoginClass();
		
		HP = LC.newLoginUsingMobile(prop.getProperty("PTSPhonenum"),prop.getProperty("OTP"));
		
		}
	@Test(priority=1)
	public void Overview() throws Exception
	{
	//	PC.Overview();
		wait(2000);
		//PC. AllTypeTest("Chapter Test");
		System.out.println("The test case 1 is started ");
		PC.clickOnPracticeTest();
		PC.countNumberOfBlock("Full Test");
		PC.selectionOfClassInTest();
		PC.clickOnAttends();
		PC.clickOnAvailable();
		PC.clickOnSearchButton();
		System.out.println("The test case 1 is Completed ");
		wait(3000);
			
		
		wait(3000);
		
		
		
	}

}
