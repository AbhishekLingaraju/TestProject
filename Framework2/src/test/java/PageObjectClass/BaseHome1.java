package PageObjectClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CommonUtility.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHome1 extends BaseTest{

	public static Properties prop = new Properties();
	public static FileReader fl;
	static Error exception;	

	public BaseHome1(WebDriver driver) {
		this.driver=driver;
	}

	public void setup() throws IOException
	{
		if(driver == null)
		{
			fl = new FileReader("C:\\Users\\abhis\\eclipse-workspace\\BestFramework\\src\\test\\resources\\config.properties");
			prop.load(fl);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get(prop.getProperty("testURL"));
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();	
			driver.get(prop.getProperty("testURL"));
			
		}
	}
	
	
	public  void launchURL(String app)
	{
		switch(app)
		{
		case "Outlook":		
			driver.get("https://outlook.live.com/owa/");
			driver.manage().window().maximize();
			break;
			
		case "Web Table":
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
			break;
			default:
			throw exception;
		}
		System.out.println("user is on "+ app);
	}
}
