package testNgProgram;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestlistner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("in onTestStart method"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("in onTestSuccess method"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		  System.out.println("in onTestFailure method"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	     System.out.println("in onTestSkipped method"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
     System.out.println("in onTestFailedButWithinSuccessPercentage method"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("in onTestFailedWithTimeout method"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("in finish start method");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("in finish method");
	}
  
}
