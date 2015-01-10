package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

	@FindBy(name = "xhpc_message")
	public WebElement postMessageArea;

	@FindBy(xpath = "//button[@value='1']")
	public WebElement postButton;

	public void postStatus(String status) {
		postMessageArea.click();
		postMessageArea.sendKeys(status);
		postButton.click();
	}

}
