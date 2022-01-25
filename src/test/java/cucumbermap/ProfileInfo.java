package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperators;

public class ProfileInfo
{
	@When("user click on Profile Information")
	public void user_click_on_profile_information()
	{
		Object[] input=new Object[1];
        input[0]="";
    Hashtable<String, Object> output=SeleniumOperators.clickOnElementForSleep(input);
        
  HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on Profile Information", output.get("MESSAGE").toString());
	}

	@When("user enters {string} as First Name")
	public void user_enters_as_first_name(String string)
	{
		Object[] input1=new Object[1];
        input1[0]="";
    Hashtable<String, Object> output1=SeleniumOperators.clickOnElementForSleep(input1);
        
  HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "user enters {string} as First Name", output1.get("MESSAGE").toString());
	   
	}

	@When("user enters {string} as Last Name")
	public void user_enters_as_last_name(String string) 
	{
	    
	}

	@When("user select Male as Gender")
	public void user_select_male_as_gender()
	{
	   
	}

	@When("user click on Save Button")
	public void user_click_on_save_button() 
	{
	   
	}

	@Then("application shows Profile Information added Successfully")
	public void application_shows_profile_information_added_successfully()
	{
	    
	}
}
