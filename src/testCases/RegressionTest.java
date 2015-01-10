package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class RegressionTest extends BaseClass{
	
	@Test
	public void testFacebookLogin(){
		Assert.assertEquals(homepage.loggedinUserName.getText(), "Md Jamaddar");
	}
	
	@Test
	public void testProfilePage(){
		menupage.clickProfilePage();
		profilepage.postStatus("New start for testing");	
	}
	
	@Test
	public void testClickFacebookLogoButton(){
		menupage.clickFacebookLogoButto();
	}
	
	@Test
	public void testSearchOnFacebook(){
		menupage.searchOnFacebook("Kanchan Islam");
		
	}

}
