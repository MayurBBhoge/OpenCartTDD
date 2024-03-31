package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageLayer.Checkoutpage;
import pageLayer.HomePage;
import pageLayer.Loginpage;
import pageLayer.Registerpage;
import pageLayer.Searchpage;
import utility.CommonComp;

public class TestBase {

	public static WebDriver driver;
	
	public HomePage homepage_obj;
	public Registerpage registerpage_obj;
	public Loginpage loginpage_obj;
	public CommonComp common_obj;
	public Searchpage searchpage_obj;
	public Checkoutpage checkoutpage_obj;
	
	@BeforeMethod
	public void setUp()
	{
		String browser_name = "chrome";
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid bwoser name");
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		homepage_obj = new HomePage(driver);
		registerpage_obj = new Registerpage(driver);
		loginpage_obj = new Loginpage(driver);
		common_obj = new CommonComp(driver);
		searchpage_obj = new Searchpage (driver);
		checkoutpage_obj = new Checkoutpage (driver);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();

	}
}