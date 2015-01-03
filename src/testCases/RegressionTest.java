package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class RegressionTest extends BaseClass{
	
	@Test
	public void testFacebookLogin(){
		facebookloginpage.enterLoginEmail("mdjamaddar@gmail.com");
		facebookloginpage.enterLoginPassword("Mdjamaddar17");
		facebookloginpage.clickLoginButton();
		Assert.assertEquals(homepage.loggedinUserName.getText(), "Md Jamaddar");
	}
	
	@Test
	public void testProfilePage(){
		homepage.clickProfilePage();
		profilepage.postPage
		
	}

}
