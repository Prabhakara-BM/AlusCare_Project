package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagementPage;
import Util.TestUtil;

public class UserManagementOperatorSide extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;

	UserManagementPage UM;

	public UserManagementOperatorSide() {
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
/*	@Test(priority = 28)
	public void operationrAdminLogin() throws InterruptedException
	{
		WaitTil(2000);
		HP = LC.MobileRegister(prop.getProperty("OperationAdmin"), prop.getProperty("DefaultOTP"));
		
	}*/

	@Test(priority = 1)
	public void operationAdminuserCreations() throws InterruptedException {
		WaitTil(2000);
		System.out.println("Test case 1 is started:");
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
		System.out.println("Test case 1 is Completed:");
	}
	@Test(priority = 2)
	public void operationAdminvalidateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 2 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateUserManagementPage();
		System.out.println("The Test case 2 is Completed ");
			
	}
	@Test(priority = 3)
	public void operationAdminregistrationRequestsApprovals() throws InterruptedException {
	
		WaitTil(2000);
		System.out.println("The Test case 3 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.registrationRequestsApprovals();
		System.out.println("The Test case 3 is Completed ");
	}

	@Test(priority = 4)
	public void operationAdminvalidateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 4 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		System.out.println("The Test case 4 is Completed ");
		
	}
	
	/*@Test(priority = 5)
	public void operationAdminvalidateStudentViewmorePage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 5 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.viewmoreCancelStudentCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.validateUnassignedStudent();
		WaitTil(2000);
		System.out.println("The Test case 5 is Completed ");
		
	}
	
	@Test(priority = 6) 
	public void operationAdminvalidateTeacherViewmorePage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 6 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
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
		System.out.println("The Test case 6 is Completed ");
		
	}
	@Test(priority = 7) 
	public void operationAdminvalidateDataoperatorViewmorePage() throws InterruptedException {
		WaitTil(2000);
		System.out.println("The Test case 7 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
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
		System.out.println("The Test case 7 is Completed ");
		
	}
	@Test(priority = 8)
	public void operationAdminvalidateOperationViewmorePage() throws InterruptedException {
		
		WaitTil(2000);
		System.out.println("The Test case 8 is started ");
		UM.clickUserManagement();
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.viewmoreCancelOperationCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("OperationCreation2");
		WaitTil(2000);
		UM.adminValidateViewMorePage();
		System.out.println("The Test case 8 is Completed ");
		
	}*/

}
