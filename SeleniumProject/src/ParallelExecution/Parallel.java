package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class Parallel
{
	
	public static  WebDriver driver;
	
    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
    }
 
    @Test
    public void testMethodsOne() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	
	 ChromeOptions options = new ChromeOptions();
	  options.setExperimentalOption("useAutomationExtension", false);
	  driver = new ChromeDriver(options);
		String url = "https://gwdev.eyiaas.com/pc/PolicyCenter.do";		
		driver.get(url);
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id);
    }
 
   /* @Test
    public void testMethodsTwo() {
    	
      System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	
	   	 ChromeOptions options = new ChromeOptions();
	   	  options.setExperimentalOption("useAutomationExtension", false);
	   	  driver = new ChromeDriver(options);
   		String url = "https://gwdev.eyiaas.com/pc/PolicyCenter.do";		
   		driver.get(url);
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id);
    }*/
 
    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
    }
}