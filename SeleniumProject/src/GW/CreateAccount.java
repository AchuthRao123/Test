package GW;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class CreateAccount extends Driver{
	
	
	@Test
	public static void newAccount() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait  wait = new WebDriverWait(driver,30);
		
		driver.findElement(By.xpath("//div[@id='Desktop-DesktopMenuActions']")).click();
		driver.findElement(By.xpath("//div[@id='Desktop-DesktopMenuActions-DesktopMenuActions_Create-DesktopMenuActions_NewAccount']")).click();
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName"))));
		
		if(ele.isDisplayed()) {
			System.out.println("Enter Account Information page displayed");
			
			driver.findElement(By.name("NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName")).sendKeys("Test");
			driver.findElement(By.name("NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName")).sendKeys("Data");
			driver.findElement(By.id("NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search")).click();
			
			driver.findElement(By.id("NewAccount-NewAccountScreen-NewAccountButton")).click();
			
			driver.findElement(By.id("NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Person")).click();
			
			
		}
		else {
			System.out.println("Enter Account Information page not displayed");
		}
		
		WebElement eleacc = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("CreateAccount-CreateAccountScreen-ttlBar"))));
		
		if(eleacc.isDisplayed()) {
			System.out.println("Create Account page displayed");
			
			driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1")).sendKeys("1st Street");
			driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City")).sendKeys("Boston");
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State")).click();
			
			Select st = new Select (driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State")));
			List <WebElement> lst= st.getOptions();
			for(int i = 0;i< lst.size();i++) {
				if(lst.get(i).getText().equals("Massachusetts")){
					lst.get(i).click();
					break;
				}
			}
			
			Thread.sleep(2000);
						
			driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode")).sendKeys("02110");
			
			Thread.sleep(2000);
			
			Select at = new Select (driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType")));
			List <WebElement> lat= at.getOptions();
			for(int i = 0;i< lat.size();i++) {
				if(lat.get(i).getText().equals("Home")){
					lat.get(i).click();
					break;
				}
			}
			
			driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-OfficialIDInputSet-OfficialIDDV_Input")).sendKeys("123-45-1234");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.name("OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-GlobalContactNameInputSet-Name")).sendKeys("Enigma Fire & Casualty");
			
			driver.findElement(By.id("OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search")).click();
			
			driver.findElement(By.id("OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchResultsLV-0-_Select")).click();
			
			Thread.sleep(1000);
			
			Select pc = new Select (driver.findElement(By.name("CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-ProducerCode")));
			//pc.selectByValue("INT-3 Internal Producer Code - 3");
			List <WebElement> ls = pc.getOptions();
			ls.get(1).click();
			
			driver.findElement(By.id("CreateAccount-CreateAccountScreen-ForceDupCheckUpdate")).click();
			

		}
		else {
			System.out.println("Create Account page not displayed");
		}
		
		
		WebElement AccSumm = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("AccountFile_Summary-ttlBar")))); 
		
		if(AccSumm.isDisplayed()) {
			String accountNumber = driver.findElement(By.id("AccountFile_Summary-AccountSummaryDashboard-AccountDetailsDetailViewTile-AccountDetailsDetailViewTile_DV-AccountNumber")).getText();
			
			System.out.println("Account number : " + accountNumber );
		}
		else {
			System.out.println("Account Summary page is not displayed");
		}
		
	}

}
