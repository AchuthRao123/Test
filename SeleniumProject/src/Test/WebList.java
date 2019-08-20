package Test;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	
		
		//Only if the ewlist is select tag.
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		WebElement d = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		wait.until(ExpectedConditions.visibilityOf((d)));
		
	
		s.selectByValue("AED");
		Thread.sleep(1000);
		s.selectByVisibleText("INR");
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		List <WebElement> elecount = s.getOptions();

		System.out.println("Dropdown count : " + elecount.size());
		
		for(int i = 0;i<elecount.size();i++) {
		System.out.println("Dropdown value : "+ elecount.get(i).getText());
		}
		
		for(int i = 0;i<elecount.size();i++) {
		if(elecount.get(i).getText().equals("INR")) {
			s.selectByValue("INR");
			System.out.println("INR Selected");
			break;
		}
		}
		
		
		driver.close();
		driver.quit();
		
	

	}

}
