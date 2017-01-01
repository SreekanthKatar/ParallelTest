package com.gk.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ObjectBase {
	protected WebDriver driver;
	
	public ObjectBase(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
