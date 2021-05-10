package com.stepdef;

import com.base.Base;
import com.utils.ScreenShot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class loginsteps extends Base {
    WebDriver driver;

    @Given("^user on Medicom Homepage$")
    public void user_on_Medicom_Homepage()  {
        getDriver();

    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password()  {
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement username=(WebElement) js.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-email-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('input')");
        String user="arguments[0].setAttribute('value', 'jaberahmednj@outlook.com')";
        ((JavascriptExecutor)driver).executeScript(user,username);

        //String inputevent="arguments[0].dispatchEvent(new Event('input'))";

        WebElement password=(WebElement) js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password\")");
        String pass= "arguments[0].setAttribute('value', 'Rana8367@1234')";
        ((JavascriptExecutor)driver).executeScript(pass,password);

    }

    @Then("^user clicks on login$")
    public void user_clicks_on_login()  {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement signin=(WebElement) js.executeScript("return document.querySelector(\"#app > div > main > div > div > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > div.sign-in-form-footer > slot > slot:nth-child(2) > amplify-button\").shadowRoot.querySelector(\"button\")");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signin);

    }

    @Then("^user navigated to the Medicom Homepage$")
    public void user_navigated_to_the_Medicom_Homepage() throws Throwable {
        Thread.sleep(5000);
        ScreenShot.scshot(driver,"Homepage");
        String Title= driver.getTitle();
        System.out.println("Title is"+Title);
        Assert.assertEquals(Title,"Medicom - QaTesting");

    }

    @Then("^user click on profile menu$")
    public void user_click_on_profile_menu()  {
        driver.findElement(By.xpath("(//span[@class='caret'])[2]")).click();


    }

    @Then("^user clicks on My settings$")
    public void user_clicks_on_My_settings() {
        driver.findElement(By.xpath("//a[@id='mySettingsItem']")).click();




    }

    @Then("^user clicks on secuirity$")
    public void user_clicks_on_secuirity()  {
        driver.findElement(By.xpath("//a[@id='userSecurityLink']")).click();

    }

    @Then("^user clicks on change password$")
    public void user_clicks_on_change_password()  {
        driver.findElement(By.xpath("//*[@id=\"settingsSecurityTab\"]/div/div/div/div[1]/button")).click();

    }

    @Then("^user add values based on password requirements$")
    public void user_add_values_based_on_password_requirements() {
        driver.findElement(By.id("input-22")).sendKeys("Tndjrn1245@5");

    }

    @Then("^user can see the matched password requirements$")
    public void user_can_see_the_matched_password_requirements() throws Throwable {

        Thread.sleep(5000);
        ScreenShot.scshot(driver,"changepassreq");

    }

    @Given("^user in the Medicom Homepage$")
    public void user_in_the_Medicom_Homepage()  {
        String Title= driver.getTitle();
        System.out.println("Title is"+Title);
        Assert.assertEquals(Title,"Medicom - QaTesting");

    }

    @Then("^click checkpoint$")
    public void click_checkpoint() {
        driver.findElement(By.xpath("//*[@id=\"checkpointItem\"]/a")).click();

    }

    @Then("^user see the feature of the checkpoint$")
    public void user_see_the_feature_of_the_checkpoint() throws Throwable {
        Thread.sleep(5000);
        ScreenShot.scshot(driver,"checkpoint");

    }

    @Given("^user on login page$")
    public void user_on_login_page()  {
        String Title= driver.getTitle();
        System.out.println("Title is"+Title);
        Assert.assertEquals(Title,"Medicom - QaTesting");

    }

    @Then("^click Internal prefetch$")
    public void click_Internal_prefetch()  {
        driver.findElement(By.xpath("//*[@id=\"internalPrefetchItem\"]/a")).click();
        driver.quit();

    }

}
