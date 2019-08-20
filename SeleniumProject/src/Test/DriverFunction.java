package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFunction {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Magic\\Selenium\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		
		//WebDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		
		//Initialize the object for PolicyIssue class
		//PolicyIssue policyIssue = new PolicyIssue(driver);
		
		PolicyIssue policyIssue = new PolicyIssue();
				
		//Calling invokeApplication method
		policyIssue.invokeApplication(driver);
		
		policyIssue.login(driver);
		
		policyIssue.createAccount(driver);
		
		policyIssue.NewSubmission(driver);

	}

}
