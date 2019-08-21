package TestHakathon;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import java.awt.FlowLayout;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Youtube {
	
	public static  WebDriver driver;

	 
	
	@org.testng.annotations.Parameters({ "BrowserName" })
	
	@Test
	public static void initialize (String BrowserName) throws InterruptedException, AWTException, IOException {	
		 if(BrowserName.equalsIgnoreCase("chrome")) {
			 
			
			 
			 
			System.setProperty("webdriver.chrome.driver", "C:\\Magic\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			 ChromeOptions options = new ChromeOptions();
			  options.setExperimentalOption("useAutomationExtension", false);
			  //options.addArguments("headless");
			  options.addArguments("window-size=1200x600");
			  driver = new ChromeDriver(options);   
			  driver.get("https://www.youtube.com");
			  Thread.sleep(1000);
			  
			  
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			WebDriverWait wait = new WebDriverWait(driver,30);
			
				
			driver.findElement(By.id("search")).sendKeys("step-inforum");
			driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//span[text()='STeP-IN Forum']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@id='tabsContent']//following-sibling::paper-tab//following-sibling::paper-tab//div")).click();
			Thread.sleep(10000);
			
			List<WebElement> wele = driver.findElements(By.xpath("//a[@id='video-title']"));
			
			int ct = wele.size();
			
			System.out.println("Video count: " + ct);

					
			for(int i = 0; i <= ct;  i++) {
				
				String eleName = wele.get(i).getAttribute("title");
								
				if(eleName.equalsIgnoreCase("Highlights of PSTC 2018")) {
					System.out.println("Video Found : " + eleName);
					
					JavascriptExecutor js=(JavascriptExecutor)driver; 
					 
					js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", wele.get(i));
								
					Thread.sleep(1000);
			        wele.get(i).click();
			        
			        Robot robot = new Robot();
					String format = ".jpg";
					String fileNameScshot = "C:\\testresults\\FullScreenshot.jpg";

					Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
					BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
					
					ImageIO.write(screenFullImage, "jpg", new File (fileNameScshot) );
					 
					System.out.println("A full screenshot saved!");
			        
					
		
					break;
				}
				else {
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,250)");
				
					
				}
							
				
			}
		 }
	
		
	}
	

}
