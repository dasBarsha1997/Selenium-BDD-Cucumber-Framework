package com.reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	public static ExtentReports getExtentReports() {

		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(spark);

		return extent;
	}

}
