package GW;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login extends Driver{
	
/*	WebDriver driver = initialize();
	WebDriverWait wait = Wait(driver);*/
	
/*	WebDriver driver;
	
	//Default Constructor
	public Login(WebDriver driver) {
		this.driver = driver;
	}*/
	
	@Test
	public void Login_App() {
		
		
				
		WebDriverWait Wait = new WebDriverWait(driver,30);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su");
		driver.findElement(By.name("Login-LoginScreen-LoginDV-password")).sendKeys("gw");
		driver.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
		
		WebElement ele = Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'My Summary')]"))));
		
		if(ele.isDisplayed()) {
			System.out.println("Application Login successfull");
		}
		else {
			System.out.println("Application Login Unsuccessfull");
		
		}
	}

	
}
