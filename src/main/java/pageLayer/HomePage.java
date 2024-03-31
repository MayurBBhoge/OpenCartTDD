package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage (WebDriver d)
	{
		driver=d;
	}
	
	
//	Object=============================================================================
	
	private By myaccountlink_obj = By.xpath("//span[text()='My Account']");
	private By Registerlink_obj = By.xpath("//a[text()='Register']");
	private By loginlink_obj = By.xpath("//a[text()='Login']");
	private By search_obj = By.xpath("//header/div[1]/div[1]/div[2]/div[1]/input[1]");
	
	
	
//	Method ===================================================================================
	public void ClickonMyAccountlink()
	{
		driver.findElement(myaccountlink_obj).click();
	}

	public void ClickOnRegisterLink()
	{
		driver.findElement(Registerlink_obj).click();
	}
	
	public void ClickOnLoginLink()
	{
		driver.findElement(loginlink_obj).click();
	}

	public void EnterInSearchField(String product)
	{
		driver.findElement(search_obj).sendKeys(product + Keys.ENTER);
	}
	

}



