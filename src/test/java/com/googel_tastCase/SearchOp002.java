 package com.googel_tastCase;

import org.testng.annotations.Test;

import com.google_PageObject.SearchOp;

public class SearchOp002 extends Baseclass{
	
@Test
public void search() throws Exception {
	driver.get(baseurl);
	logger.info("open URL");
	
	SearchOp op = new SearchOp(driver);
	
	op.abdulKalamk();
	logger.info("search abdl kalam");
	Thread.sleep(3000);
	
	op.akclear();
	logger.info("clear keyword");
	Thread.sleep(3000);

	op.AmitabhB();
	logger.info("search amitabh bhachhan");
	Thread.sleep(3000);

	op.ab();
	
	
	
	
}
}
