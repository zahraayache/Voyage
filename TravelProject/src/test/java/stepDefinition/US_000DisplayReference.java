package stepDefinition;

import TravelImplementation.Client;
import TravelImplementation.Voyage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_000DisplayReference {
	
	Voyage voyage;
	Client client;
	
	@Given("a departure country  using {string}")
	public void a_departure_country_using(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("a country of destinantion  using {string}")
	public void a_country_of_destinantion_using(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Given("a travel Mode uisng {string}")
	public void a_travel_mode_uisng(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("a user validate the travel")
	public void a_user_validate_the_travel() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("display the details of the travel using <price> and <referenceNumber>")
	public void display_the_details_of_the_travel_using_price_and_reference_number() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
