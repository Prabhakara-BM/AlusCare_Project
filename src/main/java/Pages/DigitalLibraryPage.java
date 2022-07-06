package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DigitalLibraryPage  extends Aulas_Base.BaseTest{
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary;
	@FindBy(xpath="//span[@class='anticon anticon-setting']")
	WebElement ClickOnManage;
	@FindBy(xpath="//div[@class='menuItems cursor-pointer']")
	WebElement UserDetails ;
	@FindBy(xpath="//div[@style='height: 40px; background-color: rgb(152, 118, 230); width: 9.98%;']")
	WebElement ClickOnPurple;
	@FindBy(xpath="//div[@style='height: 40px; background-color: rgb(255, 131, 208); width: 10.06%;']")
	WebElement ClickOnPink ;
	@FindBy(xpath="//div[@style='height: 40px; background-color: rgb(230, 230, 230); width: 79.96%;']")
	WebElement  ClickOnGray;
	@FindBy(xpath="//span[@class='ant-typography text-heading-library cursor-pointer']")
	WebElement ClickOnUpdatePlan;
	@FindBy(xpath="(//button[@class='ant-btn button-buy-storage'])[1]")
	WebElement ClickOnSubscribe;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default']")
	WebElement ClickOnCancel ;
	@FindBy(xpath="(//button[@class='ant-btn button-buy-storage'])[1]")
	WebElement ClickOnSubscribes;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement ClickOnPay;
	@FindBy(xpath="//div[@id='modal-close']")
	WebElement ClickOnIntoMark ;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement ClickOnIntoMarks ;
	@FindBy(xpath="(//button[@class='ant-btn button-buy-storage'])[8]")
	WebElement  ClickOnContackUs;
	@FindBy(xpath="//textarea[@placeholder='Type your question here...']")
	WebElement ClickOnTextBox ;
	@FindBy(xpath="//div[@style='margin-bottom: 10px; margin-top: 10px; margin-right: 10px;']")
	WebElement  ClickOnsendButton ;
	
	/************UPLOAD Lecture notes*****************/
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[7]")
	WebElement ClickOnDigitalLibrary1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary btn-radius-15__height-38 m-l-20 text-xmd']")
	WebElement ClickOnUpload;
	@FindBy(xpath="(//input[@class='ant-radio-input'])[1]")
	WebElement ClickOnLectureNotes;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ClickOnNext;
	@FindBy(xpath="//input[@class='ant-input ant-select-selection-search-input']")
	WebElement ClickSubject;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[3]")
	WebElement SelectSub;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement ClickClass;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[12]")
	WebElement SelectClass;
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[2]")
	WebElement ClickChapter;
	@FindBy(xpath="(//div[@style='display: flex; justify-content: space-between;'])[11]")
	WebElement SelectChapter;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickTopic;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[31]")
	WebElement ClickOnCreate;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	WebElement ClickOnTopic;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[31]")
	WebElement SelectTopic;
	@FindBy(xpath="//input[@class='ant-input ant-input-borderless']")
	WebElement ClickOnTitle;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default'])[1]")
	WebElement ClickChooseFile;
	
	
	
	
	
	
	public DigitalLibraryPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void GetStorage() throws InterruptedException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary.click();
		Thread.sleep(2000);
		ClickOnManage.click();
		Thread.sleep(2000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='menuItems cursor-pointer']"));
		int elesize=ele.size();
		for(int i=0;i<elesize;i++)
		{
			Thread.sleep(2000);
			ele.get(i).click();
		}
		
		Thread.sleep(2000);
		ClickOnPurple.click();
		Thread.sleep(2000);
		ClickOnPink.click();
		Thread.sleep(2000);
		ClickOnGray.click();
		Thread.sleep(2000);
		ClickOnUpdatePlan.click();
		Thread.sleep(2000);
		ClickOnSubscribe.click();
		Thread.sleep(2000);
		ClickOnCancel.click();
		Thread.sleep(2000);
		ClickOnSubscribes.click();
		Thread.sleep(2000);
		ClickOnPay.click();
		Thread.sleep(2000);
		ClickOnIntoMark.click();
		Thread.sleep(2000);
		ClickOnIntoMarks.click();
		Thread.sleep(2000);
		ClickOnContackUs.click();
		Thread.sleep(2000);
		ClickOnTextBox.sendKeys("Hi");
		Thread.sleep(2000);
		ClickOnsendButton.click();
		}
	
	public void LectureNotes() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		ClickOnDigitalLibrary1.click();
		Thread.sleep(2000);
		ClickOnUpload.click();
		Thread.sleep(2000);
		ClickOnLectureNotes.click();
		Thread.sleep(2000);
		ClickOnNext.click();
		/*Thread.sleep(2000);
		ClickSubject.click();
		Thread.sleep(2000);
		SelectSub.click();
		Thread.sleep(2000);
		ClickClass.click();
		Thread.sleep(2000);
		SelectClass.click();
		Thread.sleep(2000);
		ClickChapter.click();
		Thread.sleep(2000);
		SelectChapter.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickOnTopic.click();
		Thread.sleep(2000);
		SelectTopic.click();
		Thread.sleep(2000);
		ClickOnTitle.sendKeys("video");
		Thread.sleep(2000);
		WebElement tops=driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		//tops.click();
		Thread.sleep(6000);
		
		tops.sendKeys("C:\\Users\\Brigosha_Guest\\file\\user.pdf");*/
		 // File Location
		StringSelection select = new StringSelection("C:\\Users\\Prabhakar\\Documents\\OfferLetter.pdf");
		// Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		WebElement upload = driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-default'])[1]"));
		upload.click();
		Thread.sleep(6000);
		// Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        // Wait
        Thread.sleep(1000);
     // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		//driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[2]")).click();
		//Thread.sleep(4000);
		
	System.out.println("---successfull upload---");
	}
	

}
