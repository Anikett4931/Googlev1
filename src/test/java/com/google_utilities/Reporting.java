package com.google_utilities;

//Listener Class used to generate extent report

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter ;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onsStart(ITestContext testContext) {
		String timeStamp= new SimpleDateFormat("yyyy.MM.dd.hh.HH.ss").format(new Date());
		String repName = "Test-report-"+timeStamp+".html";
		htmlReporter = new ExtentHtmlReporter("./test-output/"+repName);
	
		htmlReporter.loadXMLConfig("C:/Users/DEll/eclipse-workspace/googlev1/extent-config.xml");
		extent = new ExtentReports();
		
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host name", "local host");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("user", "Aniket");

        htmlReporter.config().setDocumentTitle("Google");
        htmlReporter.config().setReportName("functional Test Report");
        htmlReporter.config().setChartVisibilityOnOpen(false);
        htmlReporter.config().setTheme(Theme.DARK);
        
       }
	public void onTestsuccess(ITestResult tr) {
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
		
		
	}
	public void onTestFailure(ITestResult tr) {
		logger=extent.createTest(tr.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		String screenshotpath=System.getProperty("user.dir")+"\\screenshot\\"+tr.getName()+".png";
		
		
		}
	public void onTestSkiped(ITestResult tr) {
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
	
	
}
