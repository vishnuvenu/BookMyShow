package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.BookmyShowConfig;
import testScripts.GUIValidations;


public class TestBeginner {
	
	GUIValidations  validations =null;

	
	@BeforeTest
	public void BeforeTest()
	{validations = new GUIValidations();}
	
	 @Test
	 public void test1()
	 { WebDriver driver = new BookmyShowConfig("ie").initializeBrowser();
	  validations.test1(driver);
	  driver.quit();
	  // update
	 }
	 
	 
	 

	
	

}
