package com.CQA.POMTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.ProfilePage;

public class ProfilePageTest {
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
		public void uploadProfilePic() {

			profileP=new ProfilePage();
			profileP.postProfilePic();
		}
		@AfterMethod
		public void terminateDriver() throws InterruptedException {
		Thread.sleep(1000);
			utility.closeDriver();
		}
	}

}
