package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.FacebookLoginPage;
import pages.HomePage;
import pages.MenuPage;
import pages.ProfilePage;


public class BaseClass {
	public WebDriver driver;
	public FacebookLoginPage facebookloginpage;
	public HomePage homepage;
	public ProfilePage profilepage;
	public MenuPage menupage;
	
	@BeforeClass 
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		facebookloginpage = PageFactory.initElements(driver, FacebookLoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
		profilepage = PageFactory.initElements(driver, ProfilePage.class);
		menupage = PageFactory.initElements(driver, MenuPage.class);
		facebookloginpage.login("mdjamaddar@gmail.com", "Mdjamaddar17");
	}
	
	@AfterClass 
	public void tearDown(){
		menupage.clickUserNavigationLabel();
		menupage.clickLogoutButton();
		driver.quit();
	}

}
