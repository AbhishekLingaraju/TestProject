package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonUtility.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseTest
{

	@Before
	public void setUp()
	{
		if(driver==null)
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else
		{
			driver.manage().window().maximize();
		}
	}

	@After
	public void tearDown()
	{
		//driver.quit();
	}

	 @AfterStep
	 public void takeScreenshot(Scenario scenario) throws InterruptedException
	 {

		 if(scenario.isFailed())
		 {
			String screenshotName =scenario.getName();
			System.out.println(screenshotName);
			
			byte[] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotName);
			Thread.sleep(1000);
		 }else
		 {
			 String screenshotName =scenario.getName();
				System.out.println(screenshotName);
				
				byte[] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(sourcepath, "image/png", screenshotName);
				Thread.sleep(1000);
		 }
	 }
	 

}
