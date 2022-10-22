package Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;



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
	 
	/******************************************Data Operator***************/
	 public void clickOnOthersInDataOper() {
		 wait(3000);
		WebElement ele= driver.findElement(By.xpath("(//*[@class='r-c-c-c '])[5]"));
		 wait(3000); 
		 ele.click();
		 System.out.println("Clicked on :"+ele.getText());
	 }
	 
	 
	public void clickOnAlusCare() {
		wait(3000);
		WebElement alusCare=driver.findElement(By.xpath("//*[contains(@href,'/care')]"));
		scrollByElement(alusCare);
		wait(3000);
		alusCare.click();
		System.out.println("Clicked on :"+alusCare.getText());
	}
	 
	public void covid19resources() {
		wait(3000);
		//WebElement covidResource=driver.findElement(By.xpath("//*[text()='Covid-19 resources']"));
		/*WebElement covidResource=driver.findElement(By.xpath("//*[@class='careCard ']"));
		wait(3000);
		covidResource.click();
		System.out.println("Clicked on :"+covidResource.getText());*/
		String xpath="//*[@class='careCard ']";
		
		driver.findElement(By.xpath(xpath)).click();
		//page has been refreshed. Now create a new element and work on it
		//driver.findElement(By.xpath(xpath)).click();   //This works
		
	}
	public void findVaccinationCenter() {
		wait(3000);
		WebElement vaccinationCenter=driver.findElement(By.xpath("//*[text()='FIND A VACCINATION CENTER']"));
		vaccinationCenter.click();
		System.out.println("Clicked on vaccination center :");
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		System.out.println("The current parent  window name is :"+parent);
		wait(3000);
		driver.findElement(By.xpath("(//*[contains(@href,'https://healthid.ndhm.gov.in/')])[1]")).click();
		Set<String>s=driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		//driver.close();
		}
	}
		//switch to the parent window
		wait(3000);
		driver.switchTo().window(parent);
		System.out.println("Switched to parent window...");
	 }
	public void getRegisteredStatus() {
		wait(3000);
		//String status=driver.findElement(By.xpath("//*[@class=' ']")).getText();
		String status=driver.findElement(By.xpath("//*[@class='m-l-20  ']")).getText();
		System.out.println("The number of blocks are:"+status);
	}
	
	
	@AfterSuite
	public void taerDown() {
		driver.quit();
	}
	
	
	public void logout() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger'])[1]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[2]")).click();
		System.out.println("Clicked on the logout button");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
