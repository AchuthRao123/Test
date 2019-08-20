package GW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewSubmission extends Driver{
	
	@Test
	public static void newSubmission() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.findElement(By.xpath("//div[@id='AccountFile-AccountFileMenuActions']")).click();
		driver.findElement(By.xpath("//div[@id='AccountFile-AccountFileMenuActions-AccountFileMenuActions_Create-AccountFileMenuActions_NewSubmission']")).click();
		
		WebElement ttl = driver.findElement(By.id("NewSubmission-NewSubmissionScreen-ttlBar"));
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(ttl));
		
		if(ele.isDisplayed()) {
			System.out.println("NewSubmission Screen displayed");
			
			driver.findElement(By.xpath("//div[@id='NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-8-addSubmission']")).click();
		}
		else {
			System.out.println("NewSubmission Screen not displayed");			
		}
		
	}
	

}
