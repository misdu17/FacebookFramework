package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.FacebookLoginPage;
import pages.HomePage;
import pages.ProfilePage;


public class BaseClass {
	public WebDriver driver;
	public FacebookLoginPage facebookloginpage;
	public HomePage homepage;
	public ProfilePage profilepage;
	
	@BeforeClass 
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		facebookloginpage = PageFactory.initElements(driver, FacebookLoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		
	}
	
	@AfterClass 
	public void tearDown(){
		homepage.clickUserNavigationLabel();
		homepage.clickLogoutButton();
		driver.quit();
	}

}
