package com.Naukri.utils;


import org.openqa.selenium.support.PageFactory;

import com.Naukri.base.Base;

public class Waits extends Base{
	
	public Waits() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	

}
