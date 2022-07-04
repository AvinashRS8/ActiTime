package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(name="pwd")
	private WebElement pswrd;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin(String un,String pass) {
		uname.sendKeys(un);
		pswrd.sendKeys(pass);
		lginbtn.click();
	}
	

}
