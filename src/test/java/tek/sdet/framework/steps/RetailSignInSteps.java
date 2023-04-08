package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;


public class RetailSignInSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	//Scenario #1
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	    click(factory.signInPage().signInBtn);
	    logger.info("user clicked on signIn buttn");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passwordValue);
		logger.info("user entered email and password");
	   
	    
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	    click(factory.signInPage().logInBtn);
	    
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountBtn));
	    logger.info("user is on account page");
	    
	}
	
	//Scenario #2
	
	@When("User click on Create new Account button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.signInPage().createAccountBtn);
	    logger.info("User clicked on Create new account button");
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	  
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameField, DataGeneratorUtility.data(signUpInformation.get(0).get("name")));
		sendText(factory.signInPage().signUpEmailField, DataGeneratorUtility.data(signUpInformation.get(0).get("email")));
		sendText(factory.signInPage().signUpPassField, signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPassField, signUpInformation.get(0).get("confirmPassword"));
		logger.info("User filled the signUp information");
		
		
		
	}
	@When("User click on signUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpFormBtn);
		logger.info("User clicked on sing up button");
		
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.accountPage().profileImage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("user is login into account page");
	}
	
	
}
