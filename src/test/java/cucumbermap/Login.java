package cucumbermap;


import java.util.Hashtable;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperators;

public class Login
{
	@Given ("^user open \"(.*)\" browser$")
	public void user_open_browser_with_exe(String bname) throws Throwable
	{
		Object [] input=new Object[1];
        input[0]=bname;
        SeleniumOperators.browserLaunch(input);
	}

	@Given("^user enter url as$")
	public void user_enter_url_as() throws Throwable
	{
		
        SeleniumOperators.openApplication();
	}

	@When("user click on cancle button")
	public void user_click_on_cancle_button() throws Throwable
	{
		Object[] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        Hashtable<String, Object> output2=SeleniumOperators.clickOnElement(input2);
        
     HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "user click on cancle button", output2.get("MESSAGE").toString());   
	}

	@When("user move on Login DropDown")
	public void user_move_on_Login_DropDown() throws Throwable
	{
		Object[] input3=new Object[1];
        input3[0]="//*[@class='_1_3w1N']";
        Hashtable<String, Object> output3=SeleniumOperators.moveToElement(input3);
        
        HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user move on Login DropDown", output3.get("MESSAGE").toString());
	}

	@When("user click on My Profile")
	public void user_click_on_My_Profile() throws Throwable
	{
		Object[] input4=new Object[1];
        input4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
        Hashtable<String, Object> output4=SeleniumOperators.clickOnElement(input4);
        
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on My Profile", output4.get("MESSAGE").toString());
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String userName) throws Throwable
	{
		 Object[] input5=new Object[2];
         input5[0]="//*[@class='_2IX_2- VJZDxU']";
         input5[1]=userName;
         Hashtable<String, Object> output5=SeleniumOperators.sendKey(input5);
         
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as username", output5.get("MESSAGE").toString());
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String passWord) throws Throwable
	{
		 Object[] input6=new Object[2];
         input6[0]="//*[@type='password']";
         input6[1]=passWord;
         Hashtable<String, Object> output6=SeleniumOperators.sendKey(input6);
         
         HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter {string} as password$", output6.get("MESSAGE").toString());
	}

	@When("user click on Login button")
	public void user_click_on_Login_button() throws Throwable
	{
		 Object[] input7=new Object[1];
         input7[0]="(//*[@type='submit'])[2]";
         Hashtable<String, Object> output7=SeleniumOperators.clickOnElement(input7);
         
         HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user click on Login button", output7.get("MESSAGE").toString());
	}

	@Then("Application shows user profile to user")
	public void application_shows_user_profile_to_user() throws Throwable
	{
	    Object [] input8= new Object[2];
	    input8[0]="//*[text()='Hello']";
	    input8[1]="Hello";
	    Hashtable<String, Object> output8=SeleniumOperators.gettingText(input8);
	    
	    HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "Application shows user profile to user", output8.get("MESSAGE").toString());
	}
}








