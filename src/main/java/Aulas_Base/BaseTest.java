package Aulas_Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import Util.TestUtil;

//@Listeners(BrowserSpawner.class)
public class BaseTest {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public BaseTest()
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\ConfigProperties");
			//FileInputStream ip=new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\ConfigProperties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void initilization() throws InterruptedException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", System.getProperty("user.dir")+"\\Downloads");
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver(options);
		    
		   // options.addArguments("headless");  // without opening browser test cases run
		    
		}
		else if(browserName.equals("FF"))
		{
			/*	Proxy proxy = new Proxy();

			proxy.setHttpProxy("ipaddress:4444");

			options.setCapability("proxy", proxy); */
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(8000);
		driver.get(prop.getProperty("url"));
		Thread.sleep(8000);
		
		
		
	}

	/*public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String DestinationFile =System.getProperty(System.getProperty("user.dir")+"\\Screenshots"+testCaseName+"_"+".png");
	//FileUtils.copyFile(source, new File("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\AulasProject\\Screenshots"+testCaseName+"_"+".jpg"));
	FileUtils.copyFile(source, new File(DestinationFile));

	}*/
	

	public void wait(int wait){
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void scrollByElement(WebElement ele) {
	wait(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
}
public void WaitTillClickble(WebElement ele) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement el=driver.findElement(By.xpath(""));

	wait.until(ExpectedConditions.elementToBeClickable(ele));
	System.out.println("Waited for 30 sec time to click on element ");
	
}

public static void randomNumber() {
Random rn = new Random();
int answer = rn.nextInt(10) + 1;
System.out.println("The Random number is :"+answer);

}
public void clearText(String locator) {
wait(3000);
WebElement toClear = driver.findElement(By.xpath(locator));
toClear.sendKeys(Keys.CONTROL + "a");
toClear.sendKeys(Keys.DELETE);

}
public void getCurrentDate() {
wait(3000);
Date date=new Date();
System.out.println("The date is :"+" "+date);
DateFormat dateformate=new SimpleDateFormat("yyyy/mm/dd");
String date1=dateformate.format(date);
System.out.println("The formate date is :"+" "+date1);


}

public static void Wait(WebElement ele)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}
public static void WaitUnTil(WebElement ele)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(900));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}
public static void WaitTil(int Wait)
{
	try {
		Thread.sleep(Wait);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//How to randomly generate different First and Last Name of users to a List with using Random Generator in java? [closed]
public static void generateFirstAndLastName() {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();

    for(int x=1;x<=100;x++) {
        StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + random.nextInt(rightLimit - leftLimit + 1);
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();


    
    System.out.println(generatedString);
    }
}


public void getScreenShotAS(String name) {
	TakesScreenshot ts1 = (TakesScreenshot)driver;
    File file1 = ts1.getScreenshotAs(OutputType.FILE);
			
    try {
         // FileUtils.copyFile(file1, new File("./Screenshots/Test2_SearchUser.png"));
    	 FileUtils.copyFile(file1, new File("./Screenshots/"+name+".png"));
	} catch (IOException e) {
	e.printStackTrace();
}

}
//Getting the current time and date on a 24 hour timescale
public void currentTimeAndDate24() {
	
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	String str = sdf.format(new Date());
	System.out.println("The current time and date on a 24 hour timescale: "+str);
}

public void selectStartDate() {
	wait(3000);
	driver.findElement(By.xpath("(//*[@placeholder='Select Date'])[1]")).click();
	wait(3000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions
			.elementToBeClickable(By.xpath("//*[@class='ant-picker-header-super-next-btn']")));
	for (int i = 0; i < 3; i++) {

		driver.findElement(By.xpath("//*[@class='ant-picker-header-super-next-btn']")).click();
	}
	// For Generating random numbers b/w 1 to 10 by adding zero as prefix
	// eg:01,02,03..ext
	Random generator = new Random();
	int i = generator.nextInt(10) + 1;
	String h = String.format("%02d", i);
	System.out.println("The Random number is : " + " " + h);
	
	// Thread.sleep(5000);
	//converting month to integer
	wait(3000);
	String displayedMonthIs=driver.findElement(By.xpath("//*[@class='ant-picker-month-btn']")).getText();
	System.out.println("The Currently displaying month is :"+displayedMonthIs);
	String monthInNumber=converMonthToNum(displayedMonthIs);
	System.out.println("The returned and covert value is :"+monthInNumber);
	System.out.println("The "+displayedMonthIs+" "+"in number is :"+monthInNumber);
	//The displayed year is 
	wait(3000);
	String displayedYearIs=driver.findElement(By.xpath("//*[@class='ant-picker-year-btn']")).getText();
	System.out.println("The Currently displaying month is :"+displayedYearIs);
	
	driver.findElement(By.xpath("//*[@title='"+displayedYearIs+"-"+monthInNumber+"-"+h+"']")).click();
	String dateIs=driver.findElement(By.xpath("//*[@title='"+displayedYearIs+"-"+monthInNumber+"-"+monthInNumber+"']")).getText();
	System.out.println("The start date selection was done successfully "+"The date is:"+dateIs);
}

public void getDisplayedMonth() {
	wait(3000);
	String displayedMonthIs=driver.findElement(By.xpath("//*[@class='ant-picker-month-btn']")).getText();
	System.out.println("The Currently displaying month is :"+displayedMonthIs);
	String monthInNumber=converMonthToNum(displayedMonthIs);
	System.out.println("The "+displayedMonthIs+"in number is :"+monthInNumber);
}
public void getDisplayedYear() {
	wait(3000);
	String displayedYearIs=driver.findElement(By.xpath("//*[@class='ant-picker-year-btn']")).getText();
	System.out.println("The Currently displaying month is :"+displayedYearIs);
}
public String converMonthToNum(String month) {
	wait(3000);
	String returnedValueIS="";
	if(month.equalsIgnoreCase("Jan")) {
		return returnedValueIS="01";
    }
	else if(month.equalsIgnoreCase("Feb")) {
		return returnedValueIS="02";
    }
	else if(month.equalsIgnoreCase("Mar")) {
		return returnedValueIS="03";
    }
	else if(month.equalsIgnoreCase("Apr")) {
		return returnedValueIS="04";
    }
	else if(month.equalsIgnoreCase("May")) {
		return returnedValueIS="05";
    }
	else if(month.equalsIgnoreCase("Jun")) {
		return returnedValueIS="06";
    }
	else if(month.equalsIgnoreCase("Jul")) {
		return returnedValueIS="07";
    }
	else if(month.equalsIgnoreCase("Aug")) {
		return returnedValueIS="08";
    }
	else if(month.equalsIgnoreCase("Sep")) {
		return returnedValueIS="09";
    }
	else if(month.equalsIgnoreCase("Oct")) {
		return returnedValueIS="10";
    }
	else if(month.equalsIgnoreCase("Nov")) {
		return returnedValueIS="11";
    }
	else if(month.equalsIgnoreCase("Dec")) {
		return returnedValueIS="12";
    }
	
	return returnedValueIS;
	}

public void selectEndDate() {
	wait(3000);
	driver.findElement(By.xpath("(//*[@placeholder='Select Date'])[2]")).click();
	wait(3000);
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
	
	// Thread.sleep(5000);
	//converting month to integer
	wait(3000);
	String displayedMonthIs=driver.findElement(By.xpath("(//*[@class='ant-picker-month-btn'])[2]")).getText();
	System.out.println("The Currently displaying month is :"+displayedMonthIs);
	String monthInNumber=converMonthToNum(displayedMonthIs);
	System.out.println("The returned and covert value is :"+monthInNumber);
	System.out.println("The "+displayedMonthIs+" "+"in number is :"+monthInNumber);
	//The displayed year is 
	wait(3000);
	String displayedYearIs=driver.findElement(By.xpath("(//*[@class='ant-picker-year-btn'])[2]")).getText();
	System.out.println("The Currently displaying month is :"+displayedYearIs);
	wait(3000);
	driver.findElement(By.xpath("//*[@title='"+displayedYearIs+"-"+monthInNumber+"-"+h+"']")).click();
	String dateIs=driver.findElement(By.xpath("//*[@title='"+displayedYearIs+"-"+monthInNumber+"-"+monthInNumber+"']")).getText();
	System.out.println("The last date selection was done successfully "+"The date is:"+dateIs);
	
}

	public static String generateRandomPassword(int len) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();


	}
	
	public void Dologout() {
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-trigger'])[1]")).click();
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='ant-dropdown-menu-title-content'])[2]")).click();
		System.out.println("Clicked on the logout button");
		
	}
	
}


