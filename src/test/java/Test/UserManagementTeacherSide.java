package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagementPage;
import Util.TestUtil;

public class UserManagementTeacherSide extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;

	UserManagementPage UM;

	public UserManagementTeacherSide() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		UM = new UserManagementPage();
		LC = new LoginClass();
		UM = new UserManagementPage();

	
		HP = LC.MobileRegister(prop.getProperty("AdminNumber"), prop.getProperty("DefaultOTP"));
	

	}
	@Test(priority = 1)
	public void teacherAdminuserCreations() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 1 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateClickCancelStudent();
		WaitTil(2000);
		UM.addaUser("StudentCreation");
		WaitTil(2000);
		UM.validateClickCancelTeacher();
		WaitTil(2000);
		UM.addaUser("TeacherCreation");
		WaitTil(2000);
		UM.addaUser("TeacherCreation2");
		WaitTil(2000);
		UM.validateClickCancelDataOperator();
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation");
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation2");
		WaitTil(2000);
		UM.validateClickCancelOperation();
		WaitTil(2000);
		UM.addaUser("OperationCreation");
		WaitTil(2000);
		UM.addaUser("OperationCreation2");
		System.out.println("The Test case 1 is completetd  ");
	}
	@Test(priority = 2)
	public void teacherAdminvalidateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 2 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.validateUserManagementPage();
		System.out.println("The Test case 2 is completed ");	
	}
	@Test(priority = 3)
	public void teacherAdminregistrationRequestsApprovals() throws InterruptedException {
	
		WaitTil(2000);
		System.out.println("The Test case 3 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.registrationRequestsApprovals();
		System.out.println("The Test case 3 is completed ");
	}

	@Test(priority = 4)
	public void teacherAdminvalidateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 4 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		System.out.println("The Test case 4 is completetd ");
	}
	
	@Test(priority = 5)
	public void teacherAdminvalidateStudentViewmorePage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 5 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.viewmoreCancelStudentCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.validateUnassignedStudent();
		WaitTil(2000);
		System.out.println("The Test case 5 is completetd ");
		
	}
	
	@Test(priority = 6)
	public void teacherAdminvalidateTeacherViewmorePage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 6 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.viewmoreCancelTeacherCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("TeacherCreation2");
		WaitTil(2000);
		UM.adminValidateViewMorePage();
		WaitTil(2000);
		System.out.println("The Test case 6 is completed ");
		
	}
	@Test(priority = 7)
	public void teacherAdminvalidateDataoperatorViewmorePage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 7 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.viewmoreCancelDataoperatorCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("DataOperatorCreation2");
		WaitTil(2000);
		UM.adminValidateViewMorePage();
		WaitTil(2000);
		System.out.println("The Test case 7 is completed ");
		
	}
	@Test(priority = 8)
	public void teacherAdminvalidateOperationViewmorePage() throws InterruptedException {
		
		WaitTil(2000);
		System.out.println("The Test case 8 is started ");
		UM.clickOnUserManagement();
		wait(3000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.viewmoreCancelOperationCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("OperationCreation2");
		WaitTil(2000);
		UM.adminValidateViewMorePage();
		System.out.println("The Test case 8 is completetd ");
		
	}
	@Test(priority = 9)
	public void teacherAdminLogout()
	{
		WaitTil(2000);
		LC.LogOut();
		WaitTil(2000);
	}
	
}