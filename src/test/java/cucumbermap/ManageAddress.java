package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperators;

public class ManageAddress
{
	@When("user click on manage addresses")
	public void user_click_on_manage_addresses()
	{
          Object[] input=new Object[1];
           input[0]="(//*[@class='NS64GK'])[1]";
       Hashtable<String, Object> output=SeleniumOperators.clickOnElementForSleep(input);
           
     HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on manage addresses", output.get("MESSAGE").toString());         
	}

	@When("user click on add addresses")
	public void user_click_on_add_addresses() 
	{
		 Object[] input1=new Object[1];
         input1[0]="//*[@class='_1QhEVk']";
     Hashtable<String, Object> output1=SeleniumOperators.clickOnElement(input1);
         
   HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "user click on add addresses", output1.get("MESSAGE").toString());   
	}

	@When("user enter {string} as name")
	public void user_enter_as_name(String myName)
	{
	   Object[] input2=new Object[2];
	           input2[0]="//*[@class='_1w3ZZo _2mFmU7']";
	           input2[1]=myName;
	  Hashtable<String, Object>  output2=SeleniumOperators.sendKey(input2);
  HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "user enter {string} as name", output2.get("MESSAGE").toString());  	
	}

	@When("user enter {string} as mobile number")
	public void user_enter_as_mobile_number(String mobileNo)
	{
		Object[] input3=new Object[2];
        input3[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
        input3[1]=mobileNo;
      Hashtable<String, Object>  output3=SeleniumOperators.sendKey(input3);
   HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user enter {string} as mobile number", output3.get("MESSAGE").toString()); 
	}

	@When("user enter {string} as pincode")
	public void user_enter_as_pincode(String pinCode)
	{
		Object[] input4=new Object[2];
        input4[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
        input4[1]=pinCode;
      Hashtable<String, Object>  output4=SeleniumOperators.sendKey(input4);
   HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user enter {string} as pincode", output4.get("MESSAGE").toString()); 
	}

	@When("user enter {string} as locality")
	public void user_enter_as_locality(String localityAdd)
	{
		Object[] input5=new Object[2];
        input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
        input5[1]=localityAdd;
      Hashtable<String, Object>  output5=SeleniumOperators.sendKey(input5);
   HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as locality", output5.get("MESSAGE").toString()); 
	}

	@When("user enter {string} as Address")
	public void user_enter_as_address(String address)
	{
		Object[] input6=new Object[2];
        input6[0]="//*[@name='addressLine1']";
        input6[1]=address;
      Hashtable<String, Object>  output6=SeleniumOperators.sendKey(input6);
   HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter {string} as locality", output6.get("MESSAGE").toString()); 
	}

	@When("user select Home as address type")
	public void user_select_home_as_address_type()
	{
		Object [] input7=new Object[1];
		      input7[0]="(//*[@class='_1XFPmK'])[1]";
	  Hashtable<String, Object> output7=SeleniumOperators.clickOnElement(input7);
	  HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user select Home as address type", output7.get("MESSAGE").toString());
		      
	}

	@When("user click on SAVE button")
	public void user_click_on_save_button()
	{
		Object [] input8=new Object[1];
	        input8[0]="(//*[@type='button'])[2]";
      Hashtable<String, Object> output8=SeleniumOperators.clickOnElement(input8);      
      HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user click on SAVE button", output8.get("MESSAGE").toString());      

	}

	@Then("Application shows new address added successfully")
	public void application_shows_new_address_added_successfully() throws Throwable
	{
		 Object [] input9= new Object[2];
		    input9[0]="//*[text()='Ravikiran Shinde']";
		    input9[1]="Ravikiran Shinde";
		    Hashtable<String, Object> output9=SeleniumOperators.gettingText(input9);
		    
		    HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "Application shows new address added successfully", output9.get("MESSAGE").toString());
	}

}
