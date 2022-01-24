package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp
{
      public static void main(String[] args)
    {
    	  //Browser Launch
	     System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");	
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     //Implici Wait
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     //het Url
	     driver.navigate().to("https://www.flipkart.com/");
	     
	     //Click On Cancle
	     driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();    
	     
	     //Move To Login
	     Actions act=new Actions (driver);	     
	     WebElement login=driver.findElementByXPath("//*[@class='_1_3w1N']");	                
	                     act.moveToElement(login).build().perform();
	     
	     //Move to Profile
	     WebElement profile=driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]");
	                act.moveToElement(profile).click().build().perform();
	                
	     driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8208266976");	                
	     driver.findElementByXPath("//*[@type='password']").sendKeys("Shinde@0987");	     
	     driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	     
	     
	     //Second TestCase
	     //Manage Address
	     
	     
	     //Click On MAnage Addresss
	     driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
	     
	     //click On Add Address
	     driver.findElementByXPath("//*[@class='_2KpZ6l _3lI646 _3dESVI']").click();
	     
	     //SendKEys ans Enter Name
	     driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[1]").sendKeys("Ravikiran");
	     
	     //Enter the Phone
	     driver.findElementByXPath("//*[@name='phone']").sendKeys("8208266976");
	     
	     //Enter The Pincode
	     driver.findElementByXPath("//*[@name='pincode']").sendKeys("414002");
	     
	     //Enter The Locality
	     driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[4]")).sendKeys("Bhingar,Ahmednagar");
	     
	     //Enter The Adrress Line 1
	     driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Pump House Road,Near Z P School Bhingar, Ahmednagar");
	     
	     //Enter the LandMark
	     driver.findElementByXPath("//*[@name='landmark']").sendKeys("Ahmedngar");
	     
	     //Enter The Alernatiive Phone Number
	     driver.findElement(By.name("alternatePhone")).sendKeys("8390921023");
	     
	     //Select The Round Box 
	     driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]").click();
	
	}
}
