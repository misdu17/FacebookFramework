package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]")
	public WebElement loggedinUserName;
	
}
