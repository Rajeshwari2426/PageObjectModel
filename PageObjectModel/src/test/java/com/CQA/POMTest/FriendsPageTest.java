package com.CQA.POMTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.FriendsPage;


public class FriendsPageTest  extends Base{
	
	public FriendsPageTest() {
		
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
	public void searchFriend() {
		
		friendsP =new FriendsPage();
		
		friendsP.searchFriend();
		
	}
}
