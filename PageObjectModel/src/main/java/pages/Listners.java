package pages;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.Base;

public class Listners implements ITestListener {
	
	Base b = new Base();
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("");
	}
	@Override
	public void onTestFailure(ITestResult result) {
	String testmethodName = result.getName();
	b.takeScreenshot("TestValidLogin");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("");
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("");
	}


}
