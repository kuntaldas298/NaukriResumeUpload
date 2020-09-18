package com.naukri.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.naukri.pom.Homepage;
import com.naukri.pom.LoginPage;
import com.naukri.pom.UploadResumePage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	public WebDriver driver;
	public FileLib f = new FileLib();
	public WebDriverCommonLib wcl = new WebDriverCommonLib();

	@BeforeTest
	public void openBrowser() throws IOException {
		String url = f.getPropertyValue("url");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wcl.waitImplicit(driver, 15);
		driver.get(url);
	}
	//	@AfterTest
	//	public void closeBrowser() {
	//		driver.close();
	//	}
	@BeforeMethod
	public void login() throws IOException {		
		String un = f.getPropertyValue("username");
		String pd = f.getPropertyValue("password");
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pd);
	}
	@AfterMethod
	public void logout() {
		UploadResumePage u = new UploadResumePage(driver);
		wcl.waitImplicit(driver, 15);
		Actions a=new Actions(driver);
		a.moveToElement(u.getMyNaukriMenu()).perform();
		u.setLogout();
	}
}
