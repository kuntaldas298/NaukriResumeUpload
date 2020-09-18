package com.naukri.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukri.generics.BaseClass;

public class UploadResumePage extends BaseClass{
	//@FindBy (xpath = "//input[@type='button' and @value='Update Resume']")   //not clickable,not intaractable 
	//@FindBy (id = "results_resumeParser")   //not clickable,not intaractable
	//@FindBy (xpath = "(//div[@class='uploadContainer'])[1]")  //not intaractable
	//@FindBy(xpath = "(//div[@class='uploadBtn'])[1]")  //not intaractable
	//@FindBy (xpath = "(//div[@class='uploadBtn'])[1]/section/div/div[@class='uploadContainer']")  //not intaractable
	@FindBy (id = "attachCV")   //notFailed but nothing uploads,not clickable
	private WebElement uploadBtn;

	@FindBy (xpath = "//div[.='My Naukri']")
	private WebElement myNaukriMenu;
	

	@FindBy (xpath = "//a[.='Logout']")
	private WebElement logout;

	public UploadResumePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getUploadBtn() {
		return uploadBtn;
	}

	public WebElement getMyNaukriMenu() {
		return myNaukriMenu;
	}

	public void setLogout() {
		logout.click();
	}

}
