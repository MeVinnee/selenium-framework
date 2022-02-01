package com.inetbanking.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import com.inetbanking.pageObejcts.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		
		
		logger.info("Opened URL");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		logger.info("Submitted");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("001_Testcase passed");
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("001_Testcase failed");
		}
		
		
	}

}
