package uni.pl.fmi;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {

	@Given("^Потребителят отваря екрана с вход в системата$")
	public void openLoginScreen() throws Throwable {
	   
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Натиска бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Вижда съобщение за успех$")
	public void checkLoginMessage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
