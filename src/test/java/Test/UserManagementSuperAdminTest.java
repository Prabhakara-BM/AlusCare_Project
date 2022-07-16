package Test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.UserManagementPage;
import Util.TestUtil;

public class UserManagementSuperAdminTest extends BaseTest {

	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;

	UserManagementPage UM;

	public UserManagementSuperAdminTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws InterruptedException {
		initilization();
		UM = new UserManagementPage();
		LC = new LoginClass();
		UM = new UserManagementPage();

	
		HP = LC.newLogin(prop.getProperty("username"), prop.getProperty("password"));
	

	}
	

	@Test(priority = 1)
	public void userCreations() throws InterruptedException {
		WaitTil(2000);
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
		UM.addaUser("TeacherCreation1");
		WaitTil(2000);
		UM.addaUser("TeacherCreation2");
		WaitTil(2000);
		UM.validateClickCancelDataOperator();
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation");
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation1");
		WaitTil(2000);
		UM.addaUser("DataOperatorCreation2");
		WaitTil(2000);
		UM.validateClickCancelOperation();
		WaitTil(2000);
		UM.addaUser("OperationCreation");
		WaitTil(2000);
		UM.addaUser("OperationCreation1");
		WaitTil(2000);
		UM.addaUser("OperationCreation2");
	}
	@Test(priority = 2)
	public void validateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateUserManagementPage();
			
	}
	@Test(priority = 3)
	public void registrationRequestsApprovals() throws InterruptedException {
	
		WaitTil(2000);
		UM.registrationRequestsApprovals();
	}

	@Test(priority = 4)
	public void validateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		
	}
	
	@Test(priority = 5)
	public void validateStudentViewmorePage() throws InterruptedException {
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.viewmoreCancelStudentCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.validateUnassignedStudent();
		WaitTil(2000);
		
	}
	@Test(priority = 6)
	public void validateTeacherViewmorePage() throws InterruptedException {
		WaitTil(2000);
		UM.clickTeacherViewMore();
		WaitTil(2000);
		UM.viewmoreCancelTeacherCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("TeacherCreation1");
		WaitTil(2000);
		UM.vieworeAddaUser("TeacherCreation2");
		WaitTil(2000);
		UM.validateViewMorePage();
		WaitTil(2000);
		
	}
	@Test(priority = 7)
	public void validateDataoperatorViewmorePage() throws InterruptedException {
		WaitTil(2000);
		UM.clickDataoperatorViewMore();
		WaitTil(2000);
		UM.viewmoreCancelDataoperatorCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("DataOperatorCreation1");
		WaitTil(2000);
		UM.vieworeAddaUser("DataOperatorCreation2");
		WaitTil(2000);
		UM.validateViewMorePage();
		WaitTil(2000);
		
	}
	
	@Test(priority = 6)
	public void validateOperationViewmorePage() throws InterruptedException {
	
		WaitTil(2000);
		UM.clickOperationViewMore();
		WaitTil(2000);
		UM.viewmoreCancelOperationCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.vieworeAddaUser("OperationCreation1");
		WaitTil(2000);
		UM.vieworeAddaUser("OperationCreation2");
		WaitTil(2000);
		UM.validateViewMorePage();
		
	}
	
	@Test(priority = 7)
	public void superAdminLogout()
	{
		WaitTil(2000);
		LC.LogOut();
		WaitTil(2000);
	}
	
	//Admin login 
/*	@Test(priority = 8)
	public void teacherAdminLogin() throws InterruptedException
	{
		WaitTil(2000);
		HP = LC.MobileRegister(prop.getProperty("AdminNumber"), prop.getProperty("DefaultOTP"));
		
	}

	@Test(priority = 9)
	public void teacherAdminuserCreations() throws InterruptedException {
		WaitTil(2000);
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
	}
	@Test(priority = 10)
	public void teacherAdminvalidateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateUserManagementPage();
			
	}
	@Test(priority = 11)
	public void teacherAdminregistrationRequestsApprovals() throws InterruptedException {
	
		WaitTil(2000);
		UM.registrationRequestsApprovals();
	}

	@Test(priority = 12)
	public void teacherAdminvalidateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		
	}
	
	@Test(priority = 13)
	public void teacherAdminvalidateStudentViewmorePage() throws InterruptedException {
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.viewmoreCancelStudentCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.validateUnassignedStudent();
		WaitTil(2000);
		
	}
	
	@Test(priority = 14)
	public void teacherAdminvalidateTeacherViewmorePage() throws InterruptedException {
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
		
	}
	@Test(priority = 15)
	public void teacherAdminvalidateDataoperatorViewmorePage() throws InterruptedException {
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
		
	}
	@Test(priority = 16)
	public void teacherAdminvalidateOperationViewmorePage() throws InterruptedException {
		
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
		
	}
	
	@Test(priority = 17)
	public void teacherAdminLogout()
	{
		WaitTil(2000);
		LC.LogOut();
		WaitTil(2000);
	}
	@Test(priority = 18)
	public void dataoperatorAdminLogin() throws InterruptedException
	{
		WaitTil(2000);
		HP = LC.MobileRegister(prop.getProperty("DataOperatorAdmin"), prop.getProperty("DefaultOTP"));
		
	}

	@Test(priority = 19)
	public void dataoperatorAdminuserCreations() throws InterruptedException {
		WaitTil(2000);
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
	}
	@Test(priority = 20)
	public void dataoperatorAdminvalidateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateUserManagementPage();
			
	}
	@Test(priority = 21)
	public void dataoperatorAdminregistrationRequestsApprovals() throws InterruptedException {
	
		WaitTil(2000);
		UM.registrationRequestsApprovals();
	}

	@Test(priority = 22)
	public void dataoperatorAdminvalidateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		
	}
	
	@Test(priority = 23)
	public void dataoperatorAdminvalidateStudentViewmorePage() throws InterruptedException {
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.viewmoreCancelStudentCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.validateUnassignedStudent();
		WaitTil(2000);
		
	}
	
	@Test(priority = 24)
	public void dataoperatorAdminvalidateTeacherViewmorePage() throws InterruptedException {
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
		
	}
	@Test(priority = 25)
	public void dataoperatorAdminvalidateDataoperatorViewmorePage() throws InterruptedException {
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
		
	}
	@Test(priority = 26)
	public void dataoperatorAdminvalidateOperationViewmorePage() throws InterruptedException {
		
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
		
	}
	@Test(priority = 27)
	public void dataoperatorAdminLogout()
	{
		WaitTil(2000);
		LC.LogOut();
		WaitTil(2000);
	}
	@Test(priority = 28)
	public void operationrAdminLogin() throws InterruptedException
	{
		WaitTil(2000);
		HP = LC.MobileRegister(prop.getProperty("OperationAdmin"), prop.getProperty("DefaultOTP"));
		
	}

	@Test(priority = 29)
	public void operationAdminuserCreations() throws InterruptedException {
		WaitTil(2000);
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
	}
	@Test(priority = 30)
	public void operationAdminvalidateUserManagementPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateUserManagementPage();
			
	}
	@Test(priority = 31)
	public void operationAdminregistrationRequestsApprovals() throws InterruptedException {
	
		WaitTil(2000);
		UM.registrationRequestsApprovals();
	}

	@Test(priority = 32)
	public void operationAdminvalidateRegistrationRequestsPage() throws InterruptedException {
		WaitTil(2000);
		UM.validateRegistrationRequestsPage();
		WaitTil(2000);
		
	}
	
	@Test(priority = 33)
	public void operationAdminvalidateStudentViewmorePage() throws InterruptedException {
		WaitTil(2000);
		UM.studentViewMoreClick();
		WaitTil(2000);
		UM.viewmoreCancelStudentCreation();
		WaitTil(2000);
		UM.vieworeAddaUser("UserCreation");
		WaitTil(2000);
		UM.validateUnassignedStudent();
		WaitTil(2000);
		
	}
	
	@Test(priority = 34)
	public void operationAdminvalidateTeacherViewmorePage() throws InterruptedException {
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
		
	}
	@Test(priority = 35)
	public void operationAdminvalidateDataoperatorViewmorePage() throws InterruptedException {
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
		
	}
	@Test(priority = 36)
	public void operationAdminvalidateOperationViewmorePage() throws InterruptedException {
		
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
		
	}*/
	@Test(priority = 36)
	public void uploadImage() throws InterruptedException {
		wait(3000);
		try {
			UM.clickCameraToUpload();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
