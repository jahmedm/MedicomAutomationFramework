package com.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void scshot(WebDriver driver, String s) throws IOException {
        TakesScreenshot tk=(TakesScreenshot)driver;
        File f1=tk.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f1, new File(s+".png"));

    }
}
