package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		String url = "https://www.google.com";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		try {
		
			WebElement ele = driver.findElement(By.name("z"));

			
			if(ele.isDisplayed()) {
				System.out.println("Application invoked successfully");
				System.out.println("Application is Displayed : " + ele.isDisplayed());
			}else {
				System.out.println("Application invoke fail");
			}
			

			System.out.println("Application is selectable : " + ele.isSelected());
			
			System.out.println("Application is Enabled : " + ele.isEnabled());
			

		    WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		    System.out.println("Element is Visible : "+ element);
					
		}catch(Exception e) {
			System.out.println("Exception in the program  : "+ e.getMessage());
		}

		

	}

}
