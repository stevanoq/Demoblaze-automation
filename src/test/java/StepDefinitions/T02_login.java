package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.login_page;

public class T02_login extends variable{

    /*
     * Given open browser
     * And goto url
     * When click login tab
     * And click login without cridential
     * When enter wrong cridential
     * And fail
     * When not enter password
     * And fail1
     * When enter right cridential
     * Then success
     */
    /*@Given("open browser login")
    public void open_browser_login() {
        System.setProperty("webdriver.chrome.driver",
                "/home/evan/Documents/MavenProjects/testing/src/test/resource/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }*/

    /*@And("goto url login")
    public void goto_url_login() {
        driver.navigate().to("https://www.demoblaze.com/");
    } */

    @When("click login tab")
    public void click_login_tab() throws InterruptedException {
        login = new login_page(driver);

        login.click_login_tab();
        Thread.sleep(1000);
        login.click_btn_close();
        Thread.sleep(1000);
        login.click_login_tab();
        Thread.sleep(1000);
        login.click_btn_x();
        Thread.sleep(1000);
        login.click_login_tab();
    }

    @And("click login without cridential")
    public void click_login_without_cridential() throws InterruptedException {
        login.click_btn_login();
        Thread.sleep(2000);
        login.alert_oke();
        Thread.sleep(1000);
    }

    @When("enter wrong cridential")
    public void enter_wrong_cridential() {
        login.enter_username();
        login.enter_wrong_password();
    }

    @And("fail login")
    public void fail_login() throws InterruptedException {
        login.click_btn_login();
        Thread.sleep(2000);
        login.alert_oke();
        Thread.sleep(1000);
    }

    @When("not enter password")
    public void not_enter_password() {
        login.delete_password();
    }

    @And("fail login1")
    public void fail_login1() throws InterruptedException {
        login.click_btn_login();
        Thread.sleep(2000);
        login.alert_oke();
        Thread.sleep(1000);
    }

    @When("enter right cridential")
    public void enter_right_cridential(){
        login.enter_password();
        login.click_btn_login();
    }

    @Then("success login")
    public void success_login() {
        driver.findElement(By.id("nameofuser")).isDisplayed();
        // driver.close();
        // driver.quit();
    }

    
}
