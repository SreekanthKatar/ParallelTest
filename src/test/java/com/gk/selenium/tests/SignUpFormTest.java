package com.gk.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gk.selenium.base.TestBase;
import com.gk.selenium.config.LocalDriverManager;
import com.gk.selenium.page.objects.ReceiptPage;
import com.gk.selenium.page.objects.SignUpPage;

public class SignUpFormTest extends TestBase {

	@Test
	public void signUp(){
		LocalDriverManager.getDriver().get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
		SignUpPage signUpPage = new SignUpPage(LocalDriverManager.getDriver());
		Assert.assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		Assert.assertTrue(receiptPage.isInitialized());

		Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
	}	
	
	@Test
	public void signUp1(){
		LocalDriverManager.getDriver().get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
		SignUpPage signUpPage = new SignUpPage(LocalDriverManager.getDriver());
		Assert.assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		Assert.assertTrue(receiptPage.isInitialized());

		Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
	}	
}