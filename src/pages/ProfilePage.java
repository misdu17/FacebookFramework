package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

	@FindBy(name = "xhpc_message")
	public WebElement postMessageArea;

	@FindBy(xpath = "//*[@id='u_jsonp_2_l']/div/div[6]/div/ul/li[2]/button")
	public WebElement postButton;

	public void postStatus(String status) {
		postMessageArea.click();
		postMessageArea.sendKeys(status);
		postButton.click();
	}

}
