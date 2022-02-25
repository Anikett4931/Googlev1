package com.google_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}
	
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseurl"); 
		return url;
		
	}

	public String getchromepath() {
		String url = pro.getProperty("chromepath");
		return url;
	
	
	
	
	
	
	}
	
	
	
}