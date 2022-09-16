package com.CQA.POMTest;

import java.io.IOException;

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

}
