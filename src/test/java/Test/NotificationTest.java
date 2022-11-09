package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NotificationPage;

public class NotificationTest extends Aulas_Base.BaseTest{
	NotificationPage NP;
	LoginClass LC;
    HomePage1 HP;
	
	public NotificationTest() {
		super();
	}
	

	@BeforeMethod
	public void setup() throws InterruptedException{
		initilization();
		
		NP=new NotificationPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement Notification1 = driver.findElement(By.xpath("//span[text()='Notification']"));
		Thread.sleep(2000);
      	js.executeScript("arguments[0].scrollIntoView(true)", Notification1);
		
	}
	
	
	@Test(priority=1,groups="Notification Module")
	public void Notification() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.Notification();
		
	}
	@Test(priority=2,groups="Notification Module")
	public void NotificationClick() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.NotificationClick();
	}
	@Test(priority=3,groups="Notification Module")
	public void NotificationOpen() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.NotificationOpen();
	}
	@Test(priority=4,groups="Notification Module")
	public void NotificationClose() throws InterruptedException
	{
		Thread.sleep(2000);
		NP.NotificationClose();
	}
	
}
