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
	
	@FindBy(xpath = "//*[@id='u_0_e']/a")
	public WebElement facebookLogoButton;
	
	@FindBy(xpath = "//*[@id='u_0_d']/div[3]")
	public WebElement searchArea;
	
	@FindBy(xpath = "//button[@value='1']")
	public WebElement searchButton;
	
	public void clickUserNavigationLabel(){
		userNavigationLabel.click();
	}
	
	public void clickLogoutButton(){
		logoutButton.click();
	}
	
	public void clickProfilePage(){
		profilePageButton.click();
	}
	
	public void clickFacebookLogoButto(){
		facebookLogoButton.click();
	}
	
	public void searchOnFacebook(String searchText){
		searchArea.click();
		searchArea.sendKeys(searchText);
		searchButton.click();
	}
}
