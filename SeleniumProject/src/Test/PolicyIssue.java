package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Inheritence
/*public class PolicyIssue extends Generic {
	
}*/

public class PolicyIssue {
	
	//class objects
/*	WebDriver driver;
	
	public PolicyIssue(WebDriver driver) {
		this.driver = driver;
	}*/
	
	//PolicyIssue policyissue = new PolicyIssue();
	
	public void invokeApplication(WebDriver driver) {
				
		Generic element = new Generic(driver); 
		
		String url = "https://gwdev.eyiaas.com/pc/PolicyCenter.do";		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		if(!driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).isDisplayed()) {
			System.out.println("Application not Invoked");
			driver.close();
		} else {
			System.out.println("Application Invoked successfully");
		}
				
		
	}
	
	public void login(WebDriver driver) {
		
		Generic element = new Generic(driver); 
		/*WebElement obj = element.findElelemt(driver,"id","Login:LoginScreen:LoginDV:username-inputEl");
		
		obj.sendKeys("su");*/
		
		element.getElelemt("name","Login-LoginScreen-LoginDV-username").sendKeys("su");
		element.getElelemt("name","Login-LoginScreen-LoginDV-password").sendKeys("gw");
		
		element.getElelemt("id","Login-LoginScreen-LoginDV-submit").click();
		
		//driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
		
		boolean loginSuccess = element.isElementDisplayed("id", "Underwriter_MySummary-ttlBar");
		
		if(loginSuccess==true) {
			System.out.println("Login Successfull.");
		}else {
			System.out.println("Login failed.");
		}
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
				
		
	}
	
	public void createAccount(WebDriver driver) throws InterruptedException {
		
		Generic element = new Generic(driver); 
		
		element.getElelemt("id","Desktop-DesktopMenuActions").click();
		element.getElelemt("id","Desktop-DesktopMenuActions-DesktopMenuActions_Create-DesktopMenuActions_NewAccount").click();
		
		boolean CreateAccount = element.isElementDisplayed("id", "Underwriter_MySummary-ttlBar");
		
		if(CreateAccount==true) {
			System.out.println("Enter Account Information page invoked.");
		}else {
			System.out.println("Enter Account Information page invoke failed.");
		}
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		//element.getElelemt("name", "NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName")
		element.getElelemt("name", "NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName").sendKeys("Test");
		element.getElelemt("name", "NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName").sendKeys("account");
		
		element.getElelemt("id", "NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search").click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		element.getElelemt("id", "NewAccount-NewAccountScreen-NewAccountButton").click();
		
		element.getElelemt("id", "NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person").click();
		
		boolean ca = element.isElementDisplayed("id", "CreateAccount-CreateAccountScreen-ttlBar");
		
		if(!ca==false) {
			System.out.println("Create account page invoked.");
		}else {
			System.out.println("Create account page invoke failed.");			
		}
						
		
		 boolean stateListAvailable = false;
		  int cntr = 1;
		  while (!stateListAvailable && cntr < 25) {
			  System.out.println("State list available:" + stateListAvailable);
			  
			  Thread.sleep(1000);
			  
							  
			  driver.findElement(By.xpath("//input[contains(@id,'State-inputEl')]")).click();
			 
			  stateListAvailable = driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='Florida']")).isDisplayed();
			  //driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='Florida']")).isDisplayed();
			 System.out.println("State list available:" + stateListAvailable);
			 cntr+=1;
		  }
			  
		  driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='Florida']")).click();
		
		
		
		 Thread.sleep(1000);
		 driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl")).sendKeys("32003");
		 driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl")).sendKeys(Keys.TAB);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		boolean addTypetAvailable = false;
		  int cntre = 1;
		  while (!addTypetAvailable && cntre < 25) {
			  System.out.println("Add list available:" + addTypetAvailable);
			  
			  Thread.sleep(1000);
			  
			  driver.findElement(By.xpath("//input[contains(@id,'AddressType-inputEl')]")).click();
			 
			  addTypetAvailable = driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='Home']")).isDisplayed();
			 System.out.println("Add list available:" + addTypetAvailable);
			 cntre+=1;
		  }
			  
		  driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='Home']")).click();
		  
		/*driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).click();
		driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).sendKeys("Home");
		driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")).sendKeys("Keys.TAB");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;*/
		
		
		boolean producerAvailable = false;
		  int contr = 1;
		  while (!producerAvailable && contr < 25) {
			  System.out.println("Producer list available:" + producerAvailable);
			  
			  Thread.sleep(1000);
			  
			  driver.findElement(By.xpath("//input[contains(@id,'ProducerCode-inputEl')]")).click();
			 
			  producerAvailable = driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='INT-3 Internal Producer Code - 3']")).isDisplayed();
			  System.out.println("Producer list available:" + producerAvailable);
			  contr+=1;
		  }
		  driver.findElement(By.xpath("//div[@class='x-boundlist-list-ct x-unselectable']/ul/li[text()='INT-3 Internal Producer Code - 3']")).click();
		
	}
	
	public void NewSubmission(WebDriver driver) {
		
		Generic element = new Generic(driver); 

				
		
	}
	
}//Class  PolicyIssue Close
	
	
		
			
	
