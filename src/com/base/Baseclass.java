package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	public void initializaton() {
		
		System.out.println("Launch the browser -init");
		System.setProperty("webdiver.chrome.driver", "E:\\Selenium\\chromedriver_win32");
		driver=new ChromeDriver();
		System.out.println("Enter the url -init");
		driver.get("https://ppwtest.altisource.com/uat");
	}
	
	public void shutdown() {
		
		System.out.println("Close the browser");
		driver.quit();
	}

}
