package Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Pages.DigitalLibraryPage;
//import Pages.FeeManagementPage;
import Pages.HomePage1;
import Pages.LoginClass;

	public class DigitalLibraryTest extends Aulas_Base.BaseTest{
		LoginClass LC;
			
		    HomePage1 HP;
			
		    DigitalLibraryPage DL;

			
			public DigitalLibraryTest () {
				super();
			}
			
			@BeforeSuite
			public void setup()throws InterruptedException{
				initilization();
				

				DL=new  DigitalLibraryPage();

				LC = new LoginClass();
				
				HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
				}
			
			@Test(priority=1)
			public void GetStorage() throws InterruptedException, AWTException 
			{
				Thread.sleep(3000);
				DL.LectureNotes();
			}
			
			
			}

