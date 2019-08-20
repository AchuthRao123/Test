package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic {
	
		
	WebDriver driver;
	
	public Generic() {
		
	}
	
	
	public Generic(WebDriver driver) {
		this.driver = driver;
		
	}
	
		
	public WebElement getElelemt(String attribute,String val) {
		
		WebElement obj = null;
				
		switch (attribute) 
        {
            case "id":
            	 obj = driver.findElement(By.id(val));
            break;	
            	
            case "xpath":
            	obj = driver.findElement(By.xpath(val));

            break;
            
            case "name":
            	obj = driver.findElement(By.name(val));
            
            default:
            	
            	break;


        }
		return obj;
		
	}
	
	public boolean isElementDisplayed(String attribute,String val) {
		
		WebElement obj = getElelemt(attribute,val);
		
		if(obj.isDisplayed()){
			return true;
		}
				
		return false;
		
	}
	
	

}
