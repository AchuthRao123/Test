package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GW.Driver;

public class Login_OR extends Driver{
	
	//WebDriver driver;
	
	public Login_OR(WebDriver driver) {
		// TODO Auto-generated constructor stub
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "Login-LoginScreen-LoginDV-username")
	private WebElement UserName;
	
	@FindBy(name = "Login-LoginScreen-LoginDV-password")
	private WebElement Password;
	
	@FindBy(id = "Login-LoginScreen-LoginDV-submit")
	private WebElement Login; 
	

	public WebElement Username() {

		return UserName;
		
		  	
	}
	
	public WebElement Password() {
		return Password;
		
		  	
	}
	
	public WebElement Login_btn() {
		return Login;
		
		  	
	}
	

}
