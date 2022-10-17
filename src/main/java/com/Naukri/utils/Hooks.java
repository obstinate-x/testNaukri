package com.Naukri.utils;

import com.Naukri.base.Base;
import com.Naukri.base.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public static void setupBrowser() {
		
		Browser.startBrowser();
		Browser.maximize();
		
	}
	
	@After
	public static void closeBrowser() {
		
		Base.driver.quit();
	}
	
}
