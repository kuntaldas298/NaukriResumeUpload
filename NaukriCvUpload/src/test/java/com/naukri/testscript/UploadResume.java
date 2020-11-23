package com.naukri.testscript;

import java.io.File;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.naukri.generics.BaseClass;
import com.naukri.pom.Homepage;
import com.naukri.pom.UploadResumePage;

public class UploadResume extends BaseClass{
	@Test
	public void uploadResume() throws InterruptedException {
		Homepage home = new Homepage(driver);
		home.clickUpdateProfile();
		UploadResumePage u = new UploadResumePage(driver);
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(u.getUploadBtn()).sendKeys(f.resumePath()).perform();
//		a.moveToElement(u.getUploadBtn()).click().perform();
		
//      u.getUploadBtn().sendKeys(f.resumePath());
//		u.getUploadBtn().click();
	}
}
