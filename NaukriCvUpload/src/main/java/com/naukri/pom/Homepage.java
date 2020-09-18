package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.generics.BaseClass;

public class Homepage extends BaseClass {

	@FindBy(xpath = "(//div[.='UPDATE PROFILE'])[2]")
	private WebElement updateProfile;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickUpdateProfile() {
		updateProfile.click();
	}
}
