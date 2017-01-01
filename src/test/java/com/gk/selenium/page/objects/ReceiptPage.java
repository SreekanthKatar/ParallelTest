package com.gk.selenium.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gk.selenium.base.ObjectBase;

public class ReceiptPage extends ObjectBase {

	@FindBy(tagName = "h1")
	private WebElement header;
	
	public ReceiptPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return header.isDisplayed();
	}

	public String confirmationHeader(){
		return header.getText();
	}

}
