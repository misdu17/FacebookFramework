package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	@FindBy(id = "u_jsonp_2_o")
	public WebElement postPage;
	
	@FindBy(className = "innerWrap")
	public WebElement writePost;
	
}
