package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage {
	
	@FindBy(name="email")
	public WebElement loginEmailField;
	
	@FindBy(name="pass")
	public WebElement loginPasswordField;
	
	@FindBy(id="u_0_n")
	public WebElement loginButton;
	
	//@FindBy(linkText="Get Facebook Mobile" )
	//public WebElement clickFacebookMobileButton;
	
	public void enterLoginEmail(String email){
		loginEmailField.sendKeys(email);
	}
	
	public void enterLoginPassword(String password){
		loginPasswordField.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	
	//public void clickFacebookMobileButton(){
		//clickFacebookMobileButton.click();
	//}

}
