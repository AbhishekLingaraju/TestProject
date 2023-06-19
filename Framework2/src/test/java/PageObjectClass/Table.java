package PageObjectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtility.BaseTest;

public class Table extends BaseTest {

	public Table(WebDriver driver) {
		this.driver=driver;// TODO Auto-generated constructor stub
	}
	public void tableVerification()
	{
		List<WebElement> d = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//following-sibling::td"));
		System.out.println("Column size is : "+d.size());
		List<WebElement> s = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("Row size is : " + s.size());

		//To scroll down the page 

		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(0,500)");

		//How to print all the company names

		List<WebElement> companynames = driver.findElements(By.cssSelector("a[href='http://demo.guru99.com/']"));

		//To print the values of particular selected row

		List<WebElement> list = driver.findElements(By.xpath("//tr//th[contains(text(),'Company')]//following-sibling::th"));


		for(WebElement e : companynames )
		{
			//How to print all the company names

			System.out.println(e.getText());

		}

		for(WebElement a : list )
		{
			// To print all the company names
			System.out.println("-------------------");
			System.out.println(a.getText());

		}

}}
