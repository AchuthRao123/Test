package GW;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Driver {
	
	public static  WebDriver driver;
	//public static WebDriverWait Wait;
	 
	
	@org.testng.annotations.Parameters({ "BrowserName" })
	
	@BeforeTest
	
	public WebDriver initialize(String BrowserName) {
	 
	  if(BrowserName.equalsIgnoreCase("firefox")) {
	 
		System.setProperty("webdriver.gecko.driver", "C:\\Magic\\Selenium\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
	    driver = new FirefoxDriver();
	  
	 
	  }else if (BrowserName.equalsIgnoreCase("chrome")) { 
	 
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 
		  ChromeOptions options = new ChromeOptions();
		  options.setExperimentalOption("useAutomationExtension", false);
		  //options.addArguments("headless");
		  options.addArguments("window-size=1200x600");
		  driver = new ChromeDriver(options); 
	 
	  } 
	  
	  return driver;
	 
	 
	  }
	

		
/*	@BeforeTest
	public static WebDriver initialize() {	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
		  options.setExperimentalOption("useAutomationExtension", false);
		  //options.addArguments("headless");
		  options.addArguments("window-size=1200x600");
		  driver = new ChromeDriver(options);        
		//System.setProperty("phantomjs.binary.path", "C:\\Magic\\Selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");		
		return driver;
	}*/
	
/*	@AfterTest
	public static void Quit() {	
		
		driver.close();

	}*/

/*	@Test
	public static void Wait(WebDriver driver) {
		Wait = new WebDriverWait(driver,30);
	}*/
	
}
