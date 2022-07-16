package Pages;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.Alert;
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

public class SchedulePage extends Aulas_Base.BaseTest {

	public SchedulePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSceduleModule() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'/schedule')]")).click();
		System.out.println("--clicked on the scedule module page ");

	}

	public void clickOnCreateButton() throws InterruptedException {
		//Thread.sleep(6000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[1]")));
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[1]")).click();
		System.out.println("--clicked on the create button-- ");
	}

	public void selectSubject() throws InterruptedException {
		Thread.sleep(4000);
		// click on select subject column
		driver.findElement(By.xpath("//*[@placeholder='Select Subject']")).click();
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int size = elements.size();
		System.out.println("The size of subjects is :" + size);
		for (int i = 1; i < size; i++) {
			String subjectName = driver
					.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).getText();
			//System.out.println("The subject name is :" + " " + subjectName);
			if (subjectName.equalsIgnoreCase("English")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("----The selection of subject  "+subjectName+" is successfull----");
				break;
			}
		}

	}

	public void selectClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select Class']")).click();
		Thread.sleep(3000);
		List<WebElement> elements = driver
				.findElements(By.xpath("//*[@class='ant-select-item ant-select-item-option']"));
		// ant-select-item ant-select-item-option
		int size = elements.size();
		System.out.println("The size of class is :" + size);
		for (int i = 1; i < size; i++) {
			String nameOfClass = driver
					.findElement(By.xpath("(//*[@class='ant-select-item ant-select-item-option'])[" + i + "]"))
					.getText();
		
			if (nameOfClass.equalsIgnoreCase("AutomatinTEST123-a,b")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item ant-select-item-option'])[" + i + "]"))
						.click();
				System.out.println("The class name is :" + " " + nameOfClass);
				break;
			}
		}

		System.out.println("----The selection class is successfull----");

	}

	public void selectTeacher() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select Teacher']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int size = elements.size();
		System.out.println("The size of Teacher is :" + size);
		for (int i = 1; i < size; i++) {
			String teacherName = driver
					.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).getText();
			
			if (teacherName.equalsIgnoreCase("BriTeacher")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("The subject name is :" + " " + teacherName);
				break;
			}

			//System.out.println("----The selection of Teacher is successfull----");
		}
	}

	public void selectModeOfClass() throws InterruptedException {
		Thread.sleep(3000);
		WebElement modeofclass = driver.findElement(By.xpath("(//*[@class='ant-btn'])[2]"));
		String mode = modeofclass.getText();
		modeofclass.click();
		System.out.println("The mode of class is :" + mode);
		driver.findElement(By.xpath("(//*[@placeholder='Select Date'])[1]")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@class='ant-picker-footer']")).click();
		driver.findElement(By.cssSelector(".ant-picker-next-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("tr:nth-child(1) > .ant-picker-cell:nth-child(5) > .ant-picker-cell-inner"))
				.click();

		System.out.println("----The selection of mode of class  is successfull----");
		// driver.findElement(By.xpath("(//*[@class='ant-picker-header-super-next-btn'])[2]")).click();
		// driver.findElement(By.xpath("(//*[@class='ant-picker-cell-inner'])[56]")).click();

	}

	public void selectModeOfTheClass(String modeofclass) {
		wait(3000);
		List<WebElement> elee = driver.findElements(By.xpath("//*[@class='ant-btn']"));
		int size = elee.size();
		System.out.println("The size is :" + size);
		for (int i = 1; i <= size; i++) {
			String actualModeofclass = driver.findElement(By.xpath("(//*[@class='ant-btn'])[" + i + "]")).getText();
			if (modeofclass.equalsIgnoreCase(actualModeofclass)) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-btn'])[" + i + "]")).click();
				System.out.println("clicked on :" + " " + actualModeofclass);
				break;
			}
		}
	}

	public void selectDateAndTime() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select Date'])[1]")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-picker-header-super-next-btn']")));
		for (int i = 0; i < 3; i++) {

			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
		}
		// For Generating random numbers b/w 1 to 10 by adding zero as prefix
		// eg:01,02,03..ext
		Random generator = new Random();
		int i = generator.nextInt(10) + 1;
		String h = String.format("%02d", i);
		System.out.println("The Random number is : " + " " + h);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='2025-07-" + h + "']")).click();
		System.out.println("The selection of date and time was done ");
		// If user wants to select today is start date then use beolw commend
		// *[@class='ant-picker-today-btn']
	}

	public void selectStartAndEndTime() {
		wait(3000);
		// click on start time
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[1]")).click();
		wait(3000);
		WebElement elee = driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[23]"));
		scrollByElement(elee);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[23]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[28]")).click();
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();

		// select end date
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[2]")).click();
		wait(3000);
		WebElement elee1 = driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[108]"));
		scrollByElement(elee1);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[108]")).click();
		wait(3000);
		WebElement enddate = driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[116]"));
		//WaitTillClickble(enddate);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[116]")));
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[116]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[2]")).click();
		System.out.println("The start time and end time set successfully");
	}

	public void selectStartAndEndTimeForZoom() {
		wait(3000);
		// click on start time
		driver.findElement(By.xpath("(//*[@placeholder='Select time'])[1]")).click();
		wait(3000);
		WebElement elee = driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[23]"));
		scrollByElement(elee);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[23]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-time-panel-cell-inner'])[28]")).click();
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();

		// select end date
		/*
		 * driver.findElement(By.xpath("(//*[@placeholder='Select time'])[2]")).click();
		 * wait(3000); WebElement elee1=driver.findElement(By.xpath(
		 * "(//*[@class='ant-picker-time-panel-cell-inner'])[108]"));
		 * scrollByElement(elee1); driver.findElement(By.xpath(
		 * "(//*[@class='ant-picker-time-panel-cell-inner'])[108]")).click();
		 * wait(3000); WebElement enddate=driver.findElement(By.xpath(
		 * "(//*[@class='ant-picker-time-panel-cell-inner'])[116]"));
		 * WaitTillClickble(enddate); driver.findElement(By.xpath(
		 * "(//*[@class='ant-picker-time-panel-cell-inner'])[116]")).click();
		 * wait(3000); driver.findElement(By.
		 * xpath("(//*[@class='ant-btn ant-btn-primary ant-btn-sm'])[2]")).click();
		 */
		System.out.println("The start time and end time set successfully");
	}

	public void repeatOnDay() throws InterruptedException {
		Thread.sleep(3000);
		// For getting the index of current day
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		String indexOfWeekIs = String.valueOf(dayOfWeek);
		System.out.println(indexOfWeekIs);
		if (indexOfWeekIs.equalsIgnoreCase("1")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[1]")).click();
			System.out.println("The selected day is:Sunday");

		} else if (indexOfWeekIs.equalsIgnoreCase("2")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[2]")).click();
			System.out.println("The selected day is:Monday");
		} else if (indexOfWeekIs.equalsIgnoreCase("3")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[3]")).click();
			System.out.println("The selected day is:Tuesday");
		} else if (indexOfWeekIs.equalsIgnoreCase("4")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[4]")).click();
			System.out.println("The selected day is:Wednesday");
		} else if (indexOfWeekIs.equalsIgnoreCase("5")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[5]")).click();
			System.out.println("The selected day is:Thursday");
		} else if (indexOfWeekIs.equalsIgnoreCase("6")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[6]")).click();
			System.out.println("The selected day is:Friday");
		} else if (indexOfWeekIs.equalsIgnoreCase("7")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default ant-btn-circle'])[7]")).click();
			System.out.println("The selected day is:Saturday");

		}
		System.out.println("The selected day is " + indexOfWeekIs);

	}

	public void lastDaySelection() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Select Date'])[2]")).click();
		// for selecting today date
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//*[@class='ant-picker-today-btn'])[2]")).click
		 * (); System.out.println("The last date was selected");
		 */
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//*[@class='ant-picker-header-super-next-btn'])[2]")));
		for (int i = 0; i < 4; i++) {

			driver.findElement(By.xpath("(//*[@class='ant-picker-header-super-next-btn'])[2]")).click();
		}
		// For Generating random numbers b/w 1 to 10 by adding zero as prefix
		// eg:01,02,03..ext
		Random generator = new Random();
		int i = generator.nextInt(10) + 1;
		String h = String.format("%02d", i);
		System.out.println("The Random number is : " + " " + h);
		Thread.sleep(3000);
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='2026-07-" + h + "']")).click();
		String dateIs=driver.findElement(By.xpath("//*[@title='2026-07-" + h + "']")).getText();
		System.out.println("The last date selection was done successfully "+"The date is:"+dateIs);
	}

	public void clickOnSave() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> ew = driver.findElements(By.xpath("//*[@class='ant-btn ant-btn-primary']"));
		int size = ew.size();
		System.out.println("The size of the primary buttons is : " + " " + size);
		for (int i = 1; i <= size; i++) {
			String nameIS = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[" + i + "]"))
					.getText();
			System.out.println("The name is :" + " " + nameIS);
			if (nameIS.equalsIgnoreCase("Save")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[" + i + "]")).click();
				System.out.println("Clicked on" + nameIS + "button");
				break;
			}
			wait(3000);
			
		}
	//	messageAndDescription();
		
		
	}
	
	public void clickOnXbutton() {
		wait(3000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".anticon-close path")));
		driver.findElement(By.cssSelector(".anticon-close path")).click();
		System.out.println("Clicked on X button");
	}

	public void messageAndDescription() {
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual message is :" + act);
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String description = text.getText();
		System.out.println("The actual text description is:" + description);
		String exp = "success";
		if (exp.equals(act)) {
			System.out.println("The success message is: " + description);
		} else {
			System.out.println("The The failure messgae is: " + description);
			// wait(2000);
			driver.findElement(By.xpath("//*[@class='anticon anticon-close ant-modal-close-icon']")).click();
		}

		System.out.println("The message is:" + " " + description);
	}

	public void EditInOccuranceSchedule() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'/schedule')]")).click();
		WebElement threeDots = driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger'])[2]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", threeDots);
		System.out.println("The scroll down was done ");
		Thread.sleep(3000);
		threeDots.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[1]")).click();
		Thread.sleep(3000);
		// click on cancel
		/*
		 * driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']")).click()
		 * ; Thread.sleep(3000);
		 */
		// if user wants to click on the ok button
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ant-btn ant-btn-primary']"));
		int size = ele.size();
		for (int i = 1; i <= size; i++) {
			String textname = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[" + i + "]"))
					.getText();
			if (textname.equalsIgnoreCase("Save")) {
				driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[" + i + "]")).click();
				System.out.println("Clicked on" + " " + textname);
				break;
			}
		}
		/*
		 * driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[3]")).
		 * click(); System.out.
		 * println("clicked on ok button in  edit accourance was successfully ");
		 */
		/*
		 * driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']")).click()
		 * ; System.out.
		 * println("clicked on no  button in  edit accourance was successfully "); //
		 * getNotificationMessage(); System.out.
		 * println("clicked on cancel  button in  edit accourance was successfully ");
		 */

	}

	public void editOccuranceClickOnSave() throws InterruptedException {

		// Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'/schedule')]")).click();
		WebElement threeDots = driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger'])[2]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", threeDots);
		System.out.println("The scroll down was done ");
		Thread.sleep(3000);
		threeDots.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[3]")).click();
		getNotificationMessage();
		System.out.println("--clicked on save button in eddit occurance page ");

	}

	public void editSchedule() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@href,'/schedule')]")).click();
		WebElement threeDots = driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger'])[2]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", threeDots);
		System.out.println("The scroll down was done ");
		Thread.sleep(3000);
		threeDots.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[2]")).click();
		Thread.sleep(3000);
		// if user want to save the scedule
		Thread.sleep(3000);
		// driver.findElement(By.xpath("(//*[@class='ant-btn
		// ant-btn-primary'])[3]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ant-btn ant-btn-primary']"));
		int size = ele.size();
		System.out.println("The size of the element is :" + " " + size);
		for (int i = 1; i <= size; i++) {
			String name = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[" + i + "]")).getText();
			if (name.equalsIgnoreCase("Save")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[" + i + "]")).click();
				System.out.println("clicked on :" + " " + name);
				break;

			}
		}
		// if user wants to delete the scedule
		/*
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "(//*[@class='ant-dropdown-menu-title-content'])[3]")).click();
		 */
		// getNotificationMessage();
		System.out.println("---The edit schedule is saved successfuly");
	}

	public void getNotificationMessage() throws InterruptedException {
		Thread.sleep(3000);
		String message = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']")).getText();
		String discription = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"))
				.getText();
		if (message.equalsIgnoreCase("Success")) {
			System.out.println("Message is:" + message + "discrption is:" + discription);
		} else {
			System.out.println("Message is:" + message + "  " + "discription is:" + discription);
		}
		System.out.println("The get notification method is successfull");
	}

	public void searchByScedule(String teacherName) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='ant-picker-today-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Search by Teacher']")).sendKeys(teacherName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-icon-only ant-input-search-button']")).click();
		System.out.println("--The search is successfull--");
		/*
		 * String
		 * searchMessage=driver.findElement(By.xpath("//*[@class='schedule-main']")).
		 * getText(); String emptySearchMessage="No live classes scheduled!";
		 * if(searchMessage.equalsIgnoreCase(emptySearchMessage)) {
		 * 
		 * System.out.println("--the search is empty--"); }
		 * 
		 * System.out.println("--the search is not  empty--");
		 * 
		 * 
		 * 
		 * }
		 */
		EditInOccuranceScheduleinSearch();
	}

	public void EditInOccuranceScheduleinSearch() throws InterruptedException {
		Thread.sleep(3000);
		WebElement threeDots = driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger'])[2]"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", threeDots);
		System.out.println("The scroll down was done ");
		Thread.sleep(3000);
		threeDots.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']")).click();
		Thread.sleep(3000);
		// if user wants to click on the ok button
		/*
		 * driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[3]")).
		 * click(); System.out.
		 * println("clicked on ok button in  edit accourance was successfully ");
		 */
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-default']")).click();
		// getNotificationMessage();
		System.out.println("clicked on cancel  button in  edit accourance was successfully ");

	}

	public void verifyCalender() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='ant-select-selection-item']")).click();
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[2]")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[4]")).click();
		// System.out.println("clciked on the search button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[4]")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//*[@class='ant-select-item-option-content'])[3]")));
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[3]")).click();
		System.out.println("--select standars was success--");

	}

	public void doFilterInDate() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select date']")).click();
		for (int i = 0; i < 3; i++) {
			WebElement ele=driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']"));
			//WaitTillClickble(ele);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
		}
		Random generator = new Random();
		int i = generator.nextInt(10) + 1;
		String h = String.format("%02d", i);
		System.out.println("The Random number is : " + " " + h);
		wait(3000);
		driver.findElement(By.xpath("//*[@title='2025-07-" + h + "']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@placeholder='Select date']"));
		wait(3000);
		ele.sendKeys(Keys.CONTROL + "a");
		wait(3000);
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys(Keys.ENTER);
		System.out.println("The select date operation is successfull");

	}

	public void doSearch() {
		wait(3000);
		// String
		// name=driver.findElement(By.xpath("(//*[@class='ant-typography'])[32]")).getText();
		driver.findElement(By.xpath("//*[@placeholder='Search by Teacher']")).sendKeys("Hello");
		wait(3000);
		// driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-icon-only
		// ant-input-search-button']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@placeholder='Search by Teacher']"));
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.DELETE);
		wait(3000);
		ele.sendKeys(Keys.ENTER);
	}

	public void doSearchInStandard() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-overflow'])[1]")).click();
		wait(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int size = elements.size();
		System.out.println("The size is :" + " " + size);
		for (int i = 1; i < 5; i++) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
			// System.out.println("The selection of stabdard was done ");
		}
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-overflow'])[2]")).click();
		wait(3000);
		for (int i = 1; i <= size; i++) {
			String nameing = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			if (nameing.equalsIgnoreCase("Android Development")) {
				wait(3000);
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				break;
			}

		}
		System.out.println("The selection of stabdard was done ");

	}

	public void clickOnTimeTable() {
		wait(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ant-tabs-tab-btn']"));
		int size = ele.size();
		System.out.println("The size of the ele is :" + " " + size);
		for (int i = 1; i <= size; i++) {
			String text = driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[" + i + "]")).getText();
			if (text.equalsIgnoreCase("Timetable")) {
				driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])[" + i + "]")).click();
				System.out.println("Clicked on:" + " " + text + "element");
				break;

			}
		}
	}

	public void selectStabdard2() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[4]")).click();
		wait(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
		int size = elements.size();
		System.out.println("The size is :" + " " + size);
		wait(3000);
		//driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[1]")).click();
		for (int i = 1; i <size; i++) {
			String text = driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"))
					.getText();
			if (text.equalsIgnoreCase("0-JSE")) {
				WebElement ee=driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]"));
				WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")));
				
				driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[" + i + "]")).click();
				System.out.println("Clicked on:" + " " + text + "element");
				break;

			}
		}
		System.out.println("The selection of standard is successfull");

	}

	public void doFilterInDate2() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select a date']")).click();
		WebElement ele2=driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']"));
		WaitTillClickble(ele2);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
		}
		Random generator = new Random();
		int i = generator.nextInt(10) + 1;
		String h = String.format("%02d", i);
		System.out.println("The Random number is : " + " " + h);
		wait(3000);
		driver.findElement(By.xpath("//*[@title='2025-06-" + h + "']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@placeholder='Select a date']"));
		wait(3000);
		ele.sendKeys(Keys.CONTROL + "a");
		wait(3000);
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys(Keys.ENTER);
		System.out.println("The select date operation is successfull");

	}
	/***********************************************************Student Side*****************************************/
	public void filtersInSceduleStudent() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Select date']")).click();
		for(int i=0;i<3;i++) {
			driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
			}
		String currentMonth=driver.findElement(By.xpath("//*[@class='ant-picker-month-btn']")).getText();
		String currentYear=driver.findElement(By.xpath("//*[@class='ant-picker-year-btn']")).getText();
		System.out.println("The current appearing month is :"+currentMonth);
		System.out.println("The current appearing Year is :"+currentYear);
		//int iTest = Integer.parseInt(currentMonth);
		int test2=convertMonthToNum();
		System.out.println("The returned value is :"+test2);
		String indexOfCurrentMonth=String.format("%02d",test2);;//example 10 ,Now it will return "10"  
System.out.println("The string of month index is :"+indexOfCurrentMonth);
Random generator=new Random();
	int i=generator.nextInt(10)+1;
	String h=String.format("%02d",i);
	System.out.println("The Generated Random number is :"+" "+h);
		String selectedDateIs=driver.findElement(By.xpath("//*[@title='"+currentYear+"-"+indexOfCurrentMonth+"-"+h+"']")).getText();
		System.out.println("try to click on :"+selectedDateIs);
		wait(3000);
		driver.findElement(By.xpath("//*[@title='"+currentYear+"-"+indexOfCurrentMonth+"-"+h+"']")).click();
		System.out.println("clicked on :"+selectedDateIs);
		
	}
	
	public void searchForSubject() {
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Search by Subject']")).sendKeys("Hello");
		System.out.println("search for subject is done ");
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-icon-only ant-input-search-button']")).click();
		System.out.println("clicked on search button");
		
	}
	
	public  int convertMonthToNum() {
		//int i=0;
		String currentMonth2=driver.findElement(By.xpath("//*[@class='ant-picker-month-btn']")).getText();
		int indexcurrentMonth = 0;
		if(currentMonth2.equalsIgnoreCase("Jan")) {
			indexcurrentMonth=01;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Feb")) {
			indexcurrentMonth=02;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Mar")) {
			indexcurrentMonth=03;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Apr")) {
			indexcurrentMonth=04;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("May")) {
			indexcurrentMonth=05;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Jun")) {
			indexcurrentMonth=06;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Jul")) {
			indexcurrentMonth=07;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Aug")) {
			indexcurrentMonth=10;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Sep")) {
			indexcurrentMonth=11;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Oct")) {
			indexcurrentMonth=10;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Nov")) {
			indexcurrentMonth=11;
			return indexcurrentMonth;
			
		}
		else if(currentMonth2.equalsIgnoreCase("Dec")) {
			indexcurrentMonth=12;
			return indexcurrentMonth;
			
		}
		return indexcurrentMonth;
		
		
	}
	/*****************************************************Enhanced way of writing coding
	 * @return ***********************************/
	
	public String createStudent() {
		wait(3000);
		driver.findElement(By.xpath("//*[contains(@href,'/user-management')]")).click();
		System.out.println("clicked on User Management...");
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();
		System.out.println("clicked on Add User...");
		
		//fillStudentDetails();
		String studentNamis=fillStudentDetails();
		System.out.println("The created student name is :"+studentNamis);
		return studentNamis;
		
		}
	public String fillStudentDetails() {
		//String name=returnStringValue();
		String name=generateRandomName()+"TE";
		System.out.println("The generated name is :"+name);
		StringBuilder phoneNum=createRandomNumber();
		System.out.println("The generated Phone number is :"+phoneNum);
		wait(3000);
		driver.findElement(By.xpath("(//span[@class='anticon anticon-right'])[1]")).click();
		System.out.println("clicked on Student...");
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter name']")).sendKeys(name);
		System.out.println("Entered Name is: ..."+name);
		wait(3000);
		driver.findElement(By.xpath("//*[@placeholder='Enter phone number']")).sendKeys("99"+phoneNum);
		System.out.println("Entered Phone number is: ...99"+phoneNum);
		wait(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='ant-btn ant-btn-primary']"));
		int size=ele.size();
		System.out.println("The size is :"+size);
			for(int i=1;i<=size;i++) {
		
		String all=driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])["+i+"]")).getText();
		if(all.equalsIgnoreCase("ADD")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])["+i+"]")).click();
			System.out.println("Clicked on add button...");
			break;
		}
		
	}
			return name;
	}
public String returnStringValue() {
	String uuid = UUID.randomUUID().toString();
	return uuid;
}

private StringBuilder  createRandomNumber(){
	String captals = "1234567890";
    Random rnd = new Random();
    StringBuilder NewChaptername = new StringBuilder(8);
    for (int n = 0; n < 8; n++)
    {
        NewChaptername.append(captals.charAt(rnd.nextInt(captals.length())));
       
    }
  //return name2;
	return NewChaptername;
	
  }

public StringBuilder generateRandomName() {
	String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random rnd = new Random();
    StringBuilder NewChaptername = new StringBuilder(7);
    for (int n = 0; n < 7; n++)
    {
        NewChaptername.append(captals.charAt(rnd.nextInt(captals.length())));
    }
    return NewChaptername;
	
}

public String createCourse() {
	wait(3000);
	driver.findElement(By.xpath("//*[contains(@href,'/course')]")).click();
	System.out.println("clicked on course Module...");
	wait(3000);
	driver.findElement(By.xpath("//*[@class='ant-btn']")).click();
	System.out.println("clicked on Add course...");
	String courseName=generateRandomName()+"CN";
	System.out.println("The generated name is :"+courseName);
	wait(3000);
	driver.findElement(By.xpath("//*[@placeholder='Enter Name']")).sendKeys(courseName);
	System.out.println("Entered Name is: ..."+courseName);
	wait(3000);
	/*driver.findElement(By.xpath("//*[@placeholder='Enter Duration']")).sendKeys("KJ"+courseName);
	System.out.println("Entered Name is: ..."+courseName);*/
	 selectDuration("Day(s)");
	 selectStartDateAndEndate();
	 System.out.println("The created course name is :"+courseName);
	 return courseName;
	
}
public void selectDuration(String DMY) {
	wait(3000);
	driver.findElement(By.xpath("//*[@placeholder='Enter Duration']")).sendKeys("1");
	System.out.println("Entered duration  is: ..."+"1 Day");
	wait(3000);
	driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();
	//System.out.println("Entered duration  is: ..."+"1 Day");
	List<WebElement> ele=driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
	int size=ele.size();
	System.out.println("The size is :"+size);
		for(int i=1;i<=size;i++) {
	
	String all=driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).getText();
	if(all.equalsIgnoreCase(DMY)) {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).click();
		System.out.println("Clicked on "+DMY+"add button...");
		break;
	}
}
		
}

public void selectStartDateAndEndate() {
	wait(3000);
	//select start date
	driver.findElement(By.xpath("(//*[@class='ant-picker datePicker'])[1]")).click();
	System.out.println("Clicked on satrt date:");
	wait(3000);
	driver.findElement(By.xpath("//*[@class='ant-picker-today-btn']")).click();
	System.out.println("Clicked on satrt date:");
	List<WebElement> ele=driver.findElements(By.xpath("//*[@class='ant-btn']"));
	int size=ele.size();
	System.out.println("The size is :"+size);
		for(int i=1;i<=size;i++) {
	
	String all=driver.findElement(By.xpath("(//*[@class='ant-btn'])["+i+"]")).getText();
	if(all.equalsIgnoreCase("ADD")) {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-btn'])["+i+"]")).click();
		System.out.println("Clicked on ADD button...");
		break;
	}
}
		
}
public String createNewClass() {
	wait(3000);
	driver.findElement(By.xpath("//*[contains(@href,'/classroom')]")).click();
	System.out.println("Clicked on classRoom:");
	wait(3000);
	driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary btn-radius-15__height-38 m-l-20 text-xmd']")).click();
	System.out.println("Clicked on Create New Button:");
	//fillClassRoomDetails();
	String classNameis=fillClassRoomDetails();
	System.out.println("The created class name is :"+classNameis);
	return classNameis;
	
}

public String fillClassRoomDetails() {
	wait(3000);
	String className=generateRandomName()+"YH";
	driver.findElement(By.xpath("(//*[@class='ant-input input-text-grey'])[1]")).sendKeys(className);
	System.out.println("The entered class name is :"+className);
	wait(3000);
	driver.findElement(By.xpath("(//*[@class='ant-input input-text-grey'])[2]")).sendKeys("a,b");
	System.out.println("The entered section name is a,b:");	
	wait(3000);
	driver.findElement(By.xpath("//*[@class='ant-select-selection-search-input']")).click();
	System.out.println("The Cliked on search course:");	
	String course=createCourse();
	List<WebElement> ele=driver.findElements(By.xpath("//*[@class='ant-select-item-option-content']"));
	int size=ele.size();
	System.out.println("The size is :"+size);
		for(int i=1;i<=size;i++) {
	
	String all=driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).getText();
	if(all.equalsIgnoreCase(course)) {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).click();
		System.out.println("Clicked on "+course+" button...");
		break;
	}
	
		}
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary btn-radius-15__height-38']")).click();
		System.out.println("Clicked on create Button.");
		return className;
}
































































}