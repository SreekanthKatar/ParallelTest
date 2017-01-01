package com.gk.selenium.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.gk.selenium.config.DriverManager;
import com.gk.selenium.config.WebDriverListener;

@Listeners(WebDriverListener.class)
public class TestBase {

	private static final String URL = "http://www.kimschiller.com/page-object-pattern-tutorial/index.html";
	//write common methods here
	public static WebDriver getDriver() {
        System.out.println("Thread id = " + Thread.currentThread().getId());
        System.out.println("Hashcode of webDriver instance = " + DriverManager.getDriver().hashCode());
		return DriverManager.getDriver();
    }
	
	public static void launchWebSite(){
        DriverManager.getDriver().get(URL);
	}
}
