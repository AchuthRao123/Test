package Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirefoxDemo {
	
	//private static final WebDriver driver = new FirefoxDriver();
	
	
		
	public static void main(String[] args) throws InterruptedException  {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Magic\\Selenium\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver;
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		System.out.println("test");
		
		String url = "https://gwdev.eyiaas.com/pc/PolicyCenter.do";		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//call method to invoke application
		invokeApplicatio(driver);
		
		
		//call method to login to application
		loginToApplicatio(driver);
		
		
		//call to create account
		createAccount(driver);
		
		
		//driver.close();
		
	

	}
	
	private static void invokeApplicatio(WebDriver driver) {
		
		String url = "https://gwdev.eyiaas.com/pc/PolicyCenter.do";		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				
	}
	
	private static void loginToApplicatio(WebDriver driver) {
		
		driver.findElement(By.id("Login:LoginScreen:LoginDV:username-inputEl")).sendKeys("su");
		driver.findElement(By.id("Login:LoginScreen:LoginDV:password-inputEl")).sendKeys("gw");
		driver.findElement(By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		
		
	}
	
	private static void createAccount(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"Desktop:DesktopMenuActions-btnWrap\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-textEl\"]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl")).sendKeys("Test");
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl")).sendKeys("account");
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton-btnWrap")).click();
		driver.findElement(By.id("NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl")).sendKeys("1800 E west PKWY");
		driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl")).sendKeys("Fleming Island");
		driver.findElement(By.id("CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl")).sendKeys(Keys.TAB);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		 boolean stateListAvailable = false;
		  int cntr = 1;
		  while (!stateListAvailable && cntr < 25) {
			  System.out.println("State list available:" + stateListAvailable);
			  
			  /*WebDriverWait wait=new WebDriverWait(driver,100);
			  
			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'State-inputEl')]")));*/
			  
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


	

}
