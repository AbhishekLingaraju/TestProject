package PageObjectClass;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import CommonUtility.BaseTest;

public class First_PageObject extends BaseTest {

	//WebDriver driver;
	public First_PageObject(WebDriver driver) {
		this.driver = driver;
	}
	BaseTest utility;
	private By signin_btn = By.xpath("(//a[contains(text(),'Sign in')])[1]");
	private By try_pre = By.xpath("(//a[contains(text(),'Try premium')])[1]");
	private By email_textfield = By.name("loginfmt");
	private By s = By.id("i0116");

	private By next_btn = By.xpath("//input[@id='idSIButton9']");
	private By password_textfield = By.xpath("//input[@name='passwd']");
	private By signin_probtn = By.xpath("//input[@id='idSIButton9']");
	private By page_verificat = By.xpath("//span[contains(text(),'Outlook')]/..//..//a[contains(text(),'Microsoft')]");
    Exception error;
    

	private static Logger log = LogManager.getLogger(First_PageObject.class);
	public  JavascriptExecutor js = (JavascriptExecutor) driver;



	public void buttonClick(String button) throws InterruptedException
	{
		switch (button) 
		{
		case "Sign in":
			driver.findElement(signin_btn).click();
			break;
		case "Try premium":
			Thread.sleep(1);
			driver.findElement(try_pre).click();
			js.executeScript ("document.getElementById('displayed-text').value='seleinum'");
			break;
		default:
			System.out.println("Button click successfully");
		}
		log.info("User successfully clicked on " + button);

	}

	public void enterData(String data,String field) throws InterruptedException, IOException
	{
		switch (field) 
		{
		case "UserName":
			
			Thread.sleep(3);
			 data =utility.dataSelect(data);
			
			driver.findElement(email_textfield).sendKeys(data);
			/*
			 * System.out.println(driver + "data"); JavascriptExecutor js =
			 * (JavascriptExecutor) driver; js.executeScript("arguments[0].value='aaaaaa'",
			 * driver.findElement(email_textfield));
			 */
			break;
		case "Password":
			Thread.sleep(1);
			data =utility.dataSelect(data);
			driver.findElement(password_textfield).sendKeys(data);
			break;
		default:
			System.out.println("Searching for :" + field );
		}
		log.info("User successfully clicked on " + field);
	}

	public void loginCred(String Username,String Password,String screen) throws InterruptedException, IOException
	{
		Thread.sleep(3);
		Username =utility.dataSelect(Username);
		
		driver.findElement(email_textfield).sendKeys(Username);

	}
	
	
	public  void launchURL(String app) throws Exception
	{
		switch(app)
		{
		case "Outlook":		
			driver.get("https://outlook.live.com/owa/");
			//driver.manage().window().maximize();
			break;

		case "Web Table":
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
			break;
		default:
			throw error;
		}
		
	}	
	
	public void fetchdata() throws EncryptedDocumentException, IOException
	{
		utility = new BaseTest();
		utility.getData("Sheet1");
	}
}
