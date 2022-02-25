package com.googel_tastCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google_utilities.Readconfig;

public class Baseclass {

	Readconfig readconfig = new Readconfig();
	
	public String baseurl = readconfig.getApplicationURL();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());

		driver = new ChromeDriver();
		
		 logger =  Logger.getLogger("google;");
		PropertyConfigurator.configure("log4j.properties");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public void  capturescreen(WebDriver driver,String tname) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//Screenshot"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
