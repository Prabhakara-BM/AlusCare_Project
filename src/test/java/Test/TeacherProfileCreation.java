package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagementPage;
import Util.TestUtil;

public class TeacherProfileCreation extends Aulas_Base.BaseTest
{

	
    LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	
	UserManagementPage UM;


	public TeacherProfileCreation()
	{
		super();
	}



	@BeforeSuite
	public void setup() throws InterruptedException
	{
		initilization();
		UM = new UserManagementPage();
		LC = new LoginClass();
		UM = new UserManagementPage();
	
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		//Thread.sleep(2000);
		//System.out.println(driver.switchTo().alert().getText());

		//driver.switchTo().alert().accept();     //positive like ok
		//Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();  // negative like Cancel
		
	}
	
	@Test
	public void CreateProfileForTeacher() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("------------The createProfile for teaches was started ---------");
		
		try {
			UM.teacherProfileCreate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------The createProfile for teaches was completed successfully ---------");
		
	}
}