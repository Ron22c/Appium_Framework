package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReportsGeneration  {
    static ExtentHtmlReporter htmlRepoter;
    static ExtentReports extent;

    @BeforeSuite
    public void reportSetup(){
        htmlRepoter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlRepoter);
    }

    @AfterSuite
    public void reportTeardown(){
        extent.flush();
    }
}
