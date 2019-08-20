package GW;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Offerings extends Driver{
	
	@Test
	public static void offerings() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait Wait = new WebDriverWait(driver,10);
		
		Select of = new Select(driver.findElement(By.name("SubmissionWizard-OfferingScreen-OfferingSelection")));
		List <WebElement> off = of.getOptions();
		for(int i = 0;i<off.size();i++) {
			if(off.get(i).getText().equals("Basic Program")) {
				off.get(i).click();
			}
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
		
	}

}
