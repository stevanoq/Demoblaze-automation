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

public class signupPopup {
    WebDriver driver = null;
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
    public void click_signup_tab(){
        driver.findElement(ByName.id("signin2")).click();
    }

    @And("signin screen popup")
    public void signin_screen_popup(){
        driver.findElement(ById.id("sign-username"));   
    }

    @When("click without data")
    public void click_without_data() throws InterruptedException{
        driver.findElement(ByXPath.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();
        Thread.sleep(5000);
    }

    @And("accept the alert")
    public void accept_the_alert(){
        driver.switchTo().alert().accept();
    }

    @When("enter data")
    public void enter_data(){
        driver.findElement(ById.id("sign-username")).sendKeys("evan");
        driver.findElement(ById.id("sign-password")).sendKeys("12345678");
    }

    @And("click signup button")
    public void click_signup_button() throws InterruptedException{
        driver.findElement(ByXPath.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();
        Thread.sleep(5000);
    }

    @When("fail")
    public void fail() throws InterruptedException{
        Alert alert = driver.switchTo().alert();
        //Thread.sleep(5000);
        alert.accept();
    }

    @And("retype data")
    public void retype_data() throws InterruptedException{
        driver.findElement(ById.id("sign-username")).clear();
        driver.findElement(ById.id("sign-password")).clear();
        Thread.sleep(2000);
        driver.findElement(ById.id("sign-username")).sendKeys("evan1240");
        driver.findElement(ById.id("sign-password")).sendKeys("1234567890");
    }

    @Then("success")
    public void success() throws InterruptedException{
        driver.findElement(ByXPath.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}
