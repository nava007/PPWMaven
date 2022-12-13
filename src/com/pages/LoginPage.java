package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginPage extends Baseclass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Term of Service']")
	private WebElement termlink;
	
	@FindBy(xpath="//div[text()='Terms of Service']")
	private WebElement servicepagetitle;
	
	@FindBy(xpath="//a[@title='New Work Order']")
	private WebElement newwrkorder;
	
	public String enter_creds() {
		
		System.out.println("User entered uname and pw -POM");
		username.sendKeys("sameena");
		password.sendKeys("Qetuoadgjl@123");
		
		
		return driver.getTitle();
	}
	
	public void login_click() {
		loginbtn.click();
		//Thread.sleep(30000);
	}

	
	public String verify_homepage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		newwrkorder.getText();
		return driver.getTitle();
	}
	
    public void Term_link_click() {
		
    	System.out.println("User clicked on term link -POM");
    	termlink.click();
	}
    
    public String servicepage_title() {
    	
    	return servicepagetitle.getText();
    }
    

}
