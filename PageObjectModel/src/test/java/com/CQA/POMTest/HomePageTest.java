package com.CQA.POMTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import utility.Utility;

public class HomePageTest extends Base {
	
public HomePageTest() {
		
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
	public void addPhotoPost() {
		
		homeP=new HomePage();
		
		homeP.postPic();
		
	}
	@Test
	public void postVideo() {
		
		homeP=new HomePage();
		
		homeP.postVideo();
		
	}
	@Test
	public void likeAndComment() {
	homeP=new HomePage();
		
		homeP.likeAndComment();
		
	}
	
	
	@AfterMethod
		public void terminateDriver() throws InterruptedException {
		Thread.sleep(1000);
			utility.closeDriver();
		}


}
