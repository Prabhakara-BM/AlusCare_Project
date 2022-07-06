package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//import Aulas_Base.TestBase;

public class MobilePage extends Aulas_Base.BaseTest
{
	@FindBy(xpath="//div[@class='ant-tabs-tab']")
    WebElement Mobilebutton;
    @FindBy(xpath="//div[@class='flag-dropdown']//following::input[@type='tel']")
    WebElement phonetextfield;
    @FindBy(xpath="//button[contains(@class,'primary ')]//span[text()='Send OTP']")
    WebElement sendOTP;
    
    public MobilePage()
    {
    	  PageFactory.initElements(driver, this);
    }
    
    public MobilePage login(String pno)
    {
    	phonetextfield.sendKeys(pno);
    	sendOTP.click();
    	return new MobilePage();
    }
    
    

}
