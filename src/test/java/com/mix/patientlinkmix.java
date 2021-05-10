package com.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class patientlinkmix {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://test.medicom.us/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Patient Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='LOG IN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jaberahmednj@outlook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rana8367");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='LOG IN']")).click();
		String Title= driver.getTitle();
		System.out.println("Title is"+ Title);
		Assert.assertEquals(Title, "Medicom - Patient Link : Patient-Link : PatientLink: medicom.us/patient-link");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='navbarPatientName hidden-xs']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	    driver.quit();
	    

	}

}
