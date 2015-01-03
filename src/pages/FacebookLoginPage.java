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
	
	public void login(String email, String password){
		loginEmailField.sendKeys(email);
		loginPasswordField.sendKeys(password);
		loginButton.click();
	}
	

}
