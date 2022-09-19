package com.CQA.POMTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;

public class Browser extends Base{
	
	@SuppressWarnings("static-access")
	public void triggerDriver() {
		try {
			utility.initializeDriver(prop.getProperty("browser"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@DataProvider(name="LoginTestData")
	public Object[][] LoginData() {
		Object[][] data=utility.getLoginData();
		return data;
		
	}
	@Test(dataProvider="LoginTestData")
	public void LoginPage(String username,String password) {
		String url=prop.getProperty("baseURL");
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		
	}
	

}
