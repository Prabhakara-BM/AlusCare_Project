package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NotificationPage extends Aulas_Base.BaseTest
{

	@FindBy(xpath="(//li[@class='ant-menu-item ant-menu-item-only-child'])[10]")
	WebElement Notification;
	@FindBy(xpath="//div[text()='Notifications']")
	WebElement NotificationText;
	@FindBy(xpath="//div[@class='ant-tabs-tab ant-tabs-tab-active']")
	WebElement NotificationClick;
	@FindBy(xpath="(//div[@class='r-jsb-fc notifyCard'])[1]")
	WebElement NotificationOpen;
	@FindBy(xpath="//button[@class='ant-btn mod-notifyApprove-btn']")
	WebElement Close;

	 public NotificationPage()
     {
    	 PageFactory.initElements(driver, this);
     }
	  public void Notification() throws InterruptedException
	  {
	    	 Thread.sleep(2000);
	    	 Notification.click();
	    	 Thread.sleep(2000);
	   }
	  public void NotificationClick() throws InterruptedException
	  {
	    	 Thread.sleep(2000);
	    	 Notification.click();
	    	 Thread.sleep(2000);
	    	 NotificationClick.click();
	    	 Thread.sleep(2000);
	    	 
	   }
	  public void NotificationOpen() throws InterruptedException
	  {
	    	 Thread.sleep(2000);
	    	 Notification.click();
	    	 Thread.sleep(2000);
	    	 NotificationClick.click();
	    	 Thread.sleep(2000);
	    	 NotificationOpen.click();
	    	 Thread.sleep(2000);
	    	 
	   }
	  public void NotificationClose() throws InterruptedException
	  {
	    	 Thread.sleep(2000);
	    	 Notification.click();
	    	 Thread.sleep(2000);
	    	 NotificationClick.click();
	    	 Thread.sleep(2000);
	    	 NotificationOpen.click();
	    	 Thread.sleep(2000);
	    	 Close.click();
	    	 Thread.sleep(2000);
	   }
	 /*****************************************************Notofication Module Teacher side*********************************/
	  public void clickOnNotification() {
		  wait(3000);
		 WebElement ele= driver.findElement(By.xpath("//*[contains(@href,'/notifications-home')]"));
		 scrollByElement(ele);
		 wait(3000);
		 ele.click();
		 System.out.println("Cliked on :"+ele.getText());
		   }
	  
	  public void clickAllNotifications() {
		  wait(3000);
		 WebElement allnotifi= driver.findElement(By.xpath("//*[@class='r-c-c-c']"));
		 wait(3000);
		 allnotifi.click();
		 System.out.println("Clicked on :"+" "+allnotifi.getText());
		 
	  }
	 public void numberOfBlocksInAllNotifications() {
		 wait(3000);
		boolean yes= driver.findElement(By.xpath("//*[@class='m-l-20  ']")).isDisplayed();
		if(yes) {
			List<WebElement> ele=driver.findElements(By.xpath("//*[@class='m-l-20  ']"));
		
		int size=ele.size();
		System.out.println("The size is :"+size);
		for(int i=1;i<=size;i++) {
			String nameis=driver.findElement(By.xpath("(//*[@class='m-l-20  '])["+i+"]")).getText();
			//System.out.println("The block names are :"+nameis);
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='cursor-pointer'])["+i+"]")).click();
			wait(3000);
			//*[@class='anticon anticon-arrow-left']
			driver.findElement(By.xpath("//*[@class='anticon anticon-arrow-left']")).click();
			wait(3000);
			
			
		}
		
		}
		 if(!yes){
		
			System.out.println("There are no notifications popups in All Notifications sections...");
		
		}
	 }
		
	 public void clickAllSelectOneByOne() {
		 wait(3000);
		 for(int i=1;i<=5;i++) {
			 wait(3000);
		driver.findElement(By.xpath("//*[@class='ant-select-selection-item']")).click();
		 wait(3000);
		 String nameIs=driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).getText();
		 driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).click();
		//String nameIs=driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])["+i+"]")).getText();
		 System.out.println("Clicked on the iteams names is :"+nameIs);
	 }
	  
	 }
	 public void clickOnAnnouncement() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[1]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 
	 public void selectionOfLeftSideOptions(String Options) {
		 wait(3000);
		 List<WebElement> ele=driver.findElements(By.xpath("	"));
			
			int size=ele.size();
			System.out.println("The size is :"+size);
			for(int i=1;i<=size;i++) {
				String nameis=driver.findElement(By.xpath("(//*[@class='r-c-c-c '])["+i+"]")).getText();
				//System.out.println("The block names are :"+nameis);
				if(nameis.equalsIgnoreCase(Options)) {
					wait(3000);
					driver.findElement(By.xpath("(//*[@class='r-c-c-c '])["+i+"]")).click();
					System.out.println("The selected option is :"+Options);
					break;
				}
			}
		 
	 }
	 
	 public void clickOnAssignments() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[2]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 public void clickOnTest() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[3]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 public void clickOnPractceTest() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[4]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 public void clickOnDigitalLibrery() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[5]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 public void clickOnOthers() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[6]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
