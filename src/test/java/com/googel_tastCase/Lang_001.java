package com.googel_tastCase;

import java.io.IOException;

import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google_PageObject.ChangeLang;


public class Lang_001 extends Baseclass{
	
	@Test
	public void changeLang() throws IOException {
		driver.get(baseurl);
		logger.info("url is open");
		
		ChangeLang cg = new ChangeLang(driver);
		cg.clickMarathi();
		logger.info("click marathi lang");

		
		cg.clickEng();
		logger.info("click eng lang");

		cg.clickhindi();
		logger.info("click hindi lang");

		
		if(driver.getTitle().equals("Google")) {
			Assert.assertTrue(true);
		}
		else {
			capturescreen(driver,"changelang");
			Assert.assertTrue(false);
		}
	}

}
