package testBrowerSetup;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Pojo {

 public static WebDriver openChromeBrowser() {
 System.setProperty("webdriver.chrome.driver", "");
 WebDriver driver = new ChromeDriver();
 return driver;
	 }
 
 public static WebDriver openFirefoxBrowser() {
	 System.setProperty("webdriver.gecko.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"browsers"+File.separator+"geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 return driver;
		 }
 
// public static WebDriver openInternetExplorerBrowser() {
//	 System.setProperty("webdriver.ie.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"browsers"+File.separator+"IEDriverServer.exe");
//	 WebDriver driver = new InternetExplorerDriver();
//	 return driver;
//		 }
}