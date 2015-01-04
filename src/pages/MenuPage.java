package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
	@FindBy(id = "userNavigationLabel")
	public WebElement userNavigationLabel;
	
	@FindBy(xpath = "//*[@id='logout_form']/label")
	public WebElement logoutButton;
	
	@FindBy(xpath = "//*[@id='blueBarNAXAnchor']/div[1]/div/div/div[1]/ul/li[1]/a")
	public WebElement profilePageButton;
	
	public void clickUserNavigationLabel(){
		userNavigationLabel.click();
	}
	
	public void clickLogoutButton(){
		logoutButton.click();
	}
	
	public void clickProfilePage(){
		profilePageButton.click();
	}

}
