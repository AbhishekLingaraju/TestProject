package StepDefinitions;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener 
{
	public static void main(String ards[])
	{
	ListenersDemo d = new ListenersDemo();
	d.onTestStart(null);	
	}
	
	@Override
	  public void onTestFailure(ITestResult tr) 
	  {
		System.out.println("test failed during execution");
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult tr) 
	  {
		  System.out.println("test skipped from execution");  
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult tr) 
	  {
		  System.out.println("test passed successfully");
	  }

}
