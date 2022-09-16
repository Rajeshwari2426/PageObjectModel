package com.CQA.POMTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;


public class LoginPageTest extends Base {
	public  LoginPageTest() {
		super();
	}
	
	
		@BeforeMethod
		public  void triggerDriver() throws Exception {
			utility.initializeDriver(prop.getProperty("browser"));			
		}	
		@Test
		public  void chromeLogin() {
		
		String url=prop.getProperty("baseURL");
		driver.get(url);
	}
		
		
		@Test
		public void validLoginPageWithconfigDataTest() {
			LoginP=new LoginPage();
			LoginP.loginUser();
			String homePageTitle=LoginP.verifyHomePage();
			assertEquals(homePageTitle,"Facebook");
			
		}
		@Test
		public void validLoginPageWithXlxsDataTest() {
			LoginP=new LoginPage();
			LoginP.loginUsingXlxs();
			String homePageTitle=LoginP.verifyHomePage();
			assertEquals(homePageTitle,"Facebook");
			
		}
		@Test 
		public void validateInvalidLoginCredTest() {
			LoginP=new LoginPage();
			message=LoginP.validateIinvalidLoginCred();
			assertEquals(message,"The password that you've entered is incorrect. Forgotten password?");
			
		}
		@AfterMethod
		public  void terminateDriver() throws InterruptedException {
			 utility.closeDriver();
	}

}
