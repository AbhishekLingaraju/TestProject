package StepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import CommonUtility.BaseTest;
import PageObjectClass.BaseHome1;
import PageObjectClass.First_PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First extends BaseTest{


	First_PageObject first_POB;
	BaseHome1 home;

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
}
