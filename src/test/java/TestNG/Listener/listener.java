package TestNG.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("[STARTED] Test Case: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("[PASSED] Test Case: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("[FAILED] Test Case: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("[SKIPPED] Test Case: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("------ Test Suite Started: " + context.getName() + " ------");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("------ Test Suite Finished: " + context.getName() + " ------");
    }
}
