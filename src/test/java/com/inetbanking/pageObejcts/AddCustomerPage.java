package com.inetbanking.pageObejcts;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement newCustomer;

	@FindBy(name = "name")
	WebElement custName;

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement custGender;

	@FindBy(id = "dob")
	WebElement custDob;

	@FindBy(name = "addr")
	WebElement custAdd;

	@FindBy(name = "city")
	WebElement custCity;

	@FindBy(name = "state")
	WebElement custState;

	@FindBy(name = "pinno")
	WebElement custPin;

	@FindBy(name = "telephoneno")
	WebElement custMobno;

	@FindBy(name = "emailid")
	WebElement custemail;

	@FindBy(name = "password")
	WebElement custPass;

	@FindBy(name = "sub")
	WebElement Custformsubmit;

	public void selectNewCustomer() {
		newCustomer.click();

	}

	public void enterCustomerName(String customerName) {
		custName.sendKeys(customerName);

	}

	public void selectCustomerGender() {
		custGender.click();

	}

	public void enterCustomerDOB(String mm, String dd, String yy) {
		custDob.sendKeys(mm);
		custDob.sendKeys(dd);
		custDob.sendKeys(yy);

	}

	public void enterCustomerAdd(String customerAdd) {
		custAdd.sendKeys(customerAdd);

	}

	public void enterCustomerCity(String customerCity) {
		custCity.sendKeys(customerCity);

	}

	public void enterCustomerState(String customerState) {
		custState.sendKeys(customerState);

	}

	public void enterCustomerPin(String customerPin) {
		custState.sendKeys(customerPin);
	}

	public void enterCustomerNumber(String mobileNo) {
		custMobno.sendKeys(mobileNo);

	}

	public void enterCustomerEmail(String email) {
		custemail.sendKeys(email);
	}

	public void enterPassword(String password) {
		custPass.sendKeys(password);

	}public void submitcustomerform() {
		Custformsubmit.click();
		
	}
}