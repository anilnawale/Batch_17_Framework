package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {

	ExtentReports extent=ExtentReportGenrator.get_Reports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getClass().getName()+"=="+ result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS,"Test case is pass");
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL,"Test case is fail");
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP,"Test case is skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}


	
}
