package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeWebDriver {
	
	public WebDriver returnDriver() {
		
		WebDriver driver = new FirefoxDriver();
		return driver;
		
	}

}
