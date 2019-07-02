package warn;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"html:target/Destination"}, 
tags = {"@biscuit"})
                             

public class runn {
	@Given("I have some cakes in my leg")
	public void i_have_some_cakes_in_my_leg() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
		@When("I wait for some minute")
		public void i_wait_for_some_minute() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}

		@Then("my cakes will get disappear")
		public void my_cakes_will_get_disappear() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}

	}



