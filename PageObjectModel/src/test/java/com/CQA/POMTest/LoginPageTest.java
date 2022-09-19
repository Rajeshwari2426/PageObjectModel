package com.CQA.POMTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Utility;
import base.Base;
import pages.LoginPage;

public class LoginPageTest extends Base {
	
	public LoginPageTest() {
		
		super();
	}

	@SuppressWarnings("static-access")
	@BeforeMethod
	
	public void triggerDriver() {
		try {
			utility.initializeDriver(prop.getProperty("browser"));
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
		assertEquals(homePageTitle, "(1) Facebook");

	}

	@Test
	public void validLoginPageWithXlsxDataTest() {
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

	}

	@AfterMethod
	public void terminateDriver() throws InterruptedException {
		Utility.closeDriver();
	}

}
