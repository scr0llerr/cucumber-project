package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.LoginPageModel;

public class loginSteps {
	
	LoginPageModel loginPageModel = new LoginPageModel();

	@Given("^Потребителят отваря екрана с вход в системата$")
	public void openLoginScreen() throws Throwable {
	   loginPageModel.navigatetoLoginScreen();
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
	    loginPageModel.setUsername(username);
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		loginPageModel.setPassword(password);
	}
	
	@When("^Въвежда място в гаража \"([^\"]*)\"$")
	public void въвежда_място_в_гаража(String emptyGarage) throws Throwable {
		if(emptyGarage == "true") {
		loginPageModel.setEmptyGarage(true);}
		else {loginPageModel.setEmptyGarage(false);}
	}

	@When("^Натиска бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginPageModel.clickLoginButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(expectedMessage, loginPageModel.GetLoginMessage());
	}
}
