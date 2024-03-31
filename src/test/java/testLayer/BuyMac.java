package testLayer;

import org.testng.annotations.Test;

import testBase.TestBase;

public class BuyMac extends TestBase{

	@Test
	public void MacbookPurchasewithNewUser ()
	{
				
		homepage_obj.EnterInSearchField("mac");
		
		searchpage_obj.ClickOnMacBook();
		searchpage_obj.ClickOnAddtocart();
		searchpage_obj.ClickOnItem();
		searchpage_obj.Checkout();
		searchpage_obj.EnterEmail("mayurbhoge5@gmail.com");
		searchpage_obj.EnterPassword("Mayur@12345");
		searchpage_obj.ClickOnLogin();
		
		checkoutpage_obj.EnterFirstName("Mayur");
		checkoutpage_obj.EnterLastName("Bhoge");
		checkoutpage_obj.EnterCompanyName("pinspire");
		checkoutpage_obj.EnterAddress1("Bhosari");
		checkoutpage_obj.EnterAddress2("Pune");
		checkoutpage_obj.EnterCity("Pune");
		checkoutpage_obj.EnterPostCode("411049");
		checkoutpage_obj.SelectCountry();
		checkoutpage_obj.SelectState();
		checkoutpage_obj.ClickOnBillingContinue();
		checkoutpage_obj.AddPaymentComment("Test1");
		checkoutpage_obj.ClickOnCheckbox();
		checkoutpage_obj.ClickOnPaymentContinue();
	}
	
	@Test
	public void MacbookPurchasewithExistingUser ()
	{
		
		homepage_obj.EnterInSearchField("mac");
		
		searchpage_obj.ClickOnMacBook();
		searchpage_obj.ClickOnAddtocart();
		searchpage_obj.ClickOnItem();
		searchpage_obj.Checkout();
		searchpage_obj.EnterEmail("mayurbhoge@gmail.com");
		searchpage_obj.EnterPassword("Mayur@1234");
		searchpage_obj.ClickOnLogin();
		
		checkoutpage_obj.ClickOnExistingAddressContinue();
		checkoutpage_obj.AddPaymentComment("Test1");
		checkoutpage_obj.ClickOnCheckbox();
		checkoutpage_obj.ClickOnPaymentContinue();
	}

	

	
	
}
