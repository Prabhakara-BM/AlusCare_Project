package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class RegistrationPage extends Aulas_Base.BaseTest {

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnRegister() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[2]")).click();
		System.out.println("-Register page is open--");
	}

	public void fillRegisrtaionForm() {
		selectRole("Teacher");
		EnterName("HelloBrigosha");
		eneterMobileNumber("1234567890");
		eneterEmailID("helloBrogohsa@gmail.com");
		eneterDistrictOrCity("Kolar");
		eneterPinCode("563139");
		eneterState("Karnataka");
		clickOnRegisterButton();

	}

	public void selectRole(String role) {
		// select role
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-dropdown-trigger cursor-pointer r-c-sb m-t-10']")).click();
		if (role.equalsIgnoreCase("Teacher")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[1]")).click();
			System.out.println("--The selected role is:" + " " + role);
		}
		if (role.equalsIgnoreCase("Student")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[2]")).click();
			System.out.println("--The selected role is:" + " " + role);
		}
		if (role.equalsIgnoreCase("Data Operator")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[3]")).click();
			System.out.println("--The selected role is:" + " " + role);
		}
		if (role.equalsIgnoreCase("Operation")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[4]")).click();
			System.out.println("--The selected role is:" + " " + role);
		}
		System.out.println("--The final selected role is " + " " + role);

	}

	public void EnterName(String name) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter Name']")).sendKeys(name);
		System.out.println("--The User name is :" + " " + name);
	}

	public void eneterMobileNumber(String mobileNumber) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter Mobile Number']")).sendKeys(mobileNumber);
		System.out.println("--The Mobile number is :" + " " + mobileNumber);
	}

	public void eneterEmailID(String emailID) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter Email ID']")).sendKeys(emailID);
		System.out.println("--The enetered email id is :" + " " + emailID);
	}

	public void eneterDistrictOrCity(String DistrictOrCity) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter City']")).sendKeys(DistrictOrCity);
		System.out.println("--The enetered District is :" + " " + DistrictOrCity);
	}

	public void eneterPinCode(String PinCode) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter PIN / ZIP Code']")).sendKeys(PinCode);
		System.out.println("--The enetered District pin code is :" + " " + PinCode);
	}

	public void eneterState(String state) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter State']")).sendKeys(state);
		System.out.println("--The enetered state is :" + " " + state);
	}

	public void clickOnRegisterButton() {
		driver.findElement(
				By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-round ant-btn-block r-c-c bold-bold']")).click();

	}

	/*****************************************************
	 * MobileRegistartion
	 *********************************************/

	public void clickOnMobileTab() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[4]")).click();
		System.out.println("--Mobile tab is opened--");
	}

	public void mobileOTPVerification(String MNumber) {
		wait(3000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(MNumber);
		System.out.println("--The Emobile number is :" + " " + MNumber);

	}

}