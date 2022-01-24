package utility;

public class Trial
{
	public static void main(String[] args) throws Throwable
	{
		//BrowserLaunch 
		Object [] input=new Object[2];
		          input[0]="Chrome";
		          input[1]="F:\\Automation Support\\chromedriver.exe";
		          SeleniumOperators.browserLaunch(input);
		          
		          
	    //openApplication
		 Object [] input1=new Object[1];
		           input1[0]="https://www.flipkart.com/";
		           SeleniumOperators.openApplication();
		                    
	   //ClickOnCancle
        Object[] input2=new Object[1];
                 input2[0]="//*[@class='_2KpZ6l _2doB4z']";
                 SeleniumOperators.clickOnElement(input2);
		                             
       //MoveToElement
         Object[] input3=new Object[1];
                  input3[0]="//*[@class='_1_3w1N']";
                  SeleniumOperators.moveToElement(input3);
		                             
        //click on my profile
         Object[] input4=new Object[1];
                  input4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
                  SeleniumOperators.clickOnElement(input4);
		                                     
       //EnterUsername
          Object[] input5=new Object[2];
                   input5[0]="//*[@class='_2IX_2- VJZDxU']";
                   input5[1]="8208266976";
                   SeleniumOperators.sendKey(input5);
		                                              
          //EnterPassword
           Object[] input6=new Object[2];
                    input6[0]="//*[@type='password']";
                    input6[1]="Shinde@0987";
                    SeleniumOperators.sendKey(input6);
                                   
		                                                        
        //clickOnLogin
        Object[] input7=new Object[1];
                 input7[0]="(//*[@type='submit'])[2]";
                 SeleniumOperators.clickOnElement(input7);
                 
                
	                                                                 
	}

}
