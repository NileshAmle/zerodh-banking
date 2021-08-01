package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhaLoginPage {

	@FindBy (xpath = "//input[@type='text']")
    private WebElement userid;

    @FindBy (xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement login;
    
   @FindBy (xpath = "//input[@id='pin']")
   private WebElement pin;
   
   @FindBy (xpath = "//button[@type='submit']")
   private WebElement continuebutton; 
    
   public KiteZerodhaLoginPage (WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
  
	public void sendKiteLoginPageUsername() {
    	userid.sendKeys("DV1510");
    }
    
    public void sendKiteLoginPagePassword() {
    	password.sendKeys("Vijay@123");
    }
    
    public void clickKiteLoginPageLogin() {
    	login.click();
    }
    
    public void sendKiteLoginPagePin() {
    	pin.sendKeys("959594");
    }
    
    public void clickKiteLoginPageContinue() {
    	continuebutton.click();
    }
}
