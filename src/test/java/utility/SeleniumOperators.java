package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperators
{
	public static ConfigReader config=null;
	public static WebDriver driver=null;
	
	public static Hashtable <String,Object> outputParameters=new Hashtable<String,Object>();
	
	//LaunchBrowser
	public static Hashtable <String,Object> browserLaunch(Object [] inputParameters)
	{
		try {
		String strBrowserName=(String) inputParameters[0];
		
		config=new ConfigReader();
		
		if(strBrowserName.equalsIgnoreCase("Chrome") )
		{
			
			System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
			
		     driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS); 
		}
		else if(strBrowserName.equalsIgnoreCase("fireFox"))
		{
			System.setProperty("webdriver.geeko.driver", config.getDriverPathFF());
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data : " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//OpenApllication
	public static Hashtable <String,Object> openApplication()
	{
      try {
		  
		  driver.get(config.getApplicationUrl());
		  
		  outputParameters.put("STATUS", "PASS");
		  outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data : " + config.getApplicationUrl().toString());
          }
         catch(Exception e)
         {
          outputParameters.put("STATUS", "FAIL");
   		  outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data : " + config.getApplicationUrl().toString());
         }
        return outputParameters;
	}
	
	//ClickOnElement
	public static Hashtable <String,Object> clickOnElement(Object[] inputParameters)
	{
		try {
		String xPath=(String) inputParameters[0];
		driver.findElement(By.xpath(xPath)).click();
		
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickOnElement, Input_Data : " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:clickOnElement, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//MoveToElement
	public static Hashtable <String,Object> moveToElement(Object[] inputParameters) throws Throwable 
	{
		try {
		String xPath1=(String) inputParameters[0];
		Actions act=new Actions(driver);
	    WebElement element=driver.findElement(By.xpath(xPath1));
	       act.moveToElement(element).build().perform();
	     Thread.sleep(3000);
	     
	     outputParameters.put("STATUS", "PASS");
	     outputParameters.put("MESSAGE", "methodUsed:moveToElement, Input_Data : " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed:moveToElement, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//ClickOnMyProfile
	
	//SendKeys
	public static Hashtable <String,Object> sendKey(Object[] inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		String values=(String) inputParameters[1];
		
	    WebElement login=driver.findElement(By.xpath(xpath));
	               login.sendKeys(values);
	               
	     outputParameters.put("STATUS", "PASS");
	     outputParameters.put("MESSAGE", "methodUsed:sendKey, Input_Data : " + inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed:sendKey, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	
	//ClickOnLogin
	
	//Get Text
	public static Hashtable <String,Object> gettingText(Object [] inputParameters) throws Throwable
	{
		try {
	
		String xPath=(String) inputParameters[0];
		 String text=(String) inputParameters[1];
	    WebElement obj=driver.findElement(By.xpath(xPath));
	            String outputText=obj.getText();
	      driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	            
	    
	               
	    if(outputText.equalsIgnoreCase(text))
	    {
	    	System.out.println("Test Case Passed");
	    }
	    else{
	    	System.out.println(("Test Case Failed"));
	    }
	    
	    outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed:gettingText, Input_Data : " + inputParameters[1].toString());
		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
			 outputParameters.put("MESSAGE", "methodUsed:gettingText, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	
	public static Hashtable <String,Object> clickOnElementForSleep(Object[] inputParameters)
	{
		try {
			Thread.sleep(6000);
		String xPath=(String) inputParameters[0];
		driver.findElement(By.xpath(xPath)).click();
		
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickOnElement, Input_Data : " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:clickOnElement, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	
	public static void main(String[] args) throws Throwable
	{
		//BrowserLaunch 
		Object [] input=new Object[2];
		          input[0]="Chrome";
		          input[1]="F:\\Automation Support\\chromedriver.exe";
		          browserLaunch(input);
		          
		          
	    //openApplication
		 Object [] input1=new Object[1];
		           input1[0]="https://www.flipkart.com/";
		           openApplication();
		                    
	   //ClickOnCancle
        Object[] input2=new Object[1];
                 input2[0]="//*[@class='_2KpZ6l _2doB4z']";
                 clickOnElement(input2);
		                             
       //MoveToElement
         Object[] input3=new Object[1];
                  input3[0]="//*[@class='_1_3w1N']";
                 moveToElement(input3);
		                             
        //click on my profile
         Object[] input4=new Object[1];
                  input4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
                  clickOnElement(input4);
		                                     
       //EnterUsername
          Object[] input5=new Object[2];
                   input5[0]="//*[@class='_2IX_2- VJZDxU']";
                   input5[1]="8208266976";
                   sendKey(input5);
		                                              
          //EnterPassword
           Object[] input6=new Object[2];
                    input6[0]="//*[@type='password']";
                    input6[1]="Shinde@0987";
                    sendKey(input6);
                                   
		                                                        
        //clickOnLogin
        Object[] input7=new Object[1];
                 input7[0]="(//*[@type='submit'])[2]";
                 clickOnElement(input7);
                 
               
	                                                                 
	}

}
