package Pages;

import java.time.Duration;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TestPage extends Aulas_Base.BaseTest {

	public TestPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnTestButton() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@href,'/test')]")));
		driver.findElement(By.xpath("//*[contains(@href,'/test')]")).click();
		System.out.println("--The Test page module is selected--");
	}

	public void clickOnCreateTest() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']")));
		driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']")).click();
		System.out.println("--clicked on create Test button--");
	}

	public void chooseTestType(String testtype) throws InterruptedException {
		Thread.sleep(3000);
		if (testtype.equalsIgnoreCase("Objective")) {
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='text-right m-b-10'])[1]")).click();
			String selectedTest = driver
					.findElement(By.xpath("(//*[@class='text-xmd color-black bold-600 text-center m-t-30'])[1]"))
					.getText();
			System.out.println("--The selected test type is :" + " " + selectedTest);

		} else if (testtype.equalsIgnoreCase("Subjective")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='text-right m-b-10'])[2]")).click();
			String selectedTest1 = driver
					.findElement(By.xpath("(//*[@class='text-xmd color-black bold-600 text-center m-t-30'])[2]"))
					.getText();
			System.out.println("--The selected test type is :" + " " + selectedTest1);

		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();
		System.out.println("--The choose test type is successfull--");

	}

	public void enterDetailsOfTest() throws InterruptedException {
		String uuid = UUID.randomUUID().toString();
		// enter title
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).sendKeys(uuid);
		// click on examinar
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).click();
		Thread.sleep(3000);
		// select examinar
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[3]")).click();
		Thread.sleep(3000);
		// click sylabus
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[2]")).click();
		Thread.sleep(3000);
		// select full sylabus
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//*[@class='ant-select-item-option-content'])[13]")));
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[13]")).click();
		Thread.sleep(3000);
		// select subjects
		driver.findElement(By.xpath("//*[@title='Search subject(s)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[20]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@title='Select class']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[24]")).click();
		Thread.sleep(3000);
		/*
		 * WebDriverWait waitt=new WebDriverWait(driver,Duration.ofSeconds(30));
		 * waitt.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//*[@title='Search Android Development chapter']")));
		 */
		// driver.findElement(By.xpath("//*[@title='Search Android Development
		// chapter']")).click(); for time being
		// driver.findElement(By.xpath("//*[@title='Search Android Development
		// chapter']")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[25]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();

		System.out.println("--Entered test deatils successfully--");

	}

	public void enterDetailsOfTestsUBJECTIVE() throws InterruptedException {
		String uuid = UUID.randomUUID().toString();
		// enter title
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).sendKeys(uuid);
		// select exmaninor
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[3]")).click();
		// select Sylabus
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[2]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[13]")).click();
		wait(3000);
		// select subject
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-item'])[3]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[20]")).click();
		// select class
		wait(3000);
		driver.findElement(By.xpath("//*[@title='Select class']")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[24]")).click(); // Automation
																									// testing CSE
		// click on Next
		wait(3000);

		driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();
		wait(3000);
		System.out.println("next button clicked ");

		// click on cancel
		/*
		 * driver.findElement(By.
		 * xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
		 * System.out.println("cancel button clicked ");
		 */

	}

	public void fillTimeAndDateSubjective() {

		wait(3000);

	}

	public void fillTimeAndDate() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select date'])[1]")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();

		}
		Random rn = new Random();
		int j = rn.nextInt(10) + 1;
		System.out.println("Generated random number is :" + " " + j);
		// int j=0;
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@title='2025-06-0" + j + "']")).click();

		Thread.sleep(3000);
		// start time
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[25]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[1]")).click();
		// end time
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[2]")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[32]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[52]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select date'])[2]")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("(//*[@class='ant-picker-header-super-next-btn'])[2]")).click();

		}
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@title='2025-05-13']")).click();
		driver.findElement(By.xpath("(//*[@class='ant-picker-cell-inner'])[61]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[114]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[135]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Add Instructions']")).sendKeys("Create test was successfull");
		Thread.sleep(3000);

		/*driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();*/
		driver.findElement(By.
		  xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
		  System.out.println("clicked on cancel button");
		 
		System.out.println("--The time and date details was successfull");

	}

	public void fillDateAndTineForSub() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select date']")).click();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-picker-header-super-next-btn']")));
		for (int i = 0; i < 3; i++) {
			
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
		}
		Thread.sleep(3000);

		Random rn = new Random();
		int k = rn.nextInt(10) + 1;
		System.out.println("The random number generated is " + " " + k);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@title='2025-06-0" + k + "']")).click();
		// select start time
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[25]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[1]")).click();
		// select end time
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[30]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[53]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Add Instructions']")).sendKeys("The subject test completed");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@placeholder='Add Instructions']")).click();
		// click on create button
		/*Thread.sleep(3000);

		driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();
		wait(3000);*/
		// click on cancel button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
		System.out.println("Clicked on cancel button");
		System.out.println("The  subjective test creation was Done");
	}

	public void CloningObjectType() throws InterruptedException {

		Thread.sleep(3000);
		// WebElement scrollEle=driver.findElement(By.xpath("(//*[@class='ant-row r-c-c
		// full-width full-height'])[1]"));
		WebElement scrollEle = driver.findElement(By.xpath("//*[text()='AULASTEST-3116']"));
		scrollByElement(scrollEle);
		// click on 3 dots
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer'])[6]")).click();
		// select clone
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[1]")).click();

		// clicked on next button
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();
		wait(3000);
		driver.findElement(By.xpath("//*[@title='Select class']")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();
		// click on next
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
				.click();
		// click on create
		wait(3000);
		/*
		 * driver.findElement(By.
		 * xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"
		 * )) .click();
		 */
		// click on cancel
		driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
		System.out.println("-cancel button clciked--");

	}

	public void clickOnViewAll() {
		wait(3000);
		WebElement viewallEle = driver.findElement(
				By.xpath("(//*[@class='ant-btn ant-btn-link ant-btn-sm viewsolutionsbtn fs-12 m-t-30'])[1]"));
		scrollByElement(viewallEle);
		viewallEle.click();
		System.out.println("--cliked on view all button--");
	}

	public void filterBySyallabus(String syllabus) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Filter by syllabus']")).click();
		if (syllabus.equalsIgnoreCase("Chapter Test")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[1]")).click();

		} else if (syllabus.equalsIgnoreCase("Part Test")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[2]")).click();

		} else if (syllabus.equalsIgnoreCase("Full Test")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]")).click();
		}
		System.out.println("The sylabus fileter is :" + " " + syllabus);
	}

	public void selectSyllabusLoop() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Filter by syllabus']")).click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='ant-checkbox-input']"));
		int size = checkboxes.size();
		System.out.println("The size of the checkbox is :" + " " + size);
		for (int i = 1; i <= size; i++) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[" + i + "]")).click();

		}
	}

	public void dateFilter() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Filter by result date']")).click();
		WebElement date = driver.findElement(By.xpath("//*[@placeholder='Filter by result date']"));
		date.getAttribute("placeholder");
		System.out.println("Clicked on :" + " " + date.getAttribute("placeholder"));
		// forward and backword
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
			System.out.println("Next button is working fine ");
			// backword
			for (int j = 0; j < 5; j++) {
				driver.findElement(By.xpath("//*[@class='ant-picker-header-super-prev-btn']")).click();
				System.out.println("Previous is working fine ");
			}
			driver.findElement(By.xpath("//*[@class='ant-picker-today-btn']")).click();
			System.out.println("seleted date is today:");

		}
	}

	public void filterByClass() {
		wait(3000);
		WebElement eleclass = driver.findElement(By.xpath("//*[@placeholder='Filter by class']"));
		driver.findElement(By.xpath("//*[@placeholder='Filter by class']")).click();
		System.out.println("cliked on :" + " " + eleclass.getAttribute("placeholder"));
		List<WebElement> numberOfClass = driver
				.findElements(By.xpath("//*[@class='ant-checkbox-wrapper black p-10 m-l-0 full-width']"));
		for (int i = 6; i < 10; i++) {
			driver.findElement(By.xpath("(//*[@class='ant-checkbox-wrapper black p-10 m-l-0 full-width'])[" + i + "]"))
					.click();

		}

	}

	public void searchByName(String name) {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Search by test name']")).sendKeys(name);
	}

	public void clickOnPublish(String YN) {
		wait(3000);
		driver.findElement(
				By.xpath("(//*[@class='ant-btn purpleBtnWrap purpleButtonHoverEffect radius-100 text-xs'])[1]"))
				.click();
		if (YN.equalsIgnoreCase("YES")) {
			wait(3000);
			driver.findElement(
					By.xpath("//*[@class='ant-btn radius-100 m-l-20 purpleBtnWrap purpleButtonHoverEffect']")).click();
			System.out.println("Clicked on the YES button");
		} else if (YN.equalsIgnoreCase("CANCEL")) {
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("Clicked on the CANCEL button");
			//
		}
		/*
		 * String message =
		 * driver.findElement(By.xpath("ant-notification-notice-description")).getText()
		 * ; System.out.println("The message is :" + " " + message);
		 */

	}

	public void createClonedOne() {
		wait(3000);
		// click on next button
		driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']")).click();
		wait(3000);
		// select class
		driver.findElement(By.xpath("//*[@title='Select class']")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']")).click();
		// create
		// driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100
		// purpleButtonHoverEffect']")).click();
		// CLICK ON CANCEL
		driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();

		System.out.println("Clone is done successfully");

	}

	public void clickOnThreeClone() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer'])[1]")).click();
		wait(3000);
		// select clone
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[1]")));
		driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[1]")).click();

		wait(6000);
		createClonedOne();
	}

	public void readyToBePub(String ECD) {
		wait(3000);
		WebElement readyToBePublish = driver.findElement(By.xpath("(//*[@class='userCard-heading m-t-40'])[1]"));
		scrollByElement(readyToBePublish);
		// click on 3 dots
		// driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey
		// cursor-pointer'])[4]")).click();
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer'])[7]")).click();
		wait(3000);
		if (ECD.equalsIgnoreCase("Edit Details")) {
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-b-10'])[1]")).click();
			System.out.println("clicked on edit button");
			// clicked on next button
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]")));
			driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
					.click();
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
					.click();
			wait(3000);
			/*
			 * driver.findElement(By.
			 * xpath("(//*[@class='ant-btn purpletnWraBp radius-100 purpleButtonHoverEffect'])[2]"
			 * )) .click();
			 */
			// click on cancel button
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();

		} else if (ECD.equalsIgnoreCase("Clone")) {
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[1]")).click();
			System.out.println("clicked on edit button");
			wait(6000);
			driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
					.click();
			wait(3000);
			driver.findElement(By.xpath("//*[@title='Select class']")).click();
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"))
					.click();
			wait(3000);
			/*
			 * driver.findElement(By.
			 * xpath("(//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect'])[2]"
			 * )) .click();
			 */
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();

		} else if (ECD.equalsIgnoreCase("Delete")) {
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20'])[1]")).click();
			System.out.println("clicked on edit button");
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("clicked on cancel button ");
		}

		System.out.println("The selected ECD is :" + " " + ECD);
	}

	/********************* For Student ***********************/

	public void fullTestWrite() {
		wait(3000);
		WebElement className = driver.findElement(By.xpath("//*[text()='Class-Prabha']"));
		scrollByElement(className);
		System.out.println("The scroll down was done till:" + " " + className.getText());
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='full-width lowgrey text-center text-overflow p-r-5 p-l-5'])[36]"))
				.click();

	}

	/********************* For DataOperator ***********************/
	public void selectEditDetailsDOP() {
		wait(3000);
		WebElement scrollEle = driver.findElement(By.xpath("//*[text()='Class-Prabha']"));
		scrollByElement(scrollEle);
		System.out.println("Scroll down till class-Prabha");
		// click on class prabha
		wait(3000);
		driver.findElement(By.xpath("(//*[text()='Prabha_Course'])[2]")).click();
		// select full test
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='r-c-c-c m-t-10'])[1]")).click();
		// select mathematics
		wait(4000);
		driver.findElement(By.xpath("(//*[@class='text-xmd bold-600 color-black m-t-10'])[1]")).click();
		// select options
		// selectOptions(option);

	}

	public void selectOptions(String options) {

		wait(3000);
		// click on 3 dots
		driver.findElement(By.xpath("//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer absolute']"))
				.click();
		//
		if (options.equalsIgnoreCase("Edit Details")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-b-10'])[1]")).click();
			System.out.println("clicked on edit details option");
			// clicked on next1
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// clicked on next2
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// clicked on update
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			System.out.println("clicked on update button");

		} else if (options.equalsIgnoreCase("Clone")) {
			wait(3000);
			WebElement clone=driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[2]"));
			WaitTillClickble(clone);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[2]")).click();
			System.out.println("clicked on Clone option");
			
			// click on next1
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			//change name 
			String uuid1 = UUID.randomUUID().toString();
		WebElement naming=	driver.findElement(By.xpath("//*[@placeholder='Enter title']"));
		naming.sendKeys(Keys.CONTROL + "a");
		naming.sendKeys(Keys.DELETE);
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).sendKeys(uuid1);
		
			// select class
			wait(3000);
			driver.findElement(By.xpath("//*[@title='Select class']")).click();
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[2]")).click();
			// click on next 2
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// click on create
			/*wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			System.out.println("clicked on cretae button");*/
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
	System.out.println("clicked on cancel button");

		} else if (options.equalsIgnoreCase("Delete")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20'])[1]")).click();
			System.out.println("clicked on Delete option");
			// click on cancel button
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("clicked on cancel button");

		}
	}

	public void setQuesAndAnsew() {
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-col ant-col-12 ca-r-fs-c-c p-l-10 cursor-pointer']")).click();
		wait(3000);
		selectQuestionType("Multiple Choice Questions");
		selectChapter();

	}

	public void selectQuestionType(String Qtype) {
		wait(3000);
		// driver.findElement(By.xpath("(//*[@class='ant-select-selection-item'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-item'])[1]")).click();

		if (Qtype.equalsIgnoreCase("Multiple Choice Questions")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();
			System.out.println("selected option is:Multiple Choice Questions");
		} else if (Qtype.equalsIgnoreCase("Numeric Type Questions")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[2]")).click();
			System.out.println("selected option is:Numeric Type Questions");
		}

		System.out.println("The selected question type is :" + Qtype);
	}

	public void selectChapter() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-item'])[2]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[3]")).click();
		System.out.println("Chapter is selected successfully");
	}

	public void question1() {
		String Quest1 = "How are you?";
		wait(3000);
		driver.findElement(By.xpath("//*[@class='cursor-pointer test-ques-window resize-editor-img p-10 full-width']"))
				.click();
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ql-editor ql-blank']")).sendKeys(Quest1);
		// *[@data-placeholder='Type here...'];
		// click on save and close in text editor
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();
		System.out.println("clicked in save and close button");
		// click on close button
		/*
		 * driver.findElement(By.xpath("//*[@class='ant-btn']")).click();
		 * System.out.println("clicked on close button");
		 */
	}
	/*
	 * public void optionsABCD() { String a="Good"; String b="Bad"; String
	 * c="Good2"; String d="Not bad"; String str[]=
	 * {"Good","Bad","Good2","Not bad"}; int sizeOfString=str.length;
	 * System.out.println("The size of string  is :"+sizeOfString); List<WebElement>
	 * ele1=driver.findElements(By.
	 * xpath("//*[@class='cursor-pointer test-ques-window p-10 r-c-sb']")); int
	 * sizeOfEle=ele1.size();
	 * 
	 * System.out.println("The size of options is:"+sizeOfEle);
	 * 
	 * for (int i=0;i<sizeOfEle;i++) {
	 * 
	 * wait(3000); driver.findElement(By.
	 * xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])["+i+"]")).
	 * click(); for(int j=0;j<sizeOfString;j++) { wait(3000);
	 * driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).
	 * sendKeys();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

	public void optionsABCD() {
		String a = "Good";
		String b = "Bad";
		String c = "Good2";
		String d = "Not bad";
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[1]")).click();
		wait(3000);

		driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).sendKeys(a);
		// clck on save and close button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();

		// second question
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[2]")).click();
		wait(3000);

		driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).sendKeys(b);
		// clck on save and close button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();
		// 3rd question

		wait(3000);
		driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[3]")).click();
		wait(3000);

		driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).sendKeys(c);
		// clck on save and close button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();
		// 4th question
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[4]")).click();
		wait(3000);

		driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).sendKeys(d);
		// clck on save and close button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();

	}

	public void coorectAnsAndExit() {
		wait(3000);
		// click on correct answer
		driver.findElement(By.xpath("(//*[@class='m-l-5 text-xs a2grey'])[1]")).click();
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("(//*[@class='cursor-pointer'])[2]")).click();
			System.out.println("the points is selected");
			
		}
		wait(3000);
		driver.findElement(By.xpath("//*[@class='text-xmd bold-600 blue text-center r-c-c']")).click();

	}
	
	public void clickSendForReview(String YN) {
		wait(10000);
		System.out.println("waited for 10 seconds -");
		WebDriverWait send=new WebDriverWait(driver,Duration.ofSeconds(30));
		//*[@class='ant-btn orangeBtnWrap radius-100 text-xs']
		send.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'SEND FOR REVIEW')]")));
		driver.findElement(By.xpath("//span[contains(.,'SEND FOR REVIEW')]")).click();
		System.out.println("clicked on send For review button");
		if(YN.equalsIgnoreCase("YES")) {
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 m-l-20']")).click();
			System.out.println("clicked on yes button");
			
			}
		if(YN.equalsIgnoreCase("CANCEL")) {
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("clicked on Cancel button");
			}
		
		
	}
	
	public void performSearchOpe(String name ) {
		wait(3000);
		WebElement searchButton=driver.findElement(By.xpath("//*[@placeholder='Search by class name']"));
		scrollByElement(searchButton);
		driver.findElement(By.xpath("//*[@placeholder='Search by class name']")).sendKeys(name);
		wait(3000);
		String searchResult=driver.findElement(By.xpath("//h1[contains(.,'No data!')]")).getText();
		System.out.println("The search result is :"+searchResult);
		if(searchResult.equalsIgnoreCase("No data!")) {
			System.out.println("The seached name is no there in the page.");
		}
		System.out.println("Search opertaion is performed successfully");
	}
	public void performSearchOpeName(String name ) {
		wait(3000);
		WebElement searchButton=driver.findElement(By.xpath("//*[@placeholder='Search by class name']"));
		scrollByElement(searchButton);
		driver.findElement(By.xpath("//*[@placeholder='Search by class name']")).sendKeys(name);
		wait(3000);
		System.out.println("Search opertaion is performed successfully");
		wait(3000);
		WebElement toClear = driver.findElement(By.xpath("//*[@placeholder='Search by class name']"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		System.out.println("Search opertaion is cleared");
	}
	
	public void performImportTask(String QPtype) {
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-col ant-col-12 ca-r-fs-c-c p-l-10 cursor-pointer']")).click();
		//click on import button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='text-xs text-center']")).click();
		System.out.println("clicked on import button");
		chooseQPType(QPtype);
		//selectOptionInNCERT();
		
		
	}
	
	public void chooseQPType(String QPtype) {
		wait(3000);
		if(QPtype.equalsIgnoreCase("Sample Question Papers")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-radio-input'])[1]")).click();
			System.out.println("cliked on QPType is:"+QPtype);
		}
		if(QPtype.equalsIgnoreCase("Subject-wise Question Papers")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-radio-input'])[2]")).click();
			System.out.println("cliked on QPType is:"+QPtype);
		}
		wait(3000);
		driver.findElement(By.xpath("//*[@class='purpleBtnWrap radius-100 cursor-pointer purpleButtonHoverEffect r-c-c']")).click();
		
		System.out.println("The selected QP type is:"+" "+QPtype);
	}
	
	public void selectOptionInNCERT() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='text-xlg text-center text-overflow p-r-5 p-l-5'])[1]")).click();
		//click on select all
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[1]")).click();
		//click On import 
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect p-r-10 p-l-10']")).click();
		wait(3000);
		System.out.println("Selected all question pepars was done");
		
		}
	public void getOverallStatus() {
		wait(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='adminStatusCard-rows']"));
		int eleSize=ele.size();
		System.out.println("The element size is:"+eleSize);
		for (int i=1;i<eleSize;i++) {
			String mes=driver.findElement(By.xpath("(//*[@class='overallStatusCard-h1 m-b-0'])["+i+"]")).getText();
			System.out.println("The test Test created and published  is:"+mes);
			
		}
	}
	
	public void clickFeedback() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[2]")).click();
		System.out.println("Feedback tab is opened");
	}
	public void clickReadyToBePublished() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[3]")).click();
		System.out.println("Ready To be Published tab is opened");
	}
	public void clickOnDraft() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[1]")).click();
		System.out.println("Draft tab is opened");
		
	}
	
	public void clickFilterByTestDate() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Filter by test date']")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
		}
		wait(3000);

		Random rn = new Random();
		int z = rn.nextInt(10) + 1;
		System.out.println("The random number generated is " + " " + z);

		wait(3000);

		driver.findElement(By.xpath("//*[@title='2025-06-0"+z+"']")).click();
		System.out.println("The date is selected in calender ");
	}
	
	public void clickOnSearchByName(){
		
		wait(3000);
		String uuid3 = UUID.randomUUID().toString();
		driver.findElement(By.xpath("//*[@placeholder='Search by test name']")).sendKeys(uuid3);
		System.out.println("Search operation is completed");
		
	}
	public void doSearchOperation() {
		//wait(3000);
		selectEditDetailsDOP();
		//wait(3000);
		clickFeedback();
		//wait(3000);
		clickReadyToBePublished();
		//wait(3000);
		clickOnDraft();
		clickFilterByTestDate();
		 clickOnSearchByName();
		 
		
		
	}
	
	/*******************************************************Teacher side***********************************************/
	public void selectOptionsForTeacher(String options) {

		wait(3000);
		// click on 3 dots
		driver.findElement(By.xpath("//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer absolute']"))
				.click();
		//
		if (options.equalsIgnoreCase("Edit Details")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-b-10'])[1]")).click();
			System.out.println("clicked on edit details option");
			// clicked on next1
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// clicked on next2
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// clicked on update
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			System.out.println("clicked on update button");

		} else if (options.equalsIgnoreCase("Clone")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[1]")).click();
			System.out.println("clicked on Clone option");
			
			// click on next1
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			//change name 
			String uuid1 = UUID.randomUUID().toString();
		WebElement naming=	driver.findElement(By.xpath("//*[@placeholder='Enter title']"));
		naming.sendKeys(Keys.CONTROL + "a");
		naming.sendKeys(Keys.DELETE);
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).sendKeys(uuid1);
		
			// select class
			wait(3000);
			driver.findElement(By.xpath("//*[@title='Select class']")).click();
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[2]")).click();
			// click on next 2
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// click on create
			/*wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			System.out.println("clicked on cretae button");*/
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
	System.out.println("clicked on cancel button");

		} else if (options.equalsIgnoreCase("Delete")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20'])[1]")).click();
			System.out.println("clicked on Delete option");
			// click on cancel button
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("clicked on cancel button");

		}
	}
	
	public void publicshNow(String YN) {
		wait(10000);
		System.out.println("waited for 10 seconds -");
		WebDriverWait send=new WebDriverWait(driver,Duration.ofSeconds(30));
		//*[@class='ant-btn orangeBtnWrap radius-100 text-xs']
		send.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-btn blueBtnWrap radius-100 m-l-20 text-xs']")));
		driver.findElement(By.xpath("//*[@class='ant-btn blueBtnWrap radius-100 m-l-20 text-xs']")).click();
		System.out.println("clicked on publish Now button");
		if(YN.equalsIgnoreCase("YES")) {
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 m-l-20']")).click();
			System.out.println("clicked on yes button");
			
			}
		else if(YN.equalsIgnoreCase("CANCEL")) {
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("clicked on Cancel button");
			
			}
		
		
	}
	
	public void cilckAllLabels() {
		wait(3000);
		List<WebElement> label=driver.findElements(By.xpath("//*[@class='ant-tabs-tab-btn']"));
		int sizeoflabel=label.size();
		System.out.println("The size of the label is :"+" "+sizeoflabel);
		for (int i=1;i<sizeoflabel;i++) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])["+i+"]")).click();
			System.out.println("value of i is: "+i);
		}
		System.out.println("clicked on all the elements ");
	}
	
	public void getTitleOfAllTest() {
		wait(3000);
		List<WebElement>titles=driver.findElements(By.xpath("//*[@class='testcard-testtitle']"));
		int titlesize=titles.size();
		System.out.println("The size of the titles on the page is :"+titlesize);
		for(int i=1;i<titlesize;i++) {
			String nameOfTitle=driver.findElement(By.xpath("(//*[@class='testcard-testtitle'])["+i+"]")).getText();
			if (nameOfTitle.equalsIgnoreCase("vamsi notification")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='testcard-testtitle'])["+i+"]")).click();
				break;
			}
			System.out.println("The name of the tile is :"+nameOfTitle);
			
		}
	}
	
	public void printAllClassNames() {
		wait(3000);
		List<WebElement>classname=driver.findElements(By.xpath("//*[@class='text-xlg text-center text-overflow p-r-5 p-l-5']"));
		int classSize=classname.size();
		System.out.println("The class name sixe is:"+" "+classSize);
		for(int i=1;i<classSize;i++) {
			String classname2=driver.findElement(By.xpath("(//*[@class='text-xlg text-center text-overflow p-r-5 p-l-5'])["+i+"]")).getText();
			System.out.println("The class name is :"+classname2);
		}
		}
	
	
	
	/***************************************************************Operator Credentials**************************************/
	public void selectOptionsOperator(String options) {

		wait(3000);
		// click on 3 dots
		driver.findElement(By.xpath("//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer absolute']"))
				.click();
		//
		if (options.equalsIgnoreCase("Edit Details")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-b-10'])[1]")).click();
			System.out.println("clicked on edit details option");
			// clicked on next1
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// clicked on next2
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// clicked on update
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			System.out.println("clicked on update button");

		} else if (options.equalsIgnoreCase("Clone")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[1]")).click();
			System.out.println("clicked on Clone option");
			
			// click on next1
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			//change name 
			String uuid1 = UUID.randomUUID().toString();
		WebElement naming=	driver.findElement(By.xpath("//*[@placeholder='Enter title']"));
		naming.sendKeys(Keys.CONTROL + "a");
		naming.sendKeys(Keys.DELETE);
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).sendKeys(uuid1);
		
			// select class
			wait(3000);
			driver.findElement(By.xpath("//*[@title='Select class']")).click();
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[2]")).click();
			// click on next 2
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			// click on create
			/*wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
					.click();
			System.out.println("clicked on cretae button");*/
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100 m-r-30']")).click();
	System.out.println("clicked on cancel button");

		} else if (options.equalsIgnoreCase("Delete")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20'])[1]")).click();
			System.out.println("clicked on Delete option");
			// click on cancel button
			wait(3000);
			driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
			System.out.println("clicked on cancel button");

		}
	}
	

	
	
	
}