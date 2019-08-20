package GW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.Login_OR;

public class NewLogin extends Driver{
	
	
	@Test
	public void Login() {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);*/
		driver.get("https://gwdev.eyiaas.com/pc/PolicyCenter.do");
			  
		Login_OR ln = new Login_OR(driver);
		
		ln.Username().sendKeys("su");
		ln.Password().sendKeys("gw");
		
		ln.Login_btn().click();
		
	}
	
}
