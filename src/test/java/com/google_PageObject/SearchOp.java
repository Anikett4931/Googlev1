package com.google_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOp {
	WebDriver ldriver;

	public SearchOp(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath= "//input[@class='gLFyf gsfi']")
	WebElement search;

	@FindBy(xpath= "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[3]/div/div[2]/div[1]/span")
	WebElement enter;

	public void abdulKalamk() {
		search.sendKeys("Abdul Kalam");
	}

	public void akclear() {
		search.clear();
	}
	public void AmitabhB() {
		
		search.sendKeys("Amitabh Bachhan");
	}
		
		public void ab() {
			enter.click();
			
		}
		
	}

