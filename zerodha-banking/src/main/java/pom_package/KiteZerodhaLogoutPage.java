package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhaLogoutPage {
	   
	WebDriver driver;
	
	   @FindBy (xpath = "//button[text()='B ']")
	   private WebElement logout; 
	   
	   public KiteZerodhaLogoutPage (WebDriver driver)
	    {
		    this.driver=driver;
	    	PageFactory.initElements(driver,this);
	    }
	    
	    public void clickKiteChangeUser() {
	    	logout.click();
	    }
}