package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesLocator.cart_page;
import pagesLocator.home_page;
import pagesLocator.signup_page;

public class T01_signup extends variable{
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //signup_page signup;
    /*Given open browser
        And enter url
        When click signin button
        Then sigin screen popup */
    //@Given("open browser")
    @Before
    public void open_browser() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/home/evan/Documents/MavenProjects/testing/src/test/resource/Drivers/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/");
       
        Thread.sleep(1000);
    }

    @When("click signup tab")
    public void click_signup_tab() {
        signup = new signup_page(driver, wait);
        signup.click_sigup_tab();
        signup.click_sigup_closeButton();
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
    public void click_without_data() {
        signup.click_sigup_button();
    }

    @And("accept the alert")
    public void accept_the_alert(){
        signup.signup_alert_accept("Please fill out Username and Password.");
    }

    @When("enter data")
    public void enter_data(){
        signup.enter_sigup_oldname();
        signup.enter_sigup_password();
    }

    @And("click signup button")
    public void click_signup_button() {
        signup.click_sigup_button();
    }

    @When("fail")
    public void fail() {
        signup.signup_alert_accept("This user already exist.");
    }

    @And("retype data")
    public void retype_data() {
        driver.findElement(ById.id("sign-username")).clear();
        driver.findElement(ById.id("sign-password")).clear();
        signup.enter_sigup_newname();
        signup.enter_sigup_password();
    }

    @Then("success")
    public void success() {
        signup.click_sigup_button();
        signup.signup_alert_accept("Sign up successful.");
        
    }

    @After
    public void close_browser(){
        driver.close();
        driver.quit();
    }
}
