package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BaseClass.Driver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class Hook {
	public static WebDriver driver = Driver.driver;
	
	@AfterAll
	public static void after_all()
	{
		driver.quit();
	}
	
	 @AfterStep
	    public void addScreenshot(Scenario scenario) {
	        
	    	// this is for cucumber junit report
	        if(scenario.isFailed()) {
	        	
	        	TakesScreenshot ts=(TakesScreenshot) driver;
	        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	        	scenario.attach(screenshot, "image/png",scenario.getName());
	        	            
	        }
	        else {
	        	TakesScreenshot ts=(TakesScreenshot) driver;
	        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	        	scenario.attach(screenshot, "image/png",scenario.getName());
	        }
	      
	    }
}
