package com.CQA.POMTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.ProfilePage;

public class ProfilePageTest extends Base {
	
		
		public ProfilePageTest() {
			
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
		
		@Test
		public void seeAllPhoto() {

			profileP=new ProfilePage();
			
		   profileP.seeAllPhotos();
		}
		
		@Test
		public void addBio() {

			profileP=new ProfilePage();
			
		   profileP.addBio();
		}

		@Test
		public void editBio() {

			profileP=new ProfilePage();
			
		   profileP.editBio();
		}
		
		
		@AfterMethod
		public void terminateDriver() throws InterruptedException {
		Thread.sleep(1000);
			utility.closeDriver();
		}
	}


