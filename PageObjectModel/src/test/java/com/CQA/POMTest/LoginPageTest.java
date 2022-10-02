package com.CQA.POMTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import utility.Utility;

public class LoginPageTest extends Base {
	
	

	public LoginPageTest() {

		super();
	}

	@SuppressWarnings("static-access")
	@BeforeMethod

	public void triggerDriver() {
		try {
			utility.initializeDriver(prop.getProperty("browser"));
			logger.info("*****************launching chrome************");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Test
	public void chromeLogin() {

		String url = prop.getProperty("baseURL");
		driver.get(url);
	}

	@Test
	public void validLoginPageWithconfigDataTest() {

		LoginP = new LoginPage();
		LoginP.loginUser();
		String homePageTitle = LoginP.verifyHomePage();
		logger.info("login page title:" + homePageTitle);
		assertEquals(homePageTitle, "(5) Facebook");
		logger.warn("This is warning");

	}

	@Test
	public void validLoginPageWithXlsxDataTest() {
		logger.info("***********validLoginPageWithXlsxDataTest Started***********");
		logger.debug("this is debug msg");
		LoginP = new LoginPage();
		LoginP.loginUsingXlsx();
		String homePageTitle = LoginP.verifyHomePage();
		assertEquals(homePageTitle, "(1) Facebook");

	}

	@Test
	public void validateInvalidLoginCredTest() {
		LoginP = new LoginPage();
		message = LoginP.validateIinvalidLoginCred();
		assertEquals(message, "The password that you've entered is incorrect. Forgotten password?");
		logger.fatal("hey this is fatal error message");
	}

	@AfterMethod
	public void terminateDriver() throws InterruptedException {
		
		utility.closeDriver();
		logger.info("***********Chrome closed***********");
	}

}
