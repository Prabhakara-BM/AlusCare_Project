package Pages;

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
	 
}
