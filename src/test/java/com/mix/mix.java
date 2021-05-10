package com.mix;

import com.utils.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class mix {
    WebDriver driver;
    public static void main(String[]args) throws InterruptedException, IOException {
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.medicom.us/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement username=(WebElement) js.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-email-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('input')");
        String user="arguments[0].setAttribute('value', 'jaberahmednj@outlook.com')";

        String inputevent="arguments[0].dispatchEvent(new Event('input'))";


        WebElement password=(WebElement) js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password\")");
        String pass= "arguments[0].setAttribute('value', 'Rana8367@1234')";

        ((JavascriptExecutor)driver).executeScript(user,username);

        ((JavascriptExecutor)driver).executeScript(inputevent,username);
        ScreenShot.scshot(driver, "user");
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript(pass,password);

        ((JavascriptExecutor)driver).executeScript(inputevent,password);
        ScreenShot.scshot(driver, "pass");
        Thread.sleep(2000);

        WebElement signin=(WebElement) js.executeScript("return document.querySelector(\"#app > div > main > div > div > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > div.sign-in-form-footer > slot > slot:nth-child(2) > amplify-button\").shadowRoot.querySelector(\"button\")");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signin);
        Thread.sleep(5000);
        ScreenShot.scshot(driver,"signin");

        driver.findElement(By.xpath("(//span[@class='caret'])[2]")).click();
        driver.findElement(By.xpath("//a[@id='mySettingsItem']")).click();
        driver.findElement(By.xpath("//a[@id='userSecurityLink']")).click();
        driver.findElement(By.xpath("//*[@id=\"settingsSecurityTab\"]/div/div/div/div[1]/button")).click();
        driver.findElement(By.id("input-22")).sendKeys("Tndjrn1245@5");
        Thread.sleep(5000);
        ScreenShot.scshot(driver,"changepassreq");
        driver.quit();

       // WebElement resetpasswd=(WebElement) js.executeScript("return document.querySelector(\"#app > div > main > div > div > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password-hint > div > amplify-button\")");
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", resetpasswd);



    }
}
