package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;



public class RegisterTest extends TestBase {

	@Test
	public void validateRegisteringAccountByProvidingValidAccountdetails()
	{
		String expected_result = "Your Account Has Been Created!";

		homepage_obj.ClickonMyAccountlink();
		homepage_obj.ClickOnRegisterLink();	
		
		registerpage_obj.enterFirstName("Mayur");
		registerpage_obj.enterLastName("Bhoge");
		registerpage_obj.enterEmail("mayurbhoge11@gmail.com");
		registerpage_obj.entertelephone("1234567892");
		registerpage_obj.enterPassword("Mayur@12345");
		registerpage_obj.enterConfirmPassword("Mayur@12345");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
		String actual_result = driver.getTitle();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test 
	public void validateRegisteringAccountByProvidingExistingAccountdetails()
	{
		String expected_result = "Warning: E-Mail Address is already registered!";
		
		homepage_obj.ClickonMyAccountlink();
		homepage_obj.ClickOnRegisterLink();

		registerpage_obj.enterFirstName("Mayur");
		registerpage_obj.enterLastName("Bhoge");
		registerpage_obj.enterEmail("mayurbhoge2@gmail.com");
		registerpage_obj.entertelephone("1234567891");
		registerpage_obj.enterPassword("Mayur@1234");
		registerpage_obj.enterConfirmPassword("Mayur@1234");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();

		String actual_result = common_obj.getErrorMessage();
		System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
	}
	
}
