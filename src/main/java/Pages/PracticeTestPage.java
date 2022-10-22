package Pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Aulas_Base.BaseTest;
import io.reactivex.rxjava3.subjects.Subject;

public class PracticeTestPage extends BaseTest {

	public void ScrollDown() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Communication);
		Thread.sleep(4000);
	}

	public void CreateTest() throws InterruptedException {
		Thread.sleep(2000);
		ScrollDown();
		String id="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Random random= new Random();
		StringBuilder title=new StringBuilder(10);
		for(int i=0;i<10;i++)
		{
			title.append(id.charAt(random.nextInt(id.length())));
		}
				

		//String uuid = UUID.randomUUID().toString();
		//System.out.println("The random name is :" + uuid);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@href, '/classroom')]")).click();
		Thread.sleep(2000);
		// click on create test
		driver.findElement(By.xpath("//span[@class='anticon anticon-plus-circle']")).click();
		// click on title
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys(title);
		// click on examiner
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]")).click();
		// select examiner
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='ant-select-item-option-content'])[7]")));
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[7]")).click();
		// select syllabus
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[2]")).click();
		Thread.sleep(2000);
		selectSyllabus("Chapter");
		Thread.sleep(2000);
		// click on subject
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[3]")).click();
		// select subject
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[19]")).click();
		// click on class
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]")).click();
		// select class
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[26]")).click();
		Thread.sleep(2000);
		// click on chapter
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[5]")).click();
		Thread.sleep(2000);
		// select chapter
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[27]")).click();
		Thread.sleep(2000);
		// click next
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
				.click();
		Thread.sleep(2000);
		// click on set hours
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]")).click();
		Thread.sleep(2000);
		// select hours
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		Thread.sleep(2000);
		// click on minutes
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		Thread.sleep(2000);
		// select minutes
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[11]")).click();
		Thread.sleep(2000);
		// instruction
		driver.findElement(By.xpath("//textarea[@class='ant-input createmodalbg']")).sendKeys("all the best");
		Thread.sleep(2000);
		// click create
		driver.findElement(By.xpath("//span[text()='CREATE']")).click();
		System.out.println("The creation test is successfull");
		Thread.sleep(2000);

	}

	public void selectQuestionType(String selectquestionType) {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();
		wait(3000);
		if (selectquestionType.equalsIgnoreCase("Multiple Choice Questions")) {
			// select multiple choice question
			wait(3000);
			driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		} else if (selectquestionType.equalsIgnoreCase("Numeric Type Questions")) {
			// Numeric Type Questions
			wait(3000);
			driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
			// click on question field
			wait(3000);
			driver.findElement(
					By.xpath("//div[@class='cursor-pointer test-ques-window resize-editor-img p-10 full-width']"))
					.click();
			wait(3000);
			driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("what is science");
			wait(3000);
			// click on save & next
			driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
			wait(3000);
			// click on ans field
			driver.findElement(By.xpath("//input[@placeholder='Type the answer here...']")).sendKeys("1");
			// click on save & next button
			wait(3000);
			for (int i = 0; i < 5; i++) {
				driver.findElement(By.xpath("(//*[@class='cursor-pointer'])[1]")).click();
				System.out.println("the points is selected");
			}
			driver.findElement(By.xpath("//div[@class='text-xmd bold-600 blue text-center r-c-c']")).click();
			wait(3000);

		}

	}

	public void selectSyllabus(String syllabus) {
		wait(3000);

		if (syllabus.equalsIgnoreCase("Chapter")) {

			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[11]")).click();
		} else if (syllabus.equalsIgnoreCase("Part")) {

			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[12]")).click();
		} else if (syllabus.equalsIgnoreCase("Full")) {

			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[13]")).click();
		} else if (syllabus.equalsIgnoreCase("Previous Year Paper")) {

			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[14]")).click();
		}

	}

	public void question1() {
		String Quest1 = " What is the average of first five multiples of 12?";
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

	public void optionsABCD() {
		String a = "36";
		String b = "38";
		String c = "40";
		String d = "42";
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[1]")).click();
		wait(3000);
		driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).sendKeys(a);
		// clck on save and close button
		wait(4000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click(); // second question
		wait(3000);
		WebElement el = driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[2]"));
		scrollByElement(el);
		driver.findElement(By.xpath("(//*[@class='cursor-pointer test-ques-window p-10 r-c-sb'])[2]")).click();
		wait(3000);
		driver.findElement(By.xpath("//*[@data-placeholder='Type here...']")).sendKeys(b);
		// clck on save and close button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']")).click();
		// 3rd question wait(3000);
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

	public void correctAnsAndExit() {
		wait(3000);
		// click on correct answer
		driver.findElement(By.xpath("(//*[@class='m-l-5 text-xs a2grey'])[1]")).click();
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("(//*[@class='cursor-pointer'])[1]")).click();
			System.out.println("the points is selected");
		}
		wait(3000);
		driver.findElement(By.xpath("//*[@class='text-xmd bold-600 blue text-center r-c-c']")).click();
	}

	public void SendForReview() {
		wait(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn orangeBtnWrap radius-100 text-xs']")).click();
		wait(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 m-l-20']")).click();
	}

	public void PublishNow() {
		wait(6000);
		driver.findElement(By.xpath("//button[@class='ant-btn blueBtnWrap radius-100 m-l-20 text-xs']")).click();
		wait(3000);
		doMouseOver();
		// clicking on yes button
		driver.findElement(By.xpath("//button[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
	}

	public void clickOn3Dots() throws InterruptedException {
		wait(3000);
		ScrollDown();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[contains(@href, '/practise-test')]")));
		driver.findElement(By.xpath("//a[contains(@href, '/practise-test')]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer'])[1]")).click();
		System.out.println("clicked on three dots done");
		wait(4000);

	}

	public void SelectoptionsIn3Dots(String select) {
		wait(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='r-ac cursor-pointer m-t-20 m-b-10']"));
		int size = ele.size();
		System.out.println("The size is :" + " " + size);
		for (int i = 1; i <= size; i++) {
			String selectname = driver
					.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[" + i + "]")).getText();
			System.out.println("The name is :" + selectname);
			if (selectname.equalsIgnoreCase(select)) {
				driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20 m-b-10'])[" + i + "]")).click();

			}
		}

	}

	public void afterClickOnClone() {
		wait(3000);
		// click on class
		wait(3000);
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[4]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		wait(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
				.click();
		wait(3000);
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
				.click();
	}

	public void afterClickpublish() {
		wait(6000);
		doMouseOver();
		driver.findElement(By.xpath("//button[@class='ant-btn blankGreyBtnWrap radius-100']")).click();

		System.out.println("Cliked on yes button in publish operation");
	}

	public void selectDeleteOption() {
		wait(3000);
		// select delete option
		driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-t-20'])[1]")).click();
		wait(3000);
		doMouseOver();
		wait(6000);
		// user want to select cancel button refer below code
		driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
		System.out.println("The selection of delete was done successfully");

	}

	public void doMouseOver() {
		wait(6000);
		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.xpath("//span[text()='YES']"));// Instantiating Actions class
		Actions actions = new Actions(driver);// Hovering on main menu
		actions.moveToElement(mainMenu).build().perform();
		System.out.println("move  over was done");
	}

	public void ReadyToBePublishViewAll() {
		wait(2000);
		// click on view all
		driver.findElement(
				By.xpath("(//button[@class='ant-btn ant-btn-link ant-btn-sm viewsolutionsbtn fs-12 m-t-30'])[1]"))
				.click();
		wait(2000);
	}

	public void FiltersMethod() {
		// click on filter
		driver.findElement(By.xpath("(//input[@class='ant-input ant-input-sm ant-input-borderless'])[1]")).click();
		wait(2000);
		List<WebElement> Filter = driver.findElements(By.xpath("//input[@class='ant-checkbox-input']"));
		int size = Filter.size();

		for (int i = 0; i < size; i++) {
			wait(2000);
			Filter.get(i).click();

		}
		/*
		 * //click on calendar
		 * driver.findElement(By.xpath("//div[@class='ant-picker-input']")).click();
		 * wait(2000); //select date
		 * driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'])[4]")).
		 * click(); wait(2000); WebElement toClear1
		 * =driver.findElement(By.xpath("(//div[@class='ant-picker-cell-inner'])[4]"));
		 * toClear1.sendKeys(Keys.CONTROL + "a"); toClear1.sendKeys(Keys.DELETE);
		 * wait(2000);
		 */
		// filter by class
		driver.findElement(By.xpath("(//input[@class='ant-input ant-input-sm ant-input-borderless'])[2]")).click();
		wait(2000);
		List<WebElement> Filterclass = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int size1 = Filterclass.size();
		for (int i = 0; i < 5; i++) {
			wait(2000);
			Filterclass.get(i).click();
			driver.findElement(By.xpath("//*[@placeholder='Search by test name']")).click();
			wait(3000);
			driver.findElement(By.xpath("//*[@placeholder='Filter by class']")).click();

		}
		driver.findElement(By.xpath("//*[@placeholder='Search by test name']")).sendKeys("test");
		wait(2000);

		WebElement toClear = driver.findElement(By.xpath("//*[@placeholder='Search by test name']"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		// click on back button
		wait(6000);
		driver.navigate().refresh();
		wait(6000);
		System.out.println("page refresh is completed");
		uncheck();
	}

	public void FeedbackFromTeacher() {
		// click on view all
		driver.findElement(
				By.xpath("(//button[@class='ant-btn ant-btn-link ant-btn-sm viewsolutionsbtn fs-12 m-t-30'])[2]"))
				.click();
		wait(2000);

	}

	public void editOption(String Option) {
		// click on 3dots
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer'])[1]")).click();
		wait(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='r-ac cursor-pointer m-b-10']"));
		int size = ele.size();
		System.out.println("The size is :" + " " + size);
		for (int i = 1; i <= size; i++) {
			String selectname = driver.findElement(By.xpath("//*[@class='r-ac cursor-pointer m-b-10'][" + i + "]"))
					.getText();
			System.out.println("The name is :" + selectname);
			if (selectname.equalsIgnoreCase(Option)) {
				wait(3000);
				driver.findElement(By.xpath("//*[@class='r-ac cursor-pointer m-b-10'][" + i + "]")).click();
				break;

			}
		}

		// click on title
		wait(2000);
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).clear();
		wait(2000);
		WebElement toClear = driver.findElement(By.xpath("//*[@placeholder='Enter title']"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		// give title name
		driver.findElement(By.xpath("//*[@placeholder='Enter title']")).sendKeys("Science Test");
		// click on next button
		wait(2000);
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
				.click();
		wait(2000);
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
				.click();
		wait(2000);
	}

	public void uncheck() {
		wait(2000);
		driver.findElement(By.xpath("//input[@placeholder='Filter by class']")).click();
		wait(2000);
		for (int i = 1; i <= 5; i++) {
			if (driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[" + i + "]"))
					.isSelected() == true) {

				wait(3000);
				driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[" + i + "]")).click();
				System.out.println("The element is unchecked ");
			} else {
				System.out.println("The elememnt is not seleccted previously");
			}
		}
		driver.navigate().refresh();
		wait(6000);
	}

	public void TestToBeReviewed() {
		wait(2000);
		// click on 3dots
		driver.findElement(
				By.xpath("(//button[@class='ant-btn ant-btn-link ant-btn-sm viewsolutionsbtn fs-12 m-t-30'])[2]"))
				.click();
	}

	public void selectChapter() {
		wait(2000);
		// click on chapter
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		wait(2000);
		// select chapter
		driver.findElement(By.xpath("//div[text()='Transition Elements and Coordination Chemistry']")).click();
		wait(2000);
	}

	public void editquestion() {
		wait(2000);
		// click on question number
		driver.findElement(
				By.xpath("(//div[@class='r-c-c radius-100 test-circle-avatar m-b-10 m-l-10 cursor-pointer'])[1]"))
				.click();
		wait(2000);
		// click on question field
		driver.findElement(
				By.xpath("//div[@class='cursor-pointer test-ques-window resize-editor-img p-10 full-width']")).click();
		wait(2000);
		// click on text editor
		driver.findElement(By.xpath("//div[@class='ql-editor']")).sendKeys("hai");
		wait(3000);
		// click on save and next button
		// driver.findElement(By.xpath("//span[text()='Save & Close']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-btn ant-btn-primary']")));
		// driver.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']"));
		wait(2000);
		driver.findElement(By.xpath("//span[text()='Save & Close']")).click();
		System.out.println("Clicked on save and close button");
		wait(3000);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' SAVE & NEXT ']")));
		driver.findElement(By.xpath("//div[text()=' SAVE & NEXT ']")).click();
		wait(2000);
	}

	public void AllClasses() throws InterruptedException {
		// click on class
		wait(2000);
		driver.findElement(By.xpath("(//div[@class='m-b-30'])[1]")).click();
		wait(2000);

	}

	public void RecentlyPublished() throws InterruptedException {
		// click on 3 dots
		wait(2000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger text-lg a2grey cursor-pointer'])[1]")).click();
		wait(2000);
	}

	public void unpublish() {
		wait(2000);
		// click on unpublish
		driver.findElement(By.xpath("(//*[@class='r-ac cursor-pointer m-b-10'])[1]")).click();
		System.out.println("Clicked on unplublish button");
		// click on cancel button
		wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-btn blankGreyBtnWrap radius-100']")).click();
		System.out.println("Clicked on cancel  button");
		// unable if you want to click on ok to be unpublish
		/*
		 * wait(3000); driver.findElement(By.
		 * xpath("//*[@class='ant-btn purpleBtnWrap radius-100 m-l-20']")).click();
		 * System.out.println("Clicked on Ok  button");
		 */

	}

	public void classSyllabus(String Syllabus1) {
		List<WebElement> syllabus = driver.findElements(By.xpath("//div[@class=' r-c-c-c']"));
		int size = syllabus.size();
		for (int i = 1; i <= size; i++) {
			String syllabusname = driver.findElement(By.xpath("(//div[@class=' r-c-c-c'])[" + i + "]")).getText();
			wait(2000);
			if (Syllabus1.equalsIgnoreCase("Chapter Test")) {
				wait(2000);
				// click on chapter
				driver.findElement(By.xpath("(//div[@class=' r-c-c-c'])[1]")).click();
				wait(2000);
				// click on search button
				driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Mathematics");
				wait(2000);
				// click on subject name
				driver.findElement(By.xpath("(//span[@class='ant-avatar ant-avatar-circle ant-avatar-image'])[3]"))
						.click();
				wait(2000);
				// click on chapter
				driver.findElement(By.xpath("(//div[@class='m-l-20 m-t-20'])[1]")).click();
				wait(2000);
				InsideChapter();
				CreateTest1();
				break;

			} else if (Syllabus1.equalsIgnoreCase("Part Test")) {
				wait(2000);
				// click on part test
				driver.findElement(By.xpath("(//div[@class=' r-c-c-c'])[2]")).click();
				wait(2000);
				// click on search button
				driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Mathematics");
				wait(2000);
				// click on subject name
				driver.findElement(By.xpath("(//div[@class='m-t-30 bold-700'])[1]")).click();
				wait(2000);
				InsideChapter();
				// click on create
				wait(2000);
				driver.findElement(
						By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect m-r-50']"))
						.click();
				wait(2000);
				// click on title
				driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("test");
				wait(2000);
				// click on examiner
				driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]")).click();
				wait(2000);
				// select examiner
				driver.findElement(By.xpath("//div[text()='bhargav teacher']")).click();
				wait(2000);
				// click on chapter
				driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[5]")).click();
				wait(2000);
				// select chapter name
				driver.findElement(By.xpath("//div[text()='Algebra']")).click();
				wait(2000);
				// click on next button
				driver.findElement(
						By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
						.click();
				wait(2000);
				// click on set hours
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]")).click();
				wait(2000);
				// select hours
				driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
				wait(2000);
				// click on minutes
				driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
				wait(2000);
				// select minutes
				driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[11]")).click();
				wait(2000);
				// instruction
				driver.findElement(By.xpath("//textarea[@class='ant-input createmodalbg']")).sendKeys("all the best");
				wait(2000);
				// click create
				driver.findElement(By.xpath("//span[text()='CREATE']")).click();
				System.out.println("The creation test is successfull");
				wait(2000);
				break;
			} else if (Syllabus1.equalsIgnoreCase("Full Test")) {
				wait(2000);
				// click on full test
				driver.findElement(By.xpath("(//div[@class=' r-c-c-c'])[3]")).click();
				wait(2000);
				// click on search button
				driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Mathematics");
				wait(2000);
				// click on subject name
				driver.findElement(By.xpath("(//div[@class='m-t-30 bold-700'])[1]")).click();
				wait(2000);
				InsideChapter();
				CreateTest1();
				break;
			} else if (Syllabus1.equalsIgnoreCase("Previous Year Papers")) {
				// click on Previous Year Papers
				driver.findElement(By.xpath("(//div[@class=' r-c-c-c'])[4]")).click();
				wait(2000);
				// click on search button
				driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("Mathematics");
				wait(2000);
				// click on subject name
				driver.findElement(By.xpath("(//div[@class='m-t-30 bold-700'])[1]")).click();
				InsideChapter();
				CreateTest1();
				break;

			}

		}
	}

	public void InsideChapter() {
		List<WebElement> InsideChapter = driver.findElements(By.xpath("//div[@class='ant-tabs-tab-btn']"));
		int size1 = InsideChapter.size();
		for (int i = 1; i <= size1; i++) {
			wait(2000);
			driver.findElement(By.xpath("(//div[@class='ant-tabs-tab-btn'])[" + i + "]")).click();
		}

	}

	public void CreateTest1() {
		// click on create
		wait(2000);
		driver.findElement(
				By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect m-r-50']")).click();
		wait(2000);
		// click on title
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys("test");
		wait(2000);
		// click on examiner
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[1]")).click();
		wait(2000);
		// select examiner
		driver.findElement(By.xpath("//div[text()='bhargav teacher']")).click();
		wait(2000);
		// click on next button
		driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect']"))
				.click();
		wait(2000);
		// click on set hours
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[1]")).click();
		wait(2000);
		// select hours
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[1]")).click();
		wait(2000);
		// click on minutes
		driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]")).click();
		wait(2000);
		// select minutes
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[11]")).click();
		wait(2000);
		// instruction
		driver.findElement(By.xpath("//textarea[@class='ant-input createmodalbg']")).sendKeys("all the best");
		wait(2000);
		// click create
		driver.findElement(By.xpath("//span[text()='CREATE']")).click();
		System.out.println("The creation test is successfull");
		wait(2000);

	}

	public void selectPartTestChapter() {
		wait(2000);
		// click on chapter
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]")).click();
		wait(2000);
		// select chapter name
		driver.findElement(By.xpath("//div[text()='Algebra']")).click();

	}

	public void selectFullTestChapter() {
		wait(2000);
		// click on chapter
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]")).click();
		wait(2000);
		// select chapter name
		driver.findElement(By.xpath("//div[text()='Knowing Our Numbers']")).click();
	}

	public void ImportQuestions(String  Import)
	{
		wait(2000);
		//click on import 
		driver.findElement(By.xpath("//div[@class='r-c-c-c cursor-pointer']")).click();
		wait(2000);
		driver.findElement(By.xpath("//input[@class='ant-radio-input']")).click();
		wait(2000);
		if(Import.equalsIgnoreCase("Sample Question Papers"))
		{
			wait(2000);
			//click on sample question papers
			driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[1]")).click();
			wait(2000);
			//click on import
			driver.findElement(By.xpath("//div[@class='purpleBtnWrap radius-100 cursor-pointer purpleButtonHoverEffect r-c-c']"))
			.click();
			wait(2000);
			//click on 6A 
			driver.findElement(By.xpath("(//div[@class='text-xlg text-center text-overflow p-r-5 p-l-5'])[1]")).click();
			wait(2000);
			//click on test name 
			driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[10]")).click();
			wait(2000);
			//click on import
			driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect p-r-10 p-l-10']"))
			.click();
			wait(2000);
			}
		else if(Import.equalsIgnoreCase("Subject-wise Question Papers"))
		{
			wait(2000);
			//click on Subject-wise Question Papers
			driver.findElement(By.xpath("(//input[@class='ant-radio-input'])[2]")).click();
			wait(2000);
			//click on import
			driver.findElement(By.xpath("//div[@class='purpleBtnWrap radius-100 cursor-pointer purpleButtonHoverEffect r-c-c']"))
			.click();
			//click on 6A 
			driver.findElement(By.xpath("(//div[@class='text-xlg text-center text-overflow p-r-5 p-l-5'])[1]")).click();
			wait(2000);
			//click on subject name 
			wait(2000);
			driver.findElement(By.xpath("(//div[@class='shadow-box p-20 m-l-20 m-b-20 p-t-20 r-c-c-c hover-shadow cursor-pointer'])[8]"))
			.click();
			wait(2000);
			//click on chapter name 
			driver.findElement(By.xpath("(//div[@class='customCardShadow m-10 cursor-pointer shadow-box hover-shadow'])[1]"))
			.click();
			wait(3000);
			//click on question number
			driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
			wait(3000);
			//click on marks
			
			for(int i=0;i<5;i++)
			{
				wait(1000);
				driver.findElement(By.xpath("(//*[@class='cursor-pointer'])[1]")).click();
			}
			//click on import button 
			driver.findElement(By.xpath("//button[@class='ant-btn purpleBtnWrap radius-100 purpleButtonHoverEffect p-r-10 p-l-10']"))
			.click();
			
		}
		
	   }
	//*********************** Student side *****************************//
	public void Overview() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		driver.findElement(By.xpath("//a[contains(@href, '/student-practice-home')]")).click();
		wait(2000);
		List<WebElement> TestCount = driver.findElements(By.xpath("(//div[@class='m-l-10'])[1]/div[3]/div/div/div/div[1]"));
		int size=TestCount.size();
		List<WebElement> TestType = driver.findElements(By.xpath("(//div[@class='m-l-10'])[1]/div[3]/div/div/div/div[2]"));
		for(int i=0;i<size;i++)
		{
			
			String TestName=TestType.get(i).getText();
			String TotalTestCount= TestCount.get(i).getText();
			System.out.println(" "+TestName+" :- "+TotalTestCount);
		
		}
	
}
	
	public void TestType() throws InterruptedException
	{
		ScrollDown();
		wait(2000);
		driver.findElement(By.xpath("//a[contains(@href, '/student-practice-home')]")).click();
		wait(2000);
		List<WebElement> TestType=driver.findElements(By.xpath("//div[@class='m-r-15 r-c-c-c p-10 customCardShadow cursor-pointer shadow-box hover-shadow']"));
		int Testsize=TestType.size();
		for(int i=0;i<Testsize;i++)
		{
			TestType.get(i).click();
			wait(1000);
			//click on subject 
			List<WebElement> Subname = driver.findElements(By.xpath("//div[@class='r-jc ']"));
			int subsize=Subname.size();
			//click on subject count 
			List<WebElement> Subcount = driver.findElements(By.xpath("//div[@class='r-jc m-t-30']/div"));
			for(int j=0;j<subsize;j++)
			{
				String SubjectName=Subname.get(j).getText();
				System.out.println(" Name Of The Subject :- "+SubjectName);
				wait(2000);
				String ChapterCount=Subcount.get(j).getText();
				System.out.println(" Count Of The Chapters :- "+ChapterCount);
				wait(2000);
				
				String expected="0";
				if(expected.equals(ChapterCount))
				{
					wait(2000);
					
					System.out.println("Zero Chapters Present in this Subject");
				}
				else {

					System.out.println("ok");
					wait(2000);
					//Subcount.get(j).click();
					//System.out.println("ok   hjhjk");
					//wait(3000);
					//driver.findElement(By.xpath("//div[@class='m-b-20']/span[1]")).click();
					//wait(2000);
					
					}
					
				
			}
			break;
		}
		
	}
	public void AllTypeTest(String TestType)
	{
		wait(2000);
		//click on all type of test
		driver.findElement(By.xpath("//div[@class='m-r-15 r-c-c-c p-10 customCardShadow cursor-pointer shadow-box hover-shadow']"))
		.click();
		wait(2000);
		if(TestType.equalsIgnoreCase("Chapter Test"))
				 {
			wait(2000);
			//click on chapter test
			driver.findElement(By.xpath("(//div[@class='m-r-15 r-c-c-c p-10 customCardShadow cursor-pointer shadow-box hover-shadow'])[1]"))
			.click();
			wait(2000);
			//click on subject 
			List<WebElement> Subname = driver.findElements(By.xpath("//div[@class='r-jc ']"));
			int subsize=Subname.size();
			for(int i=0;i<subsize;i++)
			{
				String allsubnames=Subname.get(i).getText();
				System.out.println("--------all the subjects name-------- "+Subname);
			}
			
		}
	}
	
	public void clickOnPracticeTest() {
		wait(3000);
		driver.findElement(By.xpath("//*[contains(@href,'/student-practice-home')]")).click();
		String ele=driver.findElement(By.xpath("//*[contains(@href,'/student-practice-home')]")).getText();
		System.out.println("Clicked on "+ele);
		
	}
	
	public void scrollDownOperaion(WebElement Element) {
		wait(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println("Scroll down is done : ");
	}
	
	public void countNumberOfBlock(String TestType) {
		wait(3000);
		WebElement ele=driver.findElement(By.xpath("//*[text()='Syllabus']"));
		scrollDownOperaion(ele);
		List<WebElement> WE=driver.findElements(By.xpath("//*[@class='m-r-15 r-c-c-c p-10 customCardShadow cursor-pointer shadow-box hover-shadow']"));
		int size=WE.size();
		System.out.println("The size is :"+ " "+size);
		for(int i=1;i<=size;i++) {
			String name=driver.findElement(By.xpath("(//*[@class='m-r-15 r-c-c-c p-10 customCardShadow cursor-pointer shadow-box hover-shadow'])["+i+"]")).getText();
			System.out.println("The names are :"+" "+name);
			if(name.contains(TestType)) {
				wait(3000);
			driver.findElement(By.xpath("(//*[@class='m-r-15 r-c-c-c p-10 customCardShadow cursor-pointer shadow-box hover-shadow'])["+i+"]")).click();
			break;
		}
	}
	
	}
	public void selectionOfClassInTest() {
		wait(3000);
		List<WebElement> WE=driver.findElements(By.xpath("//*[@class='cursor-pointer m-l-10 r-afs flex-wrap full-height m-t-20']"));
		int size=WE.size();
		System.out.println("The size of no. of classes are  :"+ " "+size);
		if(size!=0) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='cursor-pointer m-l-10 r-afs flex-wrap full-height m-t-20'])[1]")).click();
			//break;
			wait(3000);
			
		}
		else {
			System.out.println("The selected test type has no classes in it ...");
			wait(3000);
			driver.findElement(By.xpath("//*[@class='m-b-20']")).click();
			System.out.println("Navigated back to Home page ...");
			
		}
	}
	public void clickOnAttends() {
		wait(3000);
		driver.findElement(By.xpath("//*[@id='rc-tabs-2-tab-Attempted']")).click();
		System.out.println("Cliked on :ATTEMPTED ");
		/*List<WebElement> WE=driver.findElements(By.xpath("//*[@class='ant-tabs-tab-btn']"));
		int size=WE.size();
		System.out.println("The size of no. of clickble elements are  :"+ " "+size);
		for(int i=1;i<=size;i++) {
			String nameis=driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])["+i+"]")).getText();
			System.out.println("The names are :"+" "+nameis);
			driver.findElement(By.xpath("(//*[@class='ant-tabs-tab-btn'])["+i+"]")).click();
			wait(3000);*/
		// to check No attempted test(s) message is displayed or not 
		boolean t = driver.findElement(By.xpath("//*[@class='m-l-15']")).isDisplayed();
		if(t) {
			String name=driver.findElement(By.xpath("//*[@class='m-l-15']")).getText();
			System.out.println("Element is dispalyed: "+" "+name);
		}
		else {
			 System.out.println("No attempted test(s) message is displayed");
			 
		}
		
	}
	
	public void clickOnAvailable() {
		wait(3000);
		driver.findElement(By.xpath("//*[@id='rc-tabs-2-tab-Available']")).click();
		System.out.println("Cliked on :AVAILABLE ");
		boolean t = driver.findElement(By.xpath("//*[@class='m-l-40']")).isDisplayed();
		if(t) {
			String name=driver.findElement(By.xpath("//*[@class='m-l-40']")).getText();
			System.out.println("Element is dispalyed: "+" "+name);
		}
		else {
			 System.out.println("No test available message is displayed");
			 
		}
		
		
		
	}
	
	public void clickOnSearchButton() {
		wait(3000);
		String str="Heloo12344";
		WebElement ele=driver.findElement(By.xpath("//*[@placeholder='Search by test name']"));
		
		ele.sendKeys(str);
		ele.sendKeys(Keys.CONTROL+"a");
		wait(3000);
		ele.sendKeys(Keys.DELETE);
		System.out.println("All the search operaion was completetd successfully ...");
		
		
		
	}
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


