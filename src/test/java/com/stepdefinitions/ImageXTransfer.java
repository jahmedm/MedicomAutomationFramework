package com.stepdefinitions;


import com.base.launchbrowser;
import com.utils.ScreenShot;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageXTransfer extends launchbrowser {




    @Given("^user launch the Medicom browser$")
    public void user_launch_the_Medicom_browser() throws Throwable {
        launchBrowser();
        driver.get("https://test.medicom.us/login");

    }

    @When("^User Enter username and password$")
    public void user_Enter_username_and_password() throws Throwable {

        JavascriptExecutor js=(JavascriptExecutor)driver;
        String inputevent="arguments[0].dispatchEvent(new Event('input'))";

        WebElement username=(WebElement) js.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-email-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('input')");
        String user="arguments[0].setAttribute('value', 'puvivanu-7640@yopmail.com')";
        ((JavascriptExecutor)driver).executeScript(user,username);
        ((JavascriptExecutor)driver).executeScript(inputevent,username);
        ScreenShot.scshot(driver, "user");
        Thread.sleep(2000);

        WebElement password=(WebElement) js.executeScript("return document.querySelector(\"amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > amplify-auth-fields\").shadowRoot.querySelector(\"div > amplify-password-field\").shadowRoot.querySelector(\"amplify-form-field\").shadowRoot.querySelector(\"#password\")");
        String pass= "arguments[0].setAttribute('value', 'Rana8367@1234')";
        ((JavascriptExecutor)driver).executeScript(pass,password);
        ((JavascriptExecutor)driver).executeScript(inputevent,password);
        ScreenShot.scshot(driver, "pass");
        Thread.sleep(2000);

    }

    @Then("^user clicks on signin$")
    public void user_clicks_on_signin() throws Throwable {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement signin=(WebElement) js.executeScript("return document.querySelector(\"#app > div > main > div > div > div > div > amplify-authenticator > amplify-sign-in\").shadowRoot.querySelector(\"amplify-form-section > div.sign-in-form-footer > slot > slot:nth-child(2) > amplify-button\").shadowRoot.querySelector(\"button\")");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", signin);
        Thread.sleep(5000);
        ScreenShot.scshot(driver,"signin");


    }

    @Then("^user clicks on share study$")
    public void user_clicks_on_share_study() throws Throwable {
    driver.findElement(By.xpath("//img[@src='/dist/images/portal/sidebar_item_send.svg']")).click();

    }

    @Then("^user clicks on ImageX$")
    public void user_clicks_on_ImageX() throws Throwable {
    driver.findElement(By.xpath("//div[normalize-space()='Imagex']")).click();
    }

    @Then("^user search patient By \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_search_patient_By_and(String LastName, String FirstName) throws Throwable {
        driver.findElement(By.xpath("//input[@id='queryPacsLastName']")).sendKeys(LastName);
        driver.findElement(By.xpath("//input[@id='queryPacsFirstName']")).sendKeys(FirstName);
        driver.findElement(By.id("senderModalQueryButton")).click();
        Thread.sleep(5000);

    }

    @Then("^user select patient and clicks on Review selection$")
    public void user_select_patient_and_clicks_on_Review_selection() throws Throwable {
        driver.findElement(By.xpath("//input[@class='checkboxOnQueryPacsTable']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Review selection']")).click();

    }

    @Then("^user clicks on select recipient button$")
    public void user_clicks_on_select_recipient_button() throws Throwable {
        driver.findElement(By.xpath("//button[normalize-space()='Select recipient']")).click();

    }

    @Then("^user clicks on contacts$")
    public void user_clicks_on_contacts() throws Throwable {
        driver.findElement(By.xpath("//a[@id='selectSendeeSpacesTabLink']")).click();

    }

    @Then("^user select imagex from contactlist and clicks on confirm slection$")
    public void user_select_imagex_from_contactlist_and_clicks_on_confirm_slection() throws Throwable {
        driver.findElement(By.xpath("//div[@class='medicomSelectableItem medicomSelectableItemOnSendForm medicomSelectableContactItem']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Confirm recipient']")).click();

    }

    @Then("^user clicks on send for transfer the study$")
    public void user_clicks_on_send_for_transfer_the_study() throws Throwable {
        driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();

    }

    @Then("^user verify the outgoing file$")
    public void user_verify_the_outgoing_file() throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver,30);
        WebElement outgoingel= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='mainActionButtonImage']")));
        outgoingel.click();
        Thread.sleep(5000);
        ScreenShot.scshot(driver, "outgoing");

    }

    @Then("^user switch the space$")
    public void user_switch_the_space() throws Throwable {
        Select select= new Select(driver.findElement(By.xpath("//span[@id='navbarSpaceNameText']")));
        select.selectByVisibleText("QaTesting2");

    }

    @Then("^Study should be available on recepient imageX at receiving file menu$")
    public void study_should_be_available_on_recepient_imageX_at_receiving_file_menu() throws Throwable {
        driver.findElement(By.xpath("//a[normalize-space()='History']")).click();
        driver.findElement(By.xpath("//a[@id='receivedHistoryLink']")).click();


    }

}
