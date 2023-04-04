package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this); 
		// we are implementing PageFactory class to initialize the UI Elements 
		// using initElements method of PageFactory class
		// this method accepts two parameters, first one is driver and second 
		// is this keyword which referees to variable of this class in this case
		// we are referring to UI elements that will store in this class
	}
	

	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id="signinLink")
	public WebElement signInBtn;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id="loginBtn")
	public WebElement logInBtn;
	
	@FindBy(id="logoutBtn")
	public WebElement logOutBtn;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="newAccountBtn")
	public WebElement createAccountBtn;
	
	@FindBy(id="nameInput")
	public WebElement signUpNameField;
	
	@FindBy(css = "#emailInput")
	public WebElement signUpEmailField;
	
	@FindBy(css = "#passwordInput")
	public WebElement signUpPassField;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement signUpConfirmPassField;
	
	@FindBy(xpath = "//button[@id='signupBtn']")
	public WebElement signUpFormBtn;
	
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountBtn;
	
	
	
	
}
