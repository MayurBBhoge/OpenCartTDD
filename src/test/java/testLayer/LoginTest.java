package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;



public class LoginTest extends TestBase {

	@Test
	public void verifyLoginTestWithValidDetails()
	{
		String exppected_result = "My Account";
		
		homepage_obj.ClickonMyAccountlink();
		homepage_obj.ClickOnLoginLink();
		
		loginpage_obj.enterEmail("mayurbhoge2@gmail.com");
		loginpage_obj.enterPassword("Mayur@12345");
		loginpage_obj.clickOnLoginButton();
		
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		Assert.assertEquals(actual_result, exppected_result);
	}
	
	@Test
	public void verifyLoginTestWithInValidDetails()
	{
		String exppected_result = "Warning: No match for E-Mail Address and/or Password.";
		
		homepage_obj.ClickonMyAccountlink();
		homepage_obj.ClickOnLoginLink();
		
		loginpage_obj.enterEmail("mayurbhoge12@gmail.com");
		loginpage_obj.enterPassword("Mayur@12345");
		loginpage_obj.clickOnLoginButton();
		
		String actual_result = common_obj.getErrorMessage();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, exppected_result);
	}
}
