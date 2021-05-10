package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	
	public WebDriver driver;
	
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.get("https://test.medicom.us/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
