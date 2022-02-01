package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetbanking.pageObejcts.AddCustomerPage;
import com.inetbanking.pageObejcts.LoginPage;

public class TC_AddCustomerPage_003 extends BaseClass {

	@Test
	public void addNewCustomer() {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();

		AddCustomerPage custPage = new AddCustomerPage(driver);
		custPage.selectNewCustomer();

		custPage.enterCustomerName("Vanita");
		logger.info("Entered Customer Name");
		custPage.selectCustomerGender();
		logger.info("Select Customer Gender");
		custPage.enterCustomerDOB("21", "07", "1991");
		logger.info("Entered Customer DOB");
		custPage.enterCustomerAdd("C-102, Onella Nest-II, Sus, Pune");
		logger.info("Entered Customer Add");
		custPage.enterCustomerCity("Pune");
		logger.info("Entered Customer City");
		custPage.enterCustomerState("Maharashtra");
		logger.info("Entered Customer State");
		custPage.enterCustomerPin("411021");
		logger.info("Entered Customer Pin");
		custPage.enterCustomerNumber("9898354518");
		logger.info("Entered Customer MobNo");
		String email = randomstring() + "@gmail.com";
		custPage.enterCustomerEmail(email);
		logger.info("Entered Customer Email");
		custPage.enterPassword("password");
		logger.info("Entered Customer Password");

		custPage.submitcustomerform();
		logger.info("Submitted Form");
		

	}

	private String randomstring() {
		String generatstring = RandomStringUtils.randomAlphabetic(5);
		return (generatstring);

	}

}
