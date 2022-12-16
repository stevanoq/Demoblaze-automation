package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.signup_page;

public class T01_signup {
    WebDriver driver = null;
    signup_page signup;
    /*Given open browser
        And enter url
        When click signin button
        Then sigin screen popup */
    @Given("open browser")
    public void open_browser(){
        System.setProperty("webdriver.chrome.driver", "/home/evan/Documents/MavenProjects/testing/src/test/resource/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("enter url")
    public void enter_url(){
        driver.navigate().to("https://www.demoblaze.com/");
    }

    @When("click signup tab")
    public void click_signup_tab() throws InterruptedException{
        signup = new signup_page(driver);
        signup.click_sigup_tab();
        signup.click_sigup_closeButton();
        //driver.findElement(ByName.id("signin2")).isDisplayed();
        signup.click_sigup_tab();
        signup.click_sigup_xButton();
        //driver.findElement(ByName.id("signin2")).isDisplayed();
        signup.click_sigup_tab();
    }

    @And("signin screen popup")
    public void signin_screen_popup(){
        driver.findElement(ById.id("sign-username")).isDisplayed();   
    }

    @When("click without data")
    public void click_without_data() throws InterruptedException{
        signup.click_sigup_button();
        Thread.sleep(2000);
    }

    @And("accept the alert")
    public void accept_the_alert(){
        signup.signup_alert_accept();
    }

    @When("enter data")
    public void enter_data(){
        signup.enter_sigup_oldname();
        signup.enter_sigup_password();
    }

    @And("click signup button")
    public void click_signup_button() throws InterruptedException{
        signup.click_sigup_button();
        Thread.sleep(2000);
    }

    @When("fail")
    public void fail() throws InterruptedException{
        String txt=driver.switchTo().alert().getText().toString();
        System.out.println(txt);
        signup.signup_alert_accept();
    }

    @And("retype data")
    public void retype_data() throws InterruptedException{
        driver.findElement(ById.id("sign-username")).clear();
        driver.findElement(ById.id("sign-password")).clear();
        Thread.sleep(2000);
        signup.enter_sigup_newname();
        signup.enter_sigup_password();
    }

    @Then("success")
    public void success() throws InterruptedException{
        signup.click_sigup_button();
        Thread.sleep(2000);
        signup.signup_alert_accept();
        driver.close();
        driver.quit();
    }
}
