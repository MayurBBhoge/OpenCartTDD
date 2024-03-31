package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage {
	
	private WebDriver driver ;
	
	public Searchpage (WebDriver d)
	
	{
		driver = d;
	}

//Object--------------------------------------------------------------------------------

	
	private By macbook_obj = By.xpath("//a[text()='MacBook']");
	private By addtocart_obj = By.xpath("//button[@id='button-cart']");
	private By item_obj = By.xpath("//span[@id='cart-total']");
	private By checkout_obj = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]");
	private By enteremail_obj = By.xpath("//input[@id='input-email']");
	private By enterpassword_obj = By.xpath("//input[@id='input-password']");
	private By clickonlogin_obj = By.xpath("//input[@id='button-login']");
	
	
	
//Method--------------------------------------------------------------------------------
	
	public void ClickOnMacBook ()
	{
		driver.findElement(macbook_obj).click();
	}
	
	public void ClickOnAddtocart ()
	{
		driver.findElement(addtocart_obj).click();
	}
	
	public void ClickOnItem ()
	{
		driver.findElement(item_obj).click();
	}
	
	public void Checkout ()
	{
		driver.findElement(checkout_obj).click();
	}
	
	public void EnterEmail (String email)
	{
		driver.findElement(enteremail_obj).sendKeys(email);
	}
	
	public void EnterPassword (String pass)
	{
		driver.findElement(enterpassword_obj).sendKeys(pass);
	}
	
	public void ClickOnLogin ()
	{
		driver.findElement(clickonlogin_obj).click();
	}
	
}
