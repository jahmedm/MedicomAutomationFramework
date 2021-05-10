package com.mix;

import com.utils.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imagex {
    WebDriver driver;
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://test.medicom.us/login");

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement username=(WebElement) js.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-email-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('input')");
        String user="arguments[0].setAttribute('value', 'puvivanu-7640@yopmail.com')";

        String inputevent="arguments[0].dispatchEvent(new Event('input'))";


        WebElement password=(WebElement) js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password\")");
        String pass= "arguments[0].setAttribute('value', 'Rana8367@1234')";

        ((JavascriptExecutor)driver).executeScript(user,username);

        ((JavascriptExecutor)driver).executeScript(inputevent,username);


        ((JavascriptExecutor)driver).executeScript(pass,password);

        ((JavascriptExecutor)driver).executeScript(inputevent,password);


        WebElement signin=(WebElement) js.executeScript("return document.querySelector(\"#app > div > main > div > div > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > div.sign-in-form-footer > slot > slot:nth-child(2) > amplify-button\").shadowRoot.querySelector(\"button\")");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signin);

        driver.findElement(By.xpath("//img[@src='/dist/images/portal/sidebar_item_send.svg']")).click();
        driver.findElement(By.xpath("//div[normalize-space()='Imagex']")).click();
        driver.findElement(By.xpath("//input[@id='queryPacsLastName']")).sendKeys("smith");
        driver.findElement(By.xpath("//input[@id='queryPacsFirstName']")).sendKeys("jack");
        driver.findElement(By.id("senderModalQueryButton")).click();




    }
}
