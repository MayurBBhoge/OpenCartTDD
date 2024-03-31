package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkoutpage {

	private WebDriver driver;
	public WebElement element;
	
	public Checkoutpage (WebDriver d)
	{
		driver = d;
	}
	
//Object ----------------------------------------------------------------------------------------------------------------
	
	private By firstname_obj = By.xpath("//input[@id='input-payment-firstname']");
	private By lastname_obj = By.xpath("//input[@id='input-payment-lastname']");
	private By company_obj = By.xpath("//input[@id='input-payment-company']");
	private By address1_obj = By.xpath("//input[@id='input-payment-address-1']");
	private By address2_obj = By.xpath("//input[@id='input-payment-address-2']");
	private By city_obj = By.xpath("//input[@id='input-payment-city']");
	private By postcode_obj = By.xpath("//input[@id='input-payment-postcode']");
	private By country_obj = By.xpath("//select[@id='input-payment-country']");
	private By state_obj = By.xpath("//select[@id='input-payment-zone']");
	private By bilingcontinue_obj = By.xpath("//input[@id='button-payment-address']");
	private By comment_obj = By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[2]/textarea");
	private By checkbox_obj = By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]");
	private By paymentcontinue_obj = By.xpath("//input[@id='button-payment-method']");
	private By existingaddresscontinue_obj = By.xpath("//*[@id=\"button-payment-address\"]");
	
//Method --------------------------------------------------------------------------------------------------------------------
	
	public void EnterFirstName (String firstname)
	{
		driver.findElement(firstname_obj).sendKeys(firstname);
	}
	
	public void EnterLastName (String lastname)
	{
		driver.findElement(lastname_obj).sendKeys(lastname);
	}
	
	public void EnterCompanyName (String companyname)
	{
		driver.findElement(company_obj).sendKeys(companyname);
	}
	
	public void EnterAddress1 (String firstaddress)
	{
		driver.findElement(address1_obj).sendKeys(firstaddress);
	}
	
	public void EnterAddress2 (String secondaddress)
	{
		driver.findElement(address2_obj).sendKeys(secondaddress);
	}
	
	public void EnterCity (String cityname)
	{
		driver.findElement(city_obj).sendKeys(cityname);
	}
	
	public void EnterPostCode (String postcode)
	{
		driver.findElement(postcode_obj).sendKeys(postcode);
	}
	
	public void SelectCountry () 
	{
	    WebElement Country = driver.findElement(country_obj);
		utility.UtilClass.selectOptionFromDropdown(Country, "India");	
		
	}

	public void SelectState ()
	{
		WebElement state =  driver.findElement(state_obj);
		utility.UtilClass.selectOptionFromDropdown(state, "Maharashtra");
	}
	
	public void ClickOnBillingContinue ()
	{
		driver.findElement(bilingcontinue_obj).click();
	}
	
	public void AddPaymentComment (String comment)
	{
		driver.findElement(comment_obj).sendKeys(comment);
	}
	
	public void ClickOnCheckbox ()
	{
		driver.findElement(checkbox_obj).click();
	}
	
	public void ClickOnPaymentContinue ()
	{
		driver.findElement(paymentcontinue_obj).click();
	}
	
	public void ClickOnExistingAddressContinue ()
	{
		driver.findElement(existingaddresscontinue_obj).click();
	}
	
	
	
}
