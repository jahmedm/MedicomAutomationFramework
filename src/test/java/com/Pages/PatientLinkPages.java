package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLinkPages {
	 
	WebDriver driver;
	public PatientLinkPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Patient Login']")
	WebElement PatientLink;
	public void PatientLink() {
		PatientLink.click();
	}
	@FindBy(xpath="//a[normalize-space()='LOG IN']")
	WebElement login;
	public void login() {
		login.click();
	}
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	public void email(String username) {
		email.sendKeys(username);
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	public void pass(String password) {
	pass.sendKeys(password);
	}
	@FindBy(xpath="//button[normalize-space()='LOG IN']")
	WebElement LogintoHP;
	public void LogintoHP() {
		LogintoHP.click();
	}
	@FindBy(xpath="//iframe[@src='chrome-extension://mobhfbcgjoleoljhpkkdhopdiemlocka/popup.html?addPassword=true']")
	WebElement ProfileMenu;
	public void ProfileMenu() {
		ProfileMenu.click();
	}
	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	WebElement signout;
	public void signout() {
		signout.click();
	}

}
