package com.gk.selenium.config;
 
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
 
public class WebDriverListener implements IInvokedMethodListener {
 
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            WebDriver driver = null;
			try {
				driver = new DriverFactory().getDriver();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            DriverManager.setWebDriver(driver);
        }
    }
 
    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            WebDriver driver = DriverManager.getDriver();
            if (driver != null) {
                driver.quit();
            }
        }
    }
}