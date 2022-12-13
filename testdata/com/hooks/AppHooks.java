package com.hooks;

import com.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	Baseclass base;
	
	@Before()
	public void setup() {
		base =new Baseclass();
		base.initializaton();
	}
	
	@After()
	public void End() {
		
		base.shutdown();
	}

}
