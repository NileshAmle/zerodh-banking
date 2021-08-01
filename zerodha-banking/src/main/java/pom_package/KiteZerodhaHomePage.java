package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhaHomePage {

    WebDriver driver;
	
	@FindBy (xpath = "//div[@class='omnisearch']//div//input")
    private WebElement search;

    @FindBy (xpath = "//div[@class='search-result']//ul//div//li[2]")
    private WebElement tatasteel;

    @FindBy (xpath = "(//button[@class='button-blue'])[1]")
    private WebElement buybutton;
    
    @FindBy (xpath = "//span[text()='DV1510']")
	   private WebElement kv;

   public KiteZerodhaHomePage (WebDriver driver)
    {
		this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
   
//   public String verifyKiteHomePageDashboardlink() {
//	   return driver.getCurrentUrl();
//   }
  
	public void search() {
		search.sendKeys("TATASTEEL");
    }

    public void tatasteel() {
    	Actions a = new Actions(driver);
    	a.moveToElement(tatasteel).perform();
    }
    
    public void buybutton()  {
       	Actions a = new Actions(driver);
    	a.moveToElement(buybutton).click().build().perform();
    }
    
//    public String verifyKiteHomePageOrderslink() {
//    	return driver.getCurrentUrl();
//    }
   
    public void clickOnKiteHomePageLogout() {
    	kv.click();
    }

}
