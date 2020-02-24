package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogout {
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("user is on home page");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		System.out.println("user navigate to login page");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		System.out.println("user enters username and password");
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		System.out.println("user enters username and password");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		System.out.println("user logout from the application");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		System.out.println("log out message displayed successfully");
	}


}
