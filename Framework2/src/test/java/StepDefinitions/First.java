package StepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import CommonUtility.BaseTest;
import PageObjectClass.BaseHome1;
import PageObjectClass.First_PageObject;
import PageObjectClass.Kapture_HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First extends BaseTest{


	First_PageObject first_POB;
	BaseHome1 home;
	Kapture_HomePage kaptureHome;
	Exception error;

	@Given("user is on {string} application")
	public void user_is_on_application(String string) throws Exception 
	{
		first_POB = new First_PageObject(driver);
		first_POB.launchURL(string);
	}

	@When("user enters {string} {string} on {string} screen")
	public void user_enters_on_screen(String Username, String Password, String screen) throws EncryptedDocumentException, IOException, InterruptedException
	{
		first_POB = new First_PageObject(driver);
		first_POB.fetchdata();
		first_POB.loginCred(Username, Password, screen);

	}

	@And("user click on {string} button")
	public void user_click_on_button(String button) throws InterruptedException
	{
		first_POB = new First_PageObject(driver);
		first_POB.buttonClick(button);
	}

	@Given("user is on {string}")
	public void user_is_on(String app) 
	{	
		home = new BaseHome1(driver);
		home.launchURL(app);

	}

	@Given("user verifies {string} menu button is displayed on {string} screen")
	public void user_verifies_menu_button_is_displayed_on_screen(String button, String screen) throws Exception
	{

		switch(screen)
		{
		case "Homepage":
			kaptureHome = new Kapture_HomePage(driver);
			kaptureHome.verifyMenuElements(button,screen);
			break;
		default :
			System.out.println(screen+ " : is not present in the given case");
			throw error;
		}
	}
	
	@When("user clicks {string} menu button on  {string} screen")
	public void user_clicks_menu_button_on_screen(String button, String screen) throws Exception
	{
		switch(screen)
		{
		case "Homepage":
			kaptureHome = new Kapture_HomePage(driver);
			kaptureHome.clickButtons(button, screen);
			break;
		default :
			System.out.println(screen+ " : is not present in the given case");
			throw error;
		}
	}
	
	@Then("user verifies {string} {string} {string} options should display")
	public void user_verifies_options_should_display(String string, String string2, String string3) 
	{
		kaptureHome = new Kapture_HomePage(driver);

	
	}
	@Then("user verifies {string} option is displayed under {string} dropdown")
	public void user_verifies_option_is_displayed_under_dropdown(String button, String dropdown) throws Exception
	{
		switch(dropdown)
		{
		case "Solution":
			kaptureHome = new Kapture_HomePage(driver);
			kaptureHome.verifyDropdownOptions(button,dropdown);
			break;
		case "Resources":
			kaptureHome = new Kapture_HomePage(driver);
			kaptureHome.verifyDropdownOptions(button,dropdown);
			break;
		default :
			System.out.println(dropdown+ " : is not present in the given case");
			throw error;
		}
	}
}
