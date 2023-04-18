package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	public static ExtentReports get_Reports() {
		String path="C:\\Users\\hp\\eclipse-workspace\\Batch_17_Framework\\Reports\\ss.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Batch17 automation Test Reports");
		report.config().setTheme(Theme.DARK);
		
	    extent=new ExtentReports();
		extent.attachReporter(report);
		
		extent.setSystemInfo("Project name", "facebook");
		extent.setSystemInfo("module name", "loginpage");
		extent.setSystemInfo("Automation Tool", "Selenium WebDriver");
		extent.setSystemInfo("O.S", "windows10");
		extent.setSystemInfo("QA", "xyz");
		return extent;
	}
}
