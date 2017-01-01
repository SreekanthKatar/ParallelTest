package com.gk.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gk.selenium.base.TestBase;
import com.gk.selenium.page.objects.ReceiptPage;
import com.gk.selenium.page.objects.SignUpPage;

public class SignUpFormTest extends TestBase {

	@Test(groups={"regression"})
	public void signUp(){
		
		launchWebSite();
		SignUpPage signUpPage = new SignUpPage(getDriver());
		Assert.assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		Assert.assertTrue(receiptPage.isInitialized());

		Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
	}	
	
	@Test(groups={"smoke"})
	public void signUp1(){
		launchWebSite();
		SignUpPage signUpPage = new SignUpPage(getDriver());
		Assert.assertTrue(signUpPage.isInitialized());

		signUpPage.enterName("First", "Last");
		signUpPage.enterAddress("123 Street", "12345");

		ReceiptPage receiptPage = signUpPage.submit();
		Assert.assertTrue(receiptPage.isInitialized());

		Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
	}	
}