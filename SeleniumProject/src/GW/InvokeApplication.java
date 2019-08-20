package GW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvokeApplication extends Driver  {
	
		
	@Test
	public void InvokeApp  () {
		
		WebDriverWait Wait = new WebDriverWait(driver,30);
		
		String url = "https://gwdev.eyiaas.com/pc/PolicyCenter.do";		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		WebElement ele = Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("Login-LoginScreen-LoginDV-username"))));
		
		if(ele.isDisplayed()) {
			System.out.println("Application Invoked successfully");
		}
		else {
			System.out.println("Application Invoke Unsuccessfull");
		
		}
		
		
	}
	

	
	

}