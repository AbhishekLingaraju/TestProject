package PageObjectClass;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommonUtility.BaseTest;


public class OutlookLogin extends BaseTest{

	private By signin_btn = By.xpath("(//a[contains(text(),'Sign in')])[1]");
	private By try_pre = By.xpath("(//a[contains(text(),'Try premium')])[1]");
	private By email_textfield = By.name("loginfmt");	
	private By s = By.id("i0116");
	private By next_btn = By.xpath("//input[@id='idSIButton9']");
	private By password_textfield = By.xpath("//input[@name='passwd']");
	private By signin_probtn = By.xpath("//input[@id='idSIButton9']");
	private By page_verificat = By.xpath("//span[contains(text(),'Outlook')]/..//..//a[contains(text(),'Microsoft')]");


	private static Logger log = LogManager.getLogger(OutlookLogin.class);

	String filepath = "";
	Exception error;


	public OutlookLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void toPrintCurrentUrl()
	{
		String s = driver.getCurrentUrl();  
		System.out.println(s + "Current URL");
	}


	public void buttonClick(String button) throws InterruptedException {
		switch (button) {
		case "Sign in":
			driver.findElement(signin_btn).click();
			break;
		case "Try premium":
			Thread.sleep(1);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
			driver.findElement(try_pre).click();

			js.executeScript ("document.getElementById('displayed-text').value='seleinum'");
			//

			break;
		default:
			System.out.println("Button click successfully");
		}
		log.info("User successfully clicked on " + button);

	}

	public void Enter_text(String field) throws InterruptedException {
		Thread.sleep(3000);

		switch (field) {
		case "Email ID":
			Thread.sleep(1000);
			driver.findElement(email_textfield).sendKeys("abhishek.l@bct-consulting.com");
			break;
		case "Password":
			Thread.sleep(3000);	
			driver.findElement(password_textfield).sendKeys("Rona@0987654");	
			break;
		default:
			System.out.println("Button click successfully");
		}
		log.info("User successfully enter value on " + field);
	}


	public void enterData(String data, String field, String screen) throws Exception {
		Thread.sleep(3000);
		switch (field) {
		case "Email ID":
			driver.findElement(email_textfield).sendKeys(data);
			break;
		case "Password":
			driver.findElement(password_textfield).sendKeys(data);
			break;
		default:
			throw error;

		}
	}

	public void buttonpress(String button, String screen) throws Exception {
		switch (button) {
		case "Next":
			driver.findElement(next_btn).click();
			break;
		case "Sign in":
			driver.findElement(signin_probtn).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='idBtn_Back']")).click();
			break;
		default:
			throw error;
		}
	}

	}
