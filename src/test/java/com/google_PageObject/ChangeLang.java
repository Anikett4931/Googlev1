package com.google_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeLang {
	WebDriver ldriver;
	
	public  ChangeLang(WebDriver rdriver)
	 {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		}
	 
	 @FindBy(xpath="//a[text()='मराठी']")
	 WebElement marathi;

	 
	 @FindBy(xpath="//a[text()='English']")
	 WebElement eng;
	 

	 @FindBy(xpath="//a[text()='हिन्दी']")
	 WebElement hindi;
	 
	 public void clickMarathi() {
		 marathi.click();
	 }
	 
	 
	 public void clickEng() {
		 eng.click();
	 }
	 
	 public void clickhindi() {
		 hindi.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
