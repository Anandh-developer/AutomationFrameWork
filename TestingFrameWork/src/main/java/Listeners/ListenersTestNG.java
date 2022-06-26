package Listeners;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersTestNG implements ITestListener {

	ExtentSparkReporter spartReports= new ExtentSparkReporter("./ExtentReports/spark.html");;
	ExtentReports extentReports = new ExtentReports();;
	ExtentTest 	testLogger;
	

	public void onFinish(ITestContext Result) {
		extentReports.flush();
	}

	@Override
	public void onStart(ITestContext Result) {
		extentReports.attachReporter(spartReports);
		testLogger=extentReports.createTest(Result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	@Override
	public void onTestFailure(ITestResult Result) {
		testLogger.fail("Test case failed"+Result.getName());
		
	}

	// When Test case get Skipped, this method is called.
	@Override
	public void onTestSkipped(ITestResult Result) {
		testLogger.addScreenCaptureFromPath("");
		testLogger.skip("Test methods got skipped");

	}

	// When Test case get Started, this method is called.
	@Override
	public void onTestStart(ITestResult Result) {
		testLogger.info("Test case started "+Result.getName());
		
	}

	// When Test case get passed, this method is called.
	@Override
	public void onTestSuccess(ITestResult Result) {
		testLogger.pass("Test case Passed successfully "+Result.getName());
	}

	
}