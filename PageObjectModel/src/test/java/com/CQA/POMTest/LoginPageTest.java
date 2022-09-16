package com.CQA.POMTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;


public class LoginPageTest extends Base {
	public  LoginPageTest() {
		super();
	}
	
	
		@BeforeMethod
		public static void triggerDriver() throws Exception {
			utility.initializeDriver(prop.getProperty("browser"));			
		}	
		@Test
		public  void chromeLogin() {
		
		String url=prop.getProperty("baseURL");
		driver.get(url);
	}
		public void validLoginPageWithconfigDataTest() {
			LoginP=new LoginPage();
			LoginP.loginUser();
			String homePageTitle=LoginP.verifyHomePage();
			assertEquals(homePageTitle,"Facebook");
			
		}
		@Test 
		public void validateInvalidLoginCredTest() {
			LoginP=new LoginPage();
			message=LoginP.validateInvalidLoginCred();
			assertEquals(message,"The password that you've entered is incorrect. Forgotten password?");
			
		}
		@AfterTest
		public static void terminateDriver() throws InterruptedException {
			 utility.closeDriver();
	}

}
