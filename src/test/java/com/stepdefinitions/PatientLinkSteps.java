package com.stepdefinitions;

import com.base.launchbrowser;
import com.utils.ScreenShot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PatientLinkSteps extends launchbrowser{
	

	
	
	
	
	
	
	@Given("^user enter medicom url$")
	public void user_enter_medicom_url() {
		launchBrowser();
		
	    
	 
	}

	@Then("^user click on patient login$")
	public void user_click_on_patient_login() throws Throwable {
		driver.findElement(By.xpath("//a[normalize-space()='Patient Login']")).click();
	    
	 
	}

	@Then("^user click on login$")
	public void user_click_on_login() throws Throwable {
		driver.findElement(By.xpath("//a[normalize-space()='LOG IN']")).click();
	    
	 
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String passsword) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passsword);
		Thread.sleep(2000);
	 
	}
	@Then("^user click on logintohome$")
	public void user_click_on_logintohome(){
		driver.findElement(By.xpath("//button[normalize-space()='LOG IN']")).click();
	}

	@Then("^user on patient link homepage$")
	public void user_on_patient_link_homepage() throws Throwable {
		String Title= driver.getTitle();
		System.out.println("Title is"+ Title);
		Assert.assertEquals(Title, "Medicom - Patient Link : Patient-Link : PatientLink: medicom.us/patient-link");
	    
	 
	}

	@Then("^user verify text$")
	public void user_verify_text() throws Throwable {
		String Title= driver.getTitle();
		System.out.println("Title is"+ Title);
		Assert.assertEquals(Title, "Medicom - Patient Link : Patient-Link : PatientLink: medicom.us/patient-link");
		ScreenShot.scshot(driver, "patientlink");
	    
	 
	}
	
	@And("^user click on profile menu$")
	public void user_click_on_profile_menu() {

		driver.findElement(By.xpath("//span[@class='navbarPatientName hidden-xs']")).click();

		
	}

	@Then("^click on sign out$")
	public void click_on_sign_out() throws Throwable {

		driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	 
	}
	

	@Then("^sign out should be succesful$")
	public void sign_out_should_be_succesful() throws Throwable {
		driver.quit();
	    
	    
	}



}
