package PageObjectClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtility.BaseTest;

public class Kapture_HomePage extends BaseTest {

	public Kapture_HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}

	private By home_menu = By.xpath("//a[@class='nav-link mobile-icon1 fancy-link']");
	private By solution_menu = By.xpath("//a[@class='nav-link inner-menu mobile-icon2 fancy-link']");
	private By company_menu = By.xpath("//a[@class='nav-link mobile-icon3 fancy-link']");
	private By resource_menu= By.xpath("//a[@class='nav-link mobile-icon4 fancy-link']");
	private By contactus_menu= By.xpath("//a[@class='nav-link mobile-icon5 fancy-link']");
	private By trynow_menubtn = By.xpath("//a[contains(text(),'Try Now')]");
	private By platform_opt = By.linkText("Platform");
	private By feature_opt = By.linkText("Features");
	private By integration_opt = By.linkText("Integrations");
	private By article_opt = By.linkText("Articles");
	private By infograph_opt = By.linkText("Infographics");
	private By videos_opt = By.linkText("Videos");
	private By review_opt = By.linkText("Reviews");
	private By event_opt = By.linkText("Events");

	//Features
	Exception error;

	public void verifyMenuElements(String MenuButton,String screen) throws Exception
	{
		boolean status =false;
		switch(MenuButton)
		{
		case "Home":
			status=driver.findElement(home_menu).isDisplayed();
			break;
		case "Solution":
			status=driver.findElement(solution_menu).isDisplayed();
			break;
		case "Company":
			status=driver.findElement(company_menu).isDisplayed();
			break;
		case "Resources":
			status=driver.findElement(resource_menu).isDisplayed();
			break;
		case "ContactUs":
			status=driver.findElement(contactus_menu).isDisplayed();
			break;
		case "Try Now":
			status=driver.findElement(trynow_menubtn).isDisplayed();
			break;
		

		default:
			System.out.println(MenuButton+ ": is not present in the given case");
			throw error;
		}
		Assert.assertTrue(status==true);
		System.out.println(MenuButton+ ": is present in the given "+ screen + " screen");
	}
	
	
	public void verifyDropdownOptions(String options,String dropdown) throws Exception
	{
		boolean status =false;
		switch(options)
		{
		case "Platform":
			status=driver.findElement(platform_opt).isDisplayed();
			break;
		case "Features":
			status=driver.findElement(feature_opt).isDisplayed();
			break;
		case "Integration":
			status=driver.findElement(integration_opt).isDisplayed();
			break;
		case "Articles":
			status=driver.findElement(article_opt).isDisplayed();
			break;
		case "Infographics":
			status=driver.findElement(infograph_opt).isDisplayed();
			break;
		case "Videos":
			status=driver.findElement(videos_opt).isDisplayed();
			break;
		case "Reviews":
			status=driver.findElement(review_opt).isDisplayed();
			break;
		case "Events":
			status=driver.findElement(event_opt).isDisplayed();
			break;
		default:
			System.out.println(options + ": option is not present in the given case");
			throw error;
		}
		Assert.assertTrue(status==true);
		System.out.println(options+ ": option is present in the present "+ dropdown + " dropdown");
		
		}

	public void clickButtons(String MenuButton,String screen) throws Exception
	{
		switch(MenuButton)
		{
		case "Home":
			driver.findElement(home_menu).click();
			break;
		case "Solution":
			driver.findElement(solution_menu).click();
			break;
		case "Company":
			driver.findElement(company_menu).click();
			break;
		case "Resources":
			driver.findElement(resource_menu).click();
			break;
		case "ContactUs":
			driver.findElement(contactus_menu).click();
			break;
		default:
			System.out.println(MenuButton+ ": is not present in the given case");
			throw error;
		}
	}

}
