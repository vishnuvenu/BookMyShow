package testScripts;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import constantsBookMyshow.BookMyShow;

public class GUIValidations {
	
	//final static Logger logger = Logger.getLogger(GUIValidations.class);

	public void test1( WebDriver driver)
	{  
		
		//WebDriver driver = new BookmyShowConfig("ie").initializeBrowser();
		driver.get(BookMyShow.url);
		WebDriverWait w= new WebDriverWait(driver, 60);
		System.out.println(BookMyShow.url);
		boolean  t=  driver.findElement(By.xpath(BookMyShow.selectCityBoxXpath)).isDisplayed();
		System.out.println(t);
		//BasicConfigurator.configure();
		//logger.info("Log4j error info");
		driver.findElement(By.xpath(BookMyShow.bangaloreCitySelectXpath)).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(BookMyShow.cityHomeXpath)));
		System.out.println("test");
		
		
		
		
	}
	public void test2()
	{}
	public void test3()
	{}
	
	
}
