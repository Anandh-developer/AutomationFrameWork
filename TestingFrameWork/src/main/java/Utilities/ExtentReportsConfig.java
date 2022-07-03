package Utilities;

import java.time.LocalDate;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsConfig {

	ExtentSparkReporter sparkReports;
	ExtentReports extentReports;
	ExtentTest extentTest;

	public void reportDeclaration(String testName) {
		String date = LocalDate.now().toString();
		String curentDate = date.replace("-", "_");
		String path = System.getProperty("user.dir") + "\\ExtentReports\\spark" + curentDate + "_"
				+ System.currentTimeMillis() + ".html";
		sparkReports = new ExtentSparkReporter(path);
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReports);
		extentTest = extentReports.createTest(testName);
		sparkReports.config().setReportName("SparkReport");

	}

	public void flushTheReports() {
		extentReports.flush();
	}

	public void extentTestLoggers(String status, String logMessgaes) {
		switch (status) {
		case "pass":
			extentTest.pass(logMessgaes);
			break;
		case "fail":
			extentTest.fail(logMessgaes);
			break;
		case "skip":
			extentTest.skip(logMessgaes);
			break;
		case "info":
			extentTest.info(logMessgaes);
			break;
		default:
			System.out.println("Given status is not matched with out configurations");

		}
	}

}
