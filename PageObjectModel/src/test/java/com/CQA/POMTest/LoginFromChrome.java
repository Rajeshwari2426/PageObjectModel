package com.CQA.POMTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Base;


public class LoginFromChrome extends Base {
	
	
		@BeforeTest
		public static void triggerDriver() throws Exception {
			utility.initializeDriver();			
		}	
		@Test
		public static void chromeLogin() {
		
		String url=prop.getProperty("baseURL");
		driver.get(url);
	}
		@AfterTest
		public static void terminateDriver() throws InterruptedException {
			 utility.closeDriver();
	}

}
