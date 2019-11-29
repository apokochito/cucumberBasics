package Listeners;

import Utils.ExtentReportUtil;
import static Utils.BaseUtil.features;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class NGTestListener implements ITestListener {

    ExtentReportUtil extentReportUtil = new ExtentReportUtil();

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On test start");


    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On test success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("On test failure");
        try {
            extentReportUtil.ExtentReportScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("On test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("On test failed but with success percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        extentReportUtil.extentReport();

        features = extentReportUtil.extentReports.createTest(Feature.class, "Login Feature");
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReportUtil.FlushReport();
    }
}
