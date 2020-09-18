package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.generics.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy (id = "usernameField")
	private WebElement untbx;

	@FindBy (id = "passwordField")
	private WebElement pwtbx;

	@FindBy (xpath = "//button[.='Login']")
	private WebElement lgbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//business logic method
	public void setLogin(String un, String pd) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pd);
		lgbtn.click();

	}
}
