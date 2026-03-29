package com.kishore.base;

import com.kishore.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.kishore.driver.DriverFactory;
import org.testng.ITestResult;
import com.kishore.utils.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.initDriver(ConfigReader.get("browser"));
        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            ScreenshotUtil.takeScreenshot(driver, result.getName());
        }

        System.out.println("Closing browser...");
        if (driver != null) {
            driver.quit();
        }
    }

}
