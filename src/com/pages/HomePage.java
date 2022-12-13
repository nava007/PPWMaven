package com.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;
import com.utils.ReadExcel;

public class HomePage extends Baseclass{
	
	ReadExcel exl=new ReadExcel();
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='New Work Order']")
	private WebElement newwrkorder;
	
	@FindBy(id="wo_number")
	private WebElement wonumber;
	
	@FindBy(id="client_contact_name")
	private WebElement clientname;
	
	@FindBy(id="city")
	private WebElement city;
	
	public void newworkorderclick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		newwrkorder.getText();
		newwrkorder.click();
	}
	
	public void filldata(String path, int sheet, int row) throws IOException {
		
		Object ob[][]=exl.readexcel(path, sheet);		
		int col=ob[0].length;
		String woval=(String) ob[row][0];
		String clientval=(String) ob[row][1];
		String cityval=(String) ob[row][2];
		wonumber.sendKeys(woval);
		clientname.sendKeys(clientval);
		city.sendKeys(cityval);
	}
	
	
}
