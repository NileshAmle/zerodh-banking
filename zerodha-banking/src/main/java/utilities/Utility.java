package utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void takeScreenshot(WebDriver driver,int testID) throws Throwable {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("test-output"+File.separator+"test-screenshots"+File.separator+"Test_"+testID+"Date and Time"+".jpg");
		FileHandler.copy(source,dest);
		//String destination = System.getProperty(key);
		//return destination;
	}
}
