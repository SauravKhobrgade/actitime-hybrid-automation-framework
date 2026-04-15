package org.actitime.utils;

import com.aventstack.extentreports.reporter.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static byte[] captureScreenShot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] ar = ts.getScreenshotAs(OutputType.BYTES);
        return ar;

    }
}
