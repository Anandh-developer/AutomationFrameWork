package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ExtentReportsConfig;

public class ListenersTestNG implements ITestListener {

	ExtentReportsConfig extentReportConfig= new ExtentReportsConfig();
	

	public void onFinish(ITestContext Result) {
		extentReportConfig.flushTheReports();
	}

	@Override
	public void onStart(ITestContext Result) {
		extentReportConfig.reportDeclaration(Result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
	
		extentReportConfig.extentTestLoggers("fail", "Failed");
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
	
		 extentReportConfig.extentTestLoggers("skip", Result.getTestName());
	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {

		
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		extentReportConfig.extentTestLoggers("pass",Result.getTestName() );
	}

	
}