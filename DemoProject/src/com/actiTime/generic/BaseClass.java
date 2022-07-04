package com.actiTime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actiTime.pom.EnterTimeTrack;
import com.actiTime.pom.LoginPage;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void loginActi() throws IOException {
		FileLib f=new FileLib();
		f.getPropertyData("url");
		f.getPropertyData("username");
		f.getPropertyData("password");
		driver.get("https://demo.actitime.com");
		LoginPage l = new LoginPage(driver);
		l.setlogin("admin", "manager");
	}
	@AfterMethod
	public void logoutActi() {
		EnterTimeTrack ett = new EnterTimeTrack(driver);
		ett.setlogout();
	}
}

