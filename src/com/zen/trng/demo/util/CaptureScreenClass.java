package com.zen.trng.demo.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenClass {
	
	public void captureScreen(WebDriver driver) throws IOException {
		TakesScreenshot scr = (TakesScreenshot) driver;
		File scrshotFile = scr.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		FileUtils.copyFile(scrshotFile, new File("./screenshots/screenshot_"+timestamp+".png"));
	}

}
